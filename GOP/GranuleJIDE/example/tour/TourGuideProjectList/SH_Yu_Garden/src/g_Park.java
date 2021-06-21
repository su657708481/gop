
public class g_Park{

	granule g_Park_YG(Park) {
		external String park_c;
		{
			return park_c.equals("Yu Garden");
		}	
	}

	class Park within g_Park_YG{
			
			public void createUI(){
				SH_Yu_Garden xv = new SH_Yu_Garden();
				xv.show();
			}
			
			public void enter(){
				
			}
			
			public void exit(){
				
			}
		}
}
