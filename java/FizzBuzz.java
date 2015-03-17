public class Main {
  public static void main(String[] args) {
    int[] numArray = {5, 2, 7, 15, 3};
    for(int num : numArray){
      if(num % 5 == 0 && num % 3 == 0){
        System.out.println("FizzBuzz");
      } else if(num % 3 == 0){
        System.out.println("Fizz");
      } else if(num % 5 == 0){
        System.out.println("Buzz");
      } else {
        System.out.println(num);
      }
    }
  }
}
