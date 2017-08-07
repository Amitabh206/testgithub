/**
 * 
 * @author Amitabh
 * mini project1
 * By Amitabh Sinha
 *date:22/07/2017
 *College no.-Silicon Institute Of Technology
 *Regd No.:1401209452
 *
 */
public class Project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x[][]=new String[7][8];
		
		x[0]=new String[]{"1001","Ashish","01/04/2009","e","R&D","20000","8000","3000"};
		x[1]=new String[]{"1002","Sushma","23/08/2012","c","PM","30000","12000","9000"};
		x[2]=new String[]{"1003","Rahul","12/11/2008","k","Acct","10000","8000","1000"};
		x[3]=new String[]{"1004","Chahat","29/01/2013","r","Front Desk","12000","6000","2000"};
		x[4]=new String[]{"1005","Ranjan","16/07/2005","m","Engg","50000","20000","20000"};
		x[5]=new String[]{"1006","Suman","01/01/2000","e","Manufacturing","23000","9000","4400"};
		x[6]=new String[]{"1007","Tanmay","12/06/2006","c","PM","29000","12000","10000"};
		int d=1;
		String desig="";
		int s=Integer.parseInt(args[0]);
		for(int i=0;i<7;i++){
			if(s==Integer.parseInt(x[i][0])){
				d=0;
				switch(x[i][3]){
				case "e":
					desig="Engineer";
					s=20000+Integer.parseInt(x[i][5])+Integer.parseInt(x[i][6])-Integer.parseInt(x[i][7]);
					break;
       			case "c":
					desig="Consultant";
					s=32000+Integer.parseInt(x[i][5])+Integer.parseInt(x[i][6])-Integer.parseInt(x[i][7]);
					break;
				case "k":
					desig="Clerk";
					s=12000+Integer.parseInt(x[i][5])+Integer.parseInt(x[i][6])-Integer.parseInt(x[i][7]);
					break;
				case "r":
					desig="Receptionist";
					s=15000+Integer.parseInt(x[i][5])+Integer.parseInt(x[i][6])-Integer.parseInt(x[i][7]);
					break;
				case "m":
					desig="Manager";
					s=40000+Integer.parseInt(x[i][5])+Integer.parseInt(x[i][6])-Integer.parseInt(x[i][7]);
					break;
				}
				System.out.println("Emp No.		Emp Name		Department			Designation			Salary");
				System.out.println(x[i][0]+"              "+x[i][1]+"                "+x[i][4]+"                       	 "+desig+"                       "+s);
				System.out.println("\n");
			}
		}
		if(d==1){
			System.out.println("There is no employee with empid :"+s);
		}
	}
}


