public class BaseClass
{
	BaseClass()
	{
		
	}

	public String getClassName()
	{
		return "BaseClass.";
	}

	public void executeMethod(String programName, String time)
	{
		System.out.println(programName+" executeMethod from BaseClass in "+time);
	}

}
