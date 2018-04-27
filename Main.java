import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        Current current=new Current();
        New neww=new New();
        Formulary formulary=new Formulary();
        int n;
        System.out.println("\nEnter Your Choice : ");
        System.out.println("\n1. Current Medication .");
        System.out.println("\n2. New Medication .");
        System.out.println("\n3. Formulary .\n");
        n=scan.nextInt();
        if (n==1)
        {
            current.checkDose();
            current.printDose();
        }
        else if(n==2)
        {
        	System.out.println("\nFor New Medication  : ");
            neww.druglist();
        }
        
    }
    

}
