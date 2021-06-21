
public class g_Park{

	granule g_Park_VH(Park) {
		external String park_c;
		{
			return park_c.equals("Victoria Harbour");
		}	
	}

	class Park within g_Park_VH{
			
			public void createUI(){
				HK_Victoria_Harbour xv = new HK_Victoria_Harbour();
				xv.show();
			}
			
			public void enter(){
				
			}
			
			public void exit(){
				
			}
		}
}
