select country.population from country
where country.name='austria';

select * from river,geo_river,country
where river.name = geo_river.River
and geo_river.country = country.code
and country.name = 'austria'
order by river.length desc;

select sum(country.population) from country,encompasses,continent
where country.code = encompasses.country
and encompasses.continent = continent.name
and continent.name = 'europe';

select * from river,geo_river,country, encompasses, continent
where river.name = geo_river.River
and geo_river.country = country.code
and country.code = encompasses.country
and encompasses.continent = continent.name
and continent.name = 'europe';

select country.name,country.province,country.population from country
where country.name like 'a%'
order by country.population desc;


select * from Island,geo_island,country,religion
where island.name = geo_island.island
and geo_island.country = country.code
and country.code = religion.country
and religion.name = 'muslim'
and religion.percentage>50;

select mountain.name as name, mountain.height as height,country.name,religion.percentage from mountain,geo_mountain,country,religion
where mountain.height >= 3000
and mountain.name = geo_mountain.mountain
and geo_mountain.country = country.code
and country.code = religion.country
and religion.name = 'roman catholic'
and religion.percentage >=60
order by mountain.height asc;

select country.name,lake.name,lake.depth,mountain.name,mountain.height from country,lake,geo_lake,mountain,geo_mountain
where country.code=geo_lake.country
and geo_lake.lake = lake.name
and lake.depth >100
and country.code=geo_mountain.country
and geo_mountain.mountain = mountain.name
and mountain.height > 1500

