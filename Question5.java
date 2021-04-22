import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Collections;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
    
    Scanner in = new Scanner(System.in);
    int noOfInt = in.nextInt();

    LinkedHashMap<Integer, Integer> numbers = new LinkedHashMap<>();
    for (int i = 0; i < noOfInt; ++i) {
      int n = in.nextInt();

      if (numbers.containsKey(n)) {
        numbers.replace(n, numbers.get(n) + 1);
      } else {
        numbers.put(n, 1);
      }
    }

    int max = Collections.max(numbers.values());
    int mode = 0;

    // for (int key : numbers.keySet()) {
    for (HashMap.Entry<Integer, Integer> entry : numbers.entrySet()) {
      if (entry.getValue() == max) {
        mode = entry.getKey();
        break;
      }
    }
    System.out.println(mode);
  }
}
