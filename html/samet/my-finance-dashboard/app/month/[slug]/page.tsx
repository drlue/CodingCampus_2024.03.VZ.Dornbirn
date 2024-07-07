import { redirect } from "next/navigation";

type PageProps = {
  params: {
    slug: string;
  };
};

export default function Page({ params }: PageProps) {
  const position = params.slug.indexOf("-");
  let year = new Date().getFullYear();
  let month = new Date().getMonth();
  if (position >= 0 && position < params.slug.length) {
    let testYear = Number(params.slug.substring(0, position));
    let testMonth = Number(params.slug.substring(position + 1));

    if (
      !Number.isNaN(testYear) &&
      !Number.isNaN(testMonth) &&
      testYear >= 2000 &&
      testYear < 2150 &&
      testMonth >= 1 &&
      testMonth <= 12
    ) {
      year = testYear;
      month = testMonth;
    } else {
      let monthText = month < 10 ? "0" + month : "" + month;
      redirect("/month/" + year + "-" + monthText);
    }
  }
  console.log("/month/[slug] ", year, month);

  return (
    <div>
      Year: {year} Month: {month}
    </div>
  );
}
