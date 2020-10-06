import java.util.Scanner; 
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
Scanner input = new Scanner(System.in);
    //get users number
System.out.println("Please enter a positive integer");
   int number = input.nextInt(); 
   //create another variable
   int answer = 1; 
       // a for loop
for(int i = number; i >=1; i--){
    answer= answer * i;
}
 System.out.println(number + "!" + "= " + answer);

  }
}
