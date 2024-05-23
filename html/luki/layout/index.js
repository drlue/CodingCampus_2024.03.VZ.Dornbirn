const contentLeft = document.getElementById("contentLeft")

let shadowX = -10
let shadowY = 0

function updateShadow() {
    console.log("SHADOW update!!!")

    shadowX += 0.1
    shadowY += 0.1

    contentLeft.style.boxShadow = shadowX + "px " + shadowY + "px 5px black"

    if (shadowX >= 10) {
        shadowX = -10
    }
    if (shadowY >= 10) {
        shadowY = -10
    }
}

async function repeat() {
    // while (true) {
    //     await new Promise((res) => setTimeout(res, 1))
    //     updateShadow()
    // }
}

repeat()