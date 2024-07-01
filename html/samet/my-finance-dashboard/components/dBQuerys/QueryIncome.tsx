import prisma from "@/service/db";

const getData = async () => {
  let d = await prisma.transaction.findMany({
    where: {
      type: {
        equals: "Income",
      },
    },
  });
  return d;
};

export default async function QueryIncome() {
  const data = await getData();
  const totalIncome = data.reduce((acc, curr) => acc + curr.amount, 0);

  return (
    <div className="text-lg font-bold py-1">
      <div>{totalIncome}€</div>
    </div>
  );
}
