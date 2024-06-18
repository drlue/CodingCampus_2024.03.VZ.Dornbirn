export default function Page({ params }: { params: { slug: string } }) {
  return <div>Month: {params.slug}</div>;
}
