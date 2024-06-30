import prisma from "@/service/db";

const getData = async () => {
  let d = await prisma.transaction.findMany({
    orderBy: {
      amount: "desc",
    },
  });
  return d;
};

export default async function QueryAviable() {
  const data = await getData();

  const totalIncome = data
    .filter((t) => t.type === "Income")
    .reduce((acc, curr) => acc + curr.amount, 0);

  const totalExpense = data
    .filter((t) => t.type === "Expense")
    .reduce((acc, curr) => acc - curr.amount, 0);

  const availableBalance = totalIncome - totalExpense;
  const formattedBalance = availableBalance.toFixed(2);

  return (
    <div className="text-xs font-bold py-1">
      <div className="">{formattedBalance}€</div>
    </div>
  );
}
