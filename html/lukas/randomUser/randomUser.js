async function loadData() {

    const result = await fetch('https://randomuser.me/api/')
    const data = await result.json()

    updateUI(data.results[0])
    console.log(data.results[0]);
}


function updateUI(data) {

    let rootElement = document.querySelector(".cardContainer");
    rootElement.innerHTML = '';
    rootElement.classList.add(data.gender);
    

    let divImgContainer = document.createElement('div');
    divImgContainer.classList.add('imgContainer');
    rootElement.appendChild(divImgContainer);

    let userImg = document.createElement('img');
    userImg.src = data.picture.large;
    userImg.alt = 'Picture of ' + data.name.first + ' ' + data.name.last;
    divImgContainer.appendChild(userImg);

    //----

    let divUserData = document.createElement('div');
    divUserData.classList.add('userData');
    rootElement.appendChild(divUserData);


    let divName = document.createElement('div');
    divName.classList.add('name');
    divName.innerText = data.name.first + ' ' + data.name.last;
    divUserData.appendChild(divName);

    let divStreet = document.createElement('div');
    divStreet.classList.add('street');
    divStreet.innerText = data.location.street.name + ' ' + data.location.street.number;
    divUserData.appendChild(divStreet);

    let divPlace = document.createElement('div');
    divPlace.classList.add('place');
    divPlace.innerText = data.location.postcode + ' ' + data.location.city + " - " + data.location.country;
    divUserData.appendChild(divPlace);

    //Phone
    let divTel = document.createElement('div');
    divTel.classList.add('tel');

    let iElementPhone = document.createElement('i')
    iElementPhone.classList.add('fa-solid', 'fa-phone')
    divTel.appendChild(iElementPhone)

    let spanElement1 = document.createElement('span')
    spanElement1.innerText = data.phone;
    divTel.appendChild(spanElement1)

    divUserData.appendChild(divTel);

    //Cellphone
    let divCell = document.createElement('div');
    divCell.classList.add('cell');

    let iElementCell = document.createElement('i')
    iElementCell.classList.add('fa-solid', 'fa-mobile-screen')
    divCell.appendChild(iElementCell)

    let spanElement2 = document.createElement('span')
    spanElement2.innerText = data.cell;
    divCell.appendChild(spanElement2)

    divUserData.appendChild(divCell);

    //Email
    let divMail = document.createElement('div');
    divMail.classList.add('mailContainer');

    let iElementMail = document.createElement('div');
    iElementMail.classList.add('fa-solid', 'fa-envelope');
    divMail.appendChild(iElementMail);

    let spanElement3 = document.createElement('span');
    divMail.appendChild(spanElement3);

    let mailLink = document.createElement('a');
    mailLink.classList.add('mailLink');
    mailLink.innerText = data.email;
    mailLink.href = "mailto:" + data.email;
    spanElement3.appendChild(mailLink);

    divUserData.appendChild(divMail);

    








}