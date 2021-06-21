public class Detect extends Thread {

	public void working()
	{	
		//cityName = "Xian";
		City city = new City();
		city.getCityName();
		city.createUI();
		
		//cityName = "Shanghai";
	//	city.getCityName();
	//	city.createUI();
		
	}

	public void run() {
		while (true) {
			working();
			try {
				Thread.sleep(3500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
