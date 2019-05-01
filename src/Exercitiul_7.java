/*
7. Se da un numar natural n. Afisati suma cifrelor numarului 2 * 3 ^ n (2 inmultit cu 3 la puterea n).
 */
public class Exercitiul_7 {
    public static void main(String[] args) {
        int n=5, numar=1, suma=0;

        for (int i = 0; i <  n; i++) {
            numar=numar*3;
        }
        numar=numar*2;

        while(numar!=0){
            suma=suma+numar%10;
            numar=numar/10;
        }

        System.out.println(suma);

    }
}
