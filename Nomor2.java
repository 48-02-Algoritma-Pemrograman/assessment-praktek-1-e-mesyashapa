import java.util.Scanner;
public class Nomor2{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double hargaLabubu= 300000;
    double hargaJenglot= 250000;
    double hargaVoodo= 200000;

    double totalLabubu= 0;
    double totalJenglot= 0;
    double totalVoodo= 0;

    int transaksi = 0;

    while (true) {
        System.out.print("Masukan nama produk [Labubu/Jenglot/Voodo]: ");
        String produk = scanner.next();

        System.out.print("Jumlah pembelian: ");
        int jumlah = scanner.nextInt();

        double totalHarga = 0;

    switch (produk.toLowerCase()) {
        case "labubu":
            totalHarga = hargaLabubu * jumlah;
            totalLabubu += totalHarga;
            break;
        case "jenglot":
            totalHarga = hargaJenglot * jumlah;
            totalJenglot += totalHarga;
            break;
        case "voodo":
            totalHarga = hargaVoodo * jumlah;
            totalVoodo += totalHarga;
            break;
        }

    if (totalHarga >= 1000000) {
        totalHarga *= 0.85;
    } else if (totalHarga >= 500000) {
        totalHarga *= 0.90;
        }

        transaksi++;

        System.out.print("Input lagi (Y/N)?: ");
        String inputLagi = scanner.next();
        if (inputLagi.equalsIgnoreCase("N")) {
            break;
            }
        }
    System.out.println("Total transaksi yang terjadi = " + transaksi);
    System.out.println("Jumlah uang yang diterima = " + (totalLabubu + totalJenglot + totalVoodo));
        
    double maxOmzet = Math.max(totalLabubu, Math.max(totalJenglot, totalVoodo));
    String produkTerbesar = (maxOmzet == totalLabubu) ? "Labubu" : (maxOmzet == totalJenglot) ? "Jenglot" : "Voodo";
        
    System.out.println("Produk dengan omzet terbesar = " + produkTerbesar);
    }
}
