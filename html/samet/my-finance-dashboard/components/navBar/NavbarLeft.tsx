import Link from "next/link";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faHouse } from "@fortawesome/free-solid-svg-icons";

export default function NavbarLeft() {
  return (
    <Link href="/" className="sm:grid sm:justify-items-center">
      <div>My Dashboard</div>
      <div>
        <FontAwesomeIcon icon={faHouse} className="h-4" />
      </div>
    </Link>
  );
}
