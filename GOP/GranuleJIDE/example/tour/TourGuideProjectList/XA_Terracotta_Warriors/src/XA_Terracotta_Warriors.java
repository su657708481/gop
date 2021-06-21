import javax.swing.*;
import java.awt.*;

public class XA_Terracotta_Warriors {
	
	String path = new String("E:\ggggop\\GOP\\GranuleJIDE\\example\\tour\\Resources\\ViewIconXA\\");
	
	ImageIcon xc1 = new ImageIcon(path + "xabmy1.jpg");
	ImageIcon xc2 = new ImageIcon(path + "xabmy2.jpg");
	ImageIcon xc3 = new ImageIcon(path + "xabmy3.jpg");
	ImageIcon xc4 = new ImageIcon(path + "xabmy4.jpg");
	ImageIcon xc5 = new ImageIcon(path + "xabmy5.jpg");
	ImageIcon xc6 = new ImageIcon(path + "xabmy6.jpg");
		
	/*public static void main(String[] args) {
		XA_Terracotta_Warriors xv = new XA_Terracotta_Warriors();
		xv.show();
	}*/
	
	public void show() {
		JFrame jf = new JFrame("Terracotta Warriors");
		Container c = jf.getContentPane(); 
		//jf.setLayout(null);
        JPanel pane0 = new JPanel();				
		pane0.setLayout(null);
		pane0.setSize(1150, 705);
		final JLabel lb1 = new JLabel(xc1);
		lb1.setSize(800,600);
		final JLabel lb2 = new JLabel(xc2);
		lb2.setBounds(810, 0, 340, 170);
		final JLabel lb3 = new JLabel(xc3);
		lb3.setBounds(810, 175, 167, 175);
		final JLabel lb4 = new JLabel(xc4);
		lb4.setBounds(983, 175, 167, 175);
		final JLabel lb5 = new JLabel(xc5);
		lb5.setBounds(810, 355, 340, 170);
		final JLabel lb6 = new JLabel(xc6);	
		lb6.setBounds(810, 530, 340, 175);
		final JTextArea lb7 = new JTextArea("旅游专线：在火车站东广场乘坐306，307芦席安至兵马俑的专线车兵马俑博物馆下；自驾车：自驾车时可沿西潼高速公路前行，行程24公里，到达临潼区，前行三公里，即为秦始皇陵，继续前行四公里，即到秦兵马俑博物馆。");	
		lb7.setLineWrap(true);
		lb7.setEditable(false);
		lb7.setFont(new Font("Serif",Font.BOLD,20));
		lb7.setForeground(Color.blue);	
		lb7.setBounds(0, 605, 800, 100);	
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
