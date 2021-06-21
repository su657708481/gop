import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;

public class ShanghaiView implements ActionListener{
	
	JPanel jp1=new JPanel();
	
	String path = new String("D:\\Resources\\IconSH\\");
	
	ImageIcon head = new ImageIcon(path + "head2.jpg");
	ImageIcon welcome = new ImageIcon(path + "Shanghai.jpg");
	ImageIcon fashion = new ImageIcon(path + "Shanghai2.jpg");
	ImageIcon icon1 = new ImageIcon(path + "y01.jpg");
	ImageIcon icon2 = new ImageIcon(path + "y02.jpg");
	ImageIcon icon3 = new ImageIcon(path + "y03.jpg");
	ImageIcon icon4 = new ImageIcon(path + "y04.jpg");
	ImageIcon icon5 = new ImageIcon(path + "y05.jpg");

	ImageIcon t31 = new ImageIcon(path + "sh1.jpg");
	ImageIcon t32 = new ImageIcon(path + "sh2.jpg");
	ImageIcon t33 = new ImageIcon(path + "sh3.jpg");
	ImageIcon t34 = new ImageIcon(path + "sh4.jpg");
	ImageIcon t35 = new ImageIcon(path + "sh5.jpg");
	ImageIcon t36 = new ImageIcon(path + "sh6.jpg");
	
	ImageIcon xc1 = new ImageIcon(path + "shxc1.jpg");
	ImageIcon xc2 = new ImageIcon(path + "shxc2.jpg");
	ImageIcon xc3 = new ImageIcon(path + "shxc3.jpg");
	ImageIcon xc4 = new ImageIcon(path + "shxc4.jpg");
	ImageIcon xc5 = new ImageIcon(path + "shxc5.jpg");
	ImageIcon xc6 = new ImageIcon(path + "shxc6.jpg");
	ImageIcon xc7 = new ImageIcon(path + "shxc7.jpg");
	ImageIcon xc8 = new ImageIcon(path + "shxc8.jpg");

			
	JButton button1 = new JButton(icon1);
	JButton button2 = new JButton(icon2);
	JButton button3 = new JButton(icon3);
	JButton button4 = new JButton(icon4);
	JButton button5 = new JButton(icon5);

	CardLayout cl=new CardLayout();
			
	/*public static void main(String[] args) {
		ShanghaiView sv = new ShanghaiView();
		sv.show();
	}*/
	
	public void show() {
		JFrame jf = new JFrame("Shanghai Guard");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(null);
        Container c = jf.getContentPane();       
        
		JPanel pane = new JPanel();
		c.add(pane);
		pane.setSize(1280,100);
		pane.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		final JLabel label = new JLabel(head);
		pane.add(label);
		
		JPanel pane1 = new JPanel();
		c.add(pane1);
		pane1.setBounds(0, 100, 1280, 650);
		pane1.setLayout(null);
		pane1.setBackground(Color.pink);
		jp1.setLayout(cl);
		JLabel ta1 = new JLabel(welcome); 
		jp1.add(ta1,"1");
		JLabel ta2 = new JLabel(fashion); 
		jp1.add(ta2,"2");
		
		JPanel pane3 = new JPanel();
		pane3.setLayout(null);
		pane3.setBackground(Color.black);
		JButton ta31 = new JButton(t31);
		ta31.setBounds(15, 5, 320, 280);
		pane3.add(ta31);
		JButton ta32 = new JButton(t32);
		ta32.setBounds(355, 5, 320, 280);
		pane3.add(ta32);
		JButton ta33 = new JButton(t33);
		ta33.setBounds(695, 5, 320, 280);
		pane3.add(ta33);
		JButton ta34 = new JButton(t34);
		ta34.setBounds(15, 290, 320, 280);
		pane3.add(ta34);
		JButton ta35 = new JButton(t35);
		ta35.setBounds(355, 290, 320, 280);
		pane3.add(ta35);
		JButton ta36 = new JButton(t36);
		ta36.setBounds(695, 290, 320, 280);
		pane3.add(ta36);
		
		jp1.add(pane3,"3");
				
		JPanel pane0 = new JPanel();				
		pane0.setLayout(null);
		pane0.setSize(1036, 574);
		final JLabel lb1 = new JLabel(xc1);
		lb1.setSize(400,400);
		final JLabel lb2 = new JLabel(xc2);
		lb2.setBounds(0, 404, 400, 170);
		final JLabel lb3 = new JLabel(xc3);
		lb3.setBounds(403, 0, 315, 285);
		final JLabel lb4 = new JLabel(xc4);
		lb4.setBounds(403, 289, 315, 285);
		final JLabel lb5 = new JLabel(xc5);
		lb5.setBounds(719, 0, 315, 142);
		final JLabel lb6 = new JLabel(xc6);	
		lb6.setBounds(719, 144, 315, 142);
		final JLabel lb7 = new JLabel(xc7);	
		lb7.setBounds(719, 288, 315, 142);
		final JLabel lb8 = new JLabel(xc8);	
		lb8.setBounds(719, 432, 315, 142);		
		pane0.add(lb1);
		pane0.add(lb2);
		pane0.add(lb3);
		pane0.add(lb4);
		pane0.add(lb5);
		pane0.add(lb6);
		pane0.add(lb7);
		pane0.add(lb8);	
		pane0.setBackground(Color.black);
		jp1.add(pane0,"5");		

		final JPanel jPanel=new JPanel();
		button1.setActionCommand("1");
		button2.setActionCommand("2");
		button3.setActionCommand("3");
		button5.setActionCommand("5");
		jPanel.add(button1);
		jPanel.add(button2);
		jPanel.add(button3);
		jPanel.add(button4);
		jPanel.add(button5);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				int re = JOptionPane.showConfirmDialog(null, "您确定要播放宣传视频吗？", "确认", JOptionPane.OK_CANCEL_OPTION);
				if(re == JOptionPane.OK_OPTION){
					try {
	//					Runtime.getRuntime().exec("explorer http://www.baidu.com/");
//						String path = System.getProperty("user.dir");
						String path = new String("D:\\Resources");
						Runtime.getRuntime().exec("explorer "+path+"\\Video\\Shanghai.f4v");
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		});
		button5.addActionListener(this);
		jPanel.setBackground(Color.red);
		jPanel.setBounds(0, 0, 240, 600);
		jp1.setBounds(240, 0, 1040, 600);
		jPanel.setLayout(new FlowLayout(FlowLayout.CENTER,2,30));
		pane1.add(jPanel);
		pane1.add(jp1);
		jf.setSize(1280, 700);
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);
		jf.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
			String string=e.getActionCommand();
			if("1".equals(string)) cl.show(jp1,"1");
			if("2".equals(string)) cl.show(jp1,"2");
			if("3".equals(string)) cl.show(jp1,"3");
			if("5".equals(string)) cl.show(jp1,"5");	
	}

}

