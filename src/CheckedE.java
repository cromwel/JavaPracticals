import java.io.*;

//handles the exception
//extends java.lang.Exception
//solved mainly by throws or try/catch braces
//sensed by compilers

public class CheckedE
{
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("D:\\trial\\a.txt");
        BufferedReader fileInput = new BufferedReader(file);

        for (int counter = 0; counter < 3; counter++)
            System.out.println(fileInput.readLine());

        fileInput.close();
    }
}