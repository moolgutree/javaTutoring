import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("확인할 연도를 입력하세요: ");
    int j;
		j = sc.nextInt();
		if((j%4 == 0 && j % 100 != 0) || (j%400 ==0)){
			System.out.println(j + "년은 윤년입니다.");
		}
	}
}
