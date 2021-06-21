
public class g_Park{

	granule g_Park_QJP(Park) {
		external String park_c;
		{
			return park_c.equals("Qujiang Pool");
		}	
	}

	class Park within g_Park_QJP{
			
			public void createUI(){
				XA_Qujiang_Pool xv = new XA_Qujiang_Pool();
				xv.show();
			}
			
			public void enter(){
				
			}
			
			public void exit(){
				
			}
		}
}
