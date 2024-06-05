import banner from "../images/banner.webp";

export function PageHeader() {
  return (
    <div className="qrcode-banner hidden-xs hidden-xxs">
      <a href="/">
        <img src={banner} className="h-auto" />
      </a>
    </div>
  );
}
