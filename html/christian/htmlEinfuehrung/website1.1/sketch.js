let stars = [];
let speed;
function setup() {
  createCanvas(400, 400);
  for (let i = 0; i < 1000; i += 1) {
    let star = new Star();
    stars.push(star);
  }
}

function draw() {
  background(0);
  translate(width/2,height/2);
  speed = map(mouseX,0,width,1,50)
  for (let i = 0; i < stars.length; i += 1) {
    stars[i].update(speed);
    stars[i].display();
  }
}