class testth1 extends Thread{

public void run(){
System.out.println(Thread.currentThread().getName());
}
public static void main(String ar[]){

testth1 tt1=new testth1();
tt1.start();
testth1 tt2=new testth1();
tt2.start();

}
}