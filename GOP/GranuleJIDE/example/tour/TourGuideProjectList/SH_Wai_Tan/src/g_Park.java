
public class g_Park{

	granule g_Park_WT(Park) {
		external String park_c;
		{
			return park_c.equals("Wai Tan");
		}	
	}

	class Park within g_Park_WT{
			
			public void createUI(){
				SH_Wai_Tan xv = new SH_Wai_Tan();
				xv.show();
			}
			
			public void enter(){
				
			}
			
			public void exit(){
				
			}
		}
}
