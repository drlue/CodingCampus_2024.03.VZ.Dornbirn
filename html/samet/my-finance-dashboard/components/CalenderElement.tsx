import React from 'react'
import Link from 'next/link'

export default function CalenderElement() {
  return (
    <div className='grid grid-rows-12 space-y-5 text-center rounded-full w-24 pt-5 pb-5 ml-5 mt-12  bg-red-200'>
       <Link href="/january">Jan</Link>
       <Link href="/february">Feb</Link>
       <Link href="/march">Mar</Link>
       <Link href="/april">Apr</Link>
       <Link href="/may">May</Link>
       <Link href="/june">Jun</Link>
       <Link href="/july">Jul</Link>
       <Link href="/august">Aug</Link>
       <Link href="/september">Sep</Link>
       <Link href="/october">Oct</Link>
       <Link href="/november">Nov</Link>
       <Link href="/december">Dec</Link>
    </div>
  )
}
