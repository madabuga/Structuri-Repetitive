/*
12. Se da un numar 0 <= n <= 11 (lunile anului, unde 0 -> ianuarie, etc).
Afisati un mesaj spunand in ce anotimp e luna reprezentata de n.

 */

public class Exercitiul_12 {
    public static void main(String[] args) {

        int n=7;

        //VARIANTA IF-ELSE:

        if(n==2 || n==3 || n==4){
            System.out.println("Primavara");
        }else if(n==5 || n==6 || n==7){
            System.out.println("Vara");
        }else if(n==8 || n==9 || n==10){
            System.out.println("Toamna");
        }else if(n==11 || n==0 || n==1){
            System.out.println("Iarna");
        } else {
            System.out.println("Caracter nevalid");
        }

        //VARIANTA SWITCH:

        switch (n){
            case 2:
            case 3:
            case 4:
                System.out.println("Primavara");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("Vara");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("Toamna");
                break;
            case  11:
            case 0:
            case 1:
                System.out.println("Iarna");
                break;
            default:
                System.out.println("Caracter nevalid");
                break;
        }
    }
}
