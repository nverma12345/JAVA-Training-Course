//inner class or nesteed class
//inner class can access outer class variables
//but outer class cannot access inner class variable
//inner class can be private but a class cannot be
class outer{
int x=100;
void callinner(){
inner i1=new inner();
i1.add(12,20);

}
	private class inner{
		void add(int a,int b){

		System.out.println(a+b);
		}
	}
public static void main(String ar[]){

outer o1=new outer();
o1.callinner();

}
}