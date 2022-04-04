class A{
	int x;
	int y;
	A(){
		x=5;
		y=10;
	}
	A(int x, int y){
			this.x=x;
			this.y=y;
	}
}
class Cons{
		public static void main(String args[]){
		A ob1=new A();
		A ob2=new A(4,8);

		System.out.println(ob1.x+":"+ob1.y);
		System.out.println(ob2.x+":"+ob2.y);
		}
	}
 