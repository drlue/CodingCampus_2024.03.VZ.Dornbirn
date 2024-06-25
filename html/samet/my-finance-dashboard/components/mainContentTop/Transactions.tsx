import React from "react";
import Dialoge from "../dialoge/DialogeFeature";
import DemoPage from "@/app/payments/page";

export default function Transactions() {
  return (
    <div className="bg-yellow-500 rounded-lg shadow-xl sm:row-span-2 text-center ">
      TRANSACTIONS
      <div>
        <Dialoge />
      </div>
    </div>
  );
}
