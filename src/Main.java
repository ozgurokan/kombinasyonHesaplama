import java.util.Scanner;


//C(n,r) = n! / (r! * (n-r)!) -- Kombinasyon formülü
//N = eleman sayısı
//r = alt küme sayısı

public class Main {
    public static void main(String[] args) {
        int n, r, c, nFactorial = 1, rFactorial = 1, nMinusRFactorial = 1;

        Scanner input = new Scanner(System.in);

        System.out.println("//C(n,r) = n! / (r! * (n-r)!) -- Kombinasyon formülü");

        // Kullanıcıdan N ve R değerleri alınır.
        System.out.print("N sayısını giriniz(Eleman Sayısı): ");
        n = input.nextInt();
        System.out.print("R sayısını giriniz(Seçim Sayısı): ");
        r = input.nextInt();

        // Faktöriyelleri hesaplamak için n ve r için farklı for döngüleri açılır
        for (int i = 1; i <= n; i++) nFactorial *= i; // for döngüsünü tek satırda yazmak için
        for (int i = 1; i <= r; i++) rFactorial *= i;
        for (int i = 1; i <= (n - r); i++) nMinusRFactorial *= i;
        c = nFactorial / (rFactorial * nMinusRFactorial);
        System.out.println("C(n,r) = " + c );
    }
}
