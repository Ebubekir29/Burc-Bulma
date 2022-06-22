import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int gun,ay;

        System.out.print("Dogdugunuz gunu giriniz : ");
        gun = scan.nextInt();
        System.out.print("Dogdugunuz ay'i giriniz : ");
        ay= scan.nextInt();

        if(ay==1) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 22)
                    System.out.println("Oglak Burcu");
                else
                    System.out.println("Kova Burcu");
            }
        }
        else if(ay==2) {
            if (gun >= 1 && gun <= 28) {
                if (gun < 20)
                    System.out.println("Kova Burcu");
                else
                    System.out.println("Balik Burcu");
            }
        }
        if(ay==3) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 21)
                    System.out.println("Balik Burcu");
                else
                    System.out.println("Koc Burcu");
            }
        }
        if(ay==4) {
            if (gun >= 1 && gun <= 30) {
                if (gun < 21)
                    System.out.println("Koc Burcu");
                else
                    System.out.println("Boga Burcu");
            }
        }
        if(ay==5) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 22)
                    System.out.println("Boga Burcu");
                else
                    System.out.println("Ikizler Burcu");
            }
        }if(ay==6) {
            if (gun >= 1 && gun <= 30) {
                if (gun < 23)
                    System.out.println("Ikizler Burcu");
                else
                    System.out.println("Yengec Burcu");
            }
        }if(ay==7) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 23)
                    System.out.println("Yengec Burcu");
                else
                    System.out.println("Aslan Burcu");
            }
        }
        if(ay==8) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 23)
                    System.out.println("Aslan Burcu");
                else
                    System.out.println("Basak Burcu");
            }
        }
        if(ay==9) {
            if (gun >= 1 && gun <= 30) {
                if (gun < 23)
                    System.out.println("Basak Burcu");
                else
                    System.out.println("Terazi Burcu");
            }
        }
        if(ay==10) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 23)
                    System.out.println("Terazi Burcu");
                else
                    System.out.println("Akrep Burcu");
            }
        }if(ay==11) {
            if (gun >= 1 && gun <= 30) {
                if (gun < 22)
                    System.out.println("Akrep Burcu");
                else
                    System.out.println("Yay Burcu");
            }
        }
        if(ay==12) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 22)
                    System.out.println("Yay Burcu");
                else
                    System.out.println("Oglak Burcu");
            }
        }
    }
}
