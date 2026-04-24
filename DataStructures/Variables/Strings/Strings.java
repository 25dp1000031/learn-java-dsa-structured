/**
 * Performs Various functions and demonstrates various functions of String, StringBuffer, StringBuilder.
 * @param name The String, StringBuffer, StringBuilder.
 * @param i To iterate.
 * @print name.
 */

package DataStructures.Variables.Strings;

public class Strings {

    static void stringTest() { // simplicity
        String name = new String("aayush"); // using object method not required always
        // String name = "aayush"; // works as well
        String lname = "kukade";

        System.out.println(name);
        System.out.println(name.charAt(3));
        System.out.println(name.concat(lname));

        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    }

    static void StringBuffer() { // mutable , multi thread sync , reliable better performance than string
        StringBuffer name = new StringBuffer("aayush");
        System.out.println(name);
        name.append("null");
        name.insert(3, "java");
        name.delete(4, 5);
        String res = name.substring(0, 3);
        System.out.println(res);
        System.out.println(res);
        System.out.println(name.capacity());

        System.out.println(name);

        String str = name.toString(); // conversion
        System.out.println(str);
    }

    static void StringBuilder() { // mutable , multi thread sync , reliable better performance than string and
                                  // stringbuffer
        StringBuilder name = new StringBuilder("aayush");
        System.out.println(name);
        name.append("null");
        System.out.println(name);

        String str = name.toString(); // conversion
        System.out.println(str);
    }

    public static void main(String[] args) {
        stringTest();
        StringBuffer();
        StringBuilder();
    }
}

/*
 * unlike other languages we have 3 parts of strings so 1st one bring String :
 * this is our typical string type its unmutable
 * then we have StringBuffer : this is reliable and performance oriented String
 * type its mutable unlike String
 * then we also have StringBuilder : same as StringBuffer but at the same time
 * has more control over high level functions such as concurrency its also
 * mutable
 */