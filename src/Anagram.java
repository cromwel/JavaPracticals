import java.util.Scanner;

    public class Anagram
    {
        public static void main(String[] input)
        {
            String string1, string2;
            int length, length1, length2, i, j, found=0, not_found=0;
            Scanner scan = new Scanner(System.in);

            System.out.print("First String : ");
            string1 = scan.nextLine();
            System.out.print("Second String : ");
            string2 = scan.nextLine();

            length1 = string1.length();
            length2 = string2.length();

            if(length1 == length2)
            {
                length = length1;
                for(i=0; i<length; i++)
                {
                    found = 0;
                    for(j=0; j<length; j++)
                    {
                        if(string1.charAt(i) == string2.charAt(j))
                        {
                            found = 1;
                            break;
                        }
                    }
                    if(found == 0)
                    {
                        not_found = 1;
                        break;
                    }
                }
                if(not_found == 1)
                {
                    System.out.print("Not Anagrams!");
                }
                else
                {
                    System.out.print("Anagrams!");
                }
            }
            else
            {
                System.out.print("Strings Must have the same number of Char");
            }
        }
    }

