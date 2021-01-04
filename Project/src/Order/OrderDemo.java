package Order;

//功能表是由以下類別組成
import java.awt.*;
import java.awt.event.*;

public class FrameDemo extends Frame implements ActionListener {
	
	static FrameDemo frm=new FrameDemo() ;
	//for (int i=1; i<=3;i++)
	//frm.add(new Button (Integer.toString(i)));
	static MenuBar mb = new MenuBar();
	static Menu mu1 = new Menu("Stlye");
	static Menu mu2 = new Menu("Exit");
	static MenuItem mi1 = new MenuItem("Plane");
	static MenuItem mi2 = new MenuItem("BBBB");
	static MenuItem mi3 = new MenuItem("YYYY");
	static MenuItem mi4 = new MenuItem("SSSS");

	static Button btn1 = new Button("Yellow");//8-10視窗上出現的元件上文字
	static Button btn2 = new Button("Green");
	static Button btn3 = new Button("Pink");
	static Button btn4 = new Button("Red");
	static Button btn5 = new Button("RRR");
	static Button btn6 = new Button("Red");
	static Button btn7 = new Button("Red");
	static Button btn8 = new Button("Red");

	
	public static void main(String args []) {
		
		btn1.addActionListener(frm);//事件傾聽者farm向btn註冊,才有實際功用
		btn2.addActionListener(frm);
		btn3.addActionListener(frm);
		btn4.addActionListener(frm);
		btn5.addActionListener(frm);
		btn6.addActionListener(frm);
		btn7.addActionListener(frm);
		btn8.addActionListener(frm);
		
		
		frm.setBounds(50,50,200,200);
		frm.setTitle("Menu Title");// 視窗名稱
		mb.add(mu1);
		mb.add(mu2);
		mu1.add(mi1);// have 7 frm.add()
		mu1.add(mi2);
		mu1.add(mi3);
		mu2.add(mi4);
		

		mi1.addActionListener(frm);//為功能鍵增加功能反饋
		mi2.addActionListener(frm);
		mi3.addActionListener(frm);
		mi4.addActionListener(frm);
		
		
		frm.setMenuBar(mb);
		frm.setSize(500, 500);
		frm.setVisible(true);// 視窗會不會顯示
		frm.setLayout(new FlowLayout(FlowLayout.LEFT));
		frm.setSize(500,500);
		frm.add(btn1);//對應上面NEW的原件,幾個就要做幾個
		frm.add(btn2);
		frm.add(btn3);
		frm.add(btn4);
		frm.add(btn5);
		frm.add(btn6);
		frm.add(btn7);
		frm.add(btn8);

		frm.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Button btn = (Button)e.getSource();//這是一個轉型
		if(btn==btn1) 
			frm.setBackground(Color.pink);//實際執行顏色
		else if(btn==btn2) 	
			frm.setBackground(Color.green);
		else if(btn==btn3)
			frm.setBackground(Color.yellow);
		else
			System.exit(0);
		
		frm.addWindowListener(new WindowAdapter() {// 關閉視窗
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}


  

