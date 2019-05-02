/*
11. Sa da un numar 0 <= n <= 9 (intre 0 si 9).
Afisati un mesaj spunand ce numar reprezinta (zero, unu, etc) sau "numar gresit", pentru cazul cand n este in afara intervalului.
Pentru problema 11, trebuie sa scrieti 2 variante ale programului: una folosind if-esle, una folosind switch.
 */

public class Exercitiul_11 {
    public static void main(String[] args) {
        int n=5;

        //VARIANTA IF-ELSE:

        if(n==0){
            System.out.println("Zero");
        }else if(n==1){
            System.out.println("Unu");
        }else if(n==2){
            System.out.println("Doi");
        }else if(n==3){
            System.out.println("Trei");
        }else if(n==4){
            System.out.println("Patru");
        }else if(n==5){
            System.out.println("Cinci");
        }else if(n==6){
            System.out.println("Sase");
        }else if(n==7){
            System.out.println("Sapte");
        }else if(n==8){
            System.out.println("Opt");
        }else if(n==9){
            System.out.println("Noua");
        }else{
            System.out.println("Numar gresit");
        }

        //VARIANTA SWITCH:

        switch (n){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("Unu");
                break;
            case 2:
                System.out.println("Doi");
                break;
            case 3:
                System.out.println("Trei");
                break;
            case 4:
                System.out.println("Patru");
                break;
            case 5:
                System.out.println("Cinci");
                break;
            case 6:
                System.out.println("Sase");
                break;
            case 7:
                System.out.println("Sapte");
                break;
            case 8:
                System.out.println("Opt");
                break;
            case 9:
                System.out.println("Noua");
                break;
            default:
                    System.out.println("Numar gresit");
        }
    }
}
