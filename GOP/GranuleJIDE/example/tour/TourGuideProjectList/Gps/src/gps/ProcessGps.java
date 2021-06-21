package gps;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

class ProcessGps implements Runnable {
    private String cityInfo;
    private String parkInfo;
    private Socket socket;

    public ProcessGps() {
    }

    public ProcessGps(String city, String park, Socket s) {
        this.cityInfo = city;
        this.parkInfo = park;
        this.socket = s;
    }


    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    socket.getInputStream()));
            PrintWriter pw = new PrintWriter(new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream())));
            String line = br.readLine();
            if (line != null && line.equals("Location")) {
                pw.println(this.cityInfo + "," + this.parkInfo);
            } else {
                pw.println("error");
            }
            pw.flush();
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
