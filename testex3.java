class testex3{
public static void main(String a[]){

try{
String s1=a[0];

String s2=a[1];

int a1=Integer.parseInt(s1);
int a2=Integer.parseInt(s2);
System.out.println(a1+a2);
System.out.println(a1/a2);
}catch(ArrayIndexOutOfBoundsException e){

System.out.println("please enter 2 non zero numbers");
System.out.println(e);
}

catch(NumberFormatException e){

System.out.println("please enter numbers");
System.out.println(e);
}


}

}