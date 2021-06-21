import java.util.HashMap;

external String  city_c = "Xian";
external String park_c = "Tang Graden";

public class GTour {	
	
	public static HashMap<String,String> GpsInfo;
	
	public static void main(String[] args){

		
		GTour.GpsInfo.put("city","");
		GTour.GpsInfo.put("city_old","NULL");
		GTour.GpsInfo.put("park","");
		GTour.GpsInfo.put("park_old","NULL");
		
		GpsThread gps_thread=new GpsThread();
		gps_thread.start();
		
		Detection detection=new Detection();
		detection.start();
	}
}
