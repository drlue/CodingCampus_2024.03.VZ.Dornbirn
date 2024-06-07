import "./App.css";
import { PageHeader } from "./assets/layouts/PageHeader";
import { NavBarContainer } from "./assets/layouts/NavBarContainer";
import { MainPageLeft } from "./assets/layouts/MainPageLeft";
import { MainPaigeRight } from "./assets/layouts/MainPageRigt";
import { MatchCalender } from "./assets/layouts/MatchCalender";

export default function App() {
  return (
    <div
      className="min-h-screen flex flex-col bg-gray-500"
      style={{ overflowY: "hidden" }}
    >
      <PageHeader />
      <NavBarContainer />
      <div className="grid grid-cols-6 bg-red-300">
        <MainPageLeft />
        <MainPaigeRight />
      </div>
      <MatchCalender />
    </div>
  );
}
