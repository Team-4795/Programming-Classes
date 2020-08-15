import java.util.Scanner;

class Main {

  public static int fib(int num) {

    int sum = 0;
    
    // Insert code to calculate fibonacci here
 
    return sum;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while(true) {
      System.out.print("Input number: ");
      int input = scanner.nextInt();
      // Insert logic here to quit on negative input
      System.out.println(fib(input));
    }
  }
}
