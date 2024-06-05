import imgMainLeft from "../images/imgMainLeft.webp";
import imgRightFirst from "../images/imgRightFirst.webp";
import imgRightSecond from "../images/imgRightSecond.webp";

export function MainPage() {
  return (
    <div className="grid grid-cols-6 bg-red-300">
      <div className="col-span-4">
        <img src={imgMainLeft} />
        <div className=" relative left-7 bg-lime-500">
          FENERBAHCE ALAGÖZ HOLDING BECOMES EUROPEAN CHAMPION FOR THE SECOND
          TIME IN A ROW
        </div>
      </div>
      <div className=" col-span-2">
        <img src={imgRightFirst} />
        <img src={imgRightSecond} />
      </div>
    </div>
  );
}
