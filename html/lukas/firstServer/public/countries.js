async function loadData() {
    //localStorage.clear();
    try {
        // Data from local MySQL DB
        let sqlData = localStorage.getItem('sqlData');
        console.log(sqlData);
        if (sqlData === null) {
            sqlData = await getDataFromSql();
            console.log(sqlData);
            localStorage.setItem('sqlData', JSON.stringify(sqlData));
        } else {
            sqlData = JSON.parse(sqlData);
        }
        console.log(sqlData);

        // Data from restcountries.com
        let restData = localStorage.getItem('restData');
        if (restData === null) {
            restData = await getDataFromRestCountries();
            console.log(restData);
            localStorage.setItem('restData', JSON.stringify(restData));
        } else {
            restData = JSON.parse(restData);
        }
        console.log(restData);

        updateHtml(sqlData, restData);

    } catch (error) {
        console.error('There was a problem loading the data:', error);
    }
}

async function getDataFromSql() {
    try {
        // Get data from local MySQL
        const response = await fetch('/api/country');
        if (!response.ok) {
            throw new Error('Network response was not ok ' + response.statusText);
        }
        const data = await response.json();
        return data;
    } catch (error) {
        console.error('There was a problem with the fetch operation for SQL data:', error);
        return null; // Return null or handle it in a way that makes sense for your application
    }
}

async function getDataFromRestCountries() {
    try {
        // Get data from restcountries.com
        const responseRest = await fetch('https://restcountries.com/v2/all');
        if (!responseRest.ok) {
            throw new Error('Network response was not ok ' + responseRest.statusText);
        }
        const dataRest = await responseRest.json();
        return dataRest;
    } catch (error) {
        console.error('There was a problem with the fetch operation for REST countries data:', error);
        return null; // Return null or handle it in a way that makes sense for your application
    }
}

function updateHtml(sqlData, restData) {

    let rootElement = document.querySelector(".scrollContainer");
    //rootElement.innerHTML = '';

    for (line of sqlData) {

        //row
        let divCountryContainer = document.createElement('div')
        divCountryContainer.classList.add('countryContainer', 'gridLayout')
        rootElement.appendChild(divCountryContainer)


        //flag image
        let divFlagCell = document.createElement('div')
        divFlagCell.classList.add('flagCell')
        divCountryContainer.appendChild(divFlagCell)

        let imgFlag = document.createElement('img')
        imgFlag.classList.add('flag')
        console.log("try to get flag from dataRest")
        let imgReturn = getFlagFromDataImgRest(line, restData)
        //let imgReturn = imgNotFound()
        console.log(`Pfad zum Bild: ${imgReturn}`)
        imgFlag.src = imgReturn
        //imgFlag.src = `https://flagsapi.com/${line.Code}/flat/64.png`
        imgFlag.alt = `Flag of ${line.Name}`
        divFlagCell.appendChild(imgFlag)

        //country Data
        let divNameCell = document.createElement('div')
        divNameCell.classList.add('nameCell')
        divNameCell.innerText = line.Name
        divCountryContainer.appendChild(divNameCell)

        let divCodeCell = document.createElement('div')
        divCodeCell.classList.add('codeCell')
        divCodeCell.innerText = line.Code
        divCountryContainer.appendChild(divCodeCell)

        let divCapitalCell = document.createElement('div')
        divCapitalCell.classList.add('capitalCell')
        divCapitalCell.innerText = line.Capital
        divCountryContainer.appendChild(divCapitalCell)

        let divAreaCell = document.createElement('div')
        divAreaCell.classList.add('areaCell')
        divAreaCell.innerText = line.Area
        divCountryContainer.appendChild(divAreaCell)

        let divPopulationCell = document.createElement('div')
        divPopulationCell.classList.add('populationCell')
        divPopulationCell.innerText = line.Population
        divCountryContainer.appendChild(divPopulationCell)

    }

}

function getFlagFromDataImgRest(country, restData) {
    console.log("-----------------")
    console.log("Country Name = " + country.Name + " Country Code = " + country.Code);

    //loop over dataRest 
    for (dataRestRow of restData) {

        console.log("DataRestRowName = " + dataRestRow.name + " alpha2Code = " + dataRestRow.alpha2Code + " alpha3Code = " + dataRestRow.alpha3Code);
        if (country.Name === dataRestRow.name ||
            country.Code === dataRestRow.alpha2Code ||
            country.Code === dataRestRow.alpha3Code 
            
        ) {
            let flagImgPath = dataRestRow.flags.png;
            console.log(flagImgPath);
            return flagImgPath;

        }

    }

    return 'https://upload.wikimedia.org/wikipedia/commons/b/b9/No_photo_%282067963%29_-_The_Noun_Project.svg';

};

function imgNotFound() {
    return 'https://upload.wikimedia.org/wikipedia/commons/b/b9/No_photo_%282067963%29_-_The_Noun_Project.svg';
}