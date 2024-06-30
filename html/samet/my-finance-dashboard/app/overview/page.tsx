import OverViewMenuItem from "@/components/overViewMenu/overViewMenuItem";
import React from "react";
import QueryExpense from "@/components/dBQuerys/QueryExpenses";

export default function Overview() {
  let monthList = [];
  for (let i = 0; i < 12; ++i) {
    monthList.push(
      <OverViewMenuItem
        key={i}
        link="/month/"
        month={new Date(new Date().getFullYear(), i)}
        income={0}
        expense={0}
      />
    );
  }
  return <div className="grid md:grid-cols-3 md:gap-y-6">{monthList}</div>;
}
