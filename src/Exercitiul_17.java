/*
17. se da un numar n. sa se calculeze m unde m este suma cifrelor de pe pozitiile pare - suma cifrelor de pe pozitiile impare
 */

public class Exercitiul_17 {
    public static void main(String[] args) {

        long n = 1964634634921L, a = 0, b, m;
        long sumaPare = 0, sumaImpare = 0;

        while (n != 0) {
            a = a * 10 + n % 10;
            n = n / 10;
        }

        b = a / 10;

        while (a != 0) {
            sumaPare = sumaPare + a % 10;
            a = a / 100;
        }
        while (b != 0) {
            sumaImpare = sumaImpare + b % 10;
            b = b / 100;
        }

        m = sumaPare - sumaImpare;
        System.out.println(m);
    }
}
