import java.util.HashMap;

public class GTour {

	public static HashMap<String, String> GpsInfo = new HashMap<String, String>();

	public static void main(String[] args) {
		GTour.GpsInfo.put("city", "");
		GTour.GpsInfo.put("city_old", "NULL");
		GTour.GpsInfo.put("park", "");
		GTour.GpsInfo.put("park_old", "NULL");

		GpsThread gps_thread = new GpsThread();
		gps_thread.start();

		Detection detection = new Detection();
		detection.start();
	}
}
