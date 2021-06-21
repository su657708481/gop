
public class g_Park{

	granule g_Park_MK(Park) {
		external String park_c;
		{
			return park_c.equals("Mong Kok");
		}	
	}

	class Park within g_Park_MK{
			
			public void createUI(){
				HK_Mong_Kok xv = new HK_Mong_Kok();
				xv.show();
			}
			
			public void enter(){
				
			}
			
			public void exit(){
				
			}
		}
}
