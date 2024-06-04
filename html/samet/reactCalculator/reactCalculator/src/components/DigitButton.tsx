import { ACTIONS, Action } from "../App";

interface DigitInt {
  dispatch: (action: Action) => void;
  digit: string;
}

export default function DigitButton({ dispatch, digit }: DigitInt) {
  return (
    <button
      onClick={(event) => {
        console.log("event: ", event);
        dispatch({ type: ACTIONS.ADD_DIGIT, payload: { digit } });
      }}
    >
      {digit}
    </button>
  );
}

/*
interface DigitButtonProps {
  digit: string;
  onClick: (digit: string) => void;
}

const DigitButton: React.FC<DigitButtonProps> = ({ digit, onClick }) => {
  return <button onClick={() => onClick(digit)}>{digit}</button>;
};
export default DigitButton;
*/
