public class Customer {
  String firstname;
  String lastname;
  String gender;
  int age;
  String email;

  public void printCustomer() {
    System.out.println("FirstName : " + firstname);
    System.out.println("LastName : " + lastname);
    System.out.println("Gender : " + gender);
    System.out.println("Age : " + age);
    System.out.println("Email : " + email);
  }
}
