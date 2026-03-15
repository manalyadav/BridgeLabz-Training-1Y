import java.util.Scanner;

class Person {

    private String name;
    private int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    Person(Person p) {
        name = p.name;
        age = p.age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String n = sc.nextLine();

        System.out.print("Enter Age: ");
        int a = sc.nextInt();

        Person p1 = new Person(n, a);
        Person p2 = new Person(p1);

        System.out.println("Original Person:");
        p1.display();

        System.out.println("Copied Person:");
        p2.display();
    }
}