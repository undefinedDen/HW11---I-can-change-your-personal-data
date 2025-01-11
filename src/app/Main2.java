package app;

import java.util.Scanner;
// в классе Main2 есть возможность выбрать  значение которое нужно изменить
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        System.out.println("So now you can create 3 employees, for that enter some value!!" +
                "\nPERSON 1");
        //Create a person
        person1.enterName();
        person1.setName(sc.nextLine());
        person1.enterAge();
        person1.setAge(sc.nextInt());
        sc.nextLine();
        person1.enterProfession();
        person1.setProfession(sc.nextLine());
        System.out.println("\nPERSON 2");
        person2.enterName();
        person2.setName(sc.nextLine());
        person2.enterAge();
        person2.setAge(sc.nextInt());
        sc.nextLine();
        person2.enterProfession();
        person2.setProfession(sc.nextLine());
        System.out.println("\nPERSON 3");
        person3.enterName();
        person3.setName(sc.nextLine());
        person3.enterAge();
        person3.setAge(sc.nextInt());
        sc.nextLine();
        person3.enterProfession();
        person3.setProfession(sc.nextLine());
// display info about already created person
        person1.displayOutput(person1.getName(), person1.getAge(), person1.getProfession());
        person2.displayOutput(person2.getName(), person2.getAge(), person2.getProfession());
        person3.displayOutput(person3.getName(), person3.getAge(), person3.getProfession());
//Create new person and change his profession
        System.out.println("Now I will create new person and change his profession" +
                "\nPERSON 4");
        Person person4 = new Person();
        person4.enterName();
        person4.setName(sc.nextLine());
        person4.enterAge();
        person4.setAge(sc.nextInt());
        sc.nextLine();
        person4.enterProfession();
        person4.setProfession(sc.nextLine());
        person4.displayOutput(person4.getName(), person4.getAge(), person4.getProfession());
        //выбор изменяемого значения  и изменение выбраного значения
        person4.changeData();
        sc.close();
    }
}
