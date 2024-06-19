import {
  faBuildingColumns,
  faChartPie,
  faMoneyCheckDollar,
  faMoneyBillTransfer,
} from "@fortawesome/free-solid-svg-icons";
import NavMenuItem from "./NavMenuItem";

export default function NavbarCenter() {
  return (
    <div className="flex flex-row flex-auto justify-center gap-16 md:visible">
      <NavMenuItem title="Overview" href="/overview" icon={faBuildingColumns} />
      <NavMenuItem title="Categories" href="/categories" icon={faChartPie} />
      <NavMenuItem
        title="Bank Accounts"
        href="/bankaccount"
        icon={faMoneyCheckDollar}
      />
      <NavMenuItem
        title="Transactions"
        href="/transactions"
        icon={faMoneyBillTransfer}
      />
    </div>
  );
}
