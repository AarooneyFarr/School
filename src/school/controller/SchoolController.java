package school.controller;

import school.model.SchoolBot;
import java.util.Scanner;

public class SchoolController
{
	private SchoolBot school;
	private Scanner scanner;
	
	public SchoolController()
	{
		school = new SchoolBot();
		scanner = new Scanner(System.in);
		
		
	}
	
	void start()
	{
		String exitCode = "";
		while(!exitCode.equalsIgnoreCase("quit"))
			{
				getMajorAndClass();
				System.out.println("If you would like to quit, type quit. Otherwise type anything and hit enter");
				exitCode = scanner.next();
			}
		
		
	}
	
	private void getMajorAndClass()
	{
		System.out.println("What year in school are you right now? (1,2,3,4)");
		String year = school.getSchoolClass(scanner.next());
		System.out.println("What is your major? (M,I,C)");
		String major = school.getMajor(scanner.next());
		System.out.println("You are a " + year + " in college, and you are majoring in " + major);
		
	}
	
}
