import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import {
  faFacebookF,
  faInstagram,
  faTiktok,
  faTwitter,
  faYoutube,
} from "@fortawesome/free-brands-svg-icons";
import { faGlobe, faMagnifyingGlass } from "@fortawesome/free-solid-svg-icons";

export function NavBar() {
  return (
    <div className="bg-blue-700 grid grid-cols-12">
      <div className="col-span-2"></div>
      <ul className="col-span-8 flex items-end text-xs text-zinc-50  h-14 justify-around font-semibold font-sans pb-1">
        <li className="cursor-pointer">News</li>
        <li className="cursor-pointer">CLUB</li>
        <li className="cursor-pointer">BRANCHES</li>
        <li className="cursor-pointer">FIXTURE</li>
        <li className="cursor-pointer">FAN</li>
        <li className="cursor-pointer">BRAND</li>
        <li className="cursor-pointer">FENRIUM</li>
      </ul>
      <div className="col-span-2 space-x-3">
        <FontAwesomeIcon
          icon={faFacebookF}
          className="text-white h-2 cursor-pointer"
        />
        <FontAwesomeIcon
          icon={faTwitter}
          className="text-white h-2 cursor-pointer"
        />
        <FontAwesomeIcon
          icon={faYoutube}
          className="text-white h-2 cursor-pointer"
        />
        <FontAwesomeIcon
          icon={faInstagram}
          className="text-white h-2 cursor-pointer"
        />
        <FontAwesomeIcon
          icon={faTiktok}
          className="text-white h-2 cursor-pointer"
        />
        <FontAwesomeIcon
          icon={faMagnifyingGlass}
          className="text-white h-2 cursor-pointer"
        />
        <FontAwesomeIcon
          icon={faGlobe}
          className="text-white h-2 cursor-pointer"
        />

        <button className=" cursor-pointer bg-yellow-300 rounded text-sm">
          Log in
        </button>
      </div>
    </div>
  );
}
