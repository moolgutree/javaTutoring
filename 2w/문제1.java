// do-while 사용해서 a~z까지 출력
// tip: each public class is put in its own file
public class main
{
    // tip: arguments are passed via the field below this editor
    public static void main(String[] args)
    {
       
       char asc = 'a';
       do {
           System.out.println(asc);
           asc++;
       }while (asc < 'z');
    }
}
