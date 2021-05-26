import java.util.*;
import java.io.*;
import java.util.regex.*;

public class Lab3
{
    public static void main(String[]args) throws FileNotFoundException
    {
        Scanner kc;
        kc = new Scanner(new File("C:\\Users\\Anik\\OneDrive\\Desktop\\txt.txt"));
        int numberOfRegular = Integer.parseInt(kc.nextLine());
        String [] a = new String[numberOfRegular];
        for(int i=0; i<a.length; i++)
        {
            a[i] = kc.nextLine();
        }
        int numberOfString = Integer.parseInt(kc.nextLine());
        String [] arrayStr = new String[numberOfString];

        for(int i=0; i<arrayStr.length; i++)
        {
            arrayStr[i] = kc.nextLine();
        }

        for(int i=0; i<arrayStr.length; i++)
        {
            boolean result = false;
            int count = 0;
            for(int j=0; j<a.length; j++)
            {
                result = Pattern.matches(a[j], arrayStr[i]);
                if(result==true)
                {
                    System.out.println("Yes, " + (j+1));
                    count++;
                }
            }
            if(count==0)
            {
                System.out.println("No, " + "0");
            }
        }
    }
}