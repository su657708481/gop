
public class g_Park{

	granule g_Park_DS(Park) {
		external String park_c;
		{
			return park_c.equals("Madame Tussauds");
		}	
	}

	class Park within g_Park_DS{
			
			public void createUI(){
				SH_Madame_Tussauds xv = new SH_Madame_Tussauds();
				xv.show();
			}
			
			public void enter(){
				
			}
			
			public void exit(){
				
			}
		}
}
