import prisma from "@/service/db";
import { NextApiRequest, NextApiResponse } from "next";

export default async function handle(
  req: NextApiRequest,
  res: NextApiResponse
) {
  const posts = await prisma.transaction.groupBy({
    by: ["date"],
    where: {
      type: {
        equals: "Savings",
      },
    },
    _sum: {
      amount: true,
    },
  });
  const result = posts.map((transaction) => ({
    type: transaction.date,
    amount: transaction._sum.amount,
  }));
  res.json(result);
}
