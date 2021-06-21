granule g_City_XA(City) {

	external String city_c;
	{
		return city_c.equals("Xian");
	}	

}


class City within g_City_XA{
		
	public void createUI(){
		XianView xv = new XianView();
		xv.show();
	}
		
	public void enter(){
		
	}
		
	public void exit(){
		
	}
}