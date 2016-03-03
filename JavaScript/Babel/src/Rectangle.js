class Rectangle{
  constructor(length, breadth){
    this.length = length;
    this.breadth = breadth;
  }

  get area(){
  return this.caclArea();
  
  }

  calcArea(){
  return this.length*this.breadth;
  }
}
