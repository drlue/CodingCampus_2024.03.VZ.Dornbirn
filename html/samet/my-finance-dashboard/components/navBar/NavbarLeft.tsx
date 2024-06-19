import Link from "next/link";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faHouse } from "@fortawesome/free-solid-svg-icons";

export default function NavbarLeft() {
  return (
    <div className="">
      <Link href="/" className="">
        <div>My Dashboard</div>
        <div className="">
          <FontAwesomeIcon icon={faHouse} className="h-4" />
        </div>
      </Link>
    </div>
  );
}
