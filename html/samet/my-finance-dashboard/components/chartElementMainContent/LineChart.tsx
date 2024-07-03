"use client";

import { Transaction } from "@prisma/client";
import React from "react";
import useSWR from "swr";
import {
  Chart as Chartjs,
  LineElement,
  CategoryScale,
  LinearScale,
  PointElement,
  plugins,
  scales,
  Title,
  Tooltip,
} from "chart.js";
import { Line } from "react-chartjs-2";
Chartjs.register(
  LineElement,
  CategoryScale,
  LinearScale,
  PointElement,
  Title,
  Tooltip,
  plugins,
  scales
);

const fetcher = (url: string) => fetch(url).then((res) => res.json());

function LineChart() {
  const { data, error, isLoading } = useSWR<Transaction[]>(
    "/api/savings",
    fetcher
  );

  if (error) return <div>failed to load</div>;
  if (isLoading) return <div>loading...</div>;

  const chartData = {
    labels: data?.map((tr) => tr.type),
    datasets: [
      {
        label: "Amount",
        data: data?.map((tr) => Math.abs(tr.amount)),
        backgroundColor: "green",
        borderColor: "black",
        pointBorderColor: "green",
        fill: true,
        tension: 0.4,
      },
    ],
  };
  console.log("xxxx", chartData);

  const options = {
    plugins: {
      legend: {
        display: false,
      },
    },
    scales: {
      y: {
        beginAtZero: true,
      },
      x: {
        display: false,
      },
    },
  };

  return (
    <div>
      <Line data={chartData} options={options} />
    </div>
  );
}

export default LineChart;
