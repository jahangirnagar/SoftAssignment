import java.util.ArrayList;
import java.util.Scanner;


public class Formulary {

Scanner scan=new Scanner(System.in);
	 ArrayList<String> drugList = new ArrayList<String>();
	 String checkdrug;
	    public void druglist()
	    {
	      
	        drugList.add("Seclo");
	        drugList.add("Beklo");
	        drugList.add("Napa");
	        drugList.add("Perasitamol");
	        System.out.println("Enter the drug name to search : ");
	        checkdrug=scan.nextLine();
	        if(drugList.contains(checkdrug)==true)
	        {
	        	System.out.println("Drug is exist in the Druglist.");
	        }
	        else
	        {
	        	System.out.println("Drug does not exist in the Druglist.");
	        }
	        
	    }
	    public void printDrugList()
	    {
	        System.out.println("This ios new Druglist "+drugList);
	    }
	


}
