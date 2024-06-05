import "./App.css";
import { PageHeader } from "./assets/layouts/PageHeader";
import { NavBarContainer } from "./assets/layouts/NavBarContainer";
import { MainPage } from "./assets/layouts/MainPage";

export default function App() {
  return (
    <div className="min-h-screen flex flex-col bg-gray-500">
      <PageHeader />
      <NavBarContainer />
      <MainPage />
    </div>
  );
}
