
public class g_Park{

	granule g_Park_BWGP(Park) {
		external String park_c;
		{
			return park_c.equals("Big Wild Goose Pagoda");
		}	
	}

	class Park within g_Park_BWGP{
			
			public void createUI(){
				XA_Big_Wild_Goose_Pagoda xv = new XA_Big_Wild_Goose_Pagoda();
				xv.show();
			}
			
			public void enter(){
				
			}
			
			public void exit(){
				
			}
		}
}
