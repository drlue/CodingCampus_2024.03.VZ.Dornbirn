"use server";
import { PrismaClient, country } from "@prisma/client";
import { count } from "console";

const prisma = new PrismaClient();

export async function getDbConnection() {
  const response = await fetch("mysql://samet:samet@localhost:3306/Mondial");
  const data = await response.json();
  return data.results;
}

export async function getCountries() {
  prisma.$connect();
  return await prisma.country.findMany();
}

export async function createZululand() {
  const newCountry = await prisma.country.create({
    data: {
      Name: "Zululand" + Math.floor(Math.random() * 100),
      Code: "1" + Math.floor(Math.random() * 100),
    },
  });
}
