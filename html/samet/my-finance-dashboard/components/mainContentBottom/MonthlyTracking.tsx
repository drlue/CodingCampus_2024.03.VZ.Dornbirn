import React from "react";
import BarChart from "../chartElement/BarChart";

export default function MonthlyTracking() {
  return (
    <div className="border border-gray-100 rounded-lg shadow-xl sm:col-span-2 text-center p-1">
      <div>MONTHLY TRACKING</div>
      <div>
        <BarChart />
      </div>
    </div>
  );
}
