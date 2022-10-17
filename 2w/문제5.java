// 스위치문 사용새서 출력하기
// tip: each public class is put in its own file
import java.util.Scanner;
public class Main
{
    // tip: arguments are passed via the field below this editor
    
    public static void main(String[] args)
    {
        System.out.println("메       뉴\n 에소프레소  2500원 \n  아메리카노  3000 \n  카푸치노  3000원 \n  카페라떼   3500원");
        int B = 0;
        String order;
        Scanner scan = new Scanner(System.in);
        while (true) {
          System.out.println("주문하시겠습니까(종료하시려면 0 입력) ? ");
            order = scan.next();
            if (order.equals("0")) {
                break;
                }    
                switch (order) {
                    case "에스프레소":
                        B += 2500;
                        break;
                    case "아메리카노":
                        B += 3000;
                        break;
                    case "카푸치노":
                        B += 3500;
                        break;
                    case "카페라떼":
                        B += 3500;
                        break;
                    default:
                        System.out.println("메뉴에 없습니다!"); 
                }
        }
        System.out.println("주문하신 총 가격은" + B + "원 입니다.");
    }
}
