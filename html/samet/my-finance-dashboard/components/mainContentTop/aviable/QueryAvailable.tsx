import { getAviableData } from "@/service/transactionQuerry";

export default async function QueryAviable() {
  const data = await getAviableData();

  const totalIncome = data
    .filter((t) => t.type === "Income")
    .reduce((acc, curr) => acc + curr.amount, 0);

  const totalExpense = data
    .filter((t) => t.type === "Expense")
    .reduce((acc, curr) => acc - curr.amount, 0);

  const totalSavings = data
    .filter((t) => t.type === "Savings")
    .reduce((acc, curr) => acc - curr.amount, 0);

  const availableBalance = totalIncome - totalExpense - totalSavings;
  const formattedBalance = availableBalance.toFixed(2);

  return (
    <div className="text-lg font-bold py-1">
      <div>{formattedBalance}€</div>
    </div>
  );
}
