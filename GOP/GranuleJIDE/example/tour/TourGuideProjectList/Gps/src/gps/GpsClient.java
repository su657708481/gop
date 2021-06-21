package gps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import static javax.swing.text.html.HTML.Tag.I;

public class GpsClient {
    public static String LOCATION = "Location";

    public GpsClient() {}

    public void GetContextByTime() {
        try
        {
            Socket socket = new Socket("127.0.0.1", 8877);
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter pw = new PrintWriter(socket.getOutputStream());
            pw.println(LOCATION);
            pw.flush();
            String line = br.readLine();
            String[] nums = line.split(",");

            System.out.println(line);
//            GTour.GpsInfo.put("city", nums[0]);
//            GTour.GpsInfo.put("park", nums[1]);
//            city_c = nums[0];
//            park_c = nums[1];

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void run() {
        while (true) {
            GetContextByTime();
            try {
                Thread.sleep(3500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        GpsClient gc = new GpsClient();
        gc.run();
    }
}
