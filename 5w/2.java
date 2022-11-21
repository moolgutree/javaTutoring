// 다음 TV 클래스와 main() 메소드, 실행 결과를 참고하여 TV를 상속받은 ColorTV클래스를 작성하라.
class TV{
  private int size;
  public TV(int size) { this.size = size; }
  protected int getSize() {return size;}
}

class ColorTV extends TV {  
  int color;
  ColorTV(int a, int b) { super(a); color = b;}
  public void printProperty() {
    System.out.println(getSize() + "인치" + color + "컬러");
  }
}
