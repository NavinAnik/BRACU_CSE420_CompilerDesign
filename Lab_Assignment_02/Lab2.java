import java.util.*;
import java.io.*;

public class Lab2 {
    public static void main(String[] args) throws FileNotFoundException
    {

        Scanner kc;
        String string = null;

        kc = new Scanner(new File("C:\\Users\\Anik\\OneDrive\\Desktop\\txt.txt"));


        int test = Integer.parseInt(kc.nextLine());


        for (int i = 0; i < test; i++)
        {

            string = kc.nextLine();
            boolean finalr = false;
            String type = null;

            if (string.contains("@"))
            {
                type = "email";
            } else if (!(string.contains("@")) && (string.contains(".")))
            {
                type = "web";
            }

            if (type == "web")
            {
                String[] spl = string.split("\\.");
                int count = 0;

                for (int j = 0; j < spl.length; j++)
                {
                    char[] Web = spl[j].toCharArray();
                    boolean ch = false;

                    for (int k = 0; k < Web.length; k++)
                    {
                        if (Web[k] >= 'A' && Web[k] <= 'Z' || Web[k] >= 'a' && Web[k] <= 'z' || Web[k] >= '0' && Web[k] <= '9')
                        {
                            ch = true;
                        } else {
                            ch = false;
                        }
                    }

                    if (ch == true)
                    {
                        count++;
                    }
                }

                if (count == spl.length)
                {
                    finalr = true;
                } else {
                    finalr = false;
                }

            }

            else if (type == "email")
            {
                String[] Mail = string.split("\\@");
                String[] mail = null;

                int mailLength = 0;
                int count1 = 0;
                int count2 = 0;

                for (int j = 0; j < Mail.length; j++)
                {

                    if (!(Mail[j].contains(".")))
                    {

                        char[] ch = Mail[j].toCharArray();
                        boolean Result1 = false;

                        for (int k = 0; k < ch.length; k++)
                        {
                            if (ch[k] >= 'A' && ch[k] <= 'Z' || ch[k] >= 'a' && ch[k] <= 'z' || ch[k] >= '0' && ch[k] <= '9')
                            {
                                Result1 = true;
                            } else
                                {
                                Result1 = false;
                            }
                        }

                        if (Result1 == true)
                        {
                            count1++;
                        }

                    }

                    else if (Mail[j].contains("."))
                    {
                        mail = Mail[j].split("\\.");

                        mailLength = mail.length;

                        for (int l = 0; l < mail.length; l++)
                        {
                            char[] chMail = mail[l].toCharArray();
                            boolean Result2 = false;

                            for (int m = 0; m < chMail.length; m++)
                            {
                                if (chMail[m] >= 'A' && chMail[m] <= 'Z' || chMail[m] >= 'a' && chMail[m] <= 'z' || chMail[m] >= '0' && chMail[m] <= '9')
                                {
                                    Result2 = true;
                                } else {
                                    Result2 = false;
                                }

                                if (Result2 == true)
                                {
                                    count2++;
                                }
                            }


                        }

                    }

                    if ((count1+count2) == (Mail.length + mailLength - 1))
                    {
                        finalr = true;
                    }

                    else
                        {
                        finalr = false;
                    }

                }

            }



            if (finalr = true)
            {
                System.out.println(type + ", " + (i + 1));
            }
            else
                {
                System.out.println("Invalid" + ", " + (i + 1));
            }

        }
    }

}