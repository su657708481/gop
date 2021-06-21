
external public String cityname = "Shanghai";

class Main extends Thread
{	

	public void run()
	{ 	
		//cityname = "Xian";
		//cityname = "Shanghai";
		for(int i=0;i<1000;i++)
		{
			City city = new City();
			city.createUI();
			try {
				Thread.sleep(5000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			// 上下文更改
			cityname = "Shanghai";
			cityname = "Xian";
		}
		
	}

	public static void main(String[] args) {
		
		
		Main main = new Main();
		main.start();
	}

}
