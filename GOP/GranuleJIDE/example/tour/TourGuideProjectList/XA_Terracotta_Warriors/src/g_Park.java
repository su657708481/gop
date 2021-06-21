
public class g_Park{

	granule g_Park_TW(Park) {
		external String park_c;
		{
			return park_c.equals("Terracotta Warriors");
		}	
	}

	class Park within g_Park_TW{
			
			public void createUI(){
				XA_Terracotta_Warriors xv = new XA_Terracotta_Warriors();
				xv.show();
			}
			
			public void enter(){
				
			}
			
			public void exit(){
				
			}
		}
}
