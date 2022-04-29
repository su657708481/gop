
external String cityname = "Xian";

class Main extends Thread
{	

	public void run()
	{ 	
		City city = new City();
		for(int i=0;i<1000;i++)
		{
			cityname = "Shanghai";	
			city.createUI();
			try {
				Thread.sleep(5000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			// 上下文更改
			cityname = "Xian";
			city.createUI();
			try {
				Thread.sleep(5000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		
		
		Main main = new Main();
		main.start();
	}

}
