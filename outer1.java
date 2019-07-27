//static nested class
class outer1{

	static class inner1{

	static void add(int x,int y){
	System.out.println(x+y);
	}
	}

public static void main(String ar[]){
outer1.inner1.add(12,23);

}
}