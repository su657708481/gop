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
		System.out.println(this.pn+"基类createUI");
	}

	public void getCityName()
	{
		System.out.println(this.pn+"基类CityName");
	}

}
