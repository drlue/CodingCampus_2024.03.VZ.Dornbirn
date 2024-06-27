import Link from "next/link";

interface OverViewMenuItemProps {
  month: Date;
  income: number;
  expense: number;
  link: string;
}

const getMonthDetailURL = (link: string, d: Date): string => {
  return (
    link +
    d.toLocaleDateString("de-DE", { year: "numeric" }) +
    "-" +
    d.toLocaleDateString("de-DE", { month: "2-digit" })
  );
};

const getMonthName = (d: Date): string => {
  return d.toLocaleDateString("en-US", { month: "long" });
};

export default function OverViewMenuItem(props: OverViewMenuItemProps) {
  return (
    <div className="grid">
      <div className="rounded-lg shadow-xl text-center p-1">
        <Link href={getMonthDetailURL(props.link, props.month)}>
          <div className="hover:underline">{getMonthName(props.month)}</div>
        </Link>
        <div className="grid grid-cols-2 gap-2 text-xs text-center p-1">
          <div className="bg-green-600 rounded-lg shadow-xl p-2">
            <div>Income</div>
            <div>{props.income}</div>
          </div>
          <div className="bg-red-600 rounded-lg shadow-xl p-2">
            <div>Expense</div>
            <div>{props.expense}</div>
          </div>
        </div>
      </div>
    </div>
  );
}
