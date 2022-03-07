package demo;

public class Test {

      public static void main(String[] args) {
      HappyKid kid1 = new HappyKid("");
      HappyKid kid2 = new HappyKid("");
      HappyKid kid3 = new HappyKid("");
      HappyKid kid4 = new HappyKid("");
      HappyKid kid5 = new HappyKid("Ian");

      kid1.name = "Benjamin lugter";
      kid1.yearOfBirth = 1990;
      kid1.calculateAge();

      kid2.name = "Mathias dufter";
      kid2.yearOfBirth = 1995;
      kid2.calculateAge();

      kid3.name = "Jessi sover";
      kid3.yearOfBirth = 2000;
      kid3.calculateAge();

      kid4.name = "Patrick laver dårlige jokes";
      kid4.yearOfBirth = 2020;
      kid4.calculateAge();

      //kid5.name = "Ian skuler";
      kid5.yearOfBirth = 1400;
      kid5.calculateAge();

       // System.out.println("Kids names: " +"\n"+kid1.name+"\n"+kid2.name+"\n"+kid3.name+"\n"+kid4.name+"\n"+kid5.name);
            System.out.println("" + kid1 + kid2 + kid3 + kid4 + kid5);

    }
}
