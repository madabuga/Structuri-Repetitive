/*
10. se da un sir de numere naturale, sa se calculeze suma primelor 5 elemente pare.
 */

public class Exercitiul_10 {
    public static void main(String[] args) {

        int[] arr={1, 22, 9, 4, 11, 2, 13, 8, 20, 30, 46, 18, 124};
        int count=0, sum=0;

        for (int i = 0; i < arr.length; i++) {

                if(arr[i]%2==0){
                    sum=sum+arr[i];
                    count++;
                }
                if(count==5){
                    break;
                }
        }

        System.out.println(sum);

    }
}
