import java.util.Scanner;

public class SlopeConditions {
public static void main(String [] args) {
	
	String questionFromUser=null;
	float lowTemp=0;
	float highTemp=0;
	String day=null;

	Scanner input=new Scanner(System.in);
	
	System.out.println("This program is designed to answer questions you have about skiing or snowboarding at Wisp, Seven Springs, Snowshoe, Canaan Valley, or Timberline");
	System.out.println("Please enter any questions that you have:");
	System.out.println("");
	System.out.println("Example Topics: Snow Conditions, Slope Traffic/Trails, Location, Cost, etc at a certain resort"); 
	
	questionFromUser=input.nextLine();
	
	// Several extra questions that may be asked
	
	if (questionFromUser.contains("close") || questionFromUser.contains("near")) {
		System.out.println("Wisp is the closest ski resort to WVU.");
	}
	
	if ((questionFromUser.contains("snowboard") || questionFromUser.contains("ski")) && (questionFromUser.contains("eas") || questionFromUser.contains("begin"))) {
		System.out.println("Most beginners usually can catch onto skiing in a much faster rate than snowboarding, but some people are different.");
		System.out.println("Both skiing and snowboarding are a completely different skill, but both are great winter sports.");
		System.out.println("It's completely up to the preference of the person as to which is better.");
	}
	
	if (questionFromUser.contains("better") || questionFromUser.contains("best")){
		if (questionFromUser.contains("resort") || questionFromUser.contains("Resort")){
		System.out.println("Snowshoe has the greatest amount of trails out of all of the surrounding resorts, and a wide range of difficulty suiting the beginner or expert.");
		}
	}
	
	// Determines what the snow conditions may be like
	
	if (questionFromUser.contains("condition") || (questionFromUser.contains("report"))){
		System.out.println("What was the temperature last night?");
		lowTemp=input.nextFloat();
		System.out.println("What is the high temperature today?");
		highTemp=input.nextFloat();
				
		if ((highTemp<= 32) && (lowTemp<=32)) {
			System.out.println("The snow should be primarily powder and in good condition.\nThe resort may have gotten natural snow recently and may also be making snow.");
		}
		else if ((highTemp>32) && (lowTemp<=32)) {
			System.out.println("The snow will be melting and possibly slushy but still in good condition.");
		}
		else if ((highTemp<=32) && (lowTemp>32)) {
			System.out.println("Watch out for icy spots in the snow. The snow should be very packed and solid.");
		}
		else if ((highTemp>32) && (lowTemp>32)) {
			System.out.println("The snow will be slushy, severely melting, and some trails may be closed.");
		}
	}
	
	// Location of each of the resorts
	
	if (questionFromUser.contains("locat") || (questionFromUser.contains("far"))) {
		if (questionFromUser.contains("Wisp") || questionFromUser.contains("wisp")) {
			System.out.println("Wisp is located in McHenry, Maryland and is 41.8 miles away from WVU.");
			System.out.println(" It takes approximately 50 minutes by car to get there.");
		}
		else if (questionFromUser.contains("Snowshoe") || questionFromUser.contains("snowshoe")) {
			System.out.println("Snowshoe is located in Snowshoe, West Virginia and is 119 miles away from WVU.");
			System.out.println(" It takes approximately 2 hours and 44 minutes by car to get there.");
		}
		else if (questionFromUser.contains("Seven Springs") || questionFromUser.contains("seven springs") || questionFromUser.contains("SevenSprings")) {
			System.out.println("Seven Springs is located in Champion, Pennsylvania and is 58 miles away from WVU.");
			System.out.println(" It takes approximately 1 hour and 18 minutes by car to get there.");
		}
		else if (questionFromUser.contains("Canaan Valley") || questionFromUser.contains("canaan valley")) {
			System.out.println("Canaan Valley is located in Davis, West Virginia and is 82.8 miles away from WVU.");
			System.out.println(" It takes approximately 2 hours and 2 minutes by car to get there.");
		}
		else if (questionFromUser.contains("Timberline") || questionFromUser.contains("timberline")) {
			System.out.println("Timberline is located in Davis, West Virginia and is 81.8 miles away from WVU.");
			System.out.println(" It takes approximately 2 hours by car to get there.");
		}
	}
		
	// Cost for lift tickets and rentals at each of the resorts
	
	if (questionFromUser.contains("cost") || questionFromUser.contains("price") || questionFromUser.contains("pay") || questionFromUser.contains("much")){
		if (questionFromUser.contains("Wisp") || questionFromUser.contains("wisp")){
			System.out.println("Lift tickets cost (Weekday-Weekend):");
			System.out.println("$49-$69 for a Morning Pass (9 AM-1 PM)");
			System.out.println("$49-$74 for a Twilight Pass (1 PM-9 PM)");
			System.out.println("$29-$59 for a Night Pass (5 PM-9 PM)");
			System.out.println("$59-$79 for an All-Day Pass (9 AM-9 PM)");
			System.out.println("");
			System.out.println("Rentals cost (Ski-Snowboard):");
			System.out.println("$14-$13 from the WVU Rec Center");
			System.out.println("$34-$34 from Wisp");
		}
		
		else if (questionFromUser.contains("Snowshoe") || questionFromUser.contains("snowshoe")){
			System.out.println("Lift tickets cost (Weekday-Weekend):");
			System.out.println("$79-$99 for an All-Day Pass (9 AM-1 PM)");
			System.out.println("");
			System.out.println("Rentals cost (Ski-Snowboard):");
			System.out.println("$14-$13 from the WVU Rec Center");
			System.out.println("$45-$45 from Snowshoe");
		}
		
		else if (questionFromUser.contains("Seven Springs") || questionFromUser.contains("seven springs") || questionFromUser.contains("SevenSprings")){
			System.out.println("Lift tickets cost (Weekday-Weekend):");
			System.out.println("$59-$79 for a Twilight Pass (1 PM-9 PM)");
			System.out.println("$46-$46 for a Night Pass (4 PM-9 PM)");
			System.out.println("$65-$85 for an All-Day Pass (9 AM-9 PM)");
			System.out.println("");
			System.out.println("Rentals cost (Ski-Snowboard):");
			System.out.println("$14-$13 from the WVU Rec Center");
			System.out.println("$50-$50 from Seven Springs");
		}
		
		else if (questionFromUser.contains("Canaan Valley") || questionFromUser.contains("canaan valley")){
			System.out.println("Lift tickets cost (Weekday-Weekend):");
			System.out.println("$42-$58 for a Half-Day Pass");
			System.out.println("$52-$68 for an All-Day Pass");
			System.out.println("");
			System.out.println("Rentals cost (Ski-Snowboard):");
			System.out.println("$38-$46 from the WVU Rec Center");
			System.out.println("$35-$43 from Canaan Valley");
		}
		
		else if (questionFromUser.contains("Timberline") || questionFromUser.contains("timberline")){
			System.out.println("Lift tickets cost (Weekday-Weekend):");
			System.out.println("$58-N/A for a Half-Day Pass (12:30 PM-4:30 PM)");
			System.out.println("$58-$78 for a Twilight Pass (12:30 PM-9 PM)");
			System.out.println("$49-$47 for a Night Pass (4:30 PM-9 PM)");
			System.out.println("$72-$92 for an All-Day Pass (9 AM-9 PM)");
			System.out.println("");
			System.out.println("Rentals cost (Ski-Snowboard):");
			System.out.println("$14-$13 from the WVU Rec Center");
			System.out.println("$45-$45 from Timberline");
			System.out.println("");
			System.out.println("For any college student, a lift ticket is only $25 any day of the week");
		}
	}
	
	// Trail information at each of the resorts 
	
	if (questionFromUser.contains("trail") || (questionFromUser.contains("open"))){
		if (questionFromUser.contains("Wisp") || questionFromUser.contains("wisp")){
			System.out.println("At Wisp, there are:");
			System.out.println("10 green trails (Beginner)");
			System.out.println("14 blue trails (Intermediate)");
			System.out.println("11 black trails (Difficult)");
			System.out.println("3 terrain parks");
			System.out.println("For more information on up-to-date trail openings, visit http://www.wispresort.com");
		}
		
		else if (questionFromUser.contains("Snowshoe") || questionFromUser.contains("snowshoe")){
			System.out.println("At Snowshoe, there are:");
			System.out.println("24 green trails (Beginner)");
			System.out.println("19 blue trails (Intermediate)");
			System.out.println("15 black trails (Difficult)");
			System.out.println("1 double black trail (Most Difficult)");
			System.out.println("5 terrain parks");
			System.out.println("For more information on up-to-date trail openings, visit https://www.snowshoemtn.com");
		}
		
		else if (questionFromUser.contains("Seven Springs") || questionFromUser.contains("seven springs") || questionFromUser.contains("SevenSprings")){
			System.out.println("At Seven Springs, there are:");
			System.out.println("13 green trails (Beginner)");
			System.out.println("15 blue trails (Intermediate)");
			System.out.println("5 black trails (Difficult)");
			System.out.println("6 double black trail (Most Difficult)");
			System.out.println("8 terrain parks");
			System.out.println("For more information on up-to-date trail openings, visit http://www.7springs.com");
		}
		
		else if (questionFromUser.contains("Canaan Valley") || questionFromUser.contains("canaan valley")){
			System.out.println("At Canaan Valley, there are:");
			System.out.println("8 green trails (Beginner)");
			System.out.println("18 blue trails (Intermediate)");
			System.out.println("16 black trails (Difficult)");
			System.out.println("1 double black trail (Most Difficult)");
			System.out.println("1 terrain parks");
			System.out.println("For more information on up-to-date trail openings, visit https://www.canaanresort.com");
		}
	
		else if (questionFromUser.contains("Timberline") || questionFromUser.contains("timberline")){
			System.out.println("At Timberline, there are:");
			System.out.println("16 green trails (Beginner)");
			System.out.println("8 blue trails (Intermediate)");
			System.out.println("5 black trails (Difficult)");
			System.out.println("6 double black trails (Most Difficult)");
			System.out.println("2 terrain parks");
			System.out.println("For more information on up-to-date trail openings, visit http://www.timberlineresort.com/index.php");
		}
		
	}
	
	// Slope Traffic 
	
	if (questionFromUser.contains("traffic")) {
		System.out.println("Which day of the week are you planning to go? (Wednesday, Saturday etc)");
		day=input.nextLine();
		if (day.contains("Monday") || day.contains("Tuesday") || day.contains("Wednesday") || day.contains("Thursday") ||day.contains("Friday")) {
			System.out.println("There should be a very limited amount of people on the slopes, and the lift lines should be short.");
		}
		else if (day.contains("Saturday")) {
			System.out.println("Saturday is the busiest time of the week. Expect a large amount of people and longer lift lines.");
		}
		else if (day.contains("Sunday")) {
			System.out.println("Sunday is usually a busy day, but not as busy as Saturday. Expect quite a few people and moderate lift lines.");
		}
		else {
			System.out.println("Please enter a valid day");
		}
}
	
	
	System.out.println("");
	System.out.println("");
	System.out.println("Thank you for using the program, to ask another question please re-run.");
	
	input.close();	
}
}