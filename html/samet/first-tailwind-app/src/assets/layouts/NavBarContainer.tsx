import logo from "../images/logo.png";
import { NavBar } from "./NavBar";

export function NavBarContainer() {
  return (
    <div className="bg-blue-700 relative">
      <img src={logo} className="h-16 absolute top-4 left-7 z-10" />
      <NavBar></NavBar>
    </div>
  );
}
