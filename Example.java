import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("--------------------------------------------------------------");
		
		System.out.println("|                    SALARY INFORMATION SYSTEM                |");
		
		
		System.out.println("--------------------------------------------------------------");
		System.out.println();
		
		System.out.println("     [1] Calculate Income Tax");
		System.out.println("     [2] Calculate Annual Bonus");
		System.out.println("     [3] Calculate Loan amount");
		System.out.println();
		System.out.print("Enter an option to continue > ");
		int Number=input.nextInt();
		
		System.out.println();
		
		if (Number==1){
			System.out.println("--------------------------------------------------------------");
			System.out.println("|                    Calculate Income Tax                     |");
			System.out.println("--------------------------------------------------------------");
			
			System.out.println();
			
			System.out.print("Input Employee name    - ");
			String Name = input.next();
			System.out.print("Input Employee Salary  - ");
			double Salary = input.nextDouble();
			double tax;
			
	
			if (Salary <= 100000) {
				tax =0;
			} else if (Salary <= 141667) {
				tax=(Salary - 100000) * 0.06; 
			} else if (Salary <= 183333) {
				tax=(41667 * 0.06) + ((Salary - 141667) * 0.12); 
			} else if (Salary <= 225000) {
				tax= (41667 * 0.06) + (41666 * 0.12) + ((Salary - 183333) * 0.18); 
			} else if (Salary <= 266667) {
				tax= (41667 * 0.06) + (41666 * 0.12) + (41666 * 0.18) + ((Salary - 225000) * 0.24); 
			} else if (Salary <= 308333) {
				tax= (41667 * 0.06) + (41666 * 0.12) + (41666 * 0.18) + (41667 * 0.24) + ((Salary - 266667) * 0.30); 
			} else {
				tax= (41667 * 0.06) + (41666 * 0.12) + (41666 * 0.18) + (41667 * 0.24) + (41666 * 0.30) + ((Salary - 308333) * 0.36); 
			}
			

				System.out.println("You have to pay Income Tax per momth: " +tax);
			
		}
		
		if (Number==2){
			System.out.println("--------------------------------------------------------------");
			System.out.println("|                    Calculate Annual Bonus                   |");
			System.out.println("--------------------------------------------------------------");
			
			System.out.println();
			
			System.out.print("Input Employee name    - ");
			String Name = input.next();
			System.out.print("Input Employee Salary  - ");
			double Salary = input.nextDouble();
			double bonus;
			
			
			if (Salary <= 100000) {
				bonus= 5000;
			} else if (Salary < 200000) {
				bonus= Salary * 0.1;
			} else if (Salary < 300000) {
				bonus= Salary * 0.15;
			} else if (Salary < 400000) {
				bonus=Salary * 0.2;
			} else {
				bonus= Salary * 0.35;
			}
			System.out.println();
			System.out.println("Annual bonus: " +bonus);
			
		}
		
		if (Number==3){
			System.out.println("--------------------------------------------------------------");
			System.out.println("|                    Calculate Loan amount                   |");
			System.out.println("--------------------------------------------------------------");
			
			System.out.println();
			
			System.out.print("Input Employee name    - ");
			String Name = input.next();
			System.out.print("Input Employee Salary  - ");
			double Salary = input.nextDouble();
			
			System.out.print("Enter number of year   : ");
		    int Years = input.nextInt();
						
        
		if (Salary <= 50000) {
			
			System.out.println("            You can not get a loan because your salary lessthan Rs.50 000...");
        
       		
        } else if (Years > 5) {
           
        } else {
          
            double MaxInstallment = Salary * 0.6;

           
            double interestRate = 0.15;

            
            int months = Years * 12;

           
            double loanAmount = Math.round((MaxInstallment * ((1 - Math.pow((1 + (interestRate / 12)), -months)) / (interestRate / 12))) / 1000) * 1000;
            
            System.out.println();
            System.out.printf("You can get Loan Amount : "+ loanAmount);
			}
		}
	}
}
