granule gShanghaiCity(City)

{
	external String city_shanghai;
	{
		System.out.println("external city_shanghai:" + city_shanghai);
		return "Shanghai".equals(city_shanghai);
	}
}

class City within gShanghaiCity
{
	public void getCityName()
	{
		System.out.println(city_shanghai);
	}
	
	public void createUI()
	{
		System.out.println("gShanghaiCity createUI");
	}
}
