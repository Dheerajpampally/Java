package Graphics;
import java.awt.*;
public class AwtEg2 {
	AwtEg2(){
		Frame f=new Frame();
		
		Label l=new Label("Employee_id:");
		
		Button b=new Button("Submit");
		
		TextField t=new TextField();
		
		l.setBounds(30,100,100,30);
		b.setBounds(20,150,90,20);
		t.setBounds(100,100,80,30);
		
		f.add(l);
		f.add(b);
		f.add(t);
		
		f.setSize(400,600);
		f.setTitle("Hello");
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AwtEg2 on=new AwtEg2(); 
	}

}
