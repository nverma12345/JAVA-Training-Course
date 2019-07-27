//overloading
class testoverload{

static void add(int a){
a++;
System.out.println(a);
}
static void add(int a,int b){
a++;
System.out.println(a);
}
public static void main(String ar[]){
add(1);
add(1,2);
}
}