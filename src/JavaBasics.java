import java.util.Scanner;


public class JavaBasics {
    Scanner input = new Scanner(System.in);

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void useVariables(){
        int age = 25;
        double price = 19.99;
        char grade = 'A';
        boolean isMember = true;

        System.out.println("Age: " + age);
        System.out.println("Price: " + price);
        System.out.println("Grade: " + grade);
        System.out.println("Membership: " + isMember);
    }

    public void useLiterals(){
        int num = 100;
        double pi = 3.14;
        char letter = 'B';
        String greeting = "Hello World";
        boolean isActive = false;

        System.out.println("Num: " + num);
        System.out.println("Pi: " + pi);
        System.out.println("Letter: " + letter);
        System.out.println("Greeting: " + greeting);
        System.out.println("isActive: " + isActive);

    }

    public void useScanner(){
        System.out.println("Enter your name: ");
        name = input.nextLine();
        System.out.println("Enter your age: ");
        age = input.nextInt();
        System.out.println("Hello, " + name +" you are " + age + " years old");

    }



}
