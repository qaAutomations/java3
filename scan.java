import java.util.Scanner;

public class scan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*System.out.println("please enter your name :");
        String name = scanner.next();
        System.out.println("please enter your age :");
        int age = scanner.nextInt();

        System.out.println("hiii "+name + " your age is : "+age);*/

        System.out.println("please enter a number : ");
        int number = scanner.nextInt();
        System.out.println(number/2);

        System.out.println("please enter a number : ");
        int number2 = scanner.nextInt();

        if(number2 % 2 == 0 )
            System.out.println("yes");
        else
            System.out.println("no");


    }
}
