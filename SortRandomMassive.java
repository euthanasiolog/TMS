import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by Piatrok on 18.10.16.
 */
public class SortRandomMassive
{
    public static void main (String [] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
        int n = Integer.parseInt(in.readLine());
        int [] array = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++)
        {
            array [i] = random.nextInt(n) + 1;
        }
        for (int i = 0; i < n; i++)
        {
            System.out.print(array [i] + " ");
        }
       // Arrays.sort(array);
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n - 1; j++)
            {
                if (array[j] > array[j + 1] )
                {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Sort: ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(array [i] + " ");
        }

    }
}
