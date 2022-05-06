import granulej.lang.GopContext;
import granulej.lang.ObjectAgent;

external public String cityname = "Shanghai";

public class ThredLocal extends Thread {

    public void run(){

        System.out.println(this.getName() + ": start");
        City city = new City();
        city.setProgramName(this.getName());
        System.out.println(this.getName() + ": change");
        
        // 修改上下文
        if ("thred1".equals(this.getName())) {
            GopContext.modifyContext("cityname", "Shanghai", "public", this.getName());
        } else {
            GopContext.modifyContext("cityname", "Xian", "public", this.getName());
        }

        for(int x = 0; x < 2; ++x) {
            city.createUI();

            try {
                Thread.sleep((long)5000);
            } catch (InterruptedException var6) {
                var6.printStackTrace();
            }
        }


    }

    public static void main(String[] args) {
        ThredLocal thred1=new ThredLocal();
        thred1.setName("thred1");
        thred1.start();
        
        ThredLocal thred2=new ThredLocal();
        thred2.setName("thred2");
        thred2.start();
    }

}
