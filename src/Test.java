public class Test {
/*
If two references point to the same object, they are equal.
If two references point to different objects, they are not equal, even though they have the same contents.

Integer.java class has IntegerCache.java that caches all Integer objects between -128 and 127 to
reduce the potential memory footprint.

ValueOf() method returns the cache instance thus c and d point to the same object to give true.
*/
        public static void main(String[] args)
        {
            Integer a = 1000, b = 1000;
            System.out.println(a == b);
            Integer c = 100, d = 100;
            System.out.println(c == d);
        }
}
