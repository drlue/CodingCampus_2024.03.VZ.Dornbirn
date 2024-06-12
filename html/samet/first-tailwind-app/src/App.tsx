import "./App.css";
import { PageHeader } from "./assets/layouts/PageHeader";
import { NavBarContainer } from "./assets/layouts/NavBarContainer";
import { MainPageLeft } from "./assets/layouts/MainPageLeft";
import { MainPaigeRight } from "./assets/layouts/MainPageRigt";
import { MatchCalender } from "./assets/layouts/MatchCalender";
import { Fenerium } from "./assets/layouts/Fenerium";
import { Achievements } from "./assets/layouts/Achievments";

export default function App() {
  return (
    <div className="min-h-screen flex flex-col">
      <PageHeader />
      <NavBarContainer />
      <div className="grid grid-cols-6">
        <MainPageLeft />
        <MainPaigeRight />
      </div>
      <MatchCalender />
      <div>
        <Fenerium />
      </div>
      <div>
        <Achievements />
      </div>
    </div>
  );
}
