import React from "react";
import { Progress } from "@/components/ui/progress";
import QuerrySavings from "./QuerrySavings";
import LineChart from "@/components/chartElementMainContent/LineChart";

export default function Savings() {
  return (
    <div className="border border-gray-100 rounded-lg shadow-xl sm:row-span-2 text-center p-1">
      <div className="underline">SAVINGS</div>
      <div className="p-10">
        <LineChart />
      </div>
      <div className=" text-xs font-bold text-[#4682B4]">
        <QuerrySavings />
      </div>
    </div>
  );
}
