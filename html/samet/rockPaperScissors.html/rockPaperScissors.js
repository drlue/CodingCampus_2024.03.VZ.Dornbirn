


let randomNr = 0;
let aiMove = '';
let result = ''; 

/*
const score = {
    wins: 0,
    losses: 0,
    ties: 0,
}
*/

let score = JSON.parse(localStorage.getItem('Score'))

if(score === null) {
    score = {
        wins: 0,
        losses: 0,
        ties: 0,
    }
}

updateScoreDisplay();




function playGame(playerMove){
    aiMove = computerMove();
    result = '';

    console.log(playerMove);
    console.log(aiMove);

    if (playerMove === 'rock'){
        if (aiMove === 'rock'){
            result = 'Tie'
            score.ties += 1
        } else if (aiMove === 'paper') {
            result = 'You Lose'
            score.losses += 1
        } else {
            result = 'You Win'
            score.wins += 1
        }
    } else if (playerMove === 'paper') {
        if (aiMove === 'rock') {
            result = 'You Win'
            score.wins += 1
        } else if (aiMove === 'paper') {
            result = 'Tie'
            score.ties += 1
        } else {
            result = 'You Lose'
            score.losses += 1
        }
    } else if (playerMove === 'scissors') {
        if ( aiMove === 'rock') {
            result = 'You Lose'
            score.losses += 1
        } else if (aiMove === 'paper')
            result = 'You Win'
            score.wins += 1
        } else{
            result = 'Tie'
            score.ties +=1
        }

        console.log(result);
        
        localStorage.setItem('Score', JSON.stringify(score));
        updateScoreDisplay();
        displayMoves(playerMove, aiMove);
        displayResult(result);

        
            


 //       alertMessage(aiMove, playerMove, result);



    }
    
function computerMove(){
    randomNr = Math.random();

    if(randomNr >=0 && randomNr<1/3){
        aiMove = 'rock'
        console.log('Rock'+ randomNr);

    }else if(randomNr >= 1/3 && randomNr <2/3){
        aiMove = 'paper'
        console.log('Paper' +randomNr);
    }else if(randomNr >=2/3 && randomNr <1){
        aiMove = 'scissor'
        console.log('Scissors');
    }

return aiMove;

}

function alertMessage(aiMove, playerMove, result){
    alert(`The Computer picked ${aiMove}. You picked ${playerMove}. The result is ${result}
    Wins: ${score.wins}. Losses: ${score.losses}. Ties: ${score.ties} `)
}
function resetScore(){
    score.wins = 0;
    score.losses = 0;
    score.ties = 0;

    localStorage.removeItem('Score');

    updateScoreDisplay();
    document.querySelector('js-move').innerHTML = '';
    document.querySelector('js-result').innerHTML = '';
}

function updateScoreDisplay(){
    document.querySelector('.js-score').innerHTML = `Wins: ${score.wins}
     Losses: ${score.losses} 
     Ties: ${score.ties}`;
}

function displayMoves(playerMove, aiMove) {
    document.querySelector('.js-move').innerHTML = `You choose ${playerMove} <> ${aiMove} is what the 
    Computer choose.`
}

function displayResult(result) {
    document.querySelector('.js-result').innerHTML = `${result}`
}


