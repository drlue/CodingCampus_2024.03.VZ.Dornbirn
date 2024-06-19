import React from "react";
import NavbarLeft from "./NavbarLeft";
import NavbarRight from "./NavBarRight";
import NavbarCenter from "./NavBarCenter";

export default function NavigationBar() {
  return (
    <nav className="p-4 pt-2 pb-2 text-xs flex flex-row">
      <NavbarLeft />
      <NavbarCenter />
      <NavbarRight />
    </nav>
  );
}
