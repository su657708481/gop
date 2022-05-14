granule g1(BaseClass)

{
	external String context;
	{
		return "value1".equals(context);
	}
}

class BaseClass within g1
{

	public String getClassName()
	{
		return "g1.";
	}


	public void executeMethod(String programName, String time)
	{
		System.out.println("\n*** "+programName+" executeMethod from g1 in "+time+"***\n");
	}
}
