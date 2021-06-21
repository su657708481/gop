granule gCity_Xian expands g0(City)

{
	external String cityName;
	{
		System.out.println("external cityName:" + cityName);
		return "Xian".equals(cityName);
	}
}

class City within gCity_Xian
{
	public void getCityName()
	{
		System.out.println(cityName);
	}
	
	public void createUI()
	{
		System.out.println("gCity_Xian Ó°×ÓÀàcreateUI");
	}
}
