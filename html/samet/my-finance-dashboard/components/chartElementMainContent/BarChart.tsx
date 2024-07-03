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
        backgroundColor: "#B22222",
        borderColor: "Black",
        boderWidth: 1,
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
