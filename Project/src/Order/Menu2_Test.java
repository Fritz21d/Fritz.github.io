package Order;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Menu2_Test extends JFrame implements ActionListener{
	protected static int i;
	private JPanel pan = new JPanel();
	public JButton Menu = new JButton("飲料");
	public JButton Shop = new JButton("購物清單");
	public JButton Checkout = new JButton("結帳");
	String[] dri={"蘋果牛奶","木瓜牛奶","香蕉牛奶","甘寧涼青","奇異果綠"};
	public JButton drink1 = new JButton(dri[0]);
	public JButton drink2 = new JButton(dri[1]);
	public JButton drink3 = new JButton(dri[2]);

	public int Sum=0;
	int[] mo= {50,55,50,70,75};
	int[] qu= {0,0,0,0,0};
	int[] su=new int[dri.length];
	
	public Menu2_Test(){
			
		Font font = new Font("宋体", Font.BOLD, 12);
	    super.setTitle("歡迎您的光臨");
	    pan.setLayout(null);
	     
	    Menu.setBounds(20,20,90,20);
	    Shop.setBounds(20,60,90,20);
	    Checkout.setBounds(20,100,90,20);
	    
	    Menu.setFont(font);
	    Shop.setFont(font);
	    Checkout.setFont(font);
	     
	    pan.add(Menu);
	    pan.add(Shop);
	    pan.add(Checkout);
	     
	    Menu.addActionListener(this);
	    Shop.addActionListener(this);
	    Checkout.addActionListener(this);
	     
	    super.add(pan);
	    super.setSize(300, 500);
	    super.setVisible(true);
	}
	public void Menu() {
		
		JFrame frame1 = new JFrame("請選擇飲料");
		frame1.setSize(250, 400);
		JPanel pan2 = new JPanel();
		Font font = new Font("宋体", Font.BOLD, 12);
	    pan2.setLayout(null);
	    JButton drink[]=new JButton[dri.length];
	    int j=0;
	    for(int i=0;i<dri.length;i++) {    	
	    	drink[i]=new JButton(dri[i]+" 價格:"+mo[i]);    	
	    	drink[i].setBounds(20,20+j,130,20);
	    	j+=40;
	    	drink[i].setFont(font);
	    	pan2.add(drink[i]);
	    	
	    }
	    
		frame1.add(pan2);
        frame1.setVisible(true);
        
        drink[0].addActionListener(new ActionListener() {
				@Override
			public void actionPerformed(ActionEvent e) {
				price(dri[0],mo[0]);
				frame1.setVisible(false);				
			}			
		});
        drink[1].addActionListener(new ActionListener() {
        		@Override
        	public void actionPerformed(ActionEvent e) {
        		price(dri[1],mo[1]);
        		frame1.setVisible(false);				
        	}			
        });
        drink[2].addActionListener(new ActionListener() {
        		@Override
        	public void actionPerformed(ActionEvent e) {
        			price(dri[2],mo[2]);
        			frame1.setVisible(false);				
       		}			
        });
        drink[3].addActionListener(new ActionListener() {
        	@Override
			public void actionPerformed(ActionEvent e) {
        		price(dri[3],mo[3]);
        		frame1.setVisible(false);				
        	}			
        });
        drink[4].addActionListener(new ActionListener() {
        		@Override
			public void actionPerformed(ActionEvent e) {
				price(dri[4],mo[4]);
				frame1.setVisible(false);				
			}			
        });
	}
	
	public void price(String drink,int money) {
		JFrame frame2 = new JFrame("請輸入數量");
		frame2.setSize(250,150);
		JPanel pan3=new JPanel();
		pan3.setLayout(null);
		JLabel Quantity = new JLabel("數量");
		JTextField Quantity1 = new JTextField("1");
		JButton Ok = new JButton("確認");		
		
		Quantity.setBounds(50,20,30,40);
		Quantity1.setBounds(80,20,40,40);
		Ok.setBounds(120,20,60,40);
		
		pan3.add(Quantity);
		pan3.add(Quantity1);
		pan3.add(Ok);
		
		frame2.add(pan3);
		frame2.setVisible(true);
		
		Ok.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				int pri;
				pri=Integer.parseInt(Quantity1.getText());
				System.out.println(pri);
				Sum+=money*pri;	
				
				for(int i=0;i<dri.length;i++) {
					if(drink==dri[i]) {
						qu[i]+=pri;
						su[i]=qu[i]*mo[i];						
					}			
				}
							
				frame2.setVisible(false);
			}
		});
	}
	
	public void Shop() {
		
		JFrame frame3 = new JFrame("購物清單");
		frame3.setSize(300,300);
		JPanel pan4=new JPanel();
		pan4.setLayout(null);
		int L=dri.length;	
		JLabel name[]=new JLabel[L];
		JLabel Quantity[]=new JLabel[L];
		JLabel price[]=new JLabel[L];
		JLabel summ=new JLabel();
		int j=0;

		for(int i=0;i<dri.length;i++) {
			if(qu[i]>0) {
				name[i]=new JLabel("飲料名稱:"+dri[i]);
				Quantity[i]=new JLabel("數量:"+qu[i]);
				price[i]=new JLabel("價錢:"+su[i]);
				
				name[i].setBounds(20,30+j,130,40);
				Quantity[i].setBounds(150,30+j,50,40);
				price[i].setBounds(190,30+j,50,40);
				
				j+=40;
				
				pan4.add(name[i]);
				pan4.add(Quantity[i]);
				pan4.add(price[i]);
			}
		}
		
		j+=40;
		
		summ.setText("總價:"+Sum);
		summ.setBounds(20,30+j,130,40);
		pan4.add(summ);
		
		clo.setBounds(20,30+j+40,130,40);
		pan4.add(clo);
		
		frame3.add(pan4);
		frame3.setVisible(true);
		
		clo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame3.setVisible(false);			
			}	
		});
		
	}

	public void Checkout() {
		
		JFrame frame4 = new JFrame("確認");
		frame4.setSize(100,40); 
		JPanel pan5 = new JPanel();
		pan5.setLayout(null);

		
		
		clo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<dri.length;i++) {
					qu[i]=0;
					su[i]=0;
					Sum=0;
				}
				frame4.setVisible(false);			
			}	
		});
		
		frame4.add(pan5);
		frame4.setVisible(true);
				
	}

	public static void main(String[] args) {
		new Menu2_Test();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Menu) {
			Menu();
		}else if(e.getSource()==Shop) {
			Shop();
		}else if(e.getSource()==Checkout) {
			Checkout();
		}
		
	}

}
