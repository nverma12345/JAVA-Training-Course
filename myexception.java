class myexception extends Exception{
String myex;
myexception(String ex){

this.myex=ex;
System.out.println("myexception occured"+this.myex);
}
public String toString(){

return " this is an instance of myexcption "+this.myex;
}
}