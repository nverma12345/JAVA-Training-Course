//interface upto jdk7
//in interfaces all methods are public abstract by default
//while implementing you must say public
interface inter1{
void add(int a,int b);

}
interface inter2{
void sub(int a ,int b);
}
class useinterface implements inter1,inter2{

public void add(int a,int b){
System.out.println(a+b);
}
protected void sub(int a,int b){

System.out.println(a-b);
}
public static void main(String args[]){
inter1 i1=new useinterface();
inter2 i2=new useinterface();
i1.add(12,23);
i2.sub(12,3);
}
}
