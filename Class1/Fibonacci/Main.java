import java.util.Scanner;

class Main {

  public static int fib(int num) {
    int num1 = 0;
    int num2 = 1;
    for(int i = 0; i < num; i++) {
      int sum = num1 + num2;
      num1 = num2;
      num2 = sum;
    }

    return num2;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while(true) {
      System.out.print("Input number: ");
      int input = scanner.nextInt();
      System.out.println(fib(input));
    }
  }
}
