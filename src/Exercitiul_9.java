/*
9. se da un numar natural n. sa se afiseze urmatorul mesaj
1
1 2
1 2 3
.......
1 2 3 ... n
 */
public class Exercitiul_9 {
    public static void main(String[] args) {

        int n=17;
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");

            }
            System.out.println();

        }
    }
}
