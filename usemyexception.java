class usemyexception {

public static void main(String ar[]){

try{

int age=Integer.parseInt(ar[0]);
if(age<17){
throw new myexception("invalid age exception");
}
}
catch(myexception e){
System.out.println(e);
}}
}