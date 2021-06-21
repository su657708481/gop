class Main
{
	public static void main(String[] args) {

		GpsConn gpsConn = new GpsConn();
		gpsConn.start();

		Detect detect = new Detect();
		detect.start();
	}
}
