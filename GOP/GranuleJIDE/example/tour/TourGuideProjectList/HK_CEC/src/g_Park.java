
public class g_Park{

	granule g_Park_CEC(Park) {
		external String park_c;
		{
			return park_c.equals("CEC");
		}	
	}

	class Park within g_Park_CEC{
			
			public void createUI(){
				HK_CEC xv = new HK_CEC();
				xv.show();
			}
			
			public void enter(){
				
			}
			
			public void exit(){
				
			}
		}
}
