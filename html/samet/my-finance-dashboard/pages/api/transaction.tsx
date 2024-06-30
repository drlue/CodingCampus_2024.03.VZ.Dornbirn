import { prisma } from "@/prisma/prisma";
import { NextApiRequest, NextApiResponse } from "next";

export default async function handle(
  req: NextApiRequest,
  res: NextApiResponse
) {
  const posts = await prisma.transaction.groupBy({
    by: ["category"],
    where: {
      amount: {
        lt: 0, // Filtert nur Transaktionen mit negativen Beträgen
      },
    },
    _sum: {
      amount: true,
    },
    orderBy: {
      _sum: {
        amount: "asc",
      },
    },
  });

  const results = posts.map((transaction) => ({
    category: transaction.category,
    amount: transaction._sum.amount,
  }));
  res.json(results);
}
