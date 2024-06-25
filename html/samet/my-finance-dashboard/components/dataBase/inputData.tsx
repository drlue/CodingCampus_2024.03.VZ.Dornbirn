import { PrismaClient } from "@prisma/client";

const prisma = new PrismaClient();

async function main() {
  try {
    const transaction = await prisma.transaction.create({
      data: {
        type: "expense",
        category: "Clothing",
        amount: 100.0,
        description: "H&M Shopping Tour",
        date: new Date(2024, 5, 24),
      },
    });

    console.log("Transaction created:", transaction);
  } catch (e) {
    console.error("Error creating transaction:", e);
  } finally {
    await prisma.$disconnect();
  }
}

main()
  .then(() => {
    console.log("Script executed successfully");
  })
  .catch((e) => {
    console.error("Script execution error:", e);
  });
