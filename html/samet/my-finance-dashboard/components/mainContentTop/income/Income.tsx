import React from "react";
import QueryIncome from "@/components/mainContentTop/income/QueryIncome";

export default function Income() {
  return (
    <div className="border border-gray-100 rounded-lg shadow-xl text-center p-1">
      <div className="underline">INCOME</div>
      <div>
        <QueryIncome />
      </div>
    </div>
  );
}
