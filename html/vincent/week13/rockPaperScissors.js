let randomNum = 0;
let aiMove = "";
let result = "";

// const score = {
//     wins : 0,
//     ties : 0,
//     loses : 0,

// }
let score = JSON.parse(localStorage.getItem('score'));
if(score === null){
    score ={
    wins : 0,
    loses : 0,
    ties : 0,
};
}
updateDisplay();
//console.log(localStorage.getItem('score'));

 
function playGame(playerMove){
    aiMove = computerMove();
    result = '';

   if(playerMove === 'rock'){
    if(aiMove === 'rock'){
        result = 'Tie'
        score.ties += 1;
    }else if(aiMove === 'paper'){
        result = 'You lose'
        score.loses += 1;
    }else{
        result = 'You win'
        score.wins +=1;
    }
   }else if(playerMove === 'paper'){
    if(aiMove === 'rock'){
        result = 'You win'
        score.wins += 1;
    }else if(aiMove === 'paper'){
        result = 'Tie'
        score.ties += 1;
    }else{
        result = 'You lose'
       score.loses += 1;
    }
   }else if(playerMove === 'scissors'){
    if(aiMove === 'rock'){
        result = 'You lose'
        score.loses += 1;
    }else if(aiMove === 'paper'){
        result = 'You win'
        score.wins += 1;
    }else{
        result = ' Tie'
        score.ties += 1;
    }

   }

    localStorage.setItem('score', JSON.stringify(score));
    updateDisplay();
    displayMove(playerMove, aiMove);
    displayResult(result);

   // alertMessage(aiMove, playerMove, result)



}

   function computerMove(){

    randomNum =Math.random();
    if(randomNum >= 0 && randomNum < 1/3){
        aiMove = 'rock'
        console.log('Rock '+ randomNum)
    }else if(randomNum >= 1/3 && randomNum < 2/3){
        aiMove = 'paper'
        console.log('Paper '+ randomNum)
    }
    else if(randomNum >= 2/3 && randomNum < 1){
        aiMove= 'Scissors'
        console.log('Scissors '+ randomNum)
        
    }

    return aiMove;
 
}
function alertMessage(aiMove, playerMove, result){
    alert(` The Computer picked ${aiMove}. You picked ${playerMove}. The result is ${result}.
    Games Win : ${score.wins}
    Games Lose : ${score.loses}
    Tie Games : ${score.ties}
    `)

}

function resetScore(){
    score.wins = 0;
    score.loses = 0;
    score.ties = 0;

localStorage.removeItem('score');

updateDisplay();
document.querySelector('.js-move').innerHTML = '';
document.querySelector('.js-result').innerHTML = '';
}
function updateDisplay(){
document.querySelector('.js-score').innerHTML = `Wins : ${score.wins}
loses : ${score.loses}
Ties : ${score.ties}

`;
}
function displayMove(playerMove, aiMove){
    document.querySelector('.js-move').innerHTML = `You chose ${playerMove}, 
    ${aiMove} is what the computer pick.`

}
function displayResult(result){
document.querySelector('.js-result').innerHTML =`${result}`
}