
public class g_Park{

	granule g_Park_GBS(Park) {
		external String park_c;
		{
			return park_c.equals("Golden Bauhinia Square");
		}	
	}

	class Park within g_Park_GBS{
			
			public void createUI(){
				HK_Golden_Bauhinia_Square xv = new HK_Golden_Bauhinia_Square();
				xv.show();
			}
			
			public void enter(){
				
			}
			
			public void exit(){
				
			}
		}
}
