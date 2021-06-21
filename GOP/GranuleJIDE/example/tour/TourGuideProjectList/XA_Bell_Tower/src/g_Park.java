
public class g_Park{

	granule g_Park_BT(Park) {
		external String park_c;
		{
			return park_c.equals("Bell Tower");
		}	
	}

	class Park within g_Park_BT{
			
			public void createUI(){
				XA_Bell_Tower xv = new XA_Bell_Tower();
				xv.show();
			}
			
			public void enter(){
				
			}
			
			public void exit(){
				
			}
		}
}
