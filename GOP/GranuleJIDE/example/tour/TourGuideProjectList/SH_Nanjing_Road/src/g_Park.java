
public class g_Park{

	granule g_Park_NJR(Park) {
		external String park_c;
		{
			return park_c.equals("Nanjing Road");
		}	
	}

	class Park within g_Park_NJR{
			
			public void createUI(){
				SH_Nanjing_Road xv = new SH_Nanjing_Road();
				xv.show();
			}
			
			public void enter(){
				
			}
			
			public void exit(){
				
			}
		}
}
