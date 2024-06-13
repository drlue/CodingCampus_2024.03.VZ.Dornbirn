import { PrismaClient } from '@prisma/client'



const prisma = new PrismaClient()

async function main() {
    prisma.$connect()
    const allCities = await prisma.city.findMany()
    for(let city of allCities) {
        console.log(city)
    }
}

main()
  .then(async () => {
    await prisma.$disconnect()
  })
  .catch(async (e) => {
    console.error(e)
    await prisma.$disconnect()
    process.exit(1)
  })