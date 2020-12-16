
import java.util.Scanner;


public class Main {
    public static void ageKontrol(int age){
        if(age< 18){
            System.out.println("Mekana giriş izniniz bulunmamaktadır.");
            //bu alanda bir adet exception fırlatmak istediğimizi var sayalım....
            throw new ArithmeticException();
            
            
        }else if(age == 18){
            System.out.println("yaş sınırlamasına takıldınız.\n"
                    + "18 yaşında değilsiniz 18 yaşınızdan gün almış olarak görünüyorsunuz....");
            throw new NullPointerException();
            
        }else{
            System.out.println("Mekana Hoşgeldiniz.......\n"
                    + "ilk içki bizden ....");
        }
        
    }
    public static void main(String[] args) throws InterruptedException {
        /*
        istediğimiz zaman kendi exceptionlarımızı fırlatmamızı sağlayan bir yapdır.
        
        */
        Scanner scn = new Scanner(System.in);
       
        while(true){
             System.out.println("Lütfen bir sayı girişi yapınız . . . ");
        int age = scn.nextInt();
        try{
            ageKontrol(age);
        }catch(ArithmeticException e){
            System.out.println("Uygun yaş gurubunda değilsin arka kapıdan giriş yapmaya çalışma lütfen ....");
            Thread.sleep(2000);
        }
        
        }
    }
    
}
