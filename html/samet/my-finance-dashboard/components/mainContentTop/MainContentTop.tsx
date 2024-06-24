import React from "react";

export default function MainContentTop() {
  return (
    <div className=" grid grid-cols-1 sm:grid-cols-4 gap-4 p-4 flex-auto ">
      <div className="bg-red-500 rounded-lg shadow-xl">
        <div>TOTAL NET WORTH</div>
        <div>12'344 €</div>
      </div>
      <div className="bg-orange-500 rounded-lg shadow-xl">INCOME</div>
      <div className="bg-yellow-500 rounded-lg shadow-xl sm:row-span-2 ">
        TRANSACTIONS
      </div>
      <div className="bg-green-500 rounded-lg shadow-xl sm:row-span-2 ">
        SAVINGS
      </div>
      <div className="bg-blue-500 rounded-lg shadow-xl">AVIABLE BALANCE</div>
      <div className="bg-violet-500 rounded-lg shadow-xl">
        EXPENSES TOTAL MONTH
      </div>
    </div>
  );
}
