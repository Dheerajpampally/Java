package Graphics;
import java.awt.*;
import java.awt.event.*;
public class ALarg extends Frame {
	TextField t1;
	TextField t2;
	TextField t3;
	TextField t4;
	Label l1,l2,l3,l4;
	Button b,b1;
	
	ALarg(){
		
		t1=new TextField();
		l1=new Label("Enter the first number:");
		t1.setBounds(100,75,145,20);
		l1.setBounds(100,45,145,20);
		
		t2=new TextField();
		l2=new Label("Enter the second number:");
		t2.setBounds(100,145,145,20);
		l2.setBounds(100,110,145,20);
		
		t3=new TextField();
		l3=new Label("Enter third number:");
		t3.setBounds(100, 200, 145, 20);
		l3.setBounds(100,170, 145, 20);
		
		t4=new TextField();
		l4=new Label("Result:");
		t4.setBounds(100,240,135,20);
		l4.setBounds(100,140,145,20);
		
		b=new Button("Find");
		b.setBounds(105,278,70,40);
		
		b1=new Button("Exit");
		b1.setBounds(195,278,70,40);
		
		add(b);
		add(b1);
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		
		setSize(475,475);
		setVisible(true);
		
		b.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
			
				int a=Integer.parseInt(t1.getText());
				int b=Integer.parseInt(t2.getText());
				int c=Integer.parseInt(t3.getText());
				
				if(a>b&&a>c) {
					l4.setText("Maximum="+String.valueOf(a));
				
				}
				else if(b>c) {
					l4.setText("Maximum="+String.valueOf(b));
					
				}
				else {
					l4.setText("Maximum="+String.valueOf(c));
					}
				
			}
		});
		
		b1.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
	}

	public static void main(String[] args) {
		new ALarg();
		

	}

}
