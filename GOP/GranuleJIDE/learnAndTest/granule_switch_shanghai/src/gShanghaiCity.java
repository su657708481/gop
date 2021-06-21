granule gShanghaiCity(City)

{
	external String cityname;
	{
		System.out.println("external cityname:" + cityname);
		return "Shanghai".equals(cityname);
	}
}

class City within gShanghaiCity
{
	public void getCityName()
	{
		System.out.println(cityname);
	}
	
	public void createUI()
	{
		System.out.println("gShanghaiCity createUI");
	}
}
