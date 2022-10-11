public class Main
{
	public static void main(String[] args) {

    int repo = 0;
    int repo2 = 0;
    for (int j=0; j <= 100; j++) 
      if (j % 2 !=0)
        repo += j;
      else
        repo2 += j;

    System.out.println ("짝수합" + repo2);
    System.out.println ("홀수합" + repo);
          
	}
}
