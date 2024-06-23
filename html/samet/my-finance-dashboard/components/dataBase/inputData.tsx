import { PrismaClient } from '@prisma/client';

const prisma = new PrismaClient();

async function main() {
  try {
    // Benutzer mit einem zugehörigen Konto erstellen
    const user = await prisma.user.create({
      data: {
        email: 'testuser@example.com',
        name: 'Test User',
        password: 'securepassword', // In einer echten Anwendung solltest du das Passwort hashen
        accounts: {
          create: {
            name: 'Test User Account',
            balance: 1000.0,
          },
        },
      },
      include: {
        accounts: true,
      },
    });

    console.log('User created:', user);
  } catch (e) {
    console.error('Error creating user:', e);
  } finally {
    await prisma.$disconnect();
  }
}

main()
  .then(() => {
    console.log('Script executed successfully');
  })
  .catch((e) => {
    console.error('Script execution error:', e);
  });
