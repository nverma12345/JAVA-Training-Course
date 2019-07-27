class testex5{
static void div(int a,int b){
System.out.println(a1/a2);

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
div(a1,a2);





}

}