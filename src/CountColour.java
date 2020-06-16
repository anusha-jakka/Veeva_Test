import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class CountColour {

    // Test to check how often "blue" appears in the list
    public static int testCountColour(String colorSet)
    {
        int colorCount=0;
        String expectedColor="blue";
        String[] colors=colorSet.split(", ");
        if(colors.length<=1)
        {
            colors=colorSet.split(",");
        }
        for(String color:colors)
        {
            if(expectedColor.equalsIgnoreCase(color))
            {
                colorCount++;
            }
        }

        return colorCount;
    }


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Colors :");
        String tokens = scanner.nextLine();

        System.out.println("Color of blue count:"+tokens+"# "+testCountColour(tokens));
        scanner.close();
    }

}
