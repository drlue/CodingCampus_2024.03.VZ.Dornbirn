import DbConnection from "@/service/dBConnection";
import React from "react";

export default function Transactions() {
  return (
    <div className="bg-yellow-500 rounded-lg shadow-xl sm:row-span-2 text-center p-1">
      <div className="underline">TRANSACTIONS</div>
      <div className="text-xs">
        <DbConnection />
      </div>
    </div>
  );
}
