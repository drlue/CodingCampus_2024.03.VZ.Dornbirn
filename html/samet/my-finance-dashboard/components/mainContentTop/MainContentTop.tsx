import React from "react";
import TotalNetWorth from "./TotalNetWorth";
import Transactions from "./transactions/Transactions";
import Income from "./income/Income";
import Savings from "./savings/Savings";
import Aviable from "./aviable/Aviable";
import Expense from "./expense/Expense";

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
