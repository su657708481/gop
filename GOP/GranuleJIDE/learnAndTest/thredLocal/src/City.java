public class City
{
	public String pn="";

	City()
	{
		
	}

	public void setProgramName(String programName)
	{	
		this.pn=programName;
	}

	public void createUI()
	{
		System.out.println(this.pn+"����createUI");
	}

	public void getCityName()
	{
		System.out.println(this.pn+"����CityName");
	}

}
