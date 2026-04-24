package CodeChefs;

import java.util.stream.Stream;
import java.io.*;
import java.util.*;
import java.io.InputStreamReader;

public class UnderstandingInputInJavaForCodeChefs {
    public static void main(String[] args) throws IOException {
        Stream.iterate(2, n -> n + 3)
                .map(n -> n * 2)
                .filter(n -> n % 5 == 0)
                .limit(3)
                .forEach((x) -> System.out.print(x + " "));

        UnderstandingInputInJava u = new UnderstandingInputInJava();
        // u.bufferedReader();
    }
}

// this is the practice file
// required for codechefs unlike leetcoe
class UnderstandingInputInJava {
    // method 1 : using scanner import and the only method you need for now
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
}

class questionsonInput {
    void level1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(n);
    }

    void level2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        // int a = Integer.parseInt(st.nextToken());
        // int b = Integer.parseInt(st.nextToken());
        String a = st.nextToken();
        String b = st.nextToken();
        System.out.println(b + a);
    }

    void level3() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
        }
        System.out.println(sum);
    }

    void level4() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int n2 = Integer.parseInt(br.readLine());
            int[] arr = new int[n2];
            for (int j = 0; j < n2; j++) {
                st = new StringTokenizer(br.readLine());
                arr[i] = Integer.parseInt(st.nextToken());
            }
            System.out.println(arr);
        }
    }
}

class morequestionsonInput {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void level1() throws IOException {
        int sum = 0;
        int t = 3;
        while (t-- > 0) {
            int x = Integer.parseInt(br.readLine());
            sum += x;
        }
        System.out.println(sum);
    }

    void level2() throws IOException {
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(a + b);
        }
    }

    void level3() throws IOException {
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int sum = 0;
            for (int i : arr) {
                sum += i;
            }
            System.out.println(sum);
        }
    }
}