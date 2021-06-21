
public class g_Park{

	granule g_Park_CB(Park) {
		external String park_c;
		{
			return park_c.equals("Causeway Bay");
		}	
	}

	class Park within g_Park_CB{
			
			public void createUI(){
				HK_Causeway_Bay xv = new HK_Causeway_Bay();
				xv.show();
			}
			
			public void enter(){
				
			}
			
			public void exit(){
				
			}
		}
}
