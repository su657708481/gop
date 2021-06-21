

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HK_Mong_Kok {
	
	String path = new String("D:\\Resources\\ViewIconHK\\");
	
	ImageIcon xc1 = new ImageIcon(path + "hkwj1.jpg");
	ImageIcon xc2 = new ImageIcon(path + "hkwj2.jpg");
	ImageIcon xc3 = new ImageIcon(path + "hkwj3.jpg");
	ImageIcon xc4 = new ImageIcon(path + "hkwj4.jpg");
	ImageIcon xc5 = new ImageIcon(path + "hkwj5.jpg");
	
	/*public static void main(String[] args) {
		HK_Mong_Kok xv = new HK_Mong_Kok();
		xv.show();
	}*/
	
	public void show() {
		final JFrame jf = new JFrame("Mong Kok");
		Container c = jf.getContentPane(); 
        JPanel pane0 = new JPanel();				
		pane0.setLayout(null);
		pane0.setSize(1150, 705);
		final JLabel lb1 = new JLabel(xc1);
		lb1.setSize(572,200);
		final JButton lb2 = new JButton(xc2);
		lb2.setBounds(0, 205, 572, 295);
		lb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jf.setEnabled(false);
				final JFrame frame0 = new JFrame("Introduction");
				Container c0 = frame0.getContentPane();
				JPanel pane0 = new JPanel();		
				pane0.setLayout(null);
				final JTextArea area0 = new JTextArea();		
				area0.setText("        旺角（Mong Kok）位于香港九龙西部，人口密度极高，平均密度为每平方公里13万人，现时其地积比率约4倍。旺角位于弥敦道北端，属九龙早期发展的地区，以避风塘及庙宇最为驰名。" +
						"这里留有不少旧日痕迹，区内大街小巷都不难找到老式饼店，神龛店，麻将馆等传统店铺，商号较多为小型作业，区内有香港最古老的一些街道，步行乃是最佳的寻幽探秘方式。" +
						"那种道地的风味与弥敦道的摩登景象全然不同。邻近的旺角是香港人流最旺盛的地区，是本地人购物的热门地点，不少商店及饭馆均通宵营业，全区繁华拥挤，银行，商业大厦林立，" +
						"店铺格局小巧精致，弥敦道一段更是精华所在。庙街从佐敦道伸展至油麻地文明里，每晚七时为变身成灯火通明的热闹夜市，数以百计的摊子摆卖衣饰，电器，手表等平价货品。" +
						"由于很多摊子售卖男仕衣服，故有男人街之俗称，接近天后庙一带有算命占卜和地摊摆挡，不远处还有街头戏曲表演，热闹处真如平民式夜总会。浏览街道两旁，旅客可发掘真正的香港市区生活面貌。" +
						"旺角新旧楼宇林立；旧住宅楼宇地铺多为商店或餐厅。以弥敦道为界，购物中心集中在东面，住宅区在西面。旺角交通十分发达，有公共汽车、火车、地下铁，更有专线小巴通宵行驶。假日时弥敦道以东一带常挤得水泄不通。");
				area0.setLineWrap(true);
				area0.setEditable(false);
				area0.setFont(new Font("Serif",Font.BOLD,15));
				area0.setBackground(Color.pink);
				area0.setForeground(Color.blue);	
				area0.setSize(550, 400);
				pane0.add(area0);
				c0.add(pane0);
				frame0.setSize(554, 400);
				frame0.setLocationRelativeTo(null);
				frame0.setResizable(false);
				frame0.setVisible(true); 
				frame0.addWindowListener(new WindowAdapter(){
					public void windowClosing(WindowEvent e){
						jf.setEnabled(true);
					}
				});
			}
	    });
		final JLabel lb3 = new JLabel(xc3);
		lb3.setBounds(0, 505, 572, 200);
		final JLabel lb4 = new JLabel(xc4);
		lb4.setBounds(578, 0, 572, 350);
		final JLabel lb5 = new JLabel(xc5);
		lb5.setBounds(578, 355, 572, 350);

		pane0.add(lb1);
		pane0.add(lb2);
		pane0.add(lb3);
		pane0.add(lb4);
		pane0.add(lb5);

		//pane0.setBackground(Color.black);              
        c.add(pane0);
    	jf.setSize(1152, 730);
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);
		jf.setVisible(true);	
	}

}