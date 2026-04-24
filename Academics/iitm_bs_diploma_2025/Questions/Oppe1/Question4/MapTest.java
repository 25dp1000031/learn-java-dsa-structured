package Academics.iitm_bs_diploma_2025.Questions.Oppe1.Question4;

import java.util.*;

public class MapTest {
    public static void printShopName(ArrayList<Shop> sList) {
        Map<String, Integer> m = new LinkedHashMap<String, Integer>();
        String shop = "";
        int sold = 0;

        // Write your code here
        for (Shop s : sList) {
            m.put(s.getName(), m.getOrDefault(s.getName(), 0) + s.getItemSold());
        }
        for (Map.Entry<String, Integer> entry : m.entrySet()) {
            if (entry.getValue() > sold) {
                shop = entry.getKey();
                sold = entry.getValue();
            }
        }
        System.out.println(shop + " : " + sold);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Shop> list = new ArrayList<Shop>();
        for (int i = 0; i < 4; i++) {
            list.add(new Shop(sc.next(), sc.nextInt()));
        }
        printShopName(list);
    }
}

class Shop {
    private String name;
    private int nsold;

    public Shop(String s, int ns) {
        this.name = s;
        this.nsold = ns;
    }

    public String getName() {
        return name;
    }

    public int getItemSold() {
        return nsold;
    }
}
