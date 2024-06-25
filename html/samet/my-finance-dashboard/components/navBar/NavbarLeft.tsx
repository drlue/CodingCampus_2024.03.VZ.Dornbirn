import Link from "next/link";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faHouse } from "@fortawesome/free-solid-svg-icons";
import Image from "next/image";
import logo from "@/components/images/logo.webp";

export default function NavbarLeft() {
  return (
    <Link href="/" className="sm:grid ">
      <div>
        <Image src={logo} width={50} alt={""} />
      </div>
    </Link>
  );
}
