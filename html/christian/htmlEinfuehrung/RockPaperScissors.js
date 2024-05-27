let score = JSON.parse(localStorage.getItem('Score'))

if(score ===null){
 score = {
 wins: 0,
 ties: 0,
 losses: 0,
}   
}
updateScoreDisplay();


function playGame(playerMove){
    let value = 0;
    if(playerMove === 'rock'){
        value=1;
        calc(value);
    }else if (playerMove === 'paper'){
        value = 2;
        calc(value);
    }else{
        value = 3;
        calc(value);
    }

}
function calc(value){
    let randomValue = Math.random();
    let playerMove;
    let AiMove;
    let result;

    if(value == 1){
        if(randomValue <1/3){
            //alert('Stone against stone: Tie!');
            score.ties +=1;
            playerMove = 'Stone';
            AiMove = 'Stone';
            result = 'Tie';
        }else if (randomValue >1/3 && randomValue <2/3){
            //alert('Stone against paper: You lose!');
            score.losses +=1;
            playerMove = 'Stone';
            AiMove = 'Paper';
            result = 'Loss';
        } else {
            //alert('Stone against scissors: You won!');
            score.wins +=1;
            playerMove = 'Stone';
            AiMove = 'Scissors';
            result = 'Win';
        }
    }else if (value == 2){
        if(randomValue <1/3){
            //alert('Stone against paper: You won!');
            score.wins +=1;
            playerMove = 'Paper';
            AiMove = 'Stone';
            result = 'Win';
        }else if (randomValue >1/3 && randomValue <2/3){
            //alert('Paper against paper: Tie!');
            score.ties +=1;
            playerMove = 'Paper';
            AiMove = 'Paper';
            result = 'Tie';
        } else {
            //alert('Paper against scissors: You loose!');
            score.losses +=1;
            playerMove = 'Paper';
            AiMove = 'Scissors';
            result = 'Loss';
        }
    }else {
        if(randomValue <1/3){
            //alert('Scissors against stone: You loose!');
            score.losses +=1;
            playerMove = 'Scissors';
            AiMove = 'Stone';
            result = 'Loss';
        }else if (randomValue >1/3 && randomValue <2/3){
            //alert('Scissors against paper: You won!');
            score.wins +=1;
            playerMove = 'Scissors';
            AiMove = 'Paper';
            result = 'Win';
        } else {
            //alert('Scissors against scissors: Tie!');
            score.ties +=1;
            playerMove = 'Scissors';
            AiMove = 'Scissors';
            result = 'Tie';
        }
    }

    localStorage.setItem('Score',JSON.stringify(score));
    updateScoreDisplay();
    displayMoves(playerMove,AiMove,result);
    displayScore();

}
function resetScore(){
    score.wins = 0;
    score.losses = 0;
    score.ties = 0;

    localStorage.removeItem('Score')
    updateScoreDisplay();
}

function updateScoreDisplay(){
document.querySelector('.js-score').innerHTML = `Wins: ${score.wins}
Losses : ${score.losses}
Ties: ${score.ties}`
}

function displayMoves(playerMove, AiMove, result){
document.querySelector('.js-move').innerHTML = `Player: ${playerMove} <> ${AiMove} : Computer <br> Result: ${result}`
}
function displayScore(){
document.querySelector('.js-score').innerHTML = `Wins: ${score.wins}\nLosses: ${score.losses}\nTies: ${score.ties}`

}