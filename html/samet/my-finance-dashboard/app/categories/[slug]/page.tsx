"use client";

import CategoryMenuItem from "@/components/categoriesMenu/CategoryMenuItem";
import BarChart from "@/components/categoriesMenu/BarChart";
import { useState, useEffect } from "react";

type CategoryDataProps = {
  [category: string]: number;
};

const fetchCategoryData = async (
  year: number
): Promise<{ [key: number]: CategoryDataProps }> => {
  const response = await fetch(`/api/category-year?year=${year}`);
  const data = await response.json();
  return data;
};

type PageProps = {
  params: {
    slug: string;
  };
};

const Category = ({ params }: PageProps) => {
  const year = Number(params.slug);
  const [dataByMonth, setDataByMonth] = useState<{
    [key: number]: CategoryDataProps;
  }>({});
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState<string | null>(null);

  useEffect(() => {
    const fetchData = async () => {
      try {
        const data = await fetchCategoryData(year);
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
    return <div>Loading...</div>;
  }

  if (error) {
    return <div>Error: {error}</div>;
  }

  return (
    <div className="grid grid-cols-1 md:grid-cols-2 md:gap-y-6">
      {Object.keys(dataByMonth).map((month) => {
        const monthData = dataByMonth[Number(month)];
        return (
          <CategoryMenuItem
            key={month}
            month={new Date(year, Number(month) - 1)}
            BarChartComponent={<BarChart />}
            link="/month-details"
          />
        );
      })}
    </div>
  );
};

export default Category;
