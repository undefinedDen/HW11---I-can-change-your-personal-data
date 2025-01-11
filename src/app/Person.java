package app;

public class Person {
   private String name;
   private int age;
   private String profession;

   public void setName(String name){
       this.name = name;
   }
   public void setAge(int age){
       if(age <= 0 || age > 150){
           System.out.println("Age can not be less or equals 0. " +
                   "And age can not be bigger than 150 years old");
       }else {
           this.age = age;
       }
   }
   public void setProfession(String profession){
       this.profession = profession;
   }
   public String getName(){
       return name;
   }

    public int getAge() {
        return age;
    }

    public String getProfession() {
        return profession;
    }
}
