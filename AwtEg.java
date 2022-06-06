package Graphics;
import java.awt.*;
public class AwtEg extends Frame{
	AwtEg(){
		
	
	Button b=new Button("Click Me");
	
	b.setBounds(34,66,150,43);
	
	add(b);
	setSize(1200,1800);
	setTitle("Hello");
	setLayout(null);
	setVisible(true);
	}

	public static void main(String[] args) {
		
		AwtEg ob=new AwtEg();
		
	}

}
