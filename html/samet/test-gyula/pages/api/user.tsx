import { prisma } from "@/prisma/prisma";
import { NextApiRequest, NextApiResponse } from "next";

export default async function handle(
  req: NextApiRequest,
  res: NextApiResponse
) {
  const posts = await prisma.transaction.findMany();
  res.json(posts);
}
