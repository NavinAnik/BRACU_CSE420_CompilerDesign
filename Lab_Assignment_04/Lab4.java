import java.io.*;
import java.util.*;

public class Lab4
{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner kc ;
        kc= new Scanner(new File("C:\\Users\\Anik\\OneDrive\\Desktop\\txt.txt"));
        System.out.println("Methods : ");
        while(kc.hasNextLine()){
            String str = kc.nextLine();
            String str2 = kc.next();
            if(str.contains("(") && str2.contains("{"))
            {
                String [] arr = str.split("\\(");
                String [] arr2 = arr[0].split("\\ ");
                int count = arr2.length;
                System.out.println(arr2[count-1] + "(" + arr[1] + ", return type :  " + arr2[count-2]);
            }


        }
    }
}