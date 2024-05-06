#Alle Länder die mit einem A anfangen
select country.Name FROM mondial.country where country.name like 'A%';

#Alle Länder die mit einem A anfangen und deren Bundesländer mit Einwohnerzahl, sortiert nach Einwohnerzahl
select country.Name as 'Land', province.name as 'Bundesland', province.population as 'Bevoelkerung' from country
join province on country.code = province.country
where country.name like 'A%'
order by province.population;

#Alle Flüsse die durch Europa fließen (nur Flüsse und deren Länge), sortiert nach Länge
select distinct river.name, river.Length 
from encompasses #Aus welcher Tabelle? Aus Tabelle 'encompasses', die "Country", "Continent" und "Percentage" enthält. 
join geo_river on encompasses.country = geo_river.country #Verbinde Tabelle "geo_river" mit der Reihe "country" aus der Tabelle "Encompasses" zu "georiver + country".
join river on river.name = geo_river.River #Verbinde Tabelle river mit der Tabellenreihe "River" aus der Tabelle "geo_river" zu "georiver.River"
where encompasses.Continent = 'Europe' AND encompasses.Percentage >= 50 
order by river.Length DESC;

#Tipp: Immer wieder zwischendurch Tabellen ausgeben lassen mit Select * Tabelle. Dann gucken, ob es verknüpfbare Parts gibt. 

#Wie viel Prozent der Menschen leben im Kontinent Europa?
select continent.name as 'Kontinent', (sum(country.Population)/(select sum(country.Population) from country))*100 AS 'percentage of world population'
 from continent
join encompasses on continent.name = encompasses.continent #Füge zur Tabelle "Encompasses" den Namen des Kontinents hinzu.
join country on encompasses.country = country.code #füge zur Tabelle "Country" die Reihe "country" aus der Encompasses-Tabelle hinzu.
where encompasses.Continent = 'Europe' AND encompasses.Percentage >= 50
group by continent.name;