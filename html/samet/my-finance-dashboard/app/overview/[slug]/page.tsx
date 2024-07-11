"use client";
import { useEffect, useState } from "react";
import OverViewMenuItem from "@/components/overViewMenu/overViewMenuItem";
import { Button } from "@/components/ui/button";

type MonthlyData = {
  income: number;
  expense: number;
};

const fetchIncomeExpenseDataForYear = async (
  year: number
): Promise<{ [key: number]: MonthlyData }> => {
  const response = await fetch(`/api/income-expense?year=${year}`);
  const data = await response.json();
  return data;
};

type PageProps = {
  params: {
    slug: string;
  };
};

const Overview = ({ params }: PageProps) => {
  const year = Number(params.slug);
  const [dataByMonth, setDataByMonth] = useState<{
    [key: number]: MonthlyData;
  }>({});
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState<string | null>(null);

  useEffect(() => {
    const fetchData = async () => {
      try {
        console.log("fetchIncomeExpenseDataForYear", year);
        const data = await fetchIncomeExpenseDataForYear(year);
        setDataByMonth(data);
      } catch (err) {
        console.error("Error fetching data:", err);
        setError("Failed to fetch data");
      } finally {
        setLoading(false);
      }
    };

    fetchData();
  }, [year]);

  if (loading) {
    return (
      <div>
        <button
          type="button"
          className="bg-indigo-500 text-white font-bold py-2 px-4 rounded inline-flex items-center"
          disabled
        >
          <svg
            className="animate-spin-slow h-5 w-5 mr-3 text-white"
            viewBox="0 0 24 24"
            fill="none"
            xmlns="http://www.w3.org/2000/svg"
          >
            <circle
              cx="12"
              cy="12"
              r="10"
              stroke="currentColor"
              strokeWidth="4"
              className="opacity-25"
            />
            <path
              d="M4 12a8 8 0 018-8v8l-3.5 3.5a8 8 0 01-4.5-3.5z"
              fill="currentColor"
              className="opacity-75"
            />
          </svg>
          Loading ...
        </button>
      </div>
    );
  }

  if (error) {
    return <div>Error: {error}</div>;
  }

  return (
    <div className="grid grid-cols-3 gap-4 p-10">
      {Object.keys(dataByMonth).map((month) => {
        const monthData = dataByMonth[Number(month)];
        return (
          <OverViewMenuItem
            key={month}
            month={new Date(year, Number(month) - 1)}
            income={monthData.income}
            expense={monthData.expense}
            link="/month/"
          />
        );
      })}
    </div>
  );
};

export default Overview;
