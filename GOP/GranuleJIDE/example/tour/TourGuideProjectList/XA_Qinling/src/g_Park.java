
public class g_Park{

	granule g_Park_QL(Park) {
		external String park_c;
		{
			return park_c.equals("Qinling");
		}	
	}

	class Park within g_Park_QL{
			
			public void createUI(){
				XA_Qinling_Mountain xv = new XA_Qinling_Mountain();
				xv.show();
			}
			
			public void enter(){
				
			}
			
			public void exit(){
				
			}
		}
}
