import java.util.Scanner;

public class KalkulatorIPK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMK = input.nextInt();

        double totalNilai = 0;
        double totalSKS = 0;

        for (int i = 1; i <= jumlahMK; i++) {
            System.out.println("\nMata kuliah ke-" + i);
            System.out.print("Masukkan jumlah SKS: ");
            double sks = input.nextDouble();

            System.out.print("Masukkan nilai huruf (A, B+, B, C+, C, D, E): ");
            String nilaiHuruf = input.next().toUpperCase();

            double nilaiAngka = konversiNilai(nilaiHuruf);

            totalNilai += nilaiAngka * sks;
            totalSKS += sks;
        }

        double ipk = totalNilai / totalSKS;

        System.out.printf("\nTotal SKS: %.0f\n", totalSKS);
        System.out.printf("IPK Anda: %.2f\n", ipk);

        input.close();
    }

    public static double konversiNilai(String nilaiHuruf) {
        switch (nilaiHuruf) {
            case "A":  return 4.0;
            case "B+": return 3.5;
            case "B":  return 3.0;
            case "C+": return 2.5;
            case "C":  return 2.0;
            case "D":  return 1.0;
            case "E":  return 0.0;
            default:
                System.out.println("Nilai tidak valid! Dihitung sebagai 0.");
                return 0.0;
        }
    }
}