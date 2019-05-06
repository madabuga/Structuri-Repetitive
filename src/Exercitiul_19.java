/*
19. se da un numar care reprezeinta CNP-ul unei persoane si are urmatorul format => SAALLZZJJNNNC. sa se scrie un program care afiseaza sexul, luna si anul nasterii unei, stiind ca :
S => sexul : masculin / feminin
1 / 2 - nascuti intre 1 ianuarie 1900 si 31 decembrie 1999
3 / 4 - nascuti intre 1 ianuarie 1800 si 31 decembrie 1899
5 / 6 - nascuti intre 1 ianuarie 2000 si 31 decembrie 2099
7 / 8 - pentru persoanele straine rezidente in Romania.
AA => numar format din 2 cifre si reprezinta ultimele 2 cifre din anul nasterii
LL => luna (exemplu 05 => mai)
ZZ => ziua (exemplu 09 = 9)
exemplu : cnp = 1900510...... se va afisa mesajul "baiat nascut pe 10 mai 1990"
	  cnp = 2890205...... se va afisa mesajul "fata nascuta pe 5 februarie 1989"
 */

public class Exercitiul_19 {
    public static void main(String[] args) {
        long n=3971206460069L, s, l, a, z;

        String[] luna={"ianuarie ", "februarie ", "martie ", "aprilie ", "mai ", "iunie ", "iulie ", "august ", "septembrie ", "octombrie ", "noiembrie ", "decembrie "};

        n=n/1000000;
        z=n%100;
        n=n/100;
        l=n%100;
        n=n/100;
        a=n%100;
        s=n/100;

        if(s%2==0){
            System.out.print("fata nascuta pe ");
        }else{
            System.out.print("baiat nascut pe ");
        }

        int m=0;
        while (l!=1){
            m++;
            l--;
        }

        System.out.print(z+" "+luna[m]);

        m=0;
        while (s!=0){
            m++;
            s--;
        }

        switch (m){
            case 1:
            case 2:
                System.out.println("19" + a);
                break;
            case 3:
            case 4:
                System.out.println("18" + a);
                break;
            case 5:
            case 6:
                System.out.println("20" + a);
                break;
            default:
                System.out.println(" -> Persoana straina rezidenta in Romania");
                break;
        }


    }
}
