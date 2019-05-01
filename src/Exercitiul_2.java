/*
2. se da un numar natural n, (alegeti un int la intamplare). Acestuia i se vor aplica urmatoarele transformari :
- daca n este par el devine n/2
- daca n este impar, devine 3*n+1

Stiind ca pentru orice numar natural, la un moment dat, in urma transformarilor, numarul va deveni 1,
sa se determine numarul de termeni din sirul de transformari dupa regula data.
Exemplu :
pentru n = 6, se trece prin pasii n = 6, n = 3, n = 10, n = 5, n = 16, n = 8, n = 4, n = 2, n = 1 (stop).
deci, raspunsul este 9 (termeni sau pasi)
*/

public class Exercitiul_2 {
    public static void main(String[] args) {

        int n=6, count=1;

        while(n!=1){
            if (n%2 == 0) {
                n = n/2;
                count++;
            }
            else{
                n=3*n+1;
                count++;
            }
        };

        System.out.println(count);
    }
}
