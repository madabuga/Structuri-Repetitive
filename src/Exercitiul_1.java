// 1. sa se scrie un program folosind structuri repetitive, care sa afiseze urmatorul rezultat:
// #  ##  ###   ####   ###  ##  #

public class Exercitiul_1 {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {

            int j=0;

            while(j!=i){

                System.out.print("#");

                j++;

            };

            System.out.print("  ");

            if(i==4){

                for (int k = 3; k > 0; k--) {

                    j=0;

                    while(j!=k){

                        System.out.print("#");

                        j++;

                    };

                    System.out.print(" ");
                }
            }
        }

    }
}
