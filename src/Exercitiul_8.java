/*
8. Se dau doua numere naturale a si b. Afisati a ^ b (a la puterea b)
 */
public class Exercitiul_8 {
    public static void main(String[] args) {
        int a = 14, b = 2, numar=1;

        for (int i = 0; i < b; i++) {
            numar=numar*a;
        }

        System.out.println(numar);

    }
}
