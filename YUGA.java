import java.util.Scanner;

public class YUGA {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang di Kalkulator Sederhana!");
        System.out.println("Silakan masukkan dua angka dan pilih operasi matematika.");

        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        System.out.println("Pilih operasi matematika:");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");

        int pilihan = input.nextInt();
        double hasil;

        switch (pilihan) {
            case 1:
                hasil = angka1 + angka2;
                break;
            case 2:
                hasil = angka1 - angka2;
                break;
            case 3:
                hasil = angka1 * angka2;
                break;
            case 4:
                hasil = angka1 / angka2;
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }

        System.out.println("Hasil: " + hasil);
    }
}
