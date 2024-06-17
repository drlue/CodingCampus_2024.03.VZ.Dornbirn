import React from 'react'
import Link from 'next/link'
import { Avatar, AvatarFallback, AvatarImage } from "@/components/ui/avatar"
import AvatarElement from './AvatarElement'


export default function navBar() {
  return (
    <nav className='grid grid-cols-4 pt-5 pl-5'>
      <Link href="/">Home</Link>
      <Link href="/categories">Categories</Link>
      <Link href="/transactions">Transactions</Link>
      <Avatar>
  <AvatarImage src="https://github.com/shadcn.png" />
  <AvatarFallback>Samy</AvatarFallback>
</Avatar>

    </nav>
  )
}
