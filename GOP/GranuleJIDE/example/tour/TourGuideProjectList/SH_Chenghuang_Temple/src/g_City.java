
public class g_City {

	granule g_City_SH(City) {
		external String city_c;
		{
			return city_c.equals("Shanghai");
		}	
	}

	class City within g_City_SH{
			
			public void createUI(){
				ShanghaiView xv = new ShanghaiView();
				xv.show();
			}
			
			public void enter(){
				
			}
			
			public void exit(){
				
			}
		}
}
