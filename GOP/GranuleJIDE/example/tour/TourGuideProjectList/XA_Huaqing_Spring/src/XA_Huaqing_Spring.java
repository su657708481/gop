
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class XA_Huaqing_Spring {

	String path = new String("D:\\Resources\\ViewIconXA\\");
	
	ImageIcon xc1 = new ImageIcon(path + "xahqc1.jpg");
	ImageIcon xc2 = new ImageIcon(path + "xahqc2.jpg");
	ImageIcon xc3 = new ImageIcon(path + "xahqc3.jpg");
	ImageIcon xc4 = new ImageIcon(path + "xahqc4.jpg");
	ImageIcon xc5 = new ImageIcon(path + "xahqc5.jpg");
	ImageIcon xc6 = new ImageIcon(path + "xahqc6.jpg");
		
	/*public static void main(String[] args) {
		XA_Huaqing_Spring xv = new XA_Huaqing_Spring();
		xv.show();
	}*/
	
	public void show() {
		final JFrame jf = new JFrame("Huaqing Spring");
		Container c = jf.getContentPane(); 
        JPanel pane0 = new JPanel();				
		pane0.setLayout(null);
		pane0.setSize(1150, 705);
		final JLabel lb1 = new JLabel(xc1);
		lb1.setSize(1090,480);
		final JLabel lb2 = new JLabel(xc2);
		lb2.setBounds(0, 490, 226, 215);
		final JLabel lb3 = new JLabel(xc3);
		lb3.setBounds(231, 490, 226, 215);
		final JLabel lb4 = new JLabel(xc4);
		lb4.setBounds(460, 490, 226, 215);
		final JLabel lb5 = new JLabel(xc5);
		lb5.setBounds(691, 490, 226, 215);
		final JLabel lb6 = new JLabel(xc6);	
		lb6.setBounds(922, 490, 226, 215);
		final JButton lb7 = new JButton("<html>景<br>点<br>介<br>绍</html>");
		lb7.setFont(new Font("Serif",Font.BOLD,28));
		lb7.setForeground(Color.blue);
		lb7.setFocusPainted(false);
		lb7.setMargin(new Insets(0,0,0,0));
		lb7.setBounds(1100, 10, 40, 470);
		lb7.addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent arg0) {
				jf.setEnabled(false);
				final JFrame frame0 = new JFrame("Introduction");
				Container c0 = frame0.getContentPane();
				JPanel pane0 = new JPanel();		
				pane0.setLayout(null);
				final JTextArea area0 = new JTextArea();		
				area0.setText("        华清池，亦名华清宫，位于西安市临潼区骊山北麓，西距西安30公里，南依骊山，北临渭水，是以温泉汤池著称的中国古代离宫，周、秦、汉、隋、唐历代统治者，都视这块风水宝地为他们游宴享乐的行官别苑，或砌石起宇，兴建骊山汤，或周筑罗城，大兴温泉宫。" +
						      "历史文献及考古发掘的资料证明，华清池具有6000年温泉利用史和3000年的皇家园林建筑史。1982年，华清池被列为全国第一批重点风景名胜区，2007年5月8日，华清池景区被批准为国家5A级旅游景区。推荐旅游路线:梨园 > 香凝池 > 长汤 > 少阳汤 > 碑林 > 按歌" +
						      "台 > 西面 碑刻 > 东面 碑刻 > 荷花池 > 阿房宫长廊 > 碑亭 > 棋亭 > 五间厅 > 荷花阁 > 唐御汤遗址博物馆 > 陈列馆 > 九龙湖 > 芙蓉湖风景区 > 杨玉环奉诏华清宫壁画。");
				area0.setLineWrap(true);
				area0.setEditable(false);
				area0.setFont(new Font("Serif",Font.BOLD,18));
				area0.setBackground(Color.pink);
				area0.setForeground(Color.blue);	
				area0.setSize(500, 380);
				pane0.add(area0);
				c0.add(pane0);
				frame0.setSize(504, 380);
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
		pane0.add(lb1);
		pane0.add(lb2);
		pane0.add(lb3);
		pane0.add(lb4);
		pane0.add(lb5);
		pane0.add(lb6);
		pane0.add(lb7);
	
		pane0.setBackground(Color.black);              
        c.add(pane0);
    	jf.setSize(1152, 730);
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);
		jf.setVisible(true);		
	}	
}
