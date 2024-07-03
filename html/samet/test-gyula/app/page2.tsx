"use client";

import { Transaction } from "@prisma/client";
import React from "react";
import useSWR from "swr";

const fetcher = (url: string) => fetch(url).then((res) => res.json());

function Page2() {
  const { data, error, isLoading } = useSWR<Transaction[]>(
    "/api/user",
    fetcher
  );

  if (error) return <div>failed to load</div>;
  if (isLoading) return <div>loading...</div>;

  return (
    <div>
      <h1>Test</h1>
      {data &&
        data.map((tr) => {
          return (
            <p key={tr.id}>
              {tr.amount} {tr.category}
            </p>
          );
        })}
    </div>
  );
}

export default Page2;
