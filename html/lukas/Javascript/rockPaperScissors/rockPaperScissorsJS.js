
//GLOBALE VARIABLEN
let randomNum = 0;
let aiMove = '';
let playerMove = '';
let result = '';

/*
const score  = {
    wins: 0,
    losses: 0,
    ties: 0,
}
*/

//get score from local storage
let score = JSON.parse(localStorage.getItem('Score'));

//Initialisisieren falls null
if (score === null) {
    score  = {
        wins: 0,
        losses: 0,
        ties: 0,
    } 
}

updateScoreDisplay();



function playGame(playerMoveInput) {
    computerMove();

    playerMove = playerMoveInput;

    switch(playerMove) {
        case 'rock': 
            if(aiMove === "rock") {
                result = 'Tie';
            } else if(aiMove === "paper") {
                result = 'You loose';
            } else {
                result = 'You win';
            }
            break;

        case 'paper':
            if(aiMove === "rock") {
                result = 'You win';
            } else if(aiMove === "paper") {
                result = 'Tie';
            } else {
                result = 'You loose';
            }
            break;

        case 'scissors':
            if(aiMove === "rock") {
                result = 'You loose';
            } else if(aiMove === "paper") {
                result = 'You win';
            } else {
                result = 'Tie';
            }
            break;
        }
       
        
        console.log(playerMove + " " + aiMove + " " + result);
        refreshScore(result)
        updateHtml();
        //alertMessage (playerMove, aiMove, result)
        
}


function computerMove() {

    let aiNumber = Math.random();
    
    if(aiNumber <= 1/3) {
        aiMove = "rock";
    } else if(aiNumber > 1/3 && aiNumber <= 2/3 ) {
        aiMove = "paper";
    } else {
        aiMove = "scissors";
    }

    console.log(aiNumber + ' ' + aiMove);
    return aiMove;
}


function alertMessage(aiMove, playerMove, result){

    //alert('You choose '+ playerMove +', AI choose ' + aiMove + '. ' + result + '!');
    
    //String in Accent - Anführunszeichen
    alert(`You choose ${playerMove}.
AI choose ${aiMove}.
${result}!
Wins ${score.wins} | Losses ${score.losses} | Ties ${score.ties}`);

}




function refreshScore(result) {
    switch(result) {
        case 'You win':
            score.wins++;
            break;
        case 'You loose':
            score.losses++;
            break;
        case 'Tie':
            score.ties++;
            break;
    }

    //after updating, write to local Storage
    localStorage.setItem('Score', JSON.stringify(score));
}



function resetScore() {
    score.wins = 0;
    score.losses = 0;
    score.ties = 0;

    localStorage.removeItem('Score')
    updateScoreDisplay();
    document.querySelector('.js-move').innerHTML = ``;
    document.querySelector('.js-result').innerHTML = ``;

}

function updateHtml(){
    updateScoreDisplay();
    displayMoves();
    displayResult();
}


function updateScoreDisplay() {
    document.getElementById('counterWins').innerHTML = score.wins;
    document.getElementById('counterTies').innerHTML = score.ties;
    document.getElementById('counterLosses').innerHTML = score.losses;

    let resultDivBg = '';
    if (result === 'You win') {
        resultDivBg = 'green';
    } else if (result === 'Tie') {
        resultDivBg = 'lightgray';
    } else if (result === 'You loose') {
        resultDivBg = 'red'
    }

}

function displayMoves() {
    document.querySelector('.js-move').innerHTML = `You choose ${playerMove}. AI choose ${aiMove}`;
}

function displayResult(){
    document.querySelector('.js-result').innerHTML = `${result}`;
}


