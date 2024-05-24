let pz;
class Star {
  constructor() {
    this.x = random(-width, width);
    this.y = random(-height, height);
    this.z = random(width);
    pz = this.z;
  }

  update(speed) {
    this.z = this.z -speed;
    if (this.z < 1) {
      this.z = random(width);
      this.x = random(-width, width);
      this.y = random(-height, height);
      pz = this.z;
    }
  }

  display() {
    fill(255);
    noStroke();

    let sx = map(this.x / this.z, 0, 1, 0, width);
    let sy = map(this.y / this.z, 0, 1, 0, width);

    let r = map(this.z, 0, width, 8, 0);
    
    ellipse(sx, sy, r, r);
    pz = this.z
    
    let px = map(this.x/pz, 0, 1, 0, width);
    let py = map(this.y/pz, 0, 1, 0, height);

    stroke(255);
    line(px,py,sx,sy);
  }
}