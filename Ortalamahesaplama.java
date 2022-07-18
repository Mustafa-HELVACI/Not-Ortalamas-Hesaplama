import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenleri Oluştur.
        int mat,fzk,kmy,trkc,trh,mzk;

        //Scanner değerlerimizi tanımladık.
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan verileri al.
        System.out.print("Matematik Notunuzu Girin: ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuzu Girin: ");
        fzk = inp.nextInt();

        System.out.print("Kimya Notunuzu Girin: ");
        kmy = inp.nextInt();

        System.out.print("Türkçe Notunuzu Girin: ");
        trkc = inp.nextInt();

        System.out.print("Tarih Notunuzu Girin: ");
        trh = inp.nextInt();

        System.out.print("Müzik Notunuzu Girin: ");
        mzk = inp.nextInt();

        int toplam =  (mat + fzk + kmy + trkc + trh + mzk);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız : " + sonuc);
        System.out.print((sonuc >= 60.0) ? "Sınıfı Geçtiniz. " : "Sınıfta Kaldın. ");
        System.out.println((sonuc >= 60.0) ? "Başarılarınızın Devamını Dilerim." : "Sana bu yıl bisiklet felan yok.");

    }
}
