import imgMainLeft from "../images/imgMainLeft.webp";

export function MainPageLeft() {
  return (
    <div className="col-span-4 relative ">
      <div className=" absolute inset-0 grid place-items-center z-10">
        <div className="text-white text-xl text-left invisible md:visible">
          FENERBAHCE ALAGÖZ HOLDING BECOMES EUROPEAN CHAMPION FOR THE SECOND
          TIME IN A ROW
        </div>
      </div>
      <div className="inset-0">
        <img src={imgMainLeft} />
      </div>
    </div>
  );
}
