"use client";
import { createZululand, getCountries } from "@/dbConnection/connection";
import { PrismaClient, country } from "@prisma/client";
import { useEffect, useState } from "react";

export default function Home() {
  const [countries, setCountries] = useState<country[]>([]);

  useEffect(() => {
    /*async function load() {
      let c = await getCountries()
      setCountries(c);
    }
    load();*/
    getCountries().then((c) => setCountries(c));
  }, []);

  function createCountry() {
    console.log("Creating country");
    createZululand();
  }

  return (
    <div className="mb-32 grid grid-cols-3 text-center lg:mb-0 lg:w-full lg:max-w-5xl lg:grid-cols-3 lg:text-left">
      {countries.map((country: country) => {
        return <div>{country.Name}</div>;
      })}
      <button onClick={createCountry}>hallo</button>
    </div>
  );
}

/*async function main(req: any, res: any) {
  prisma.$connect();
  const countries = await prisma.country.findMany();
  res.status(200).json(countries);
 
}*/

/*main(req: any, res:any)
  .then(async () => {
    await prisma.$disconnect();
  })
  .catch(async (e) => {
    console.error(e);
    await prisma.$disconnect();
    process.exit(1);
  });
*/
