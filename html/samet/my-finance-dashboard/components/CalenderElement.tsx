import React from "react";
import Link from "next/link";

export default function CalenderElement() {
  return (
    <div className="grid grid-rows-12 gap-5 text-center rounded-3xl pt-6 pb-5 ml-5 mt-12 bg-red-200">
      <Link href="/month/January">JAN</Link>
      <Link href="/month/February">FEB</Link>
      <Link href="/month/March">MAR</Link>
      <Link href="/month/April">APR</Link>
      <Link href="/month/May">MAY</Link>
      <Link href="/month/June">JUN</Link>
      <Link href="/month/July">JUL</Link>
      <Link href="/month/August">AUG</Link>
      <Link href="/month/September">SEP</Link>
      <Link href="/month/October">OCT</Link>
      <Link href="/month/November">NOV</Link>
      <Link href="/month/December">DEC</Link>
    </div>
  );
}
