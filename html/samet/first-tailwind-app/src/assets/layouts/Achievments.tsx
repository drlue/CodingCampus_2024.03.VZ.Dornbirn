import ligkupasi from "../images/ligkupasi.webp";
import kupa from "../images/kupa.webp";
import superkupa from "../images/superkupa.webp";
import basbakankupa from "../images/basbakankupa.webp";
import atatürkupasi from "../images/atatürkkupasi.webp";
import istanbulligi from "../images/istanbulligi.webp";

export function Achievements() {
  return (
    <div className="bg-green-300 min-h-56">
      <h1 className="px-24">ACHIEVMENTS</h1>
      <div className=" bg-blue-400 grid grid-cols-6 text-center text-xs justify-items-center">
        <div className="bg-blue-700 col-span-1 ">
          <img className="h-20" src={ligkupasi} />
          <h1>Turkish Champions</h1>
          <h5 className="px-10">Futbol</h5>
        </div>
        <div className="bg-yellow-300 col-span-1">
          <img className="h-20" src={kupa} />
          <h1>Turkish Cup</h1>
        </div>
        <div className="bg-blue-700 col-span-1">
          <img className="h-20" src={superkupa} />
          <h1>Super Cup</h1>
        </div>
        <div className="bg-yellow-300 col-span-1">
          <img className="h-20" src={basbakankupa} />
          <h1>Prime Minister´s Cup</h1>
        </div>
        <div className="bg-blue-700 col-span-1">
          <img className="h-20" src={atatürkupasi} />
          <h1>Atatürk Cup</h1>
        </div>
        <div className="bg-yellow-300 col-span-1">
          <img className="h-20" src={istanbulligi} />
          <h1>Instanbul League</h1>
        </div>
      </div>
    </div>
  );
}
