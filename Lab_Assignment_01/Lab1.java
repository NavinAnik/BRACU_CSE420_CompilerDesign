import java.nio.file.FileAlreadyExistsException;
import java.util.*;
import java.io.*;
class Lab1 {
    public static void main(String[] args) throws FileAlreadyExistsException, FileNotFoundException {
        Scanner kc;
        String a = null;

        ArrayList<String> Key= new ArrayList(Arrays.asList("abstract", "continue", "for", "new", "switch", "assert", "default", "goto", "package", "synchronized", "boolean", "do", "if", "private", "this", "break", "double", "implements", "protected", "throw", "byte", "else", "import", "public", "throws", "case", "enum", "instanceof", "return", "transient", "catch", "extends", "int", "short", "try", "char", "final", "interface", "static", "void", "class", "finally", "long", "strictfp", "volatile", "const", "float", "native", "super", "while"));
        ArrayList<String> mathOperator= new ArrayList(Arrays.asList("+", "-", "/", "%", "=", "*", "++", "--"));
        ArrayList<String> logOperator = new ArrayList(Arrays.asList(">", "<", ">=", "<=", "||", "&&", "^", "|", "&", "!"));
        ArrayList<String> identifiers = new ArrayList(Arrays.asList("A", "a", "B", "b", "C", "c", "D", "d", "E", "e", "F", "f", "G", "g", "H", "h", "I", "i", "J", "j", "K", "k", "L", "l", "M", "m", "N", "n", "O", "o", "P", "p", "Q", "q", "R", "r", "S", "s", "T", "t", "U", "u", "V", "v", "W", "w", "X", "x", "Y", "y", "Z", "z"));
        ArrayList<String> others = new ArrayList(Arrays.asList(",", ";", "(", ")", "{", "}", "[", "]"));


        Set<String> key = new HashSet<>();
        Set<String> id = new HashSet<>();
        Set<String> mathOpera = new HashSet<>();
        Set<String> logOpera = new HashSet<>();
        Set<String> num = new HashSet<>();
        Set<String> other = new HashSet<>();

        kc = new Scanner(new File("C:\\Users\\Anik\\OneDrive\\Desktop\\test.txt"));

        while(kc.hasNextLine())
        {
            a = kc.nextLine();
            String []  b = a.split(" ");

            for(String c : b)
            {
                if(Key.contains(c))
                {
                    key.add(c);
                }
                else if (mathOperator.contains(c))
                {
                    mathOpera.add(c);
                }
                else if (logOperator.contains(c))
                {
                    logOpera.add(c);
                }
                else if (identifiers.contains(c))
                {
                    id.add(c);
                }
                else if (others.contains(c))
                {
                    other.add(c);
                }
                else if(Int(c))
                {
                    num.add(c);
                }
                else if(Doub(c))
                {
                   num.add(c);
                }
            }

        }
        System.out.print("Keywords: ");
        for (String elemKeywords : key)
        {
            System.out.print(elemKeywords + " ");
        }
        System.out.println();

        System.out.print("Identifiers: ");
        for (String elemIdentifiers : id)
        {
            System.out.print(elemIdentifiers + " ");
        }
        System.out.println();

        System.out.print("Math Operators: ");
        for (String elemMathOperators : mathOpera)
        {
            System.out.print(elemMathOperators + " ");
        }
        System.out.println();

        System.out.print("Logical Operators: ");
        for (String elemLogOperators : logOpera)
        {
            System.out.print(elemLogOperators + " ");
        }
        System.out.println();

        System.out.print("Numerical Values: ");
        for (String elemNumValues : num
        )
        {
            System.out.print(elemNumValues + " ");
        }
        System.out.println();

        System.out.print("Others: ");
        for (String elemOthers : other)
        {
            System.out.print(elemOthers + " ");
        }
        System.out.println();

    }

    private static boolean Doub(String d)
    {
        try
        {
            Double.parseDouble(d);
            return true;
        } catch (NumberFormatException e)
        {
            return false;
        }
    }

    private static boolean Int(String d)
    {
        try
        {
            Integer.parseInt(d);
            return true;
        } catch (NumberFormatException e)
        {
            return false;
        }
    }
}