granule gShanghaiCity(City)

{
	external String cityName;
	{
		System.out.println("external cityName:" + cityName);
		return "Shanghai".equals(cityName);
	}
}

class City within gShanghaiCity
{
	public void getCityName()
	{
		System.out.println(cityName);
	}
	
	public void createUI()
	{
		System.out.println("gCity_ShangHai ceateUI");
	}
}
