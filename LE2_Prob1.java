class Mother
{
    int x;
    void show(){
        System.out.println("Inside show()");
    }
	
}
class Child extends Mother
{
    //Empty
}
public class Main
{
    public static void main(String args[]){
        Mother m = new Mother();
        m.show();
        Child ch = new Child();
        ch.show();
    }
}