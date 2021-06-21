
public class g_Park{

	granule g_Park_DMP(Park) {
		external String park_c;
		{
			return park_c.equals("Daming Palace");
		}	
	}

	class Park within g_Park_DMP{
			
			public void createUI(){
				XA_Daming_Palace xv = new XA_Daming_Palace();
				xv.show();
			}
			
			public void enter(){
				
			}
			
			public void exit(){
				
			}
		}
}
