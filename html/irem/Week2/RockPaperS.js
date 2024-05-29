let randomNum = 0;
let aimove = '' ;
let result = '';

/*
const score ={
    wins: 0,
    losses: 0,
    ties: 0,

}
*/
let score = JSON.parse(localStorage.getItem('score'))

if (score === null){
    score ={
        wins: 0,
        losses: 0,
        ties: 0,
    };
}

updateScoreDisplay();

console.log(localStorage.getItem('score'));

function playGame (playerMove){
    aimove = computerMove();
    result = '';

    console.log(aimove + playerMove);

if (playerMove === 'Rock'){
    if (aimove === 'Rock'){
        result = 'Tie';
    }else if (aimove === 'Paper'){
        result = 'You lose';
    }else{
        result = 'You Win';
    }
}else if (playerMove === 'Paper'){
    if (aimove === 'Rock'){
        result = 'You Win';
    }else if (aimove === 'Paper'){
        result = 'Tie';
    }else{
        result = 'You Lose';
    }
 }else if (playerMove === 'Scissor'){
    if (aimove === 'Rock'){
        result = 'You Lose';
    }else if (aimove === 'Paper'){
        result = 'You Win';
    }else{
        result = 'Tie';
    }
 }

 console.log(result);

   if (result === 'You Win'){
    score.wins += 1;
   }else if (result === 'You Lose'){
    score.losses += 1;
   }else if (result === 'Tie'){
    score.ties += 1;
   }
   localStorage.setItem('Score', JSON.stringify(score));

   updateScoreDisplay();
   displayMoves( playerMove, aimove);
   displayResult(result);

   alertMessage(aimove, playerMove, result)
}

   function computerMove(){
randomNum = Math.random();

if(randomNum >= 0 && randomNum <1/3){
    aimove = 'Rock';
}else if (randomNum >= 1/3 && randomNum< 2/3){
    aimove = 'Paper'
}else if (randomNum >= 2/3 && randomNum <1){
    aimove = 'Scissor'
}

console.log(aimove + randomNum);
return aimove
  
   }
   
  function alertMessage(aimove,playerMove,result){
    alert(`ComputerMove is : ${aimove}. PlayerMove is : ${playerMove}. The Game is : ${result}.
Wins: ${score.wins}
Losses:${score.losses}
Ties:${score.ties}
      `)
   }
  function resetScore(){
    score.wins = 0;
    score.losses = 0;
    score.tie = 0;

    localStorage.removeItem('score');

    updateScoreDisplay();
    document.querySelector('.js-move').innerHTML = '';
    document.querySelector('.js-result').innerHTML = '';

}
function updateScoreDisplay(){
    document.querySelector('.js-score').innerHTML= `wins: ${score.wins}
    losses: ${score.losses}
    ties: ${score.ties}`;
}
function displayMoves(playerMove, aimove){
    document.querySelector('.js-move').innerHTML = `You choose ${playerMove}<>${aimove}is what the Computer pick.  `
}
function displayResult(result){
    document.querySelector('.js-result').innerHTML = `${result}`
}
