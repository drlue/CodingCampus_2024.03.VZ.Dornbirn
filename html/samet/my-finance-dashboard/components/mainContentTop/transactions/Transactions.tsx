import QueryTransaction from "@/components/mainContentTop/transactions/QueryTransaction";
import React from "react";

export default function Transactions() {
  return (
    <div className="border border-grey-100 rounded-lg shadow-xl sm:row-span-2 text-center p-1  flex justify-center items-center ">
      <div>
        <div className="underline">TRANSACTIONS</div>
        <div className="text-xs font-bold flex justify-center items-center">
          <QueryTransaction />
        </div>
      </div>
    </div>
  );
}
