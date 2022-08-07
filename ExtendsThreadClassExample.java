
public class ExtendsThreadClassExample extends Thread{  
	public void run(){  

		System.out.println("thread is running...");
	}  
	public static void main(String args[]){  
		ExtendsThreadClassExample t1=new ExtendsThreadClassExample();  
		t1.start();  
	}  
}  