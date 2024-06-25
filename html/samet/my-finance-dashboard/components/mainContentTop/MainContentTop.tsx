import React from "react";
import TotalNetWorth from "./TotalNetWorth";
import Transactions from "./Transactions";
import Income from "./Income";
import Savings from "./Savings";
import Aviable from "./Aviable";
import Expense from "./Expense";

export default function MainContentTop() {
  return (
    <div className=" grid grid-cols-1 sm:grid-cols-4 gap-4 p-4 flex-auto ">
      <TotalNetWorth />
      <Income />
      <Transactions />
      <Savings />
      <Aviable />
      <Expense />
    </div>
  );
}
