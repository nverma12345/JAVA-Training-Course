//overriding methods not variables

//a class can have only one base class

//dyanamic method despatching

class father{
int age=50;

void dress(){

System.out.println("not updated one ");
}
}
class son extends father{
int age=20;

void dress(){

System.out.println("updated one ");
}
public static void main(String at[]){

father f1=new father();
son s1=new son();
f1.dress();
s1.dress();
father f2=new son();
f2.dress();
System.out.println(f2.age);
}
}
