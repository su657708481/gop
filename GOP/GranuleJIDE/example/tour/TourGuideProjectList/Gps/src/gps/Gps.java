package gps;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;

public class Gps extends JFrame {

    private String city;
    private String park;
    private Thread thread;

    private static boolean KEY = true;
    private static int PORT = 8877;

    private JComboBox jcb;
    private JComboBox jcbv1;
    private JTextField jtf;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if ("西安".equals(city)) {
            this.city = "Xian";
        } else if ("上海".equals(city)) {
            this.city = "Shanghai";
        } else if ("香港".equals(city)) {
            this.city = "HongKong";
        }
    }

    public String getPark() {
        return park;
    }

    public void setPark(String park) {
        if ("钟楼".equals(park)) {
            this.park = "Bell Tower";
        } else if ("大雁塔".equals(park)) {
            this.park = "Big Wild Goose Pagoda";
        } else if ("大明宫".equals(park)) {
            this.park = "Daming Palace";
        } else if ("华清池".equals(park)) {
            this.park = "Huaqing Spring";
        } else if ("秦岭".equals(park)) {
            this.park = "Qinling";
        } else if ("曲江池".equals(park)) {
            this.park = "Qujiang Pool";
        } else if ("大唐芙蓉园".equals(park)) {
            this.park = "Tang Garden";
        } else if ("秦始皇陵兵马俑".equals(park)) {
            this.park = "Terracotta Warriors";
        } else if ("城隍庙".equals(park)) {
            this.park = "Chenghuang Temple";
        } else if ("上海杜莎夫人蜡像馆".equals(park)) {
            this.park = "Madame Tussauds";
        } else if ("南京路".equals(park)) {
            this.park = "Nanjing Road";
        } else if ("上海世博园".equals(park)) {
            this.park = "Expo Park";
        } else if ("外滩".equals(park)) {
            this.park = "Wai Tan";
        } else if ("豫园".equals(park)) {
            this.park = "Yu Garden";
        } else if ("星光大道".equals(park)) {
            this.park = "Avenue of Stars";
        } else if ("铜锣湾".equals(park)) {
            this.park = "Causeway Bay";
        } else if ("国际会展中心".equals(park)) {
            this.park = "CEC";
        } else if ("金紫荆广场".equals(park)) {
            this.park = "Golden Bauhinia Square";
        } else if ("旺角".equals(park)) {
            this.park = "Mong Kok";
        } else if ("浅水湾".equals(park)) {
            this.park = "Repulse Bay";
        } else if ("太平山顶".equals(park)) {
            this.park = "The Peak";
        } else if ("维多利亚湾".equals(park)) {
            this.park = "Victoria Harbour";
        } else if (park == "") {
            this.park = "NULL";
        }
    }

    public Thread getThread() {
        return thread;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }

    public static void main(String[] args) {
        Gps xv = new Gps();
        xv.show();
        try {
            ServerSocket server = new ServerSocket(PORT);
            while (KEY) {
                Socket s = server.accept();
                Runnable r = new ProcessGps(xv.city, xv.park, s);
                Thread thr = new Thread(r);
                xv.setThread(thr);
                thr.start();
            }
            server.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void show() {
        final JFrame jf = new JFrame("GPS");
        Container c = jf.getContentPane();
        JPanel pane0 = new JPanel();
        pane0.setLayout(null);
        pane0.setSize(400, 450);
        final JLabel lb1 = new JLabel("城市：");
        lb1.setBounds(10, 0, 100, 50);
        final JLabel lb2 = new JLabel("景点：");
        lb2.setBounds(10, 50, 100, 50);

        String[] s = { "西安", "上海", "香港" };
        jcb = new JComboBox(s);
        jcb.setSelectedItem(1);
        jcb.setBounds(100, 10, 280, 30);

        String[] v1 = { "", "钟楼", "大雁塔", "大明宫", "华清池", "秦岭", "曲江池", "大唐芙蓉园",
                "秦始皇陵兵马俑" };
        jcbv1 = new JComboBox(v1);
        // jcbv1.setSelectedItem(1);
        jcbv1.setBounds(100, 62, 280, 30);

        JButton publish = new JButton("发布");
        publish.setBounds(100, 110, 100, 30);

        JButton stop = new JButton("停止");
        stop.setBounds(260, 110, 100, 30);

        final JTextArea jtf = new JTextArea();
        jtf.setBounds(10, 160, 380, 250);
        jtf.setEditable(false);
        // jtf.setColumns(20);
        // jtf.setRows(5);
        // jtf.setText(jcb.getSelectedItem().toString());

        jcb.addItemListener(new ItemListener() {
            @SuppressWarnings("unchecked")
            public void itemStateChanged(final ItemEvent e) {
                String ctt = jcb.getSelectedItem().toString();
                if (ctt.equals("西安")) {
                    jcbv1.removeAllItems();
                    jcbv1.addItem("");
                    jcbv1.addItem("钟楼");
                    jcbv1.addItem("大雁塔");
                    jcbv1.addItem("大明宫");
                    jcbv1.addItem("华清池");
                    jcbv1.addItem("秦岭");
                    jcbv1.addItem("曲江池");
                    jcbv1.addItem("大唐芙蓉园");
                    jcbv1.addItem("秦始皇陵兵马俑");
                    // jcbv1.setSelectedItem(1);
                    jcbv1.setBounds(100, 62, 280, 30);
                } else if (ctt.equals("上海")) {
                    jcbv1.removeAllItems();
                    jcbv1.addItem("");
                    jcbv1.addItem("城隍庙");
                    jcbv1.addItem("上海杜莎夫人蜡像馆");
                    jcbv1.addItem("南京路");
                    jcbv1.addItem("上海世博园");
                    jcbv1.addItem("外滩");
                    jcbv1.addItem("豫园");
                    // jcbv1.setSelectedItem(1);
                    jcbv1.setBounds(100, 62, 280, 30);
                } else if (ctt.equals("香港")) {
                    jcbv1.removeAllItems();
                    jcbv1.addItem("");
                    jcbv1.addItem("星光大道");
                    jcbv1.addItem("铜锣湾");
                    jcbv1.addItem("国际会展中心");
                    jcbv1.addItem("旺角");
                    jcbv1.addItem("浅水湾");
                    jcbv1.addItem("天平山顶");
                    jcbv1.addItem("维多利亚湾");
                    jcbv1.setBounds(100, 62, 280, 30);
                }
            }
        });

        publish.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                String ctt1 = jcb.getSelectedItem().toString();
                String ctt2 = jcbv1.getSelectedItem().toString();

                SimpleDateFormat sdf = new SimpleDateFormat(
                        "yyyy-MM-dd hh:mm:ss");
                Date date = new Date();
                String time = sdf.format(date);

                InetAddress addr = null;
                try {
                    addr = InetAddress.getLocalHost();
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                }
                String ip = addr.getHostAddress().toString();

                StringBuffer result = new StringBuffer();
                result.append("\n Ip = " + ip + "   Port = " + PORT);
                result.append("\n\n " + "Time = " + time);
                result.append("\n\n City = " + ctt1);
                result.append("\n\n Park = " + ctt2);
                jtf.setText(result.toString());

                setCity(ctt1);
                setPark(ctt2);

            }
        });

        stop.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                jtf.setText(null);
                stopButtonActionPerformed(arg0);

            }
        });

        pane0.add(lb1);
        pane0.add(lb2);
        pane0.add(jcb);
        pane0.add(jcbv1);
        pane0.add(publish);
        pane0.add(stop);
        pane0.add(jtf);

        c.add(pane0);
        jf.setSize(400, 450);
        jf.setLocationRelativeTo(null);
        jf.setResizable(false);
        jf.setVisible(true);
    }

    private void stopButtonActionPerformed(ActionEvent evt) {
        KEY = false;
        this.dispose();
    }

}
