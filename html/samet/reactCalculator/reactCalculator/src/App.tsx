import { useReducer } from "react";
import "./App.css";

export enum ACTIONS {
  ADD_DIGIT = "add-digit",
  CHOOSE_OPERATION = "choose-operation",
  CLEAR = "clear",
  DELETE_DIGIT = "delete-digit",
  EVALUATE = "evaluate",
}

interface State {
  currentOperand: string;
  previousOperand: string;
  operation: string | null | undefined;
  result: string;
}

export interface Action {
  type: ACTIONS;
  payload?: {
    digit?: string;
    operation?: string;
  };
}

function reducer(state: State, action: Action): State {
  switch (action.type) {
    case ACTIONS.ADD_DIGIT:
      if (action.payload?.digit === "0" && state.currentOperand === "0") {
        return state;
      }
      if (action.payload?.digit === "." && state.currentOperand.includes(".")) {
        console.log("double comma separator...");
        return state;
      }

      if (action.payload?.digit === "." || state.currentOperand.includes(".")) {
        return {
          ...state,
          currentOperand: state.currentOperand + action.payload?.digit,
        };
      }

      return {
        ...state,
        currentOperand: String(
          Number(state.currentOperand + action.payload?.digit)
        ),
      };

    case ACTIONS.CHOOSE_OPERATION:
      return {
        ...state,
        operation: action.payload?.operation,
        previousOperand: state.currentOperand,
        currentOperand: "",
      };

    case ACTIONS.CLEAR:
      return {
        currentOperand: "0",
        previousOperand: "",
        operation: null,
        result: "0",
      };

    case ACTIONS.DELETE_DIGIT:
      if (state.currentOperand.length === 1) {
        return {
          ...state,
          currentOperand: "0",
        };
      }

      return {
        ...state,
        currentOperand: state.currentOperand.slice(0, -1),
      };

    case ACTIONS.EVALUATE:
      if (!state.operation) {
        return state;
      }

      let result: number;
      const prev = parseFloat(state.previousOperand);
      const current = parseFloat(state.currentOperand);

      switch (state.operation) {
        case "+":
          result = prev + current;
          break;
        case "-":
          result = prev - current;
          break;
        case "*":
          result = prev * current;
          break;
        case "/":
          if (current === 0) {
            return state;
          }
          result = prev / current;
          break;
        default:
          return state;
      }

      return {
        ...state,
        currentOperand: String(result),
        previousOperand: "",
        operation: null,
        result: String(result),
      };

    default:
      return state;
  }
}

interface DigitButtonInterface {
  digit: string;
  handleClick: (digit: string) => void;
}

function DigitButton({ digit, handleClick }: DigitButtonInterface) {
  return (
    <button
      onClick={() => handleClick(digit)}
      className={digit === "0" ? "zero " : ""}
    >
      {digit}
    </button>
  );
}

function App() {
  const [state, dispatch] = useReducer(reducer, {
    currentOperand: "0",
    previousOperand: "",
    operation: null,
    result: "0",
  });

  const handleDigitClick = (digit: string) => {
    dispatch({ type: ACTIONS.ADD_DIGIT, payload: { digit } });
    console.log(digit);
  };

  const handleOperationClick = (operation: string) => {
    dispatch({ type: ACTIONS.CHOOSE_OPERATION, payload: { operation } });
    console.log(operation);
  };

  const handleClearClick = () => {
    dispatch({ type: ACTIONS.CLEAR });
  };

  const handleDeleteClick = () => {
    dispatch({ type: ACTIONS.DELETE_DIGIT });
  };

  const handleEqualClick = () => {
    dispatch({ type: ACTIONS.EVALUATE });
  };

  return (
    <div className="calculator-grid">
      <div className="output">
        <div className="previous-operand">
          {state.previousOperand} {state.operation}
        </div>
        <div className="current-operand">{state.currentOperand}</div>
      </div>
      <button className="span-two" onClick={handleClearClick}>
        AC
      </button>
      <button onClick={handleDeleteClick}>DEL</button>
      <DigitButton digit="+/-" handleClick={handleDigitClick}></DigitButton>
      <button onClick={() => handleOperationClick("/")}>/</button>
      <DigitButton digit="1" handleClick={handleDigitClick}></DigitButton>
      {/* <button onClick={() => handleDigitClick("1")}>1</button>  */}
      <button onClick={() => handleDigitClick("2")}>2</button>
      <button onClick={() => handleDigitClick("3")}>3</button>
      <button onClick={() => handleOperationClick("*")}>*</button>
      <button onClick={() => handleDigitClick("4")}>4</button>
      <button onClick={() => handleDigitClick("5")}>5</button>
      <button onClick={() => handleDigitClick("6")}>6</button>
      <button onClick={() => handleOperationClick("-")}>-</button>
      <button onClick={() => handleDigitClick("7")}>7</button>
      <button onClick={() => handleDigitClick("8")}>8</button>
      <button onClick={() => handleDigitClick("9")}>9</button>
      <button onClick={() => handleOperationClick("+")}>+</button>
      <DigitButton digit="0" handleClick={handleDigitClick}></DigitButton>
      <button onClick={() => handleDigitClick(".")}>.</button>
      {/* <button className="zero" onClick={() => handleDigitClick("0")}>
        0
  </button> */}
      <button className="span-two" onClick={handleEqualClick}>
        =
      </button>
    </div>
  );
}

export default App;
