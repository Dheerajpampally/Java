class Box{
		double width;
		double height;
		double depth;
	}
class BoxDemo{
		public static void main(String args[]){
			double vol;
			Box mybox1=new Box();
			Box mybox2=new Box();
			mybox1.width=5;
			mybox1.height=8;
			mybox1.depth=5;
			mybox2.width=6;
			mybox2.height=6;
			mybox2.depth=8;
			vol=mybox1.width*mybox1.height*mybox1.depth;
			System.out.println("volume of first "+vol);
			vol=mybox2.width*mybox2.height*mybox2.depth;
			System.out.println("volume of Second "+vol);
		}
	}	
			
			
	