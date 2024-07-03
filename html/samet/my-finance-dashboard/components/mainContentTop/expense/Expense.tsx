import React from "react";
import QueryExpense from "../expense/QueryExpenses";

export default function Expense() {
  return (
    <div className="border border-gray-100 rounded-lg shadow-xl text-center p-1">
      <div className="underline">Expense</div>
      <div>
        <QueryExpense />
      </div>
    </div>
  );
}
