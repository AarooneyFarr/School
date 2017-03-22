package school.model;

public class SchoolBot
	{

		public SchoolBot()
			{

			}

		public String getMajor(String input)
			{
				String major = "";

				if (input.equalsIgnoreCase("M"))
					{
						major = "Mathematics";
					}
				else if (input.equalsIgnoreCase("I"))
					{
						major = "Information Technology";
					}
				else if (input.equalsIgnoreCase("C"))
					{
						major = "Computer Science";
					}
				else
					{
						major = "Major not found";
					}

				return major;
			}

		public String getSchoolClass(String input)
			{
				String sclass = "";

				if (input.equalsIgnoreCase("1"))
					{
						sclass = "Freshman";
					}
				else if (input.equalsIgnoreCase("2"))
					{
						sclass = "Sophomore";
					}
				else if (input.equalsIgnoreCase("3"))
					{
						sclass = "Junior";
					}
				else if (input.equalsIgnoreCase("4"))
					{
						sclass = "Senior";
					}
				else
					{
						sclass = "Invalid year number";

					}

				return sclass;

			}
	}
