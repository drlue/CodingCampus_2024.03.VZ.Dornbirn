select continent.name, sum(country.Population) from continent  #Dieser Code gibt mir erstmal die Bevölkerungen aller Kontinente aus, indem die Bevölkerungen aller Länder addiert werden.
inner join encompasses on continent.name = encompasses.continent
#inner join encompasses on country.percantage = encompasses.country
inner join country on encompasses.country = country.code
group by continent.name;
#Wie viel Prozent der Menschen leben im Kontinent Europa?