import React from "react";
import QuerrySavings from "./QuerrySavings";
import BarChart from "./BarChartSaving";

export default function Savings() {
  return (
    <div className="border border-gray-100 rounded-lg shadow-xl sm:row-span-2 text-center p-1">
      <div className="underline">SAVINGS</div>
      <div className="p-10">
        <BarChart />
      </div>
      <div className=" text-xs text-[#4682B4]">
        <QuerrySavings />
      </div>
    </div>
  );
}
