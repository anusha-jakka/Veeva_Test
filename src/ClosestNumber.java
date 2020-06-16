import java.io.*;
import java.util.*;

public class ClosestNumber {
    /**
     * Returns the distance between the two closest numbers
     * @param numbers An array of numbers
     */
    static int distClosestNumbers(int[] numbers) {
        // try to implement it!
        int sortestDistance=0;

        if(numbers.length>2)
        {sortestDistance =Math.abs(numbers[0]-numbers[1]);}
        int source=0,destination=0;

        for(int i=0;i<numbers.length;i++)
        {
            for(int j=i+1;j<numbers.length;j++)
            {
               if(Math.abs(numbers[i]-numbers[j])<sortestDistance)
               {
                   source=numbers[i];
                   destination=numbers[j];
                   sortestDistance=Math.abs(numbers[i]-numbers[j]);
               }
            }
        }


        System.out.print("Shortest distance between "+source+" and "+destination +":");


        return sortestDistance;
    }

public static void main(String args[])
{
    List<String> list = new ArrayList<>();
    System.out.println("Enter the numbers :");
    BufferedReader br = null;

    try {
        br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        while (st != null && st.hasMoreElements()) {
            list.add(st.nextToken());
        }
    } catch (IOException e) {
        e.printStackTrace();
    }

        int[] testArray = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            testArray[i] = Integer.parseInt(list.get(i));
        }
        System.out.println(distClosestNumbers(testArray));

//    int[] testArray2={4, 5, 5, 99, 99, 65};
//    System.out.println(distClosestNumbers(testArray2));

    }

}
