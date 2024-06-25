import { prisma } from "@/prisma/prisma";

const getData = async () => {
  let d = await prisma.transaction.findMany({
    orderBy: {
      amount: "desc",
    },
    take: 10,
  });
  return d;
};

export default async function DbConnection() {
  const data = await getData();
  return (
    <ul className="py-10">
      {data.map((t) => (
        <li key={t.id} style={{ color: t.type === "Income" ? "green" : "red" }}>
          {t.type}: {t.category} / {t.amount}
        </li>
      ))}
    </ul>
  );
}
