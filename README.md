Create a method sumOdd that takes in an integer and returns an integer that is the sum of all of the odd digits. 
class Main {
  //sumOddDigits method goes below
  //remember to make it static
  
  
  
  //sumOdDigit method goes above 
  //Code to test your method is below
  public static void main(String[] args) {
    System.out.println("Sum of odds 13: " + sumOddDigits(13));
    System.out.println("Sum of odds 4682222: " + sumOddDigits(4682222));
    System.out.println("Sum of odds 1: " + sumOddDigits(1));
    System.out.println("Sum of odds 1347689: " + sumOddDigits(1347689));


  }
}
# Autograding Example: Java
This example project is written in Java, and tested with Gradle/JUnit.

### The assignment
The tests are currently failing because of an output mismatch. Fixing the `System.out.println` in the main method will make the tests green.

### Setup command
N/A

### Run command
`gradle test`

### Notes
- The JDK is installed on GitHub Actions machines, so you're also able to directly invoke `javac`, `java`, or any other CLI command included in the JDK. 
