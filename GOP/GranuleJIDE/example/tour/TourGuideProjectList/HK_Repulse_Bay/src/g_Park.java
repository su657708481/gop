
public class g_Park{

	granule g_Park_RB(Park) {
		external String park_c;
		{
			return park_c.equals("Repulse Bay");
		}	
	}

	class Park within g_Park_RB{
			
			public void createUI(){
				HK_Repulse_Bay xv = new HK_Repulse_Bay();
				xv.show();
			}
			
			public void enter(){
				
			}
			
			public void exit(){
				
			}
		}
}
