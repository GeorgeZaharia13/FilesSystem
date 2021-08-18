package filessystem;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("LIST, INFO, CREATE_DIR, RENAME, COPY, MOVE, DELETE");
        System.out.print("Select the desired operation: ");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();

        try {
            Operatii op = Operatii.valueOf(input);
            System.out.print("Operation accepted ");
            switch (op) {
                case LIST:
                    Functii.list();
                    break;
                case INFO:
                    Functii.info();
                    break;
                case CREATE_DIR:
                    Functii.createDir();
                    break;
                case RENAME:
                    Functii.rename();
                    break;
                case COPY:
                    Functii.copy();
                    break;
                case MOVE:
                    Functii.move();
                    break;
                case DELETE:
                    Functii.delete();
                    break;
                default:
                    System.out.println("*");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Operation does not exist." + "\nTry again.");
        }
    }
}





