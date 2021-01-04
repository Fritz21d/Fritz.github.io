package Order;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ordering extends JFrame implements ActionListener {
	
		private JPanel pan = new JPanel();
//		private JLabel namelab = new JLabel("帳    號");
//		private JLabel passlab = new JLabel("密    碼");
		private JTextField nametext = new JTextField();
		private JPasswordField passtext = new JPasswordField();

		public JButton menu = new JButton("菜單");
		public JButton Checkout = new JButton("結帳");
		public JButton shoppinglist = new JButton("購物清單");
		public JButton deleteuser = new JButton("刪除用戶");
		
	public Ordering() {	
		Font font = new Font("微軟正黑體", Font.BOLD, 12);
		super.setTitle("歡迎光臨,點餐系統!!");
		pan.setLayout(null);
//		namelab.setBounds(20, 20, 60, 30);
		nametext.setBounds(90, 20, 140, 30);
//		passlab.setBounds(20, 60, 60, 30);
		passtext.setBounds(90, 60, 140, 30);
		menu.setBounds(30, 120, 90, 20);
		Checkout.setBounds(140, 120, 90, 20);
		shoppinglist.setBounds(30, 150, 90, 20);
		deleteuser.setBounds(140, 150, 90, 20);
		
//		pan.add(namelab);
		pan.add(nametext);
//		pan.add(passlab);
		pan.add(passtext);
		pan.add(menu);
		pan.add(Checkout);
		pan.add(shoppinglist);
		pan.add(deleteuser);

		passtext.setFont(font);
		Checkout.setFont(font);
		shoppinglist.setFont(font);
		deleteuser.setFont(font);

		menu.addActionListener(this);
		Checkout.addActionListener(this);
		shoppinglist.addActionListener(this);
		deleteuser.addActionListener(this);

		super.add(pan);
		super.setSize(300, 250);
		super.setVisible(true);
	}
}
