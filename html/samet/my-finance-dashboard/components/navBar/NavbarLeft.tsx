import Link from "next/link";
import Image from "next/image";
import logo from "@/components/images/logo.png";

export default function NavbarLeft() {
  return (
    <Link href="/" className="sm:grid ">
      <div>
        <Image src={logo} width={70} alt={""} />
      </div>
    </Link>
  );
}
