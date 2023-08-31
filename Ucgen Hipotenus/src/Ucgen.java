
  import java.util.Scanner;

public class Ucgen {

    public static void main(String[] args) {

        int a, b, akare,bkare;
        double c ;
        Scanner inp = new Scanner(System.in);
        System.out.print("a kenarının uzunluğunu giriniz:");
        a = inp.nextInt();

        System.out.print("b kenarının uzunluğunu giriniz:");
        b = inp.nextInt();

        c = Math.sqrt( (a*a) + (b*b) );
        System.out.println("Hipotenüs :" + c );

    }


}
