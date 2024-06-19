import React from "react";


export default function MainContentTop() {
  return (
    <div className=" grid grid-cols-4 gap-4 p-4 flex-grow">
      <div className="bg-red-500 rounded-lg shadow-xl min-h-[50px]"></div>
      <div className="bg-orange-500 rounded-lg shadow-xl min-h-[50px]"></div>
      <div className="bg-yellow-500 rounded-lg shadow-xl row-span-2 min-h-[50px]"></div>
      <div className="bg-green-500 rounded-lg shadow-xl min-h-[50px]"></div>
      <div className="bg-blue-500 rounded-lg shadow-xl min-h-[50px]"></div>
      <div className="bg-violet-500 rounded-lg shadow-xl min-h-[50px]"></div>
      <div className="bg-zinc-500 rounded-lg shadow-xl min-h-[50px]"></div>
    </div>
  );
}
