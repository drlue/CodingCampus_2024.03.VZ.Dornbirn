import { getTransactionData } from "@/service/transactionQuerry";

export default async function QueryTransaction() {
  const data = await getTransactionData();
  return (
    <ul className="py-10">
      {data.map((t) => (
        <li key={t.id} style={{ color: t.amount < 0 ? "#B22222" : "#556B2F" }}>
          {t.category}: {t.description}/ {Math.abs(t.amount)}€
        </li>
      ))}
    </ul>
  );
}
