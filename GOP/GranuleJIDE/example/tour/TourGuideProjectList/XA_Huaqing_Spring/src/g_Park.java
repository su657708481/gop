
public class g_Park{

	granule g_Park_HQS(Park) {
		external String park_c;
		{
			return park_c.equals("Huaqing Spring");
		}	
	}

	class Park within g_Park_HQS{
			
			public void createUI(){
				XA_Huaqing_Spring xv = new XA_Huaqing_Spring();
				xv.show();
			}
			
			public void enter(){
				
			}
			
			public void exit(){
				
			}
		}
}
