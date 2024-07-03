import CategoryMenuItem from "@/components/categoriesMenu/CategoryMenuItem";
import PieChart from "@/components/categoriesMenu/PieChart";
import React from "react";

export default function Categories() {
  let monthList = [];
  for (let i = 0; i < 12; ++i) {
    monthList.push(
      <CategoryMenuItem
        key={i}
        link="/month/"
        month={new Date(new Date().getFullYear(), i)}
        PieChartComponent={<PieChart />}
      />
    );
  }
  return (
    <div className="grid grid-cols-1 md:grid-cols-6 md:gap-y-6">
      {monthList}
    </div>
  );
}
