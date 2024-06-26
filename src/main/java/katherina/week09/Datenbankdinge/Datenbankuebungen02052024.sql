Beispiele, gezeigt von Lukas:

use Mondial;

select Name, Population from country order by Name asc;

select country.Name, city.name from country, city
where country.code = city.country
AND country.Name like 'Aust%'
order by country.Name;

select country.Name , city.name from country
inner join city on country.code = city.country
where country.Name like 'Aust%'
order by country.name;

#country - Province - geo_mountain- Mountain
select country.Name as 'country name', province.Name as 'province', mountain.Height from country, geo_mountain, mountain
where coutry.code = province.country
AND province.name = geo_mountain.province
AND geo_mountain.mountain = mountain.name
and country.name = 'Austria'
order by mountain.heigh desc;

select country.Name as 'country name', province.Name as 'province', mountain.Height from country
inner join province on country.code = province.country
inner join geo_mountain on province.name = geo_mountain.province
inner join mountain on go_mountain.mountain = mountain.name
where country.name = 'Austria'
order by montain.height desc;

select * from province
left join geo_mountain on province.name = geo_mountain.province;

select country.name,count(*), min (city.population) as 'min', max(city.population) as 'max', sum(city.population) from country
inner join city on country.code = city.country
group by country.name
order by country.name;

Übungsaufgaben:

use Mondial;

SELECT Name, Population FROM mondial.country WHERE Name = 'Austria';
#Wie viele Einwohner hat Österreich? - 8023244

select continent.name, sum(country.Population) from continent #Ich sage, was kombiniert werden soll. sum ergibt nur Sinn bei Zahlen, bei Namen kommt Unsinn raus.
inner join encompasses on continent.name = encompasses.continent #verbindet continent und encompasses. Aber noch nicht den Rest.
inner join country on encompasses.country = country.code #Alle drei sind verknüpft.
where continent.name = 'Europe'
group by continent.name; #Im Prinzip: Gucken, welche Tabellen hier "angefasst" werden und diese mittels join verbinden. Semikolon steht nur nach der fertigen Anweisung.
#Einwohnerzahl von ganz Europa

select distinct country.Name as 'country name', river.name as 'river' from country
inner join geo_river on country.code = geo_river.country #Wenn ich sehen will, was ich mit was verknüpfen will, dann entweder "Tables" ausklappen oder Grafik im Wiki
inner join River on geo_river.river = river.Name #Eigentlich ist der Fluss nur über die Provinz erreichbar. (Uneigentlich haben wir es so irgendwie hingekriegt.)
#Province.name = geo_river.province
where country.name = 'Austria';
#Welche Flüsse fließen durch Österreich?

select distinct continent.name as 'continent', river.name as 'river' from continent #select distinct entfernt Dupletten.
inner join encompasses on continent.name = encompasses.continent
inner join country on encompasses.country = country.code
inner join province on country.code = province.country #Ebenenverschachtelung - das Land ist im Kontinent, die Provinz im Land ...
inner join geo_river on Province.name = geo_river.province #... und der Fluss fließt durch die Provinz.
inner join River on geo_river.river = river.Name
where continent.name = 'Europe';
#Welche Flüsse fließen durch Europa (nur den Flussnamen)?

