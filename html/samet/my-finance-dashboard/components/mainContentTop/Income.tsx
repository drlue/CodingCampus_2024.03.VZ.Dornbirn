import React from "react";
import QueryIncome from "../dBQuerys/QueryIncome";

export default function Income() {
  return (
    <div className="bg-orange-500 rounded-lg shadow-xl text-center p-1">
      <div className="underline">INCOME</div>
      <div>
        <QueryIncome />
      </div>
    </div>
  );
}
