import java.lang.String;
import java.util.Scanner;

public class homeappliancesstore {

    public static String onoma ;
    public static String dieuthinsi ;
    public static int plithosip;

    public static void main(String[] args)
    {
        try {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Grapse onoma etairias: ");
            String Namecomp = myObj.nextLine();
            if (Namecomp.equals(" ")) {
                System.out.println("Den iparxei onoma ");
            }

            {
                Scanner myObj2 = new Scanner(System.in);
                System.out.println("Grapse dieu8insi tis etairias: ");
                String Idcomp = myObj2.nextLine();
                if (Idcomp.equals(" ")) {
                    System.out.println("Den iparxei id etairias");
                }
            }

            {
                Scanner myObj3 = new Scanner(System.in);
                System.out.println("Posa atoma douleuoun : ");
                int Stuffcomp = Integer.parseInt(myObj3.nextLine());
                if (Stuffcomp == 0 || Stuffcomp < 0 ) {
                    System.out.println("Den iparxei prosopiko");
                }
            }
        }
        catch(Exception e) {
            System.out.println(onoma);
            System.out.println(dieuthinsi);
            System.out.println(plithosip);
        }
    }

}