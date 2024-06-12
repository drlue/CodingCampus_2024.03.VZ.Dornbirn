import img1 from "../images/img1.webp";
import img2 from "../images/img2.webp";
import img3 from "../images/img3.webp";

export function MatchCalender() {
  return (
    <div className="min-h-70 py-4">
      <div className=" grid grid-cols-10 py-4">
        <div className="col-span-2 text-center">fdhdf</div>
        <div className="col-span-2"></div>
        <div className="col-span-6 text-center">dfhgdefh</div>
      </div>
      <div className=" grid grid-cols-3 py-6 ">
        <div className="col-span-1 min-h-40">
          <img src={img1} />
        </div>
        <div className="col-span-1">
          <img src={img2} />
        </div>
        <div className="col-span-1">
          <img src={img3} />
        </div>
      </div>
    </div>
  );
}
