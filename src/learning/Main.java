package learning;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// this is appliction for input biodata
        System.out.println("===== Biodata =====");

        Scanner UserInput = new Scanner(System.in);
                String name;
                int age;
                String addres;
                String hoby;

        System.out.print("Please Insert Your Name = ");
        name = UserInput.next();

        System.out.print("Please Insert Your Age = ");
        age = UserInput.nextInt();

        System.out.print("Insert Address = ");
        addres = UserInput.next();

        System.out.print("Insert Your Hoby = ");
        hoby = UserInput.next();

        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Addres = " + addres);
        System.out.println("Hoby = " + hoby);
    }
}
