import img1 from "../images/img1.webp";
import img2 from "../images/img2.webp";
import img3 from "../images/img3.webp";

export function MatchCalender() {
  return (
    <div className=" bg-red-500 min-h-70 py-4">
      <div className=" bg-blue-800 grid grid-cols-10 py-4">
        <div className=" bg-green-500 col-span-2 text-center">fdhdf</div>
        <div className="col-span-2"></div>
        <div className="bg-yellow-500 col-span-6 text-center">dfhgdefh</div>
      </div>
      <div className="bg-cyan-300 grid grid-cols-3 py-6 ">
        <div className="bg-gray-500 col-span-1 min-h-40">
          <img src={img1} />
        </div>
        <div className="bg-green-800 col-span-1">
          <img src={img2} />
        </div>
        <div className="bg-yellow-900 col-span-1">
          <img src={img3} />
        </div>
      </div>
    </div>
  );
}
