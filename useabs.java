//abstarct class
abstract class abs1{
void div(int a,int b){
System.out.println(a/b);
}
abstract void add(int a,int b);
abstract void sub(int a,int b);
}

class useabs extends abs1{

void add(int a,int b){
System.out.println(a+b);

}
public  void sub(int a,int b){
System.out.println(a-b);
} 
public static void main(String arg[]){

abs1 a1=new useabs();
a1.add(12,23);
a1.sub(23,2);
}
}

//public,protected,private and no modifier is package friendly called as default
//abstarct class can have both complete method and abstarct method
//need not have abstarct method too
//but a class if has an abstract method must be declared as abstarct class 