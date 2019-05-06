/*
18. se da un caracter n (char). sa afiseze daca n este o litera ce reprezinta punctele cardinale.
 */

public class Exercitiul_18 {
    public static void main(String[] args) {
        char n = 'V';

        switch (n) {
            case 'N':
                System.out.println("Nord");
                break;
            case 'S':
                System.out.println("Sud");
                break;
            case 'V':
                System.out.println("Vest");
                break;
            case 'E':
                System.out.println("Est");
                break;
            default:
                System.out.println("Nu reprezinta un punct cardinal");
                break;

        }
    }
}
