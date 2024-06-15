"use client";
import { createZululand, getCountries } from "@/dbConnection/connection";
import { PrismaClient, country } from "@prisma/client";
import { useEffect, useState } from "react";
import { deleteZululand } from "@/dbConnection/connection";

export default function Home() {
  const [countries, setCountries] = useState<country[]>([]);

  useEffect(() => {
    async function load() {
      let c = await getCountries();
      setCountries(c);
    }
    load();
  }, []);

  function createCountry() {
    console.log("Creating country");
    createZululand();
  }

  function deleteCountry() {
    console.log("Country deleted");
    deleteZululand();
  }

  return (
    <div className="bg-slate-900">
      <div className="grid grid-cols-2">
        <button className="bg-green-600" onClick={createCountry}>
          ADD COUNTRY
        </button>
        <button className="bg-red-600" onClick={deleteCountry}>
          DELETE COUNTRY
        </button>
      </div>

      <div className="mb-32 text-white text-xs grid grid-cols-4 ">
        {countries.map((country: country) => {
          return <div>{country.Name}</div>;
        })}
      </div>
    </div>
  );
}
