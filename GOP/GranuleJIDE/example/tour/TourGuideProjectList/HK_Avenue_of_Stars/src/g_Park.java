
public class g_Park{

	granule g_Park_AoS(Park) {
		external String park_c;
		{
			return park_c.equals("Avenue of Stars");
		}	
	}

	class Park within g_Park_AoS{
			
			public void createUI(){
				HK_Avenue_of_Stars xv = new HK_Avenue_of_Stars();
				xv.show();
			}
			
			public void enter(){
				
			}
			
			public void exit(){
				
			}
		}
}
