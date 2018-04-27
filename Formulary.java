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
	        System.out.println(drugList);
	    }
	    public void printDrugList()
	    {
	        System.out.println("This is new Druglist "+drugList);
	    }


}
