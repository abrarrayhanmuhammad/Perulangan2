import java.util.Scanner;

public class NilaiKelompok01 {
    public static void main(String[] args) {
        int i, j, nilai;
        float totalNilai, ratanilai;

        Scanner sc = new Scanner(System.in);

        i = 1;
        while (i <= 6) {
            System.out.println("Kelompok " + i);

            totalNilai = 0;
            for (j = 1; j <= 5; j++) {
                System.out.print("Nilai dari kelompok penilai " + j + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }

            ratanilai = totalNilai / 5;
            System.out.println("Kelompok " + i + ": nilai rata-rata = "+ ratanilai);
            i++;
        }
    }
}
