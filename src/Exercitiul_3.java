/*
3. Se dau n numere naturale (creati voi un array de tipul int, de marime n, umplut cu valori la intamplare).
Sa se afiseze cel mai mare numar impar din array, sau mesajul "no" in cazul in care toate numerele sunt pare.

 */

public class Exercitiul_3 {
    public static void main(String[] args) {

        int[] arr=new int[]{22, 66, 32, 8, 22, 8, 10, 388, 927};
        int nr=0;

        for (int i = 0; i < arr.length; i++) {
            if((arr[i] % 2 != 0) && (arr[i]>nr)){
                nr=arr[i];
            }
        }

        if(nr==0){
            System.out.println("no");
        }else{
            System.out.println(nr);
        }
    }
}
