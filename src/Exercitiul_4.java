/*
4. Se dau n numere naturale. Sa se calculeze cate dintre ele sunt pare si cate impare.
 */

public class Exercitiul_4 {
    public static void main(String[] args) {
        int[] vector = {23, 87, 907, 55, 67, 22, 10, 34, 88, 101, 307};
        int nrPare = 0, nrImpare = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                nrPare++;
            } else {
                nrImpare++;
            }
        }
        System.out.println("Numerele pare sunt: " + nrPare);
        System.out.println("Numerele impare sunt: " + nrImpare);
    }
}
