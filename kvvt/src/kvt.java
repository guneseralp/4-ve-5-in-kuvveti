
import java.util.Scanner;
public class kvt {
    public static void main(String[] args) {
        int k;
        Scanner inp= new Scanner (System.in);
        System.out.print("Enter your number: ");
        k= inp.nextInt();
        System.out.println( " Dordun kuvvetleri: ");
        for(int i=1; i<=k; i*=4){
            System.out.println(i+" ");
        }
        System.out.println( "Besin kuvvetleri: ");
        for(int i=1; i<=k; i*=5){
            System.out.println(i+" ");
        }
    }
}
