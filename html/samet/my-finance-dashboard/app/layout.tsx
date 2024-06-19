import type { Metadata } from "next";
import { Inter } from "next/font/google";
import "./globals.css";
import { ThemeProvider } from "@/components/themeProvider";
import React from "react";
import NavigationBar from "@/components/navBar/NavigationBar";
import CalenderElement from "@/components/CalenderElement";
import MainContentTop from "@/components/mainContentTop/MainContentTop";

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
      <body className={inter.className}>
        <ThemeProvider attribute="class" defaultTheme="dark">
          {children}
          <div>
            <NavigationBar />
          </div>
          <div className="bg-yellow-500">
            <div>
              <CalenderElement />
            </div>
            <div>
              <MainContentTop />
            </div>
          </div>
        </ThemeProvider>
      </body>
    </html>
  );
}
