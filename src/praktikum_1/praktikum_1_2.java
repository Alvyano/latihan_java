package praktikum_1;

public class praktikum_1_2 {
    public static void main(String[] args) {
        int a=90;
        int b=40;
        int hasil;

        hasil = a&b;
        System.out.println("Hasil dari a & b: "+hasil);

        hasil = a|b;
        System.out.println("Hasil dari a | b: "+hasil);

        hasil = a^b;
        System.out.println("Hasil dari a ^ b: "+hasil);

        hasil = ~a;
        System.out.println("Hasil dari ~a : "+hasil);

        hasil = a>>1;
        System.out.println("Hasil dari a>>1 : "+hasil);

        hasil = b<<2;
        System.out.println("Hasil dari b<<2 : "+hasil);
    }
}
