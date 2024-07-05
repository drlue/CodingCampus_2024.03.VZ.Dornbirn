"use client";

import { Transaction } from "@prisma/client";
import React from "react";
import useSWR from "swr";
import {
  Chart as Chartjs,
  BarElement,
  CategoryScale,
  LinearScale,
  Tooltip,
  Legend,
  BarOptions,
} from "chart.js";

import { Bar } from "react-chartjs-2";
Chartjs.register(BarElement, CategoryScale, LinearScale, Tooltip, Legend);

const fetcher = (url: string) => fetch(url).then((res) => res.json());

//Function to step the Colors in the Barchart
function generateColors(count: number): string[] {
  let steps = Math.floor(255 / count);
  let colors: string[] = [];
  for (let i = 0; i <= 255; i += steps) {
    let currentStep = i.toString(16);
    colors.push("#FF0000" + currentStep);
  }
  return colors.reverse();
}

function BarChart() {
  const { data, error, isLoading } = useSWR<Transaction[]>(
    "/api/transaction",
    fetcher
  );

  if (error) return <div>failed to load</div>;
  if (isLoading) return <div>loading...</div>;

  const chartData = {
    labels: data?.map((tr) => tr.category),
    datasets: [
      {
        label: "Amount",
        data: data?.map((tr) => tr.amount),
        backgroundColor: generateColors(data?.length ?? 0),
        borderColor: "white",
        boderWidth: 1,
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
