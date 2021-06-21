

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

public class HK_CEC {
	
	String path = new String("D:\\Resources\\ViewIconHK\\");
	
	ImageIcon xc1 = new ImageIcon(path + "hkhzzx1.jpg");
	ImageIcon xc2 = new ImageIcon(path + "hkhzzx2.jpg");
	ImageIcon xc3 = new ImageIcon(path + "hkhzzx3.jpg");
	ImageIcon xc4 = new ImageIcon(path + "hkhzzx4.jpg");
	ImageIcon xc5 = new ImageIcon(path + "hkhzzx5.jpg");
	ImageIcon xc6 = new ImageIcon(path + "hkhzzx6.jpg");

	/*public static void main(String[] args) {
		HK_CEC xv = new HK_CEC();
		xv.show();
	}*/
	
	public void show() {
		final JFrame jf = new JFrame("Convention and Exhibition Centre");
		Container c = jf.getContentPane(); 
        JPanel pane0 = new JPanel();				
		pane0.setLayout(null);
		pane0.setSize(1150, 705);
		final JButton lb1 = new JButton(xc1);
		lb1.setSize(570,350);
		lb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jf.setEnabled(false);
				final JFrame frame0 = new JFrame("Introduction");
				Container c0 = frame0.getContentPane();
				JPanel pane0 = new JPanel();		
				pane0.setLayout(null);
				final JTextArea area0 = new JTextArea();		
				area0.setText("        香港会议展览中心（香港会展中心,Hong Kong Convention and Exhibition Centre，HKCEC）位于香港湾仔的香港会议展览中心，是香港区海边最新建筑群中的代表者之一。" +
						"除了作大型会议及展览用途之外，这里还有两间五星级酒店、办公大楼和豪华公寓各一幢。而它的新翼则由填海扩建而成，内附大礼堂及大展厅数个，分布于三层建筑之中，是世界最大的展览馆之一。" +
						"1997年7月1日香港回归中国大典亦在该处举行，成为国际瞩目的焦点，而它独特的飞鸟展翅式形态，也给美丽的维多利亚港增添了不少色彩。会展由香港贸易发展局拥有，并由新创建集团的全资附属机构──香港会议展览中心（管理）有限公司管理。" +
						"会展2期向海一面对开为金紫荆广场，放有象征香港回归的金紫荆雕像，亦是香港每天举行升旗仪式的地方。香港会议展览中心曾作为多项世界性会议的主要会议场地，除了1997年7月1日香港回归中国大典亦在此举行外，" +
						"其他包括1997年世界银行年会，2000年亚洲电讯展等。2005年世界贸易组织部长级会议亦以香港会议展览中心作主要场地。");
				area0.setLineWrap(true);
				area0.setEditable(false);
				area0.setFont(new Font("Serif",Font.BOLD,16));
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
		lb2.setBounds(575, 0, 285, 350);
		final JLabel lb3 = new JLabel(xc3);
		lb3.setBounds(865, 0, 285, 350);
		final JLabel lb4 = new JLabel(xc4);
		lb4.setBounds(0, 355, 285, 350);
		final JLabel lb5 = new JLabel(xc5);
		lb5.setBounds(290, 355, 285, 350);
		final JLabel lb6 = new JLabel(xc6);	
		lb6.setBounds(580, 355, 570, 350);
				
		pane0.add(lb1);
		pane0.add(lb2);
		pane0.add(lb3);
		pane0.add(lb4);
		pane0.add(lb5);
		pane0.add(lb6);
		
		//pane0.setBackground(Color.black);              
        c.add(pane0);
    	jf.setSize(1152, 730);
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);
		jf.setVisible(true);		
	}	

}
