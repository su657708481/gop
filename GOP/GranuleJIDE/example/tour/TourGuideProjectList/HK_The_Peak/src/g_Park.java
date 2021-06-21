
public class g_Park{

	granule g_Park_Peak(Park) {
		external String park_c;
		{
			return park_c.equals("The Peak");
		}	
	}

	class Park within g_Park_Peak{
			
			public void createUI(){
				HK_The_Peak xv = new HK_The_Peak();
				xv.show();
			}
			
			public void enter(){
				
			}
			
			public void exit(){
				
			}
		}
}
