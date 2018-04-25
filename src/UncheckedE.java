//exceptions not verified
//extends java.lang.RuntimeExceptions
//not sensed by compilers
//mostly depends on program logic

public class UncheckedE
{
    public static void main(String args[]) {
        int x = 0;
        int y = 10;
        int z = y/x;

        System.out.println(z);
    }
}