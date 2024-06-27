import prisma from "@/service/db";

const getData = async () => {
  let d = await prisma.transaction.findMany({
    orderBy: {
      amount: "desc",
    },
    take: 10,
  });
  return d;
};

export default async function QueryTransaction() {
  const data = await getData();
  return (
    <ul className="py-10">
      {data.map((t) => (
        <li key={t.id} style={{ color: t.amount < 0 ? "red" : "green" }}>
          {t.category}: {t.description}/ {t.amount}€
        </li>
      ))}
    </ul>
  );
}
