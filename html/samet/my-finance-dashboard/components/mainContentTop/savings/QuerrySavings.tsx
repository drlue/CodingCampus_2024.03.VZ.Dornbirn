import { getSavingsData } from "@/service/transactionQuerry";

export default async function QuerrySavings() {
  const data = await getSavingsData();
  return (
    <ul>
      {data.map((t) => (
        <li key={t.id}>
          {t.type}: {t.description}: {Math.abs(t.amount)}€
        </li>
      ))}
    </ul>
  );
}
