import type { Metadata } from "next";
import { Inter } from "next/font/google";
import "./globals.css";
import { ThemeProvider } from "@/components/themeProvider";
import React from "react";
import NavigationBar from "@/components/navBar/NavigationBar";
import SandwichMenu from "@/components/navBar/SandwichMenu";

const inter = Inter({ subsets: ["latin"] });

export const metadata: Metadata = {
  title: "Samy´s Finace Application",
  description: "Generated by create next app",
};

export default function RootLayout({
  children,
}: Readonly<{
  children: React.ReactNode;
}>) {
  return (
    <html lang="en">
      <body className={`{inter.className} `}>
        <div className="min-h-screen flex flex-col">
          <ThemeProvider attribute="class" defaultTheme="dark">
            <SandwichMenu />
            <NavigationBar />
            {children}
          </ThemeProvider>
        </div>
      </body>
    </html>
  );
}
