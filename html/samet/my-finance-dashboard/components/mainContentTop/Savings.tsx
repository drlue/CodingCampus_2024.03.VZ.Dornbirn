import React from "react";
import { Progress } from "@/components/ui/progress";

export default function Savings() {
  return (
    <div className="bg-green-500 rounded-lg shadow-xl sm:row-span-2 text-center p-1">
      SAVINGS
      <div className="p-11">
        <Progress value={67} />
      </div>
    </div>
  );
}
