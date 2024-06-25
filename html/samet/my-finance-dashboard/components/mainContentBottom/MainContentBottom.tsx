import React from "react";
import Assets from "./Assets";
import MonthlyTracking from "./MonthlyTracking";
import ExpensesDiagram from "./ExpensesDiagram";

export default function MainContentBottom() {
  return (
    <div className="grid grid-cols-1 sm:grid-cols-4 gap-4 p-4 flex-grow">
      <Assets />
      <MonthlyTracking />
      <ExpensesDiagram />
    </div>
  );
}
