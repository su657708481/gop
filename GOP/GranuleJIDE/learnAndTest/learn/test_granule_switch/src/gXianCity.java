granule gXianCity(City)

{
	external String city_xian;
	{
		System.out.println("external city_xian:" + city_xian);
		return "Xian".equals(city_xian);
	}
}

class City within gXianCity
{
	public void getCityName()
	{
		System.out.println(city_xian);
	}
	
	public void createUI()
	{
		System.out.println("gCity_Xian Ó°×ÓÀàcreateUI");
	}
}
