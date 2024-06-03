let sqlData;
let restData;

function initPage() {
    let searchInput = document.getElementById('searchInput');
    searchInput.value = '';

    let rootElement = document.querySelector(".scrollContainer");
    rootElement.innerHTML = '';

}

async function loadData() {
    //localStorage.clear();
    try {
        // Data from local MySQL DB
        sqlData = await getDataFromSql();
        //console.log(sqlData);

        // Data from localstorage or from restcountries.com/api if not stored
        restData = localStorage.getItem('restData');
        if (restData === null) {
            restData = await getDataFromRestCountries();
            console.log(restData);
            localStorage.setItem('restData', JSON.stringify(restData));
        } else {
            restData = JSON.parse(restData);
        }
        //console.log(restData);

        updateInfoText(sqlData);
        updateHtml(sqlData, restData);

    } catch (error) {
        console.error('There was a problem loading the data:', error);
        showErrorText('There was a problem loading the data: '+ error);
    }
}

async function getDataFromSql() {
    try {
        // Get data from local MySQL
        let valueToSearch = document.getElementById('searchInput').value
        //let valueToSearch ="Belgium";

        const response = await fetch('/api/country?name=' + valueToSearch);
        if (!response.ok) {
            throw new Error('Network response was not ok ' + response.statusText);
        }
        const data = await response.json();
        return data;
    } catch (error) {
        console.error('There was a problem with the fetch operation for SQL data:', error);
        showErrorText('There was a problem loading the data: '+ error);
        return null; // Return null or handle it in a way that makes sense for your application
    }
}

async function getDataFromRestCountries() {
    try {
        // Get data from restcountries.com
        const responseRest = await fetch('https://restcountries.com/v2/all');
        if (!responseRest.ok) {
            showErrorText('Network response was not ok ' + responseRest.statusText);
            throw new Error('Network response was not ok ' + responseRest.statusText);
            
        }
        const dataRest = await responseRest.json();
        return dataRest;
    } catch (error) {
        console.error('There was a problem with the fetch operation for REST countries data:', error);
        showErrorText('There was a problem with the fetch operation for REST countries data: ' + error);
        return null; // Return null or handle it in a way that makes sense for your application
    }
}


function updateHtml(sqlData, restData) {

    let rootElement = document.querySelector(".scrollContainer");
    rootElement.innerHTML = '';

    let i = 0;
    for (line of sqlData) {
        
        let line = sqlData[i];

        //check empty Capital
        if(line.Capital === null) {
            sqlData[i].Capital = '';
        }

        //row
        let divCountryContainer = document.createElement('div')
        divCountryContainer.classList.add('countryContainer', 'gridLayout')
        rootElement.appendChild(divCountryContainer)


        //flag image
        let divFlagCell = document.createElement('div')
        divFlagCell.classList.add('flagCell', 'centeredContent')
        divCountryContainer.appendChild(divFlagCell)

        let imgFlag = document.createElement('img')
        imgFlag.classList.add('flag')
        //console.log("try to get flag from dataRest")
        let imgReturn = getFlagFromDataImgRest(line, restData)
        //let imgReturn = imgNotFound()
        //console.log(`Pfad zum Bild: ${imgReturn}`)
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

        i++;

    }

}

function getFlagFromDataImgRest(country, restData) {
    //console.log("-----------------")
    //console.log("Country Name = " + country.Name + " Country Code = " + country.Code);

    //loop over dataRest 
    for (dataRestRow of restData) {

        //console.log("DataRestRowName = " + dataRestRow.name + " alpha2Code = " + dataRestRow.alpha2Code + " alpha3Code = " + dataRestRow.alpha3Code);
        if (country.Name === dataRestRow.name) {
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

function sortByName() {
    console.log("sortByName")
    let sortDirection = localStorage.getItem('SortDirection');
    if (sortDirection === 'asc') {

        sqlData.sort((a, b) => a.Name.localeCompare(b.Name))
        sortDirection = 'desc';
    } else {
        sqlData.sort((a, b) => b.Name.localeCompare(a.Name))
        sortDirection = 'asc'
    }
    console.log(sortDirection);
    localStorage.setItem('SortDirection', sortDirection);
    updateHtml(sqlData, restData);
}

function sortByCode() {
    console.log("sortByCode")
    let sortDirection = localStorage.getItem('SortDirection');
    if (sortDirection === 'asc') {

        sqlData.sort((a, b) => a.Code.localeCompare(b.Code))
        sortDirection = 'desc';
    } else {
        sqlData.sort((a, b) => b.Code.localeCompare(a.Code))
        sortDirection = 'asc'
    }
    console.log(sortDirection);
    localStorage.setItem('SortDirection', sortDirection);
    updateHtml(sqlData, restData);
}

function sortByCapital() {
    console.log("sortByCapital")
    let sortDirection = localStorage.getItem('SortDirection');
    if (sortDirection === 'asc') {

        sqlData.sort((a, b) => a.Capital.localeCompare(b.Capital))
        sortDirection = 'desc';
    } else {
        sqlData.sort((a, b) => b.Capital.localeCompare(a.Capital))
        sortDirection = 'asc'
    }
    console.log(sortDirection);
    localStorage.setItem('SortDirection', sortDirection);
    updateHtml(sqlData, restData);
}

function sortByArea() {
    console.log("sortByArea")
    let sortDirection = localStorage.getItem('SortDirection');
    if (sortDirection === 'asc') {

        sqlData.sort((a, b) => a.Area - b.Area)
        sortDirection = 'desc';
    } else {
        sqlData.sort((a, b) => b.Area - a.Area)
        sortDirection = 'asc'
    }
    console.log(sortDirection);
    localStorage.setItem('SortDirection', sortDirection);
    updateHtml(sqlData, restData);
}

function sortByPopulation() {
    console.log("sortByArea")
    let sortDirection = localStorage.getItem('SortDirection');
    if (sortDirection === 'asc') {

        sqlData.sort((a, b) => a.Population - b.Population)
        sortDirection = 'desc';
    } else {
        sqlData.sort((a, b) => b.Population - a.Population)
        sortDirection = 'asc'
    }
    console.log(sortDirection);
    localStorage.setItem('SortDirection', sortDirection);
    updateHtml(sqlData, restData);
}

function updateInfoText(sqlData) {
    console.log(sqlData);
    let resultCount = sqlData.length;
    let infoText = document.getElementById('infoText');
    infoText.innerText = resultCount + " results found";
}

function showErrorText(txt) {
    let errorContainer = document.getElementById('errorContainer');
    errorContainer.style.display = 'inherit';

    let errorText = document.getElementById('errorText');
    errorText.innerText = txt;

}

function closeErrorContainer() {
    let errorContainer = document.getElementById('errorContainer');
    errorContainer.style.display = 'none';

    let errorText = document.getElementById('errorText');
    errorText.innerText = '';
}