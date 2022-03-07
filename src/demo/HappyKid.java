package demo;
import java.time.LocalDateTime;

public class HappyKid {
  String name;
  int yearOfBirth;
  int age;

  public void calculateAge(){
    age = LocalDateTime.now().getYear() - yearOfBirth;
  }
  HappyKid(String name1){
  name = name1;
  }
  public String toString(){
    return "HappyKids: " + name + "\n" + yearOfBirth + "\n" + age + "\n";
  }
}
