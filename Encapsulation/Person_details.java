class Person {
 private String name;
 private int age;
 private String country;
 public void getName() {
 System.out.println("Name: " + name);
 }
 public void setName(String name) {
 this.name = name;
 }
 public void getAge() {
 System.out.println("Age: " + age);
 }
 public void setAge(int age) {
 this.age = age;
 }
 public void getCountry() {
 System.out.println("Country: " + country);
 }
 public void setCountry(String country) {
 this.country = country;
 }
}
public class Main {
 public static void main(String[] args) {
 Person person = new Person();
 person.setName("John");
 person.setAge(30);
 person.setCountry("USA");
 person.getName();
 person.getAge();
 person.getCountry();
 }
}
