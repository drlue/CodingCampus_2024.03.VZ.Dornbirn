"use client";

import React from "react";
import useSWR from "swr";
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

const fetcher = (url: string) => fetch(url).then((res) => res.json());

function generateColors(count: number): string[] {
  const steps = Math.floor(255 / count);
  const colors: string[] = [];
  for (let i = 0; i <= 255; i += steps) {
    const currentStep = i.toString(16).padStart(2, "0");
    colors.push(`#0000FF${currentStep}`);
  }
  return colors.reverse();
}

interface SavingsData {
  month: string;
  amount: number;
}

function BarChart() {
  const { data, error } = useSWR<SavingsData[]>("/api/savings", fetcher);

  if (error) return <div>Failed to load</div>;
  if (!data) return <div>Loading...</div>;

  const chartData = {
    labels: data.map((tr) => tr.month),
    datasets: [
      {
        label: "Amount",
        data: data.map((tr) => Math.abs(tr.amount)),
        backgroundColor: generateColors(data.length),
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
    scales: {
      x: {
        beginAtZero: true,
        ticks: {
          stepSize: 100, // Adjust step size to ensure correct scaling
          callback: function (value: any) {
            return value; // Customize labels if needed
          },
        },
      },
    },
    plugins: {
      legend: {
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
