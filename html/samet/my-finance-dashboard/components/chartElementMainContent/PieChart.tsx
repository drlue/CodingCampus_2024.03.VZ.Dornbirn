"use client";

import { Transaction } from "@prisma/client";
import React from "react";
import useSWR from "swr";
import { Chart as Chartjs, ArcElement, Tooltip, Legend } from "chart.js";
import ChartDataLabels from "chartjs-plugin-datalabels";
import { Pie } from "react-chartjs-2";

Chartjs.register(ArcElement, Tooltip, Legend, ChartDataLabels);

const fetcher = (url: string) => fetch(url).then((res) => res.json());

function PieChart() {
  const { data, error, isLoading } = useSWR<Transaction[]>(
    "/api/income",
    fetcher
  );

  if (error) return <div>failed to load</div>;
  if (isLoading) return <div>loading...</div>;

  const chartData = {
    labels: data?.map((tr) => `${tr.category}: ${tr.amount}`),
    datasets: [
      {
        data: data?.map((tr) => tr.amount),
        backgroundColor: [
          "#FF6384",
          "#36A2EB",
          "#FFCE56",
          "#FF6384",
          "#36A2EB",
          "#FFCE56",
        ],
        datalabels: {
          color: "yellow",
        },
      },
    ],
  };

  const options = {
    plugins: {
      datalabels: {},
      legend: {
        display: false,
      },
    },
    cutout: "30%",
  };

  return (
    <div>
      <Pie data={chartData} options={options} />
    </div>
  );
}

export default PieChart;
