import java.util.Scanner;
public class DeretAritmatika {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print(" Masukan batas awal ");
        int BatasAwal = n.nextInt();
        System.out.print(" Masukkan batas akhir ");
        int BatasAkhir = n.nextInt();
        System.out.print(" Masukkan kelipatan ");
        int kelipatan = n.nextInt();

        System.out.println(" Deret aritmatika ");
        for (int i = BatasAwal; i <= BatasAkhir; i += kelipatan) {
        }
        System.out.println();

        int g = BatasAwal;
        while (g <= BatasAkhir) {
            System.out.print(g + " , ");
                g += kelipatan;
            }
            System.out.println();

            n.close();
        }
    

    }


