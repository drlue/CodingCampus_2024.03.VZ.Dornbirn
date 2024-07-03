import Link from "next/link";

interface CategoryMenuItemProps {
  month: Date;
  PieChartComponent: JSX.Element;
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

export default function CategoryMenuItem(props: CategoryMenuItemProps) {
  return (
    <div className="rounded-lg shadow-xl text-center p-1">
      <Link href={getMonthDetailURL(props.link, props.month)}>
        <div className="hover:underline">{getMonthName(props.month)}</div>
      </Link>
      <div>{props.PieChartComponent}</div>
    </div>
  );
}
