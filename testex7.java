import java.io.*;
class testex7{
static void div(int a,int b){
try{
System.out.println(a/b);
}catch(Exception e)
{ System.out.println("div()  error ");
throw e;
}
}


public static void main(String a[]){
int a1=0;
int a2=0;
try{
String s1=a[0];

String s2=a[1];

a1=Integer.parseInt(s1);
 a2=Integer.parseInt(s2);
System.out.println(a1+a2);
//System.out.println(a1/a2);
}catch(ArrayIndexOutOfBoundsException e){

System.out.println("please enter 2 non zero numbers");
System.out.println(e);
}

//System.out.println(a1/a2);
try{
div(a1,a2);
}catch(ArithmeticException ee){
System.out.println("main()  error "+ee);

try{
FileOutputStream fos=new FileOutputStream("mylog.txt");
String s1=ee.toString();// +""
byte[] b1=s1.getBytes();
fos.write(b1);
}catch(IOException e){


}

}





}

}