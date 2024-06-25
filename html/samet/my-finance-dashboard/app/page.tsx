import CalenderElement from "@/components/CalenderElement";
import MainContentTop from "@/components/mainContentTop/MainContentTop";
import MainContentBottom from "@/components/mainContentBottom/MainContentBottom";

export default function Home() {
  return (
    <div className="flex-1 flex">
      <CalenderElement />
      <div className="flex flex-col flex-1">
        <MainContentTop />
        <MainContentBottom />
      </div>
    </div>
  );
}
