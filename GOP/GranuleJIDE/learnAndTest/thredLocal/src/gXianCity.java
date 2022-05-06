granule gXianCity(City)

{
	external String cityname;
	{
		// System.out.println("external cityname:" + cityname);
		return "Xian".equals(cityname);
	}
}

class City within gXianCity
{
	public void getCityName()
	{
		System.out.println(this.pn+": "+cityname);
	}
	
	public void createUI()
	{
		System.out.println(this.pn+": gCity_Xian Ó°×ÓÀàcreateUI");
	}
}
