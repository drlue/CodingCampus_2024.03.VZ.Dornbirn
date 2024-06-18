import React from "react";
import Link from "next/link";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import {
  faMoneyCheckDollar,
  faChartPie,
  faMoneyBillTransfer,
  faBuildingColumns,
} from "@fortawesome/free-solid-svg-icons";


interface NavbarContainerProps {
  children: React.ReactNode;
}


 const NavbarContainer: React.FC<NavbarContainerProps> = ({ children }) => {
  return <nav className="p-4 grid grid-cols col-span-6 pt-2 pb-2 text-xs bg-red-500">
    
  <div className=" col-span-1 bg-green-300">
    <Link href="/">My Finance Dashboard</Link>
  </div>
  <div className=" bg-yellow-500">
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
export default NavbarContainer;
