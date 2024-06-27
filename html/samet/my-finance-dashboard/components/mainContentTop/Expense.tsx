import React from "react";
import QueryExpense from "../dBQuerys/QueryExpenses";

export default function Expense() {
  return (
    <div className="bg-violet-500 rounded-lg shadow-xl text-center p-1">
      <div className="underline">Expense</div>
      <div>
        <QueryExpense />
      </div>
    </div>
  );
}
