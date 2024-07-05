"use client";

import React from "react";
import {
  Chart as Chartjs,
  BarElement,
  CategoryScale,
  LinearScale,
  Tooltip,
  Legend,
} from "chart.js";
import { Bar } from "react-chartjs-2";

Chartjs.register(BarElement, CategoryScale, LinearScale, Tooltip, Legend);

interface BarChartProps {
  data: { category: string; amount: number }[];
}

function BarChart({ data }: BarChartProps) {
  const sortedData = [...data].sort((a, b) => b.amount - a.amount);

  const chartData = {
    labels: sortedData.map((tr) => tr.category),
    datasets: [
      {
        label: "Amount",
        data: sortedData.map((tr) => tr.amount),
        backgroundColor: "#B22222",
        borderColor: "Black",
        borderWidth: 1,
      },
    ],
  };

  const options = {
    indexAxis: "y" as const,
    elements: {
      bar: {
        borderWidth: 2,
      },
    },
    responsive: true,
    plugins: {
      legend: {
        display: false,
      },
      datalabels: {
        display: false,
      },
    },
  };

  return (
    <div>
      <Bar data={chartData} options={options} />
    </div>
  );
}

export default BarChart;
