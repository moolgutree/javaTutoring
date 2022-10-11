import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
    int j;
		j = sc.nextInt();
		if(j >= 90){
			System.out.println("합격! A등급");
		}
	    else if (j >= 80){
            System.out.println("합격! B등급");
	    }
        else if (j >= 65){
            System.out.println("합격! C등급");
        }
        else{
            System.out.println("불합격입니다. 다시 도전하세요.");
        }
	}
}
