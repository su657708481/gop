
public class g_Park{

	granule g_Park_CHT(Park) {
		external String park_c;
		{
			return park_c.equals("Chenghuang Temple");
		}	
	}

	class Park within g_Park_CHT{
			
			public void createUI(){
				SH_Chenghuang_Temple xv = new SH_Chenghuang_Temple();
				xv.show();
			}
			
			public void enter(){
				
			}
			
			public void exit(){
				
			}
		}
}
