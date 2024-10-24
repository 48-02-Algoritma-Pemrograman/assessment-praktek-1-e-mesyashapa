import java.util.Scanner;

public class Nomor1{
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

   System.out.print("Masukkan jumlah anggota keluarga (1-3 jiwa): ");
        int jumlahAnggota = scanner.nextInt();

    double tunjanganKesehatan;

    if (jumlahAnggota <= 3) {
        tunjanganKesehatan = jumlahAnggota * 100000;
        } else {
        tunjanganKesehatan = (3 * 100000) + ((jumlahAnggota - 3 ) * 50000);
    }

System.out.println("Besar Tunjangan Kesehatan = " + tunjanganKesehatan);


        
    }

}

//PSEUDOCODE
//Start
//Input jumlah anggota keluarga
//If jumlah anggota keluarga <= 3, Else
//tunjangan kesehatan = jumlah anggota keluarga * 100.000
//If jumlah anggota keluarga > 3, Else
//tunjangan kesehatan = (3 * 100.000) + ((jumlah anggota keluarga - 3) * 50.000)
//Output tunjangan kesehatan
//Selesai
