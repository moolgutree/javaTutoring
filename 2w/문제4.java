// 스위치문 사용새서 출력하기
// tip: each public class is put in its own file
public class main
{
    // tip: arguments are passed via the field below this editor
    import java.util.Scanner;
    public static void main(String[] args)
    {
        System.out.println("메       뉴\n 에소프레소  2500원 \n  카푸치노  3000원 \n  카페라떼   3500원");
        Scanner scan = new Scanner(System.in);
        System.out.println("주문하시겠습니까 ? ");
        order = scan.nextLine();
        
        switch (order) {
            case 에스프레소:
                A = 2500;
                break;
            case 아메리카노:
                A = 3000;
                break;
            case 카푸치노:
                A = 3500;
                break;
            case 카페라떼:
                A = 3500
                break;
        }
        System.out.println("주문하신 " + order + "는(은) " + A + "원 입니다.");
    }
}
