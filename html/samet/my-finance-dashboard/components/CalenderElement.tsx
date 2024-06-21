import React from "react";
import Link from "next/link";

export default function CalenderElement() {
  return (
    <div className="grid grid-rows-12 gap-5 text-center text-xs rounded-3xl pt-6 pb-5 ml-4 mr-4 mb-4 w-14">
      <Link href="/month/January" className="hover:underline">
        JAN
      </Link>
      <Link href="/month/February" className="hover:underline">
        FEB
      </Link>
      <Link href="/month/March" className="hover:underline">
        MAR
      </Link>
      <Link href="/month/April" className="hover:underline">
        APR
      </Link>
      <Link href="/month/May" className="hover:underline">
        MAY
      </Link>
      <Link href="/month/June" className="hover:underline">
        JUN
      </Link>
      <Link href="/month/July" className="hover:underline">
        JUL
      </Link>
      <Link href="/month/August" className="hover:underline">
        AUG
      </Link>
      <Link href="/month/September" className="hover:underline">
        SEP
      </Link>
      <Link href="/month/October" className="hover:underline">
        OCT
      </Link>
      <Link href="/month/November" className="hover:underline">
        NOV
      </Link>
      <Link href="/month/December" className="hover:underline">
        DEC
      </Link>
    </div>
  );
}
