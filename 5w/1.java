// 상속을 이용해 간결하게 재작성
class A{
  private int amount;
  public int getAmount() {return amount; }
  public coid setAmount(int amount) { this.amount = amount; }
}

class SharpPencil extends A{
  private int width;
}

class BallPen extends A{
  Private String color;
  public String getColor() { return color; }
  public void setColor(String color) {this.color=color;}
}

class FountainPen extends BallPen{  
  public coid setAmount(int amount) { this.amount = n; }
  public void refill(int n) { amount = n; }
}
