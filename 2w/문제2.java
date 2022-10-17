// 숫자를 입력받아 1~100사이에 입력받은 숫자의 배수가 몇개인지 출력
// tip: each public class is put in its own file
public class main
{
    // tip: arguments are passed via the field below this editor
    import java.util.Scanner;
    public static void main(String[] args)
    {
        Scanner num1 = new Scanner(System.in);
        int num = 0;
        int basu = 0;
        
        System.out.println("숫자를 입력하세요 ? ");
        num = num1.nextInt();

        

        
        for ( int i=0 ; i<100 ; i++) {
            if (num <= 100 && num > 0) {
                num = num * i;
                basu++;
                num = num / i;
            }
            break;
        }
        
        System.out.println(num + "의 배수는 " + basu +"개 입니다.");
    }
}
