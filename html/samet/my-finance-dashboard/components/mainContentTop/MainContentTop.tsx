import React from "react";
import TotalNetWorth from "./TotalNetWorth";
import Income from "./Income";

export default function MainContentTop() {
  return (
    <div className=" bg-green-500 text-center text-xs rounded-3xl pt-6 pb-5 ml-4 mt-4 mr-4 mb-4 w-1/6">
      <TotalNetWorth />
      <Income />
    </div>
  );
}
