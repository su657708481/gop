granule g_Park_TG(Park) {
	
	external String park_c;
	{
		return park_c.equals("Tang Garden");
	}	
}

class Park within g_Park_TG{
		
	public void createUI(){
		XA_Tang_Garden xv = new XA_Tang_Garden();
		xv.show();
	}
	
	public void enter(){
		
	}
	
	public void exit(){
		
	}
}