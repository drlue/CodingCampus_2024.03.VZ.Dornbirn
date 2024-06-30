import React from "react";
import QueryAviable from "../dBQuerys/QueryAvailable";

export default function Aviable() {
  return (
    <div className="border border-gray-100 rounded-lg shadow-xl text-center p-1">
      <div className="underline"> AVAILABLE BALANCE</div>
      <div>
        <QueryAviable />
      </div>
    </div>
  );
}
