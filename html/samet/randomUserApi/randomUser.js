
loadData()


async function loadData(){
    const result = await fetch('https://randomuser.me/api/?results=10')
    const data = await result.json()

    console.log(data.results[0])
    updateUI(data.results[0])
}

function updateUI(data){
    let rootElement = document.getElementById('randomUser')
    rootElement.innerHTML = ""

    let divImageContainer = document.createElement('div')
    divImageContainer.classList.add('imgContainer')

    let imgElement = document.createElement('img')
    imgElement.classList.add('userimg')
    imgElement.classList.add(data.gender)
    imgElement.src = data.picture.large
    imgElement.alt = 'Picture of ' + data.name.first + ' ' + data.name.last
    divImageContainer.appendChild(imgElement)

    let divName = document.createElement('div')
    divName.classList.add('name')
    divName.innerText = data.name.first + ' ' + data.name.last

    let divEmail = document.createElement('div')
    divEmail.classList.add('email')
    let linkEmail = document.createElement('a')
    linkEmail.href = 'mailto:' + data.email
    linkEmail.innerText = data.email
    divEmail.appendChild(linkEmail)

    let divTel = document.createElement('div')
    divTel.classList.add('tel')
    divTel.innerText = data.phone


    rootElement.appendChild(divImageContainer)
    rootElement.appendChild(divName)
    rootElement.appendChild(divEmail)
    rootElement.appendChild(divTel)

}