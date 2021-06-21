

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

public class HK_Golden_Bauhinia_Square {
	
	String path = new String("D:\\Resources\\ViewIconHK\\");
	
	ImageIcon xc1 = new ImageIcon(path + "hkjzj1.jpg");
	ImageIcon xc2 = new ImageIcon(path + "hkjzj2.jpg");
	ImageIcon xc3 = new ImageIcon(path + "hkjzj3.jpg");
	ImageIcon xc4 = new ImageIcon(path + "hkjzj4.jpg");
	ImageIcon xc5 = new ImageIcon(path + "hkjzj5.jpg");
	ImageIcon xc6 = new ImageIcon(path + "hkjzj6.jpg");

	/*public static void main(String[] args) {
		HK_Golden_Bauhinia_Square xv = new HK_Golden_Bauhinia_Square();
		xv.show();
	}*/
	
	public void show() {
		final JFrame jf = new JFrame("Golden Bauhinia Square");
		Container c = jf.getContentPane(); 
        JPanel pane0 = new JPanel();				
		pane0.setLayout(null);
		pane0.setSize(1150, 705);
		final JButton lb1 = new JButton(xc1);
		lb1.setSize(765,450);
		lb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jf.setEnabled(false);
				final JFrame frame0 = new JFrame("Introduction");
				Container c0 = frame0.getContentPane();
				JPanel pane0 = new JPanel();		
				pane0.setLayout(null);
				final JTextArea area0 = new JTextArea();		
				area0.setText("        金紫荆广场位于香港会展中心的新冀海旁的博览海滨花园内。“永远盛开的紫荆花”雕塑－金紫荆雕像矗立于香港会议展览中心新翼海旁的博览海滨花园内。" +
						"金紫荆广场三面被维多利亚港包围，在维港的中心位置，与对岸的尖沙咀对峙，是观景的好地方。1997年7月1日香港特别行政区成立，中央政府把一座金紫荆铜像赠送香港。" +
						"金紫荆铜像被安放在会展中心旁，面对大海，这个广场也被命名为“金紫荆广场”这座高6米的铜像正式名称为“永远盛开的紫荆花”，寓意香港永远繁荣昌盛。" +
						"在金紫荆广场飘扬着中国国旗及香港特区区旗，每天上午8时举行升旗仪式，晚6点举行降旗仪式。每年的7月1日香港特区成立纪念日和10月1日中国国庆日，" +
						"这里都会举行隆重的升旗仪式，特区行政长官率领特区政府主要官员出席，飞行服务队的直升机方阵低飞过广场上空，消防船还会进行喷水表演，吸引大批市民和游客前来观赏。" +
						"在金紫荆广场一角还矗立着高20米的香港回归纪念碑，与金紫荆铜像遥相呼应。纪念碑由206块石板层叠而成，每块石板代表1842～2047年间的每个年份。" +
						"其中6块圆形石板选用了浅色花岗石制成，分别代表1842年、1860年、1898年、1982年、1984年及1990年，至于内置灯光的玻璃环则标志着香港正式回归中国的1997年。");
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
		final JLabel lb2 = new JLabel(xc2);
		lb2.setBounds(770, 0, 380, 223);
		final JLabel lb3 = new JLabel(xc3);
		lb3.setBounds(770, 227, 380, 223);
		final JLabel lb4 = new JLabel(xc4);
		lb4.setBounds(0, 455, 380, 250);
		final JLabel lb5 = new JLabel(xc5);
		lb5.setBounds(385, 455, 380, 250);
		final JLabel lb6 = new JLabel(xc6);	
		lb6.setBounds(770, 455, 380, 250);
				
		pane0.add(lb1);
		pane0.add(lb2);
		pane0.add(lb3);
		pane0.add(lb4);
		pane0.add(lb5);
		pane0.add(lb6);
		
		pane0.setBackground(Color.black);              
        c.add(pane0);
    	jf.setSize(1152, 730);
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);
		jf.setVisible(true);		
	}	

}
