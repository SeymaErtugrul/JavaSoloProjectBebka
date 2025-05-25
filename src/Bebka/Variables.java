package Bebka;
import java.sql.Time;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Variables
{
    int testvarInt=10;
    double testvarDouble=485.0055;
    float testvarFloat=314.5f;
    char testvarChar='k';
    final int testfinalVar=77;
    String testvarString = "bebka";

    public static void main(String[] args)
    {
        Variables variables = new Variables();
       // variables.PrintlnVariables();
        // ScanAge();
        ArithemeticOps();
    }

    public void PrintlnVariables()
    {   System.out.println("Integer Değiskeni: "+ testvarInt);
        System.out.println("Double Değiskeni: "+ testvarDouble);
        System.out.println("Float Degiskeni: "+ testvarFloat);
        System.out.println("Char Değiskeni: "+ testvarChar);
        System.out.println("Final Degisken: "+ testfinalVar);
        System.out.println("String Degisken:  "+ testvarString);
    }

    public static void ScanAge()
    {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Yaşınızı giriniz: ");
        while (!scanner.hasNextInt())
        {
            System.out.println("Yaşınızı sayılarla giriniz: ");
            scanner.next(); // Kullanıcıdan tekrar veri almak için
        }
        int age = scanner.nextInt();
        try {
            Thread.sleep(50); //Yaşı yazdırmadan önce kısa bir bekleme süresi eklemek için
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Yaşınız: " + age);
    }

    public static void ArithemeticOps()
    {
        float numb1=58.78f;
        int numb2=99;
        float sumNumb= numb1+numb2;
        float subNumb=numb1-numb2;
        float multNumb=numb1*numb2;
        float divideNumb=numb1 / numb2;
        System.out.println(numb1 + " ve " + numb2 +" sayilarinin toplami: "  +sumNumb);
        System.out.println(numb1 + " sayisindan " + numb2 +" sayisinin çıkarimi: "  +subNumb);
        System.out.println(numb1 + " ve " + numb2 +" sayilarinin carpimi: "  +multNumb);
        System.out.println(numb1 + " sayisinin " + numb2 +" sayisina bolumu: "  +divideNumb);
    }
}
