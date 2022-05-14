granule g2(BaseClass)

{
	external String context;
	{
		return "value2".equals(context);
	}
}

class BaseClass within g2
{

	public String getClassName()
	{
		return "g2.";
	}


	public void executeMethod(String programName, String time)
	{
		System.out.println("\n*** "+programName+" executeMethod from g2 in "+time+"***\n");

	}
}
