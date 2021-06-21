

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class XA_Big_Wild_Goose_Pagoda {

	String path = new String("D:\\Resources\\ViewIconXA\\");
	
	ImageIcon xc1 = new ImageIcon(path + "xadyt1.jpg");
	ImageIcon xc2 = new ImageIcon(path + "xadyt2.jpg");
	ImageIcon xc3 = new ImageIcon(path + "xadyt3.jpg");
	ImageIcon xc4 = new ImageIcon(path + "xadyt4.jpg");
	ImageIcon xc5 = new ImageIcon(path + "xadyt5.jpg");
	ImageIcon xc6 = new ImageIcon(path + "xadyt6.jpg");
	ImageIcon xc7 = new ImageIcon(path + "xadyt7.jpg");
	
	/*public static void main(String[] args) {
		XA_Big_Wild_Goose_Pagoda xv = new XA_Big_Wild_Goose_Pagoda();
		xv.show();
	}*/
	
	public void show() {
		final JFrame jf = new JFrame("Big Wild Goose Pagoda");
		Container c = jf.getContentPane(); 
        JPanel pane0 = new JPanel();				
		pane0.setLayout(null);
		pane0.setSize(1150, 705);
		final JButton lb1 = new JButton(xc1);
		lb1.setSize(800,500);
		lb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jf.setEnabled(false);
				final JFrame frame0 = new JFrame("Introduction");
				Container c0 = frame0.getContentPane();
				JPanel pane0 = new JPanel();		
				pane0.setLayout(null);
				final JTextArea area0 = new JTextArea();		
				area0.setText("        大雁塔(Big Wild Goose Pagoda)是西安市著名的旅游景点。唐代永徽三年（公元652年），玄奘为藏经典而修建。" +
						      "大雁塔又名大慈恩寺塔，位于中国陕西省西安市南郊大慈恩寺内。因坐落在慈恩寺西院内，大雁塔原称慈恩寺西院浮屠（浮屠即塔的意思）。" +
						      "是中国唐朝佛教建筑艺术杰作。大雁塔是楼阁式砖塔，塔通高64.5米，塔身为七层，塔体呈方形锥体，由仿木结构形成开间，由下而上按比例递减。" +
						      "塔内有木梯可盘登而上。每层的四面各有一个拱券门洞，可以凭栏远眺。整个建筑气魄宏大，造型简洁稳重，比例协调适度，格调庄严古朴，是保存比较完好的楼阁式塔。" +
						      "在塔内可俯视西安古城。大雁塔是西安市的标志性建筑和著名古迹，是古城西安的象征。因此，西安市徽中央所绘制的便是这座著名古塔。");
				area0.setLineWrap(true);
				area0.setEditable(false);
				area0.setFont(new Font("Serif",Font.BOLD,18));
				area0.setBackground(Color.pink);
				area0.setForeground(Color.blue);	
				area0.setSize(520, 380);
				pane0.add(area0);
				c0.add(pane0);
				frame0.setSize(524, 380);
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
		lb2.setBounds(810, 0, 340, 245);
		final JLabel lb3 = new JLabel(xc3);
		lb3.setBounds(810, 255, 340, 245);
		final JLabel lb4 = new JLabel(xc4);
		lb4.setBounds(0, 505, 280, 200);
		final JLabel lb5 = new JLabel(xc5);
		lb5.setBounds(290, 505, 280, 200);
		final JLabel lb6 = new JLabel(xc6);	
		lb6.setBounds(580, 505, 280, 200);
		final JLabel lb7 = new JLabel(xc7);
		lb7.setBounds(870, 505, 280, 200);

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
