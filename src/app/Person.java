package app;

import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private String profession;
    static Scanner scanner = new Scanner(System.in);

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age <= 0 || age > 150) {
            System.out.println("Age can not be less or equals 0. " +
                    "And age can not be bigger than 150 years old");
        } else {
            this.age = age;
        }
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getProfession() {
        return profession;
    }

    void displayOutput(String name, int age, String profession) {
        System.out.println("Name: " + name + ", age: " + age + ", Profession: " + profession);
    }

    //Enter value for Scanner
    void enterName() {
        System.out.print("Enter name: ");
    }

    void enterAge() {
        System.out.print("Enter age: ");
    }

    void enterProfession() {
        System.out.print("Enter profession: ");
    }

    void changeProfession(String newProfession) {
        profession = newProfession;
    }

    public void changeData() {
        System.out.print("What do you want to change? Choose a number!!" +
                "\n1 -- change name;" +
                "\n2 -- change age;" +
                "\n3 -- change profession;" +
                "\n4 -- i do not want change anyone row" +
                "\nInput number there: ");
        int change = scanner.nextInt();
        scanner.nextLine();
        switch (change) {
            case 1:
                System.out.print("Enter new name: ");
                name = scanner.nextLine();
                break;
            case 2:
                System.out.print("Enter new age: ");
                age = scanner.nextInt();
                System.out.println("After changing profession");
                displayOutput(name, age, profession);
                break;
            case 3:
                System.out.print("Enter new profession: ");
                profession = scanner.nextLine();
                System.out.println("After changing profession");
                displayOutput(name, age, profession);
                break;
            case 4:
                displayOutput( name, age, profession);
                break;
            default:
                System.out.println("ERROR! Enter only correct number(1, 2, 3 or 4)!!");
                displayOutput(name, age, profession);
        }
    }
}
