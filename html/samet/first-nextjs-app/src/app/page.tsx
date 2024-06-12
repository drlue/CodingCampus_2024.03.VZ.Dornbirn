//import ProductCard from "@/components/ProductCard";
import Image from "next/image";
import Link from "next/link";

export default function Home() {
  return (
    <main>
      <Link className="btn btn-outline btn-secondary" href="/users">
        Users
      </Link>
    </main>
  );
}
