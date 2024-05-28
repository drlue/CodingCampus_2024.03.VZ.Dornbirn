use mondial;
-- Wieviele Einwohner hat Österreich?
select country.population from country
where country.name='austria';

-- Welche Flüsse fließen durch Österreich?
select * from river,geo_river,country
where river.name = geo_river.River
and geo_river.country = country.code
and country.name = 'austria'
order by river.length desc;

-- Welche Flüsse fließen durch Österreich?
select * from river
join geo_river on river.name = geo_river.river
join country on country.code = geo_river.country
where country.name = 'germany';

-- Wieviele Einwohner hat Europa?
select sum(country.population) from country,encompasses
where country.code = encompasses.country
and encompasses.continent = 'europe';

-- Wieviele Einwohner hat Europa?
select sum(country.population) from country
join encompasses on country.code = encompasses.country
where encompasses.continent = 'europe';

-- Welche Flüsse fließen durch Europa?
select * from river,geo_river,country, encompasses, continent
where river.name = geo_river.River
and geo_river.country = country.code
and country.code = encompasses.country
and encompasses.continent = continent.name
and continent.name = 'europe';

-- Welche Flüsse fließen durch Europa?
select * from river
join geo_river on river.name = geo_river.river
join country on geo_river.country = country.code
join encompasses on country.code = encompasses.country
where encompasses.continent = 'europe'
and percentage >= 50
order by length;

-- Welche flüsse europa?
select distinct geo_river.river from geo_river
join encompasses on encompasses.country = geo_river.country
where encompasses.continent = 'europe' and encompasses.percentage > 50;

-- Wie viel Prozent der Menschen leben in Europa?
select(select sum(country.population)
 from country
 join encompasses on country.code = encompasses.country
 where encompasses.continent = 'europe')
 / sum(country.population) * 100 as Percentage
 from country;
 
-- Alle länder die mit "A" anfgangen
select country.name,country.province,country.population from country
where country.name like 'a%'
order by country.population desc;

-- alle Inseln im Pazifik mit min. 50 % Islam
select * from Island,geo_island,country,religion
where island.name = geo_island.island
and geo_island.country = country.code
and country.code = religion.country
and religion.name = 'muslim'
and religion.percentage>50;

--  Alle 3000er in Ländern die min. 50 % roman catholic
select mountain.name as name, mountain.height as height,country.name,religion.percentage from mountain,geo_mountain,country,religion
where mountain.height >= 3000
and mountain.name = geo_mountain.mountain
and geo_mountain.country = country.code
and country.code = religion.country
and religion.name = 'roman catholic'
and religion.percentage >=60
order by mountain.height asc;

-- alle Länder mit einem See mit min 100 Tiefe und einem Berg > 1500
select country.name,lake.name,lake.depth,mountain.name,mountain.height from country,lake,geo_lake,mountain,geo_mountain
where country.code=geo_lake.country
and geo_lake.lake = lake.name
and lake.depth >100
and country.code=geo_mountain.country
and geo_mountain.mountain = mountain.name
and mountain.height > 1500;

-- Einwohnerzahl pro Religion
select round(sum(country.population*((religion.percentage)/100))) as pop ,religion.name from country
join religion on country.code = religion.country
group by religion.name
order by pop desc;

-- Alle Länder + Meere dazu
select country.name,sea.name from country,geo_sea,sea
where country.code = geo_sea.country
and geo_sea.sea = sea.name;

-- Alle Länder + Meere dazu if exists
select distinct country.name, sea.name from country
left outer join geo_sea on country.code = geo_sea.country
left outer join sea on geo_sea.sea = sea.name
order by sea.name;

-- Alle Länder mit Wüste und ethnischer Gruppe African
select * from country
join geo_desert on country.code = geo_desert.country
join EthnicGroup on country.code = EthnicGroup.country
join politics on country.code = politics.country
where EthnicGroup.name = 'african';

-- Länder mit genau 3 Städten
select count(city.name) as cityCount, country.name from city
join country on city.country = country.code
group by country
having cityCount =3;

-- Die drei größten Städte Americas
select * from city 
join encompasses on city.country = encompasses.country
where encompasses.continent = 'america'
order by city.population desc
limit 3;

-- größter Berg von Östereich
select * from mountain
join geo_mountain on mountain.name =  geo_mountain.mountain
where geo_mountain.country = 'a'
order by mountain.height desc
limit 1;

-- größter Berg von Europa
select * from mountain
join geo_mountain on mountain.name = geo_mountain.mountain
join encompasses on geo_mountain.country = encompasses.country
where encompasses.continent = 'europe'
and percentage >= 50
order by mountain.height desc
limit 5;

-- Land mit den meisten anerkannten REligionen
select count(religion.name), country.name from country
join religion on country.code = religion.country
group by country
order by count(religion.name) desc
limit 5;

-- Organisationen mit Hauptsitz in Österreich
select * from organization
join country on organization.country = country.code
where country.name = 'austria';


-- höchster Berg pro Kontinent mit mountain.name
select maxBerg.continent, maxBerg.height, mountain.name from mountain
join (select encompasses.continent, max(mountain.height) as height from mountain
join geo_mountain on mountain.name = geo_mountain.mountain
join encompasses on geo_mountain.country = encompasses.country
where encompasses.percentage > 50
group by encompasses.continent
) as maxBerg 
on maxBerg.height = mountain.height;

select encompasses.continent, max(mountain.height) as height from mountain
join geo_mountain on mountain.name = geo_mountain.mountain
join encompasses on geo_mountain.country = encompasses.country
group by encompasses.continent;



select en.Continent, co.Name, count(*) cnt, sum(pr.Population) pop, avg(pr.area) area
from province pr
join country co on pr.Country = co.Code
join encompasses en on en.country = co.Code
group by en.Continent, co.Name;


select * 
from city
where country in (
select code from country where name like '%y'
);

select *
FROM
(
	select code, name, capital from country where name like '%y'
) hauptstadt
join city on city.country = hauptstadt.code;


select * from borders;
-- alle angrenzenden Länder von hungary
select country.name 
from borders
join country on borders.country2 = country.code
where borders.country1 = 'h'
union
select country.name
from borders
join country on borders.country1 =  country.code
where borders.country2 = 'h';

select language.name, sum(country.population) as sumpop from language
join country on language.country = country.code
group by language.name
order by sumpop desc
;

select language.name, sum(country.population) as sumpop from country
join language on country.code = language.country
group by language.name
order by sumpop desc
limit 10
;

select country.name, geo_sea.sea
from country 
left join geo_sea on country.code = geo_sea.country
where geo_sea.sea is null;


select * from city
where city.country like'A';

insert into city (name,Country,province,population)
values ('Dornbirn','A', 'Vorarlberg',42000);

insert into city
values('Bludenz', 'A','Vorarlberg',26000,null,null);

update city c
set c.population = 30000
where c.name = 'Bregenz';

delete from city
where city.name like 'Blud%';

select * from province

;

