import Image from "next/image";
import { prisma } from "@/prisma/prisma";
import { Transaction } from "@prisma/client";
import Page2 from "./page2";

const getData = async () => {
  let d = await prisma.transaction.findMany();
  //console.log("d: ", d);
  return d;
};

export default async function Home() {
  const data = await getData();

  return (
    <main className="flex min-h-screen flex-col items-center justify-between p-24">
      <Page2 />
      <br />
      <h1>XXXXXXXXXXXXX</h1>
      {data.map((tr) => {
        return (
          <p key={tr.id}>
            {tr.amount} {tr.category}
          </p>
        );
      })}
    </main>
  );
}
