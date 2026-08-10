import java.util.*;
import java.util.logging.Logger;
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
        UnderstandingExceptions exceptions = new UnderstandingExceptions();
        exceptions.ExampleArithmeticException(10, 0);
        exceptions.ExampleArithmeticException(10, 5);
        int res = exceptions.ExampleOfFinallyAndResources();
        System.out.println(res);

        Debugging debug = new Debugging();
        debug.sout();
        debug.UsingLogger();
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
    ArrayList<Integer> list = new ArrayList<>();

    public void commonOpsOnArrayList() {
        list.set(0, 11);
        list.set(1, 12);
        list.set(2, 13);
        list.set(3, 14);
        list.set(4, 15);
        list.remove(0);
        System.out.println(list.isEmpty());
        list.forEach((a) -> {
            System.out.println(a + " ");
        });

    }
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
        map.forEach((k, v) -> {
            System.out.println(k + " -> " + v);
        });

    }
}

class UnderstandingPriorityQueues {
    // by default a priority queue or heap for that matter is a min heap that is the
    // top most element is a min-element
    // creation
    // ==========================================================
    void PriorityQueueDefault() {
        // 1. Default Priority Queue (Min Heap)
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(10);
        pq.offer(5);
        pq.offer(20);
        pq.offer(1);

        System.out.println("Min Heap:");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
        // Output: 1 5 10 20

        System.out.println("\n");
    }

    // ==========================================================
    void PriorityQueueMax() {
        // 2. Max Heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.offer(10);
        maxHeap.offer(5);
        maxHeap.offer(20);
        maxHeap.offer(1);

        System.out.println("Max Heap:");
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " ");
        }
        // Output: 20 10 5 1

        System.out.println("\n");
    }

    // ==========================================================
    void PriorityQueueWithArray() {
        // 3. Priority Queue of int[]
        // Comparator is REQUIRED because arrays don't implement Comparable
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        heap.offer(new int[] { 3, 100 });
        heap.offer(new int[] { 1, 500 });
        heap.offer(new int[] { 2, 200 });

        System.out.println("int[] sorted by first element:");

        while (!heap.isEmpty()) {
            int[] arr = heap.poll();
            System.out.println(Arrays.toString(arr));
        }
        /*
         * Output:
         * [1, 500]
         * [2, 200]
         * [3, 100]
         */
        System.out.println();

        // ==========================================================
        // 4. Sort int[] by second element
        PriorityQueue<int[]> secondValueHeap = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));

        secondValueHeap.offer(new int[] { 5, 80 });
        secondValueHeap.offer(new int[] { 1, 20 });
        secondValueHeap.offer(new int[] { 2, 50 });

        System.out.println("int[] sorted by second element:");

        while (!secondValueHeap.isEmpty()) {
            System.out.println(Arrays.toString(secondValueHeap.poll()));
        }

        System.out.println();
    }

    void PriorityQueueWithArrayList() {
        // ==========================================================
        // 5.Priority Queue of ArrayList<Integer>
        PriorityQueue<ArrayList<Integer>> pqList = new PriorityQueue<>((a, b) -> Integer.compare(a.get(0), b.get(0)));

        pqList.offer(new ArrayList<>(Arrays.asList(3, 40)));
        pqList.offer(new ArrayList<>(Arrays.asList(1, 10)));
        pqList.offer(new ArrayList<>(Arrays.asList(2, 30)));

        System.out.println("ArrayList sorted by first element:");

        while (!pqList.isEmpty()) {
            System.out.println(pqList.poll());
        }

        System.out.println();
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
    // don't be surprised you can use nested class and nested functions in java
    class InputWithScanner {
        Scanner sc = new Scanner(System.in);

        void SimpleInput() {
            // input : 1 hello
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
            sc.close(); // don't forget to close the scanner since it takes a lot of resources
        }

        void MultipleMixInput() {
            // input : 1 hello 3.14
            System.out.println("Enter the multiple inputs : ");
            int a = sc.nextInt();
            String b = sc.next();
            Float c = sc.nextFloat();
            System.out.println("Your Output : %n, %s, %f".formatted(a, b, c));

        }

        void MultipleTestCases() {
            // input : 2 4 hello world from aayush 3 java or python
            // here we have to use loops to do this so we do a
            System.out.println("Enter Your Multiple Test Case Input : ");
            // since we are given the length of the input we use that
            int t = sc.nextInt();
            String[][] data = new String[t][];

            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                data[i] = new String[n];
                for (int j = 0; j < n; j++) {
                    String str = sc.next();
                    data[i][j] = str;
                }
            }
            // printing
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data.length; j++) {
                    System.out.println(data[i][j] + " ");
                }
                System.out.println(); // new line
            }
        }

        void MultipleTestCasesWithNoInputLength() {
            // input : 4 hello world from aayush
            // here we have to use loops to do this so we do a
            System.out.println("Enter Your Multiple Test Case Input : ");
            // same as above we just add a check as to how many elements we get in the input
            // but since size is unknown here its better to use ArrayList
            List<List<String>> data = new ArrayList<>();
            while (sc.hasNext()) {
                String line = sc.nextLine();
                String words[] = line.split(" ");
                data.add(Arrays.asList(words));
            }

        }

        class MatrixInput {
            void MatrixInputSizeGivenExample() {
                // input : 3
                // 0 1 0
                // 1 0 1
                // 0 1 0
                System.out.println("Enter the Adj.Matrix : ");
                int n = sc.nextInt();
                int[][] arr = new int[n][n];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        arr[i][j] = sc.nextInt();
                    }
                }
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }
            }

            void MatrixInputSizeNotGivenExample() {
                // input : 0 1 0
                // 1 0 1
                // 0 1 0
                System.out.println("Enter Your Matrix : ");
                // again since the size unknown we use arraylist
                List<int[]> mat = new ArrayList<>();
                while (sc.hasNextLine()) {
                    String line = sc.nextLine();
                    String[] parts = line.split(" ");
                    int[] row = new int[parts.length];
                    for (int i = 0; i < row.length; i++) {
                        row[i] = Integer.parseInt(parts[i]);
                    }
                    mat.add(row);
                }
                // if you need to convert to traditional array
                int[][] adj = new int[mat.size()][];
                for (int i = 0; i < adj.length; i++) {
                    adj[i] = mat.get(i);
                }
            }
        }

        void InputWithHashMap() {

        }
    }

    // using scanner or BufferedReader later on comes down to the performance,
    // BufferedReader is really efficient as compared to scanner and thus
    // BufferedReader with StringTokenizer is preferred
    class InputWithBFAndST {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        void SimpleInput() throws IOException {
            // input : 12
            int a = Integer.parseInt(br.readLine());
            System.out.println(a);
        }

        void MultipleMixInput() throws IOException {
            // input : 12 hello 3.14
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            double d = Double.parseDouble(st.nextToken());
            System.out.println("THe OutPut is : %n, %s, %d".formatted(n, s, d));
        }

        void MultipleTestCases() {
            // input : 4 hello world from aayush
        }

        void MatrixInput() {

        }

        void InputWithHashMap() {

        }
    }
}

// sometimes we require less typing and more concise codes for that very purpose
// ternary operators exist
class Ternary {
    // for example
    public Ternary(Boolean Flag) {
        if (Flag) {
            System.out.println("The Flag is set to be True");
        } else {
            System.out.println("The Flag is set to False");
        }
        // this is our traditional use of ifelse now in ternary it seems as
        System.out.println(Flag == true ? "The Flag is set to be True" : "The Flag is set to be False");
    }
}

// 179. Largest Number
class UnderstandingSortingOnArraysAndItsFeatures {
    // using comparator to simply make a sorting customizable
    // comes from the comparator interface in java
    // traditional verbose not preferred method
    void ComparatorExample() {

    }

    // modern method
    void ComparatorModernExample() {

    }
}

// understanding exceptions
class UnderstandingExceptions {
    // an exception is an even that interrupts flow of an program consider like
    // handing errors before they actually arrive
    // for example 10/0 -> arithmeticException -> so we just handle it before it
    // arrives
    public void ExampleArithmeticException(int a, int b) {
        try {
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) { // or you can just write Exception in place of ArithmeticException
            // TODO: handle exception
            System.out.println("sorry, cannot divide");
        }
    }

    // but there are whole lot more types of exceptions for example
    // NullPointerException
    public void ExampleNullPointerException(String s) {
        try {
            System.out.println(s.length());
        } catch (NullPointerException e) {
            // TODO: handle exception
            System.out.println("sorry, the value is null and does not have a length");
        }
    }

    // ArrayIndexOutOfBoundsException
    public void ExampleArrayIndexOutOfBoundsException(int[] arr, int index) {
        try {
            System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("try to keep it in array indexing from 0 to " + (arr.length - 1));
        }
    }

    // StringIndexOutOfBoundsException
    public void ExampleStringIndexOutOfBoundsException(String s, int index) {
        try {
            System.out.println(s.charAt(index));
        } catch (StringIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("try to keep it in String indexing from 0 to " + (s.length() - 1));
        }
    }

    // NumberFormatException
    public void ExampleNumberFormatException() {
        try {
            int age = Integer.parseInt("abc");
            System.out.println(age);
        } catch (NumberFormatException e) {
            System.out.println("cannot convert");
        }
    }

    // IOException --> important for competitive or cses sheet
    public void ExampleIOException() {
        try {
            System.out.println(" enter a string : ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            System.out.println(s);
            int ns = Integer.parseInt(s);
            System.out.println(ns);
        } catch (IOException e) {
            System.out.println("encountered an exception");
        } catch (NumberFormatException e) {
            System.out.println("Yea we cant cast a String to a number bruh sorry T_T");
        } finally {
            System.out.println("now here the code has no idea what exception it is so it just run this");
            System.out.println(
                    "p.s `finally` always runs no matter what its mostly use to clean up resources such as Scanner");
        }
    }

    public int ExampleOfFinallyAndResources() {
        // see finally will run regardless and it will also override try if needed for
        // example
        try {
            return 30;
        } catch (Exception e) {
            // TODO: handle exception
            return 10;
        } finally {
            return 20;
            // here finally has overidden both try and catch (so 20 will be returned and not
            // 10 or 30 even if try had an exception it would go to catch but then as well
            // finally will overide the catch ) finally will always run and overide
        }
        // here resources automatically closes all the resources you don't have to even
        // explicitly tell it.
    }
}

class Debugging {
    // a lot of times we need to debug so :
    // first and simplest is to use system.out.println
    public void sout() {
        int k = 0;
        int j = 4;
        char c = 'a';
        System.out.println("ran");
        System.out.printf("ran with values : k = %d, j= %d, c=%c", k, j, c);
    }

    // 2nd and better for backend projects is using logger
    public void UsingLogger() {
        Logger logger = Logger.getLogger(Logger.class.getName());
        logger.info("677 -> ran");
    }
}