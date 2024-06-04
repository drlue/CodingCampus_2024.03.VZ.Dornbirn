import { ACTIONS, Action } from "../App";

interface OprationInt {
  dispatch: (action: Action) => void;
  operation: string;
}

export default function OperationButton({ dispatch, operation }: OprationInt) {
  return (
    <button
      onClick={() =>
        dispatch({
          type: ACTIONS.CHOOSE_OPERATION,
          payload: { digit: operation },
        })
      }
    >
      {operation}
    </button>
  );
}

/*
interface OperationButtonProps {
  digit: string;
  onClick: (digit: string) => void;
}

const OparationButton: React.FC<OperationButtonProps> = ({
  digit,
  onClick,
}) => {
  return <button onClick={() => onClick(digit)}>{digit}</button>;
};

export default OparationButton;
*/
