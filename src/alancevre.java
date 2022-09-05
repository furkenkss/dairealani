import java.util.Scanner;

//Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
//
//Alan Formülü : π * r * r;
//
//Çevre Formülü : 2 * π * r;
//
//Ödev
//Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
//
//𝜋 sayısını = 3.14 alınız.
//
//Formül : (𝜋 * (r*r) * 𝛼) / 360

public class alancevre {
    public static void main(String[] args) {
        double yariCap;
        double alan, cevre;
        double pi = 3.14;
        double merkezAcisi;

        Scanner inp =new Scanner(System.in);

        System.out.print("Lutfen YariCap Degeri Giriniz :");
        yariCap = inp.nextDouble();

        alan = pi * yariCap * yariCap;
        cevre = 2 * pi * yariCap;

        System.out.println(" Alani :"+alan);
        System.out.println(" Cevresi :"+cevre);

        System.out.print("Merkez Acisi Degeri Giriniz :");
        merkezAcisi = inp.nextDouble();

        double daireAlani = (pi*(yariCap*yariCap)*merkezAcisi)/360;

        System.out.println("Daire Alani :"+daireAlani);
    }
}
