package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      //  Помню что вы говорили то что нестоит давать имя переменым/объуктам так(person1/num1).
        // Но в даном случае даю такие имена объектам с пониманием того что пользователь будет вводить даные сам
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        System.out.println("So now you can create 3 employees, for that enter some value!!" +
                "\nPERSON 1");
        //Create a person
        person1.enterName();
        person1.setName(scanner.nextLine());
        person1.enterAge();
        person1.setAge(scanner.nextInt());
        scanner.nextLine();
        person1.enterProfession();
        person1.setProfession(scanner.nextLine());
        System.out.println("\nPERSON 2");
        person2.enterName();
        person2.setName(scanner.nextLine());
        person2.enterAge();
        person2.setAge(scanner.nextInt());
        scanner.nextLine();
        person2.enterProfession();
        person2.setProfession(scanner.nextLine());
        System.out.println("\nPERSON 3");
        person3.enterName();
        person3.setName(scanner.nextLine());
        person3.enterAge();
        person3.setAge(scanner.nextInt());
        scanner.nextLine();
        person3.enterProfession();
        person3.setProfession(scanner.nextLine());
// display info about already created person
        person1.displayOutput(person1.getName(), person1.getAge(), person1.getProfession());
        person2.displayOutput(person2.getName(), person2.getAge(), person2.getProfession());
        person3.displayOutput(person3.getName(), person3.getAge(), person3.getProfession());

//Create new person and change his profession
        System.out.println("Now I will create new person and change his profession" +
                "\nPERSON 4");
        Person person4 = new Person();
        person4.enterName();
        person4.setName(scanner.nextLine());
        person4.enterAge();
        person4.setAge(scanner.nextInt());
        scanner.nextLine();
        person4.enterProfession();
        person4.setProfession(scanner.nextLine());
        person4.displayOutput(person4.getName(), person4.getAge(), person4.getProfession());
        System.out.print("For changing the " + person4.getName() + "`s profession input new profession :");
        String newProfession = scanner.nextLine();
        person4.changeProfession(newProfession);
        System.out.println("After changing profession");
        person4.displayOutput(person4.getName(), person4.getAge(), person4.getProfession());
        scanner.close();
    }

}
