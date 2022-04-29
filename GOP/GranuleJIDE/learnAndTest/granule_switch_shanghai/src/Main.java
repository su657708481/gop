
external public String cityname = "Shanghai";

class Main extends Thread
{	

	public void run()
	{ 	
		City city = new City();
		for(int i=0;i<5;i++)
		{
			// 上下文更改
			cityname = "Xian";
			city.createUI();
			try {
				Thread.sleep(5000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			cityname = "Shanghai";
			city.createUI();
			try {
				Thread.sleep(5000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("==============");
			
		}
		
	}

	public static void main(String[] args) {
		
		
		Main main = new Main();
		main.start();
	}

}
