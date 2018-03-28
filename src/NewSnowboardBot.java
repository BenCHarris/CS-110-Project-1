import java.util.Scanner;
public class NewSnowboardBot {

	String resortName=null;
	float lowTemp=0;
	float highTemp=0;
	String day=null;
	
	NewSnowboardBot(String name){
		resortName=name;
		}
	
	Scanner input=new Scanner(System.in);
		
	SnowboardBot wisp = new SnowboardBot("Wisp");
	SnowboardBot canaanValley = new SnowboardBot("Canaan Valley");
	SnowboardBot timberline = new SnowboardBot("Timberline");
	SnowboardBot sevenSprings = new SnowboardBot("Seven Springs");
	SnowboardBot snowshoe = new SnowboardBot("Snowshoe");	
	
	
public void conditions()	{
	System.out.println("What was the temperature last night at "+wisp.resortName+"?");
	lowTemp=input.nextFloat();
	System.out.println("What is the high temperature today at "+wisp.resortName+"?");
	highTemp=input.nextFloat();
			
	if ((highTemp<= 32) && (lowTemp<=32)) {
		System.out.println("The snow at "+wisp.resortName+" should be primarily powder and in good condition.\nThe resort may have gotten natural snow recently and may also be making snow.");
	}
	else if ((highTemp>32) && (lowTemp<=32)) {
		System.out.println("The snow at "+wisp.resortName+" will be melting and possibly slushy but still in good condition.");
	}
	else if ((highTemp<=32) && (lowTemp>32)) {
		System.out.println("Watch out for icy spots in the snow at "+wisp.resortName+". The snow should be very packed and solid.");
	}
	else if ((highTemp>32) && (lowTemp>32)) {
		System.out.println("If there is still snow at "+wisp.resortName+" it will be slushy and melting. Some trails may be closed.");
	}
}

public static void main(String [] args) {
	
String questionFromUser=null;

Scanner input=new Scanner(System.in);

System.out.println("Hello user, my name is Shaun and i'm a bot that's designed to answer quesions you have about nearby ski resorts to WVU.");
System.out.println("I'm capable of answering most common questions about skiing or snowboarding at Wisp, Snowshoe, Seven Springs, Timberline, and Canaan Valley.");
System.out.println("\n\n\nPlease enter any question that you have about one of the above resorts:");
System.out.println("\nExamples include: Prices, Conditions, Trail Info, Lodging and more at one of the above listed resorts");
questionFromUser=input.nextLine();

}
}
