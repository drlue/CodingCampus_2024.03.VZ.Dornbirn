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

function generateColors(count: number): string[] {
  let steps = Math.floor(255 / count);
  let colors: string[] = [];
  for (let i = 0; i <= 255; i += steps) {
    let currentStep = i.toString(16);
    colors.push("#FF0000" + currentStep);
  }
  return colors.reverse();
}

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
        backgroundColor: generateColors(data?.length ?? 0),
        borderColor: "white",
        borderWidth: 1,
        borderRadius: 10,
      },
    ],
  };

  const options = {
    indexAxis: "y" as const,
    elements: {
      bar: {
        borderWidth: 1,
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
