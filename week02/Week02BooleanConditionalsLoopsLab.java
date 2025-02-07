//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Boolean & Conditionals Lab
// Java Week 02 Lab  
//
package week02;

public class Week02BooleanConditionalsLoopsLab {
	
	public static void main(String[] args) {
		
		//
		// BOOLEANS and CONDITIONALS:
		//
		
		// 1. Variable Declaration:
		//		a. Create a variable named age and assign it a value of 14

		int age = 18;
		
		
		// 2. Print a Boolean Expression:
		//		a. Print the boolean expression age >= 16 to the console and note the results.
		//		a. Change the value of age to 18 and print again.

		System.out.println(age >= 16);
		
		// 3. Can you drive?
		//		a. Using a conditional, print one of the following:
		//				i. "You can drive" if age is greater than or equal to 16
		//				ii. "You cannot drive" otherwise
		//
		//		a. Change the value of age and rerun to see the result
		boolean hasLicense = false;

		if(age >= 16 && hasLicense){
			System.out.println("You can drive");
		} else {
			System.out.println("You cannot drive");
		}



		// 4. Update Solution to Question 3 as follows:
		//		a. Add a new variable called hasLicense before the conditional.
		//		b. Change the boolean expression in the conditional to additionally 
		//				include the need for hasLicense to be true.
		//		c. Try changing the values of age and hasLicense and note the different results.



		
		
		// 5. Milk?
		//		a. Create two new variables - costOfMilk and thirstLevel
		//		b. Create a new conditional that prints "Milk Please" if costOfMilk is less than 2.50 
		//				or if thirstLevel is greater than 6 and prints "No Thanks" otherwise.
		//		c. Change the values and note the different results.

		double costOfMilk = 3.15;
		int thirstLevel = 4;
		if (costOfMilk < 2.50 || thirstLevel > 6){
			System.out.println("Milk Please");
		} else{
			System.out.println("No Thanks");
		}

		// 6. Cookie Distribution: 
		//			Note:  You will evenly distribute all of the cookies to the children 
		//					and as the adult you get to keep the remaining cookies for yourself.
		//
		//		a. Create two variables called numberOfCookies and numberOfChildren.
		//		b. Initialize the two variables to integer values.
		//		b. Use a conditional to print the following based on the following conditions:
		//				i. If there are 0 cookies remaining, print "Sad Face"
		//				ii. If there are less than 2 cookies, print "Yes!"
		//				iii. If there are less than 5 cookies, print "Whoohoooo!"
		//				iv. If there are 5 or more cookies, print "Jackpot!"
		int numberOfCookies = 20;
		int numberOfChildren = 12;
		if (numberOfCookies % numberOfChildren > 5) {
			System.out.println("Jackpot");
		} else if (numberOfCookies % numberOfChildren >= 2) {
			System.out.println("Woohoo");
		} else if (numberOfCookies % numberOfChildren > 0) {
			System.out.println("Yes");
		} else {
			System.out.println("Sad Face");
		}


		// 7.  Loyalty Member Program:
		//		a. Create a variable called loyaltyMemberStatus and assign the value "SILVER"
		//		b. Create a variable called loyaltyMemberDiscount and assign the value 0.0
		//		c. Using a switch, set the value of loyaltyMemberDiscount based on 
		//				the following loyaltyMemberStatus scale:
		//				i. "SILVER" is 0.10
		//				ii. "GOLD" is 0.15
		//				iii. "PLATINUM" is 0.25
		String loyaltyMemberStatus = "SILVER";
		double loyaltyMemberDiscount = 0.0;

		switch (loyaltyMemberStatus){
			case "SILVER":
				loyaltyMemberDiscount = .1;
				break;
			case "GOLD":
				loyaltyMemberDiscount = .15;
				break;
			case "PLATINUM":
				loyaltyMemberDiscount = .25;
				break;
		}

		System.out.println(loyaltyMemberDiscount);


		// 8. Using the Loyalty Member Program variables from Question 7, do the following:
		//		a. Create a variable called billTotal and assign a value
		//		b. Create a variable called adjustedTotal and assign it the billTotal minus 
		//				the loyaltyMemberDiscount percent of the billTotal
		//		c. If the adjustedBillTotal is greater than $500 upgrade the 
		//				loyaltyMemberStatus from SILVER to GOLD or from GOLD to PLATINUM

		double billTotal = 600;
		double adjustedTotal = billTotal - loyaltyMemberDiscount * billTotal;
		System.out.println(adjustedTotal);

		if (adjustedTotal > 500) {
			if (loyaltyMemberStatus == "SILVER") {
				loyaltyMemberStatus = "GOLD";
			} else if (loyaltyMemberStatus == "GOLD") {
				loyaltyMemberStatus = "PLATINUM";
				
			}
		}

		System.out.println(loyaltyMemberStatus);
		
		// 9. Login -- username & password:
		//		a. Create two variables, username and password
		//		b. Create a conditional that prints one of the following:
		//				i. "login successful" if the username is "Tommy123" and the password is "12345"
		//				ii. "access denied" otherwise

		String username = "Tommy123";
		String password = "12345";


		if (username.equals("Tommy123") && password.equals("12345")){
			System.out.println("login successful");
		} else {
			System.out.println("access denied");
		}


		
		
		//
		// LOOPS:
		//
		
		// 10. Write a for loop that prints each number from 0 to 9

		for (int i=0; i < 10; i++) {
			System.out.println(i);
		}
		
		
		// 11. Write a for loop that prints each number from 10 to 0 backwards

		for (int i=10; i>=0; i--) {
			System.out.println(i);
		}
		
		
		// 12. Write a for loop that prints every other number from 0 to 100

		for (int i=0; i<=100; i++){
			if (i % 2==0){
				System.out.println(i);
			}
		}
		
		
		// 13. Write a for loop that iterates from 0 to 100 and prints 
		//			"EVEN" if the number is even and "ODD" if it's odd

		for (int i=0; i<=100; i++){
			if (i % 2==0){
				System.out.println(i+"EVEN");
			} else{
				System.out.println(i+"ODD");
			}
		}
		
		// 14. Write a while loop that starts at 100 and iterates backwards by 1 until it reaches 0
		//			within the loop, divide each number by 3 and print the remainder to the console.
		int i = 100;
		while(i>0){
			System.out.println(i + " " + (i % 3));
			i--;
		}
		System.out.println((-2<-1) || (10>3) && false);


				int personOneAge = 25;
				int personTwoAge = 35;
				int personThreeAge = 30;

				if (personOneAge > personTwoAge && personOneAge > personThreeAge) {
					System.out.println("Person one is the oldest.");
				} else if (personTwoAge > personOneAge && personTwoAge > personThreeAge) {
					System.out.println("Person two is the oldest.");
				} else {
					System.out.println("Person three is the oldest.");
				}

				int num = 10;
				String numStr = Integer.toString(num);
				int numDigits = numStr.length();

				if (numDigits == 2) {
					System.out.println(num + " is a 2 digit number.");
				} else if (numDigits == 3) {
					System.out.println(num + " is a 3 digit number.");
				} else if (numDigits == 4) {
					System.out.println(num + " is a 4 digit number.");
				} else if (numDigits == 5) {
					System.out.println(num + " is a 5 digit number.");
				} else {
					System.out.println(num + "Your number is smaller than 10 or larger than 99999.");
				}

				int x = -3;
				int y = -8;

				if (x > 0 && y > 0){
					System.out.println("The point is in quadrant 1.");
				} else if (x > 0 && y < 0) {
					System.out.println("The point is in quadrant 4.");
				} else if (x < 0 && y <0) {
					System.out.println("The point is in quadrant 3.");
				} else if (x < 0 && y > 0) {
					System.out.println("The point is in quadrant 2.");
				} else if (x==0) {
					System.out.println("The point is resting on the x axis.");
				} else if (y == 0) {
					System.out.println("The point is resting on the y axis.");
				}

				int num1 = 156;
				int myNumber = 125;

				if (num1 > myNumber) {
					System.out.println(num1 + " " + "is larger than my number," + " " + myNumber);
				} else if (num1 < myNumber) {
					System.out.println(num1 + " " + "is smaller than my number,"+ " " + myNumber);
				} else {
					System.out.println(num1 + " " + "is equal to my number,"+ " " + myNumber);
				}

				int monthNumber = 10;
				String monthName;

				switch (monthNumber) {
					case 1:
						monthName = "January";
						break;
					case 2:
						monthName = "February";
						break;
					case 3:
						monthName = "March";
						break;
					case 4:
						monthName = "April";
						break;
					case 5:
						monthName = "May";
						break;
					case 6:
						monthName = "June";
						break;
					case 7:
						monthName = "July";
						break;
					case 8:
						monthName = "August";
						break;
					case 9:
						monthName = "September";
						break;
					case 10:
						monthName = "October";
						break;
					case 11:
						monthName = "November";
						break;
					case 12:
						monthName = "December";
						break;
					default:
						monthName ="Invalid Month";
						break;
				}

				System.out.println(monthName);

				int numericGrade = 75;

				if (numericGrade >= 90) {
					System.out.println("A");
				} else if (numericGrade >= 80) {
					System.out.println("B");
				} else if ( numericGrade >= 70) {
					System.out.println("C");
				} else if (numericGrade >= 60) {
					System.out.println("D");
				} else {
					System.out.println("F");
				}



	}
		}



