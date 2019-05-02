/*
16. sa da un numar n. sa se calculeze suma cifrelor de pe pozitiile pare ale numarului.
ex: n = 1234, suma => 1 + 3 = 4
 */

public class Exercitiul_16 {
    public static void main(String[] args) {

        long n=234667420L, m=0;
        long sum=0;

        while (n!=0)
        {
            m=m*10 + n%10;
            n=n/10;
        }

        while (m!=0){
            sum = sum + m%10;
            m=m/100;
        }

        System.out.println(sum);
    }
}
