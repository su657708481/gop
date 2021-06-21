
public class Detection extends Thread {

	private String type = null;
	private boolean flag = false;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public Detection() {
	}

	public boolean compare() {
		setType(null);
		if (!(GTour.GpsInfo.get("city_old").equals(GTour.GpsInfo.get("city")))) {
			flag = true;
			type = "city";
		} else if (!(GTour.GpsInfo.get("park_old").equals(GTour.GpsInfo.get("park")))) {
			if("NULL".equals(GTour.GpsInfo.get("park_old"))){
				flag = true;
				type = "park";
			}else if("NULL".equals(GTour.GpsInfo.get("park"))){
				flag = true;
				type = "city";
			}else{
				flag = true;
				type = "park";
			}
		} else
			flag = false;
		return flag;
	}

	public void execute(){
		if (compare()) {
			if("city".equals(type)){
				City c = new City();
				c.enter();
				c.createUI();
			}
			else if("park".equals(type)){
				Park p = new Park();
				p.enter();
				p.createUI();
			}
			GTour.GpsInfo.put("city_old", GTour.GpsInfo.get("city"));
			GTour.GpsInfo.put("park_old", GTour.GpsInfo.get("park"));
		}
	}
	
	public void run() {
		/*if (GTour.GpsInfo.get("city").length() != 0) {
			City c = new City();
			c.enter();
			c.createUI();
		}*/
		while (true) {			
			execute();
			try {
				Thread.sleep(3500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

