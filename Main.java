import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Снять наличность:да/нет ");
        String name = in.nextLine();
        String str = "да";
        if (str.equals(name)) {
            System.out.println("номер счета:__ " + "сумма:__");
        } else {
            System.out.print(" Внести наличные:да/нет ");
            String name1 = in.nextLine();
            String str1 = "да";

            if (str.equals(name1)) {
                System.out.println("номер счета:__ " + "сумма:__");
            } else {
                System.out.print("Статус:да/нет ");
                String name2 = in.nextLine();
                String str2 = "да";

                if (str.equals(name2)) {
                    System.out.println("Номер счета:__23");

                }

            }
        }
    }
}