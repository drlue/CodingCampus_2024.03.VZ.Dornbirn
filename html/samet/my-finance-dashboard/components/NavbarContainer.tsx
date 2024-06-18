import React from "react";
import Link from "next/link";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import {
  faMoneyCheckDollar,
  faChartPie,
  faMoneyBillTransfer,
  faBuildingColumns,
} from "@fortawesome/free-solid-svg-icons";


export default function NavbarContainer() {
  return <nav className="p-4 grid grid-cols-[1fr_auto_1fr] pt-2 pb-2 text-xs bg-red-500">
  <div className="place-items-center bg-green-300">
    <Link href="/">My Finance Dashboard</Link>
  </div>
  <div className="flex gap-4 justify-center  bg-yellow-500">
    <Link
      href="/overview"
      className="grid grid-cols-1 justify-items-center"
    >
      Overview
      <FontAwesomeIcon icon={faBuildingColumns} className="h-4" />
    </Link>
    <Link
      href="/categories"
      className="grid grid-cols-1 justify-items-center"
    >
      Categories
      <FontAwesomeIcon icon={faChartPie} className="h-4" />
    </Link>
    <Link
      href="bankaccount"
      className="grid grid-cols-1 justify-items-center"
    >
      Bank Accounts
      <FontAwesomeIcon icon={faMoneyCheckDollar} className=" h-4" />
    </Link>
    <Link
      href="/transactions"
      className="grid grid-cols-1 justify-items-center"
    >
      <div>Transactions</div>
      <div>
        <FontAwesomeIcon icon={faMoneyBillTransfer} className="h-4" />
      </div>
    </Link>
  </div>
  </nav>
}
