

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class HK_The_Peak {
	
	String path = new String("D:\\Resources\\ViewIconHK\\");
	
	ImageIcon xc1 = new ImageIcon(path + "hktpsd1.jpg");
	ImageIcon xc2 = new ImageIcon(path + "hktpsd2.jpg");
	ImageIcon xc3 = new ImageIcon(path + "hktpsd3.jpg");
	ImageIcon xc4 = new ImageIcon(path + "hktpsd4.jpg");
	ImageIcon xc5 = new ImageIcon(path + "hktpsd5.jpg");
	ImageIcon xc6 = new ImageIcon(path + "hktpsd6.jpg");
	ImageIcon xc7 = new ImageIcon(path + "hktpsd7.jpg");
	ImageIcon xc8 = new ImageIcon(path + "hktpsd8.jpg");	
	
	/*public static void main(String[] args) {
		HK_The_Peak xv = new HK_The_Peak();
		xv.show();
	}*/
	
	public void show() {
		final JFrame jf = new JFrame("The Peak");
		Container c = jf.getContentPane(); 
        JPanel pane0 = new JPanel();				
		pane0.setLayout(null);
		pane0.setSize(1150, 705);
		final JLabel lb1 = new JLabel(xc1);
		lb1.setSize(265,231);
		final JLabel lb2 = new JLabel(xc2);
		lb2.setBounds(0, 237, 265, 231);
		final JButton lb3 = new JButton(xc3);
		lb3.setBounds(275, 0, 600, 468);
		lb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jf.setEnabled(false);
				final JFrame frame0 = new JFrame("Introduction");
				Container c0 = frame0.getContentPane();
				JPanel pane0 = new JPanel();		
				pane0.setLayout(null);
				final JTextArea area0 = new JTextArea();		
				area0.setText("        香港太平山顶(Victoria Peak)，一般指“太平山山顶”，因而被香港人简称为山顶（The Peak）。太平山原名“硬头山”，古称香炉峰，海拔554米，是香港岛的最高峰。" +
						"太平山历史悠久，拥有多个名称，而不同的名称所指的范围亦有所不同。太平山顶俗称扯旗山，是游客必到的旅游点。在这里可以俯瞰维多利亚港的香港岛，九龙半岛两岸，" +
						"日落后欣赏有「东方之珠」美誉的夜景。山顶一带更是官绅名流的官邸所在。至于喜欢郊游的人士，可以由此起步，漫步小径古道或挑战港岛径。太平山俗称山顶，雄居香港岛的西部，" +
						"太平山顶香港岛之巅，也是俯瞰维多利亚港景色的最佳地点，游览香港的第一焦点。一直是香港的标志。它又称维多利亚峰或扯旗山，是港岛最负盛名的豪华高级住宅区。" +
						"游览太平山，可以乘车从公路盘旋而上山顶。不过，更多的游客喜欢选择登山缆车，因为它是前往山顶既快捷又极富游览价值的交通工具。白天和入夜的山顶风景各有不同，" +
						"不论你是不是个浪漫的人，也一定要安排到太平山赏夜景，赏景最佳的地点在凌霄阁的观景台、缆车总站旁的狮子亭，入夜的香港会让你念念不忘。当夜幕降临之际，站在太平山上放眼四望，" +
						"只见在万千灯火的映照下，港岛和九龙宛如镶嵌在维多利亚港湾的两颗明珠，互相辉映。");
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
		final JLabel lb4 = new JLabel(xc4);
		lb4.setBounds(885, 0, 265, 231);
		final JLabel lb5 = new JLabel(xc5);
		lb5.setBounds(885, 237, 265, 231);
		final JLabel lb6 = new JLabel(xc6);	
		lb6.setBounds(0, 474, 380, 231);
		final JLabel lb7 = new JLabel(xc7);
		lb7.setBounds(385, 474, 380, 231);
		final JLabel lb8 = new JLabel(xc8);	
		lb8.setBounds(770, 474, 380, 231);
				
		pane0.add(lb1);
		pane0.add(lb2);
		pane0.add(lb3);
		pane0.add(lb4);
		pane0.add(lb5);
		pane0.add(lb6);
		pane0.add(lb7);
		pane0.add(lb8);
		
		pane0.setBackground(Color.black);              
        c.add(pane0);
    	jf.setSize(1152, 730);
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);
		jf.setVisible(true);		
	}	

}
