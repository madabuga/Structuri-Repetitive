/*
15. se dau doua numere n si m, scrieti un program care afiseaza "true" sau "false" (daca n este inversul lui m).
exemplu: n = 12, m = 21 => true; n = 10, m = 1 => false
 */

public class Exercitiul_15 {
    public static void main(String[] args) {

        long n=10, m=1, a=0, b=0, cn=n, cm=m;

        while(n!=0){
            a=a*10 + n%10;
            n=n/10;
        }

        while(m!=0){
            b=b*10 + m%10;
            m=m/10;
        }

        if(a==cn && b==cm){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }


}
