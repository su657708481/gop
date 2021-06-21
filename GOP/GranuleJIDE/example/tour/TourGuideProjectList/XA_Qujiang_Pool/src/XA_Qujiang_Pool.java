

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class XA_Qujiang_Pool {
	
	String path = new String("D:\\Resources\\ViewIconXA\\");
	
	ImageIcon xc1 = new ImageIcon(path + "xaqjc1.jpg");
	ImageIcon xc2 = new ImageIcon(path + "xaqjc2.jpg");
	ImageIcon xc3 = new ImageIcon(path + "xaqjc3.jpg");
	ImageIcon xc4 = new ImageIcon(path + "xaqjc4.jpg");
	ImageIcon xc5 = new ImageIcon(path + "xaqjc5.jpg");
	ImageIcon xc6 = new ImageIcon(path + "xaqjc6.jpg");
	ImageIcon xc7 = new ImageIcon(path + "xaqjc7.jpg");
	ImageIcon xc8 = new ImageIcon(path + "xaqjc8.jpg");
	
	/*public static void main(String[] args) {
		XA_Qujiang_Pool xv = new XA_Qujiang_Pool();
		xv.show();
	}*/
	
	public void show() {
		final JFrame jf = new JFrame("Qujiang Pool");
		Container c = jf.getContentPane(); 
        JPanel pane0 = new JPanel();				
		pane0.setLayout(null);
		pane0.setSize(1150, 705);
		final JButton lb1 = new JButton(xc1);
		lb1.setSize(280,350);
		lb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jf.setEnabled(false);
				final JFrame frame0 = new JFrame("Introduction");
				Container c0 = frame0.getContentPane();
				JPanel pane0 = new JPanel();		
				pane0.setLayout(null);
				final JTextArea area0 = new JTextArea();		
				area0.setText("         曲江池，兴于秦汉，盛于隋唐，历时千年，是中国古代风景园林之经典。秦代曲江，一片天然池沼，称为隑洲，建有著名离宫--宜春宫。" +
						"汉武帝时因其水波浩渺，池岸曲折，“形似广陵之江”，取名“曲江”。隋代修建大兴城，曲江被纳入城廓之中，改称芙蓉池。唐代大规模营建曲江，凿黄渠，辟御苑，筑夹城，建大雁塔，修新开门，曲江池成为水域千亩、名冠京华的游赏胜地。" +
						"“曲江流饮”、“雁塔题名”、“杏园关宴”、“寒窑故事”等典故传说，更使曲江池声名远播，文脉流长。唐末，曲江池因战乱宫殿废圮，池水逐渐干涸，后被垦为田圃，园林盛景几无所存。                                                                                                                  " +
						"公元2007年7月，西安市决定，由曲江新区投巨资，依照曲江池历史水系和文物勘探成果，规划建设占地1500亩，集历史文化、文物保护、城市游憩为一体的大型开放式园林生态工程--曲江池遗址公园。" +
						"作为西安市重点建设项目，历时一年，于2008年7月1日建成开放。曲江池遗址公园彰显秦汉雄风，传承隋唐源脉，跨原带隰（xi），湖泊连延，是历史盛景的完美再现，也是西安“皇城复兴计划”的扛鼎之作，被誉为人文西安、古今融合、人与自然和谐的建设典范。");
				area0.setLineWrap(true);
				area0.setEditable(false);
				area0.setFont(new Font("Serif",Font.BOLD,16));
				area0.setBackground(Color.pink);
				area0.setForeground(Color.blue);	
				area0.setSize(600, 400);
				pane0.add(area0);
				c0.add(pane0);
				frame0.setSize(604, 400);
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
		final JLabel lb2 = new JLabel(xc2);
		lb2.setBounds(290, 0, 280, 250);
		final JLabel lb3 = new JLabel(xc3);
		lb3.setBounds(580, 0, 280, 450);
		final JLabel lb4 = new JLabel(xc4);
		lb4.setBounds(870, 0, 280, 350);
		final JLabel lb5 = new JLabel(xc5);
		lb5.setBounds(0, 355, 280, 350);
		final JLabel lb6 = new JLabel(xc6);	
		lb6.setBounds(290, 255, 280, 450);
		final JLabel lb7 = new JLabel(xc7);
		lb7.setBounds(580, 455, 280, 250);
		final JLabel lb8 = new JLabel(xc8);	
		lb8.setBounds(870, 355, 280, 350);

		pane0.add(lb1);
		pane0.add(lb2);
		pane0.add(lb3);
		pane0.add(lb4);
		pane0.add(lb5);
		pane0.add(lb6);
		pane0.add(lb7);
		pane0.add(lb8);

		pane0.setBackground(Color.gray);              
        c.add(pane0);
    	jf.setSize(1152, 730);
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);
		jf.setVisible(true);		
	}	

}
