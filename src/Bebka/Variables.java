package Bebka;
import java.util.Scanner;

public class Variables
{
    int testvarInt=10;
    double testvarDouble=485.0055;
    float testvarFloat=314.5f;
    char testvarChar='k';
    final int testfinalVar=77;
    String testvarString = "bebka";
     static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args)
    {
        // Variables variables = new Variables();
        // variables.printlnVariables();
        // scanAge();
        //arithemeticOps();
        // checkifNegative();
        //checkifDual();
        // letterGrade();
        //forLoop();
        //whileLoop();
        // scanArray();
        //findBiggestNum();
        addUntilN();
    }

    public void printlnVariables()
    {   System.out.println("Integer Değiskeni: "+ testvarInt);
        System.out.println("Double Değiskeni: "+ testvarDouble);
        System.out.println("Float Degiskeni: "+ testvarFloat);
        System.out.println("Char Değiskeni: "+ testvarChar);
        System.out.println("Final Degisken: "+ testfinalVar);
        System.out.println("String Degisken:  "+ testvarString);
    }

    public static void scanAge()
    {
        //Scanner scanner= new Scanner(System.in);
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

    public static void arithemeticOps()
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


    public static void checkifNegative()
    {
        //Scanner scanner =new Scanner(System.in);

        System.out.println("Pozitif veya negatif mi olduğunu öğrenmek istediğiniz sayiyi giriniz");
        int numb= scanner.nextInt();
        if (numb>0)
        {
            System.out.println("Sayi pozitif");
        }
        else if(numb<0)
        {
            System.out.println("Sayi negatif");
        }

        else
        {
            System.out.println("Sayi 0");
        }
    }

    public static  void checkifDual()
    {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Tek, cift mi olduğunu öğrenmek istediğiniz sayiyi giriniz");
        int numb= scanner.nextInt();
        int totalNumb=numb%2;
        if (totalNumb==0)
        {
            System.out.println("Girdiginiz Sayi cift");
        }
        else
        {
            System.out.println("Girdiginiz Sayi tek");
        }
    }

    public static void letterGrade()
    {
        //Scanner scanner =new Scanner(System.in);
        System.out.println("Harf notunu öğrenmek istediğiniz notu giriniz");
        int grade=0;
        while (true)
        {
            if (scanner.hasNextInt()) {
                grade = scanner.nextInt();
                if (0 <= grade && grade <= 100) {
                    break;
                }
                else {
                    System.out.println("Not 1-100 araliginda olmalidir");

                }
            }

            else
            {
                System.out.println("Bir sayi girilmelidir");
                scanner.next();
            }
        }

        switch (grade/10)
        {
            case 10:
                System.out.println("Harf notu A");
                break;


            case 9:
                System.out.println("Harf notu A");
                break;

            case 8:
                System.out.println("Harf notu B");
                break;

            case 7:
                System.out.println("Harf notu C");
                break;


            case 6:
                System.out.println("Harf notu D");
                break;

            case 5:
                System.out.println("Harf notu F");
                break;

            default:
                System.out.println("Harf notu F");
        }



    }

    public static void forLoop()
    {
        for (int i=1; i<11; i++)
        {
                System.out.println(i);
        }
    }

    public static void whileLoop()
    {
        int num=10;
        while(num>=1)
        {
            System.out.println(num);
            num--;
        }
    }

    public static void scanArray(){
        String []NumArray={"code","java","debug","github","developer"};

        for (int i=0;i<5;i++)
        {
         System.out.println(NumArray[i]);
        }

    }

    public  static  void findBiggestNum()
    {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Girilen sayilardan en buyugu belirlenecektir,ilk sayiyi giriniz");
        while (!scanner.hasNextInt())
        {
            System.out.println("Lutfen bir sayi giriniz");
            scanner.next();
        }
        int num1  =scanner.nextInt();
        System.out.println("Ikinci sayiyi giriniz");
        while (!scanner.hasNextInt())
        {
            System.out.println("Lutfen bir sayi giriniz");
            scanner.next();
        }
        int num2=scanner.nextInt();
        System.out.println("Ucuncu sayiyi giriniz");
        while (!scanner.hasNextInt())
        {
            System.out.println("Lutfen bir sayi giriniz");
            scanner.next();
        }
        int num3=scanner.nextInt();


       boolean isBigger;
       if (num1>num2 && num1>num3)
       {
           System.out.println("En buyuk sayi " + num1);
       }
       else if (num2>num3 && num2>num1)
       {
           System.out.println("En buyuk sayi " + num2);
       }
       else {
           System.out.println("En buyuk sayi " + num3);
       }
    }

    public static void addUntilN()
    {
        System.out.println("Bir sayi giriniz:");

        while (!scanner.hasNextInt())
        {
            System.out.println("sayi girilmeli:");
            scanner.next();
        }
        int scanNum=scanner.nextInt();
        int totalNum=0;
        for (int i=0 ; i<=scanNum ;i++)
        {
            totalNum+=i;
        }
        System.out.println("1'den" + scanNum + " sayisina kadar olan sayilarin toplami: " + totalNum);
    }
}
