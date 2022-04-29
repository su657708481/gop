granule gXianCity(City)

{
	external String cityname;
	{
		System.out.println("external cityname:" + cityname);
		return "Xian".equals(cityname);
	}
}

class City within gXianCity
{
	public void getCityName()
	{
		System.out.println(cityname);
	}
	
	public void createUI()
	{
		System.out.println("gCity_Xian Ó°×ÓÀàcreateUI");
	}
}