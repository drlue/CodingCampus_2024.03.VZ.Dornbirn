

async function loadData() {
    const response = await fetch('/api/test');
    const data = await response.json();

    console.log(data);
    updateHtml(data);

}


function updateHtml(data) {

    let rootElement = document.querySelector(".mainContainer");
    rootElement.innerHTML = '';

    data.forEach(line => {

        let divCardContainer = document.createElement('div');
        divCardContainer.classList.add('cardContainer');
        rootElement.appendChild(divCardContainer);


        let divImgContainer = document.createElement('div');
        divImgContainer.classList.add('imgContainer');
        divCardContainer.appendChild(divImgContainer);

        let userImg = document.createElement('img');
        userImg.src = line.image;
        userImg.alt = 'Picture of ' + line.firstname + ' ' + line.lastname;
        divImgContainer.appendChild(userImg);

        //----

        let divUserData = document.createElement('div');
        divUserData.classList.add('userData');
        divCardContainer.appendChild(divUserData);


        let divName = document.createElement('div');
        divName.classList.add('name');
        divName.innerText = line.firstname + ' ' + line.lastname;
        divUserData.appendChild(divName);


        //Phone
        let divTel = document.createElement('div');
        divTel.classList.add('tel');

        let iElementPhone = document.createElement('i')
        iElementPhone.classList.add('fa-solid', 'fa-phone')
        divTel.appendChild(iElementPhone)

        let spanElement1 = document.createElement('span')
        spanElement1.innerText = line.phone;
        divTel.appendChild(spanElement1)

        divUserData.appendChild(divTel);


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
        mailLink.innerText = line.email;
        mailLink.href = "mailto:" + line.email;
        spanElement3.appendChild(mailLink);

        divUserData.appendChild(divMail);



    });


}