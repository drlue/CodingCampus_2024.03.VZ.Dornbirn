import prisma from "@/service/db";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";

const getData = async () => {
  let d = await prisma.transaction.groupBy({
    by: ["category"],
    _sum: {
      amount: true,
    },
  });
  return d;
};

export default async function QueryCategories() {
  const data = await getData();

  return (
    <div className="text-xs font-bold py-1">
      {data.map((t) => (
        <div key={t.category}>
          {t.category} {t._sum.amount}
        </div>
      ))}
    </div>
  );
}
