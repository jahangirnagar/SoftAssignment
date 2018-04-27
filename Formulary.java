import java.util.ArrayList;
import java.util.Scanner;


public class Formulary {


	Scanner scan=new Scanner(System.in);
	 ArrayList<String> drugList = new ArrayList<String>();
	String checkdrug;
	    public void druglist()
	    {
	      
	        drugList.add("Duralux");
	        drugList.add("histasin");
	        drugList.add("Tusca");
	        drugList.add("disprin");
	         System.out.println("Enter the drug name to search : ");
	        checkdrug=scan.nextLine();
		    if(drugList.contains(checkdrug)==true)
	        {
	        	System.out.println("Your Enterd Drug is exist in the drug list.");
	        }
		    else
	        {
	        	System.out.println("Drug does not exist in the Druglist.");
	        }
	    }
	    public void printDrugList()
	    {
	        System.out.println("This is new Druglist "+drugList);
	    }


}
