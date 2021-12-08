import java.util.Scanner;


public class SinifGecme {
    public  static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int kimya,fizik,matematik,turkce,tarih,muzik,ort,gecme=60;
        System.out.println("Kimya notunuzu girin:");
        kimya=scanner.nextInt();
        while (kimya<0||kimya>100){
            System.out.println("Not değeri 0 - 100 arasında olmalıdır. ");
            kimya=scanner.nextInt();
        }
        System.out.println("Fizik notunuzu girin:");
        fizik=scanner.nextInt();
        while (fizik<0||fizik>100){
            System.out.println("Not değeri 0 - 100 arasında olmalıdır. ");
            fizik=scanner.nextInt();
        }
        System.out.println("Matematik notunuzu girin:");
        matematik=scanner.nextInt();
        while (matematik<0||matematik>100){
            System.out.println("Not değeri 0 - 100 arasında olmalıdır. ");
            matematik=scanner.nextInt();
        }
        System.out.println("Türkçe notunuzu girin:");
        turkce=scanner.nextInt();
        while (fizik<0||fizik>100){
            System.out.println("Not değeri 0 - 100 arasında olmalıdır. ");
            turkce=scanner.nextInt();
        }
        System.out.println("Tarih notunuzu girin:");
        tarih=scanner.nextInt();
        while (tarih<0||tarih>100){
            System.out.println("Not değeri 0 - 100 arasında olmalıdır. ");
            tarih=scanner.nextInt();
        }
        System.out.println("Müzik notunuzu girin:");
        muzik=scanner.nextInt();
        while (muzik<0||muzik>100){
            System.out.println("Not değeri 0 - 100 arasında olmalıdır. ");
            muzik=scanner.nextInt();
        }
        ort=((kimya+fizik+matematik+turkce+tarih+muzik)/6);
        boolean gecme_kontrol=ort>=gecme;
        System.out.println("Ortalama:"+ort);
        String output=(gecme_kontrol)? "Sınıfı Geçti": "Sınıfta kaldı";
        System.out.println(output);

    }
}