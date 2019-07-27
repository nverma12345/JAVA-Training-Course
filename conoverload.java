class conoverload{

String name;
int mark;
conoverload(String sname){

this.name=sname;

System.out.println("1 arg constructor called");
System.out.println(this.name);
}

conoverload(String sname,int smark){

this.name=sname;
this.mark=smark;
System.out.println("2 arg constructor called");
System.out.println(this.name+this.mark);
}

public static void main(String ar[]){
conoverload o1=new conoverload("aaa");
conoverload o2=new conoverload("aaa",99);
System.out.println(o1.name);
System.out.println(o1.age);
System.out.println(o2.name);
System.out.println(o2.age);
}

}