import java.util.Scanner;
public class SnowboardBot {

String resortName=null;

SnowboardBot(String name){
resortName=name;
}

public static void main(String [] args) {

Scanner input = new Scanner(System.in);

String questionFromUser=null;
float lowTemp=0;
float highTemp=0;
String day=null;
	
SnowboardBot wisp = new SnowboardBot("Wisp");
SnowboardBot canaanValley = new SnowboardBot("Canaan Valley");
SnowboardBot timberline = new SnowboardBot("Timberline");
SnowboardBot sevenSprings = new SnowboardBot("Seven Springs");
SnowboardBot snowshoe = new SnowboardBot("Snowshoe");

System.out.println("Hello user, my name is Shaun and i'm a bot that's designed to answer quesions you have about nearby ski resorts to WVU.");
System.out.println("I'm capable of answering most common questions about skiing or snowboarding at Wisp, Snowshoe, Seven Springs, Timberline, and Canaan Valley.");
System.out.println("\n\n\nPlease enter any question that you have about one of the above resorts:");
System.out.println("\nExamples include: Prices, Conditions, Trail Info, Lodging and more at one of the above listed resorts");
questionFromUser=input.nextLine();


//Questions 

if (questionFromUser.contains("Wisp") || questionFromUser.contains("wisp")) {	
	if (questionFromUser.contains("condition") || (questionFromUser.contains("report"))){
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
	
	else if (questionFromUser.contains("locat") || (questionFromUser.contains("far"))) {
		System.out.println(""+wisp.resortName+" is located in McHenry, Maryland and is 41.8 miles away from WVU.");
		System.out.println(" It takes approximately 50 minutes by car to get there.");
	}
	
	else if (questionFromUser.contains("cost") || questionFromUser.contains("price") || questionFromUser.contains("pay") || questionFromUser.contains("much")){
		System.out.println("Lift tickets at "+wisp.resortName+" cost (Weekday-Weekend):");
		System.out.println("$49-$69 for a Morning Pass (9 AM-1 PM)");
		System.out.println("$49-$74 for a Twilight Pass (1 PM-9 PM)");
		System.out.println("$29-$59 for a Night Pass (5 PM-9 PM)");
		System.out.println("$59-$79 for an All-Day Pass (9 AM-9 PM)");
		System.out.println("");
		System.out.println("Rentals cost (Ski-Snowboard):");
		System.out.println("$14-$13 from the WVU Rec Center");
		System.out.println("$34-$34 from Wisp");
	}
	
	else if (questionFromUser.contains("trail") || (questionFromUser.contains("open"))){
		System.out.println("At "+wisp.resortName+", there are:");
		System.out.println("10 green trails (Beginner)");
		System.out.println("14 blue trails (Intermediate)");
		System.out.println("11 black trails (Difficult)");
		System.out.println("3 terrain parks");
		System.out.println("For more information on up-to-date trail openings, visit http://www.wispresort.com");
	}
	
	else if (questionFromUser.contains("traffic")) {
		System.out.println("Which day of the week are you planning to go to "+wisp.resortName+"? (Wednesday, Saturday etc)");
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
	
	else if (questionFromUser.contains("food") || questionFromUser.contains("restaurant") || questionFromUser.contains("eat ")) {
		System.out.println("At "+wisp.resortName+", a few different places to eat include:");
		System.out.println("DC's Bar and Restaurant- Family sit-down restaurant");
		System.out.println("Wisp Food Court- Quick meals");
		System.out.println("Wispers Mountainside Bar- Sports Bar");
		System.out.println("Sundown Cafe- Snacks and Drinks");
	}
	
	else if (questionFromUser.contains("lodging") || questionFromUser.contains("hotel") || questionFromUser.contains("stay")) {
		System.out.println("A few places to stay at "+wisp.resortName+" include:");
		System.out.println("The Wisp Lodge");
		System.out.println("Carmel Cove Inn");
		System.out.println("Lake Pointe Inn");
		System.out.println("Railey Mountain Lake Vacations");
	}
	
	else
		
	System.out.println("Sorry, that's a question that I wasn't designed to answer, please re-run and try another question.");
}





if (questionFromUser.contains("Snowshoe") || questionFromUser.contains("snowshoe")) {	
	if (questionFromUser.contains("condition") || (questionFromUser.contains("report"))){
		System.out.println("What was the temperature last night?");
		lowTemp=input.nextFloat();
		System.out.println("What is the high temperature today?");
		highTemp=input.nextFloat();
				
		if ((highTemp<= 32) && (lowTemp<=32)) {
			System.out.println("The snow should be primarily powder and in good condition at "+snowshoe.resortName+".\nThe resort may have gotten natural snow recently and may also be making snow.");
		}
		else if ((highTemp>32) && (lowTemp<=32)) {
			System.out.println("The snow will be melting and possibly slushy at "+snowshoe.resortName+" but still in good condition.");
		}
		else if ((highTemp<=32) && (lowTemp>32)) {
			System.out.println("Watch out for icy spots in the snow at "+snowshoe.resortName+". The snow should be very packed and solid.");
		}
		else if ((highTemp>32) && (lowTemp>32)) {
			System.out.println("If there is still snow at "+snowshoe.resortName+" it will be slushy and melting. Some trails may be closed.");
		}
	}
	
	else if (questionFromUser.contains("locat") || (questionFromUser.contains("far"))) {
		System.out.println(""+snowshoe.resortName+" is located in Snowshoe, West Virginia and is 119 miles away from WVU.");
		System.out.println(" It takes approximately 2 hours and 44 minutes by car to get there.");
	}
	
	else if (questionFromUser.contains("cost") || questionFromUser.contains("price") || questionFromUser.contains("pay") || questionFromUser.contains("much")){
		System.out.println("Lift tickets at "+snowshoe.resortName+"cost (Weekday-Weekend):");
		System.out.println("$79-$99 for an All-Day Pass (9 AM-1 PM)");
		System.out.println("");
		System.out.println("Rentals cost (Ski-Snowboard):");
		System.out.println("$14-$13 from the WVU Rec Center");
		System.out.println("$45-$45 from Snowshoe");
	}
	
	else if (questionFromUser.contains("trail") || (questionFromUser.contains("open"))){
		System.out.println("At "+snowshoe.resortName+", there are:");
		System.out.println("24 green trails (Beginner)");
		System.out.println("19 blue trails (Intermediate)");
		System.out.println("15 black trails (Difficult)");
		System.out.println("1 double black trail (Most Difficult)");
		System.out.println("5 terrain parks");
		System.out.println("For more information on up-to-date trail openings, visit https://www.snowshoemtn.com");
	}
	
	else if (questionFromUser.contains("traffic")) {
		System.out.println("Which day of the week are you planning to go to "+snowshoe.resortName+"? (Wednesday, Saturday etc)");
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
	
	else if (questionFromUser.contains("food") || questionFromUser.contains("restaurant") || questionFromUser.contains("eat ")) {
		System.out.println("At "+snowshoe.resortName+", a few different places to eat include:");
		System.out.println("Cheat Mountain Pizza- Sit-down pizza restaurant");
		System.out.println("Old Spruce Tavern- Bar");
		System.out.println("Southern Mountain Grille- Higher Class Dining");
		System.out.println("The Boathouse- Barbeque");
	}
	
	else if (questionFromUser.contains("lodging") || questionFromUser.contains("hotel") || questionFromUser.contains("stay")) {
		System.out.println("A few places to stay at "+snowshoe.resortName+" include:");
		System.out.println("Allegheny Springs");
		System.out.println("Soaring Eagle");
		System.out.println("Rimfire Lodge");
		System.out.println("Powderidge");
	}
	
	else
		
	System.out.println("Sorry, that's a question that I wasn't designed to answer, please re-run and try another question.");
}





if (questionFromUser.contains("Seven Springs") || questionFromUser.contains("SevenSprings") || questionFromUser.contains("sevensprings") || questionFromUser.contains("seven springs")) {	
	if (questionFromUser.contains("condition") || (questionFromUser.contains("report"))){
		System.out.println("What was the temperature last night at "+sevenSprings.resortName+"?");
		lowTemp=input.nextFloat();
		System.out.println("What is the high temperature today?");
		highTemp=input.nextFloat();
				
		if ((highTemp<= 32) && (lowTemp<=32)) {
			System.out.println("The snow should be primarily powder and in good condition at "+sevenSprings.resortName+".\nThe resort may have gotten natural snow recently and may also be making snow.");
		}
		else if ((highTemp>32) && (lowTemp<=32)) {
			System.out.println("The snow "+sevenSprings.resortName+" will be melting and possibly slushy but still in good condition.");
		}
		else if ((highTemp<=32) && (lowTemp>32)) {
			System.out.println("Watch out for icy spots in the snow at "+sevenSprings.resortName+". The snow should be very packed and solid.");
		}
		else if ((highTemp>32) && (lowTemp>32)) {
			System.out.println("If there is still snow at "+sevenSprings.resortName+" it will be slushy and melting. Some trails may be closed.");
		}
	}
	
	else if (questionFromUser.contains("locat") || (questionFromUser.contains("far"))) {
		System.out.println(""+sevenSprings.resortName+" is located in Champion, Pennsylvania and is 58 miles away from WVU.");
		System.out.println(" It takes approximately 1 hour and 18 minutes by car to get there.");
	}
	
	else if (questionFromUser.contains("cost") || questionFromUser.contains("price") || questionFromUser.contains("pay") || questionFromUser.contains("much")){
		System.out.println("Lift tickets at "+sevenSprings.resortName+" cost (Weekday-Weekend):");
		System.out.println("$59-$79 for a Twilight Pass (1 PM-9 PM)");
		System.out.println("$46-$46 for a Night Pass (4 PM-9 PM)");
		System.out.println("$65-$85 for an All-Day Pass (9 AM-9 PM)");
		System.out.println("");
		System.out.println("Rentals cost (Ski-Snowboard):");
		System.out.println("$14-$13 from the WVU Rec Center");
		System.out.println("$50-$50 from Seven Springs");
	}
	
	else if (questionFromUser.contains("trail") || (questionFromUser.contains("open"))){
		System.out.println("At "+sevenSprings.resortName+", there are:");
		System.out.println("13 green trails (Beginner)");
		System.out.println("15 blue trails (Intermediate)");
		System.out.println("5 black trails (Difficult)");
		System.out.println("6 double black trail (Most Difficult)");
		System.out.println("8 terrain parks");
		System.out.println("For more information on up-to-date trail openings, visit http://www.7springs.com");
	}
	
	else if (questionFromUser.contains("traffic")) {
		System.out.println("Which day of the week are you planning to go to "+sevenSprings.resortName+"? (Wednesday, Saturday etc)");
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
	
	else if (questionFromUser.contains("food") || questionFromUser.contains("restaurant") || questionFromUser.contains("eat ")) {
		System.out.println("At "+sevenSprings.resortName+", a few different places to eat near the resort include:");
		System.out.println("Helen's- Higher class dining");
		System.out.println("Slopeside- Family sit-down restaurant ");
		System.out.println("Timbers- Burgers and comfort food");
		System.out.println("The Grille- Bar and grill");
	}
	
	else if (questionFromUser.contains("lodging") || questionFromUser.contains("hotel") || questionFromUser.contains("stay")) {
		System.out.println("A few places to stay at "+sevenSprings.resortName+" include:");
		System.out.println("The Seven Springs Hotel");
		System.out.println("Log Cabin Lodge and Suites");
		System.out.println("Alpine Retreat Bed and Breakfast");
		System.out.println("Hidden Valley Resort");
	}
	
	else
		
	System.out.println("Sorry, that's a question that I wasn't designed to answer, please re-run and try another question.");
}





if (questionFromUser.contains("Timberline") || questionFromUser.contains("timberline")) {	
	if (questionFromUser.contains("condition") || (questionFromUser.contains("report"))){
		System.out.println("What was the temperature last night at "+timberline.resortName+"?");
		lowTemp=input.nextFloat();
		System.out.println("What is the high temperature today at "+timberline.resortName+"?");
		highTemp=input.nextFloat();
				
		if ((highTemp<= 32) && (lowTemp<=32)) {
			System.out.println("The snow at "+timberline.resortName+" should be primarily powder and in good condition.\nThe resort may have gotten natural snow recently and may also be making snow.");
		}
		else if ((highTemp>32) && (lowTemp<=32)) {
			System.out.println("The snow at "+timberline.resortName+" will be melting and possibly slushy but still in good condition.");
		}
		else if ((highTemp<=32) && (lowTemp>32)) {
			System.out.println("Watch out for icy spots in the snow at "+timberline.resortName+". The snow should be very packed and solid.");
		}
		else if ((highTemp>32) && (lowTemp>32)) {
			System.out.println("If there is still snow at "+timberline.resortName+" it will be slushy and melting. Some trails may be closed.");
		}
	}
	
	else if (questionFromUser.contains("locat") || (questionFromUser.contains("far"))) {
		System.out.println(""+timberline.resortName+" is located in Davis, West Virginia and is 81.8 miles away from WVU.");
		System.out.println(" It takes approximately 2 hours by car to get there.");
	}
	
	else if (questionFromUser.contains("cost") || questionFromUser.contains("price") || questionFromUser.contains("pay") || questionFromUser.contains("much")){
		System.out.println("Lift tickets at "+timberline.resortName+" cost (Weekday-Weekend):");
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
	
	else if (questionFromUser.contains("trail") || (questionFromUser.contains("open"))){
		System.out.println("At "+timberline.resortName+", there are:");
		System.out.println("16 green trails (Beginner)");
		System.out.println("8 blue trails (Intermediate)");
		System.out.println("5 black trails (Difficult)");
		System.out.println("6 double black trails (Most Difficult)");
		System.out.println("2 terrain parks");
		System.out.println("For more information on up-to-date trail openings, visit http://www.timberlineresort.com/index.php");
	}
	
	else if (questionFromUser.contains("traffic")) {
		System.out.println("Which day of the week are you planning to go to "+timberline.resortName+"? (Wednesday, Saturday etc)");
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
	
	else if (questionFromUser.contains("food") || questionFromUser.contains("restaurant") || questionFromUser.contains("eat ")) {
		System.out.println("At "+timberline.resortName+", a few places to eat near the resort include:");
		System.out.println("Timberline Cafeteria- Quick Meals");
		System.out.println("Timber's Pub- Bar");
		System.out.println("Fireside Grille- Bar and Grill");
	}
	
	else if (questionFromUser.contains("lodging") || questionFromUser.contains("hotel") || questionFromUser.contains("stay")) {
		System.out.println("A few places to stay at "+timberline.resortName+" include:");
		System.out.println("Timber's Inn Hotel");
		System.out.println("Bunkhouse");
		System.out.println("Alpine Lodge");
		System.out.println("North Fork Mountain Inn");
	}
	
	else
		
	System.out.println("Sorry, that's a question that I wasn't designed to answer, please re-run and try another question.");
}





if (questionFromUser.contains("Canaan Valley") || questionFromUser.contains("CanaanValley") || questionFromUser.contains("canaan valley") || questionFromUser.contains("canaanvalley")) {	
	if (questionFromUser.contains("condition") || (questionFromUser.contains("report"))){
		System.out.println("What was the temperature last night at "+canaanValley.resortName+"?");
		lowTemp=input.nextFloat();
		System.out.println("What is the high temperature today at "+canaanValley.resortName+"?");
		highTemp=input.nextFloat();
				
		if ((highTemp<= 32) && (lowTemp<=32)) {
			System.out.println("The snow at "+canaanValley.resortName+" should be primarily powder and in good condition.\nThe resort may have gotten natural snow recently and may also be making snow.");
		}
		else if ((highTemp>32) && (lowTemp<=32)) {
			System.out.println("The snow at "+canaanValley.resortName+" will be melting and possibly slushy but still in good condition.");
		}
		else if ((highTemp<=32) && (lowTemp>32)) {
			System.out.println("Watch out for icy spots in the snow at "+canaanValley.resortName+". The snow should be very packed and solid.");
		}
		else if ((highTemp>32) && (lowTemp>32)) {
			System.out.println("If there is still snow at "+canaanValley.resortName+" it will be slushy and melting. Some trails may be closed.");
		}
	}
	
	else if (questionFromUser.contains("locat") || (questionFromUser.contains("far"))) {
		System.out.println(""+canaanValley.resortName+" is located in Davis, West Virginia and is 82.8 miles away from WVU.");
		System.out.println(" It takes approximately 2 hours and 2 minutes by car to get there.");
	}
	
	else if (questionFromUser.contains("cost") || questionFromUser.contains("price") || questionFromUser.contains("pay") || questionFromUser.contains("much")){
		System.out.println("Lift tickets at "+canaanValley.resortName+" cost (Weekday-Weekend):");
		System.out.println("$42-$58 for a Half-Day Pass");
		System.out.println("$52-$68 for an All-Day Pass");
		System.out.println("");
		System.out.println("Rentals cost (Ski-Snowboard):");
		System.out.println("$38-$46 from the WVU Rec Center");
		System.out.println("$35-$43 from Canaan Valley");
	}
	
	else if (questionFromUser.contains("trail") || (questionFromUser.contains("open"))){
		System.out.println("At "+canaanValley.resortName+", there are:");
		System.out.println("8 green trails (Beginner)");
		System.out.println("18 blue trails (Intermediate)");
		System.out.println("16 black trails (Difficult)");
		System.out.println("1 double black trail (Most Difficult)");
		System.out.println("1 terrain parks");
		System.out.println("For more information on up-to-date trail openings, visit https://www.canaanresort.com");
	}
	else if (questionFromUser.contains("traffic")) {
		System.out.println("Which day of the week are you planning to go to "+canaanValley.resortName+"? (Wednesday, Saturday etc)");
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
	
	else if (questionFromUser.contains("food") || questionFromUser.contains("restaurant") || questionFromUser.contains("eat ")) {
		System.out.println("At "+canaanValley.resortName+" a few places to eat near the resort include:");
		System.out.println("Hickory Dining Room- Family sit-down restaurant");
		System.out.println("Laurel Lounge- Bar");
		System.out.println("Seasons Cafe- Lighter, healthier meals");
		System.out.println("Quenchers Pub- Bar");
	}
	
	else if (questionFromUser.contains("lodging") || questionFromUser.contains("hotel") || questionFromUser.contains("stay")) {
		System.out.println("A few places to stay at "+canaanValley.resortName+" include:");
		System.out.println("Canaan Lodge");
		System.out.println("Bright Morning Inn");
		System.out.println("Canaan Village Inn");
		System.out.println("Black Bear Resort");
	}
	
	else
		
	System.out.println("Sorry, that's a question that I wasn't designed to answer, please re-run and try another question.");
}
input.close();

System.out.println("\n\n\nHope you have a great time shreddin' the slopes. If you would like to ask another question, please re-run the code.");
}
}

