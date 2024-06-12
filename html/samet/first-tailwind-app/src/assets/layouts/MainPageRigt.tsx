import imgRightFirst from "../images/imgRightFirst.webp";
import imgRightSecond from "../images/imgRightSecond.webp";

export function MainPaigeRight() {
  return (
    <div className="  col-span-2">
      <div className="bg-lime-600">
        <img src={imgRightFirst} />
      </div>
      <div className="">
        <img src={imgRightSecond} />
      </div>
    </div>
  );
}
