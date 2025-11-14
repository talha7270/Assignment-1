import java.util.*;
public class Assignment2{
	static Scanner input = new Scanner(System.in);

	public static String toBinary(int number){
		int rem=0;
		String binary = "";
		while (number >0){
			
			rem = number%2;
			binary = rem+binary;
			number /= 2;
			}

			return binary ;
		}

	public static void callQuestion(int option) {
        
            switch(option) {
                case 1: displayQ1(); break;
                case 2: displayQ2(); break;
                case 3: displayQ3(); break;
                case 4: displayQ4(); break;
                case 5: displayQ5(); break;
            }}

public static void displayQ1(){
		System.out.println("\t- - - -> Executing Question1 <- - - - ");
	System.out.println("Enter your Social Security Number : (in the format DDD-DD-DDDD)");
		input.nextLine();
		 String inputLine = input.nextLine();
      		 Scanner lineScanner = new Scanner(inputLine.replace("-", " "));
		
		int field1 = lineScanner.nextInt();
		int field2 = lineScanner.nextInt();
		int field3 = lineScanner.nextInt();
		
		int count1= 0;
		int num1= field1;
  		while(num1 != 0){
			num1 = num1/10;
			count1++;
		}

			int count2=0;
			int num2= field2;
  		while(num2 != 0){
			num2 = num2/10;
			count2++;
		}
		
		int count3=0;
		int num3 = field3;
  		while(num3 != 0){
			num3 = num3/10;
			count3++;
		}

		if (count1==3 && count2 == 2 && count3 == 4)
			System.out.println(field1+"-"+field2+"-"+field3+" is a valid social security number");
		else 
			System.out.println(field1+"-"+field2+"-"+field3+" is not a valid social security number");
	}

	public static void displayQ2(){
	System.out.println("\t- - - -> Executing Question2 <- - - - ");
	System.out.println();
	System.out.println("Enter two characters that represent your Major and status: ");
	input.nextLine();
	String str = input.nextLine();
	char c1= str.charAt(0);
	char c2 = str.charAt(1);

	System.out.println();
	
	Boolean validMajor= (c1=='M' || c1=='C'  ||c1=='I' );
	Boolean validStatus= (c2=='1'|| c2=='2' || c2=='3' || c2=='4');

	if (validMajor && validStatus){
		System.out.println("\tMajor\t\tStatus");	
		System.out.print("\t");
		switch(c1){
		case 'M': System.out.print("Mathematics ");break;
		case 'C': System.out.print("Computer Science");break;
		case 'I': System.out.print("Informaton Technology");break;
		default: System.out.print("Invalid input");}
 
		System.out.print("\t");
		switch(c2){
		case '1': System.out.print(" Freshman");break;
		case '2': System.out.print(" Sophomore");break;
		case '3': System.out.print(" Junior");break;
		case '4': System.out.print(" Senior");break;
		default :  System.out.print("Invalid input");}
	}
	else 
		System.out.println("Invalid Input.");
}


	public static void displayQ3(){

		System.out.println("- - - -> Executing Question3 <- - - - ");
		String Letters = "";
		for (int i =0 ; i <3; i++){

			char letter = (char)(Math.random()*26+'A');
			Letters += letter;
		}
		int digits=0;
		for (int i =0 ; i < 4 ; i++){
			int  digit = (int)(Math.random()*10);
			digits = digits*10 + digit;
		}
		if(digits <1000 && digits >99)
			digits*=10;
		else if (digits > 9999)
			digits /=10;
		else if (digits < 99)
			digits*=100;
		else
			digits = digits; 
		System.out.println();
		System.out.print("The Number plate is "+Letters+"-"+digits);
		System.out.println();
}


	public static void displayQ4(){
		
	System.out.println("\t- - - -> Executing Question4 <- - - - ");
	
	System.out.println();
	System.out.println("Enter a decimal number: ");
	int decNum = input.nextInt();

	if (decNum>0)
	System.out.println("The decimal number "+decNum+" in binary form is: "+toBinary(decNum));
	else if (decNum==0)
	System.out.println("The decimal number "+decNum+" in binary form is:"+0);
	else
	System.out.println("Invalid Input.");
}

	public static void displayQ5(){
			System.out.println("\t- - - -> Executing Question5 <- - - - ");
			int correct=0;
		System.out.println();
		System.out.println("Answer the following five multiple choice questions. Select one of the four options.");
		System.out.println();
		System.out.println("Question 1\nWhat do most climate scientists identify as the primary human-caused greenhouse gas driving recent warming? \n a) Methane from agriculture\n b) Carbon dioxide from fossil fuels \n c) Water vapor from industrial processes \n d) Ozone from vehicle emissions");	

		System.out.println("Enter your option: (a-b) ");
		System.out.println();
		boolean flag = true;
		while (flag){
			char option = input.next().charAt(0);
			if (option == 'a' || option == 'b' || option =='c' || option == 'd'){
			if (option == 'b')
				correct++;
				flag = false;}
			else 
			System.out.print("invalid input. Enter again.");
		}

		System.out.println();
		System.out.println("Question 2\nWhat do climate scientists who emphasize natural variability point to as important climate influences?\na) Only human activities matter\nb) Solar cycles and ocean patterns\nc) Lunar gravitational effects\nd) Planetary alignment\nEnter your option: (a-d) ");
		 flag = true;
		while (flag){
			char option = input.next().charAt(0);
			if (option == 'a' || option == 'b' || option =='c' || option == 'd'){
			if (option == 'b')
				correct++;
				flag = false;}
			else 
			System.out.print("invalid input. Enter again.");
		}

		System.out.println();
		System.out.println("Question 3\n"+
						"\nWhat has been the observed trend in Arctic sea ice extent since satellite monitoring began in 1979?"+
						"\na) Steady increase in summer minimum ice"+
						"\nb) No consistent trend in any season"+
						"\nc)  Significant decrease in summer ice coverage"+
						"\nd) Complete loss of winter ice already occurred");
		System.out.println("Enter your option: (a-b) ");
		 flag = true;
		while (flag){
			char option = input.next().charAt(0);
			if (option == 'a' || option == 'b' || option =='c' || option == 'd'){
			if (option == 'c')
				correct++;
				flag = false;}
			else 
			System.out.print("invalid input. Enter again.");
		}



				System.out.println();
			System.out.println("Question 4\n"+
						"\nWhat is the main criticism some scientists raise about climate projection models?"+
						"\na) They don't include enough greenhouse gases"+
						"\nb) They accurately predict all regional changes"+
						"\nc)  They overestimate warming rates compared to observations"+
						"\nd) They ignore basic physics principles");
		System.out.println("Enter your option: (a-b) ");
		 flag = true;
		while (flag){
			char option = input.next().charAt(0);
			if (option == 'a' || option == 'b' || option =='c' || option == 'd'){
				if (option == 'c')
				correct++;
				flag = false;}
			else 
			System.out.print("invalid input. Enter again.");
		}


			System.out.println("Question 5\nBased on tide gauge and satellite data, how much has global average sea level risen since 1900?\na) No statistically significant change\nb) Less than 2 inches total\nc) Approximately 8-9 inches overall\nd) More than 2 feet already");
			System.out.println("Enter your option: (a-b) ");

			 flag = true;
			while (flag){
			char option = input.next().charAt(0);
			if (option == 'a' || option == 'b' || option =='c' || option == 'd'){
				if (option == 'c')
				correct++;
				flag = false; }
			else 
			System.out.print("invalid input. Enter again.");
		}



			if (correct == 5)
				System.out.println("Excellent!!!.");
			else if (correct == 4)
				System.out.println("Very Good. ");
			else
				System.out.println("Time to brush up your knowledge of global warming.");
			System.out.println("You got "+ correct+" out of 5 right.");
}

	public static void main(String [] args){
		
		int option=0;
		boolean escapeLoop = true;
		do {
			System.out.println();
			System.out.println("\t   - - - ->MAIN MENU (Assignment - 2)<- - - - ");
			System.out.println();
			System.out.println("\n\t\t 1 - Question 1 (SNN validation)"+
							 "\n\t\t 2 - Question 2 (Degree and Status)"+
							 "\n\t\t 3 - Question 3 (No. Plate generator)"+
							 "\n\t\t 4 - Question 4 (Dec to bin)"+
							 "\n\t\t 5 - Question 5 (MCQ based Quiz)");
			System.out.println();
			System.out.println("Press option (1-5) to execute the program and press 0 to exit");	
			option = input.nextInt();
			
			if (option>0 && option<6){

			switch(option) {
			
			case 1 : displayQ1();break;
			case 2 : displayQ2();break;
			case 3 : displayQ3();break;
			case 4 : displayQ4();break;
			case 5 : displayQ5();break;
			}
		
				while(escapeLoop){
				System.out.println();
				System.out.println("Do you want to execute this question again? then press (y). Otherwise press (b) to go back to the main menu");
				char letter = input.next().charAt(0);

			if (letter == 'y' || letter == 'Y'){
				callQuestion(option);
				System.out.println();}
			else 
				escapeLoop= false;
		
			}
	}
		else if (option<0 || option >5){
			System.out.println();
			System.out.println("Invalid Input. Try again");
			System.out.println();
			continue;}
		else 
			break;
			
			
			
		

		}while(option != 0);
			System.out.println();
			System.out.print("Program exited. Goodbye!");

		
}}

			
		