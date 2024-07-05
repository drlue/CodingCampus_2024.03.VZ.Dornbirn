import React from "react";
import { getAviableData } from "@/service/transactionQuerry";
import NetWorthQuerry from "@/components/mainContentTop/totalNetWorth/NetWorthQuerry";

export default function TotalNetWorth() {
  return (
    <div className="border border-gray-100 rounded-lg shadow-xl text-center p-1">
      <div>TOTAL NET WORTH</div>
      <div>
        <NetWorthQuerry />
      </div>
    </div>
  );
}
