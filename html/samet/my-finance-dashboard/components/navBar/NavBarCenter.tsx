import {
  faBuildingColumns,
  faChartPie,
  faMoneyCheckDollar,
  faMoneyBillTransfer,
} from "@fortawesome/free-solid-svg-icons";
import NavMenuItem from "./NavMenuItem";

export default function NavbarCenter() {
  return (
    <div className="sm:flex sm:flex-row sm:flex-auto sm:justify-center sm:gap-10">
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
