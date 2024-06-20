import React from 'react'

export default function MainContentBottom () {
  return (
    <div className=" grid grid-cols-3 gap-4 p-4 flex-grow">
    <div className="bg-red-500 rounded-lg shadow-xl col-span-1 row-span-2 min-h-[50px]"></div>
    <div className="bg-orange-500 rounded-lg shadow-xl min-h-[50px]"></div>
    <div className="bg-yellow-500 rounded-lg shadow-xl row-span-2 min-h-[50px]"></div>
    </div>
  )
}
