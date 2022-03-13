package thispackage;

public class ThisClass1{

int a= 2; // instance or global variable

 public void getData()
 {
int a= 3; // local variable
int b=a+this.a;
System.out.println(a);
System.out.println(this.a);
System.out.println(b);

public static void main(String[] args) {

	ThisClass1 td=new ThisClass1();
td.getData();
}

}
