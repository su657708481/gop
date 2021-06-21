
public class g_Park{

	granule g_Park_Expo(Park) {
		external String park_c;
		{
			return park_c.equals("Expo Park");
		}	
	}

	class Park within g_Park_Expo{
			
			public void createUI(){
				SH_Shanghai_Expo_Park xv = new SH_Shanghai_Expo_Park();
				xv.show();
			}
			
			public void enter(){
				
			}
			
			public void exit(){
				
			}
		}
}
