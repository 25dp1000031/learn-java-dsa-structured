import java.util.*;
import java.io.*;
// import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // how would you take a input --> use import scanner
        Scanner sc = new Scanner(System.in);
        // methods of Scanner : nextInt() --> takes input as int --> also nextDouble()
        // --> takes input as double, next() --> takes input a single word,
        // -->nextLine() takes input as a full line / reads full line, nextBoolean() -->
        // reads boolean
        System.out.println("type the input : ");
        String input = sc.nextLine();

        System.out.println("you typed : " + input);

        sc.close();

        // how do we take a substring out of a string ?
        // --> use the inbuilt function substring()
        // for example
        String str = "aayush";
        String s = str.substring(2, 4);
        // or we can also do take substring with reverse index
        String sr = str.substring(str.length() - 3);

        // we can also convert the whole of String into an array with arr.toCharArray();
        // for example
        char[] chars = str.toCharArray();
        // or you could get the string's element by getting one by one char
        char a = str.charAt(0);

        // we can reverse the string with a while and 2 pointers swapping or use a quick
        // StringBuilder(preferred)
        String reverse = new StringBuilder(str).reverse().toString();

    }
}

class UnderstandingSyntax {
    // if you want to declare a array in the func input use new like here
    void temp(int[] nums) {
        System.out.println("just a example");
    }
    // now here the intake is a array but you cant do temp({1,2,3,4}) what you have
    // to do is use new
    // temp(new int[] {1,2,3,4})

    // remember use substring if you want to manipulate a string
}

class UnderstandingStrings {
    void Basics() {
        // String in double quotes and char in single quote String s = 'f' will not
        // work, String needs more than one char
        String s = "Hello";
        int n = s.length();
        char c = s.charAt(0);
        // traversal
        for (int i = 0; i < n; i++) {
            System.out.println(s.charAt(i));
        }
        // String Operations
        String slice = s.substring(0, 2); // slicing
        s.equals(slice); // compares
        s.contains(slice); // checks if the elements are in the string
        s.indexOf('h'); // return the index at that very element
        s.toLowerCase(); // converts all the elements to lower case
        s.toUpperCase(); // converts all the elements to upper case
        // converting String into an char array
        // method 1 : direct and preferred
        char[] arr = s.toCharArray(); // convert the char arr back to string
        String s2 = new String(arr);
        // method 2 : indirect and using loop not preferred
        char[] arr2 = new char[s.length()];
        for (int i = 0; i < n; i++) {
            arr2[i] = s.charAt(i);
        }
        // reverse a String
        // use StringBuilder
        StringBuilder sb = new StringBuilder(s);
        String rev2 = sb.reverse().toString(); // since string builder is an object and not a string
        // operations of StringBuilder
        sb.append("World");
        sb.insert(3, ",");
        sb.replace(0, 2, "hi");
        sb.delete(2, 3);
        sb.deleteCharAt(3);
        char ch = sb.charAt(3);
        sb.setCharAt(0, 'h');
        int len = sb.length();
        String str = sb.toString();
        // rather than learning string just learn stringbuilder but to use string
        // operations do this sb.toString().method()
        // for example
        sb.toString().equals(str);
        // you can even use multiple methods together
        String result = sb.toString().toLowerCase().substring(0, 3);
    }

    // important
    void advanced() {
        // frequency array -- important
        String s = "aayush";

        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String sorted = new String(arr);

        // comparing lexicographically and not exact compare for exact use .equals
        String s1 = "kuk";
        String s2 = "ade";
        s1.compareTo(s2);

        // conversion String to int
        int x = Integer.parseInt("123");
        // or
        String z = String.valueOf(x);
        // conversion of char to int
        char one = '1';
        int y = Integer.parseInt(String.valueOf(one));

        // String Split
        String str = "a b c";
        String[] parts = str.split(" "); // or just StringTokenizer

        // starts with or ends with
        s.startsWith("he");
        s.endsWith("ld");
        // Important: Strings are immutable
    }
}

class UnderstandingArraysAndCollectionArray {

}

class UnderstandingHashmapsAndHashSets {
    // hashmaps are <key, value> pair ds
    HashMap<Integer, String> map = new HashMap<>();

    // common operations
    public void commonOperationsOfHashMaps() {
        map.put(1, "aayush");
        map.put(2, "shubrato");
        map.get(1); // gets the value via key
        map.containsKey(1); // checks if the map contains the key
        map.containsValue("aayush"); // checks if the map contains the value
        map.remove(1); // removes the key
        map.getOrDefault(2, "noValue"); // if the key --> exists it returns that value if not it return default
        map.clear(); // removes all entries
        map.size(); // length of the hashmap
        map.isEmpty(); // if the hashmap is empty
        map.replace(2, "anshuman");
        // now advanced operations
        // always use getordefault with put so you dont forget the syntax and also its
        // cleaner that way
        int b = 2;
        map.put(b, map.getOrDefault(b, null));

        // how to traverse the hashmap
        for (int key : map.keySet()) {
            System.out.println(key);
        }
        for (String value : map.values()) {
            System.out.println(value);
        }
        // just rata this
        for (Map.Entry<Integer, String> entry : map.entrySet()) {

        }

    }
}

class UnderstandingCollectionSetsAndQueues {

}

class UnderstandingCollectionLinkedLists {

}

class UnderstandingHowToTakeInput {
    void scanner() {
        Scanner sc = new Scanner(System.in);
        int next_int = sc.nextInt();
        double next_double = sc.nextDouble();
        String line = sc.nextLine();
        String next_string = sc.next();
        sc.close();
    }

    // method 2 : when your better start with the BufferedReader (its a lot more
    // faster than scanner)
    void bufferedReader() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // note : unlike scanner bufferedReader only and only reads strings so you have
        // to manually convert them
        String line = br.readLine();
        int t = Integer.parseInt(br.readLine());
        System.err.println(line + t);
        // taking input as arrays
        String[] parts = br.readLine().split(" ");
        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }
        // using StringTokenizer --> preferred with buffered reader
        StringTokenizer st = new StringTokenizer(br.readLine());
    }

    void multipleTestCases() throws IOException {
        // you know what lets start this whole thing from the basics cuz this is what
        // will help us in the longterm
        // level 0 - basics
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine(); // --> reads the next full line always in string
        // level 1 - single value
        // input : 5
        int n = Integer.parseInt(br.readLine());
        // level 2 - multiple values
        // input : 10 20
        StringTokenizer st = new StringTokenizer(br.readLine()); // --> as the name suggest it breaks the line into
                                                                 // token or more like into parts
        int a = Integer.parseInt(st.nextToken()); // 10
        int b = Integer.parseInt(st.nextToken()); // 20
        // Line → split → take tokens one by one
        // level 3 - mixed values
        // input : 5 hello 3.14
        st = new StringTokenizer(br.readLine());
        int n1 = Integer.parseInt(st.nextToken());
        String s = st.nextToken();
        double d = Double.parseDouble(st.nextToken());
        // level 4 - array input
        // input : 5
        // 1 2 3 4 5
        st = new StringTokenizer(br.readLine());
        int sizeofarr = Integer.parseInt(br.readLine());
        int[] arr = new int[sizeofarr];

    }

    // in both scanner and bf we have to explicitly tell tell the code that its
    // System.in
    class InputWithScanner {
        void SimpleInput() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the input : ");
            int a = sc.nextInt(); // if its an int
            String b = sc.next(); // if its its a string
            System.out.println(String.format("You can print with a formatString as well like this : %n %s", a, b));
            // or
            System.out.println("You can print with a formatString as well like this : %n %s".formatted(a, b)); // if
                                                                                                               // performance
                                                                                                               // matters
                                                                                                               // then
                                                                                                               // use
                                                                                                               // StringBuilder
            // any double, bigint etc can be taken just change the Int to required for
            // example sc.nextDouble();
            sc.close(); // dont forget to close the scanner since it takes a lot of resources
        }

        void MultipleMixInput() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the multiple inputs : ");
            int a = sc.nextInt();
            String b = sc.next();
            Float c = sc.nextFloat();
            System.out.println("Your Output : %n, %s, %f".formatted(a, b, c));

        }

        void MultipleTestCases() {

        }

        void MatrixInput() {

        }

        void InputWithHashMap() {

        }
    }

    // using scanner or BufferedReader later on comes down to the performance,
    // BufferedReader is really efficient as compared to scanner and thus
    // BufferedReader with StringTokenizer is preferred
    class InputWithBFAndST {
        void SimpleInput() {

        }

        void MultipleInput() {

        }

        void MultipleTestCases() {

        }

        void MatrixInput() {

        }

        void InputWithHashMap() {

        }
    }
}