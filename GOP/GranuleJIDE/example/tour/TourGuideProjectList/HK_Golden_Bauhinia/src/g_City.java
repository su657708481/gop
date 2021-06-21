
public class g_City {

	granule g_City_HK(City) {
		external String city_c;
		{
			return city_c.equals("HongKong");
		}	
	}

	class City within g_City_HK{
			
			public void createUI(){
				HongKongView xv = new HongKongView();
				xv.show();
			}
			
			public void enter(){
				
			}
			
			public void exit(){
				
			}
		}
}
