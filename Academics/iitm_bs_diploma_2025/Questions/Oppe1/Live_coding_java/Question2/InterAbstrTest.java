package Academics.iitm_bs_diploma_2025.Questions.Oppe1.Live_coding_java.Question2;

import java.util.Scanner;

interface IResearcherScholar {
    public void studies(String str);

    public void teaches(String str);

}

abstract class JuniorRS implements IResearcherScholar {
    public void studies(String str) {
        System.out.println("TA studies " + str);
    }
}

class SeniorRS extends JuniorRS {
    public void teaches(String str) {
        System.out.println("TA teacher " + str);
    }

}

public abstract class InterAbstrTest extends SeniorRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        SeniorRS sr = new SeniorRS();
        JuniorRS jr = new SeniorRS();
        jr.studies(str1);
        sr.studies(str2);
        sr.teaches(str2);
        sc.close();
    }

}
