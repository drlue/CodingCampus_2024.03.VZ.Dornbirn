import { useState } from "react";
import cubuklu from "../images/cubuklu.webp";
import laci_4 from "../images/laci_4.webp";
import sari_7 from "../images/sari_7.webp";

export function Fenerium() {
  const [centerImage, setCenterImage] = useState(cubuklu);

  return (
    <div className="min-h-72 py-2">
      <div className=" py-2 px-24">
        <h3 className="text-xs"> FENERIUM</h3>
      </div>
      <div className="grid grid-cols-3">
        <div className="col-span-1">
          <h1>Are You Ready To Go On The Pitch?</h1>
          <h5 className="text-xs py-3">
            You can create your new season uniform with your jersey number and
            name, and order it instantly.
          </h5>
          <h1 className="py-6 text"> Select Jersey</h1>
          <div className="grid grid-cols-3">
            <img
              className="h-20 bg-slate-600 border-solid rounded-full cursor-pointer px-2 hover:bg-white"
              src={cubuklu}
              onClick={() => {
                setCenterImage(cubuklu);
              }}
            />
            <img
              className="h-20  bg-slate-600 border-solid rounded-full cursor-pointer px-2  hover:bg-white"
              src={laci_4}
              onClick={() => {
                setCenterImage(laci_4);
              }}
            />
            <img
              className="h-20  bg-slate-600 border-solid rounded-full cursor-pointer px-2  hover:bg-white"
              src={sari_7}
              onClick={() => {
                setCenterImage(sari_7);
              }}
            />
          </div>
        </div>
        <div className="bg-gradient-to-r from-indigo-500 via-purple-500 to-pink-500 ...">
          <p>mkfdknkdsfgk</p>
          <img
            className="h-20 bg-slate-600 border-solid rounded-full cursor-pointer px-2 hover:bg-white skew-x-[45deg]"
            src={centerImage}
          />
        </div>
        <div className="bg-gray-200">
          <p>kdmhkmdh</p>
        </div>
      </div>
    </div>
  );
}
