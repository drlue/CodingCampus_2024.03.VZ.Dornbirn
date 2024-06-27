import prisma from "@/service/db";

const getData = async () => {
  let d = await prisma.transaction.findMany({
    where: {
      type: {
        equals: "Expense",
      },
    },
  });
  return d;
};

export default async function QueryExpense() {
  const data = await getData();
  const totalExpense = data.reduce((acc, curr) => acc + curr.amount, 0);

  return (
    <div className="text-xs font-bold py-1">
      <div>{totalExpense}€</div>
    </div>
  );
}
