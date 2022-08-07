class Table  
{     
	synchronized static void printTable(int n){    
		for(int i=1;i<=10;i++){    
			System.out.println(n*i);    
			try{    
				Thread.sleep(400);    
			}catch(Exception e){}    
		}    
	}    
}    
class Thread1 extends Thread{    
	public void run(){    
		Table.printTable(1);    
	}    
}    
class Thread2 extends Thread{    
	public void run(){    
		Table.printTable(10);    
	}    
}    
class Thread3 extends Thread{    
	public void run(){    
		Table.printTable(100);    
	}    
}    
class Thread4 extends Thread{    
	public void run(){    
		Table.printTable(1000);    
	}    
}  
public class StaticSynchronization {
	public static void main(String t[]){  
		//We don't want interference between t1 and t3 or t2 and t4. Static synchronization solves this problem.
		Thread1 t1=new Thread1();    
		Thread2 t2=new Thread2();    
		Thread3 t3=new Thread3();    
		Thread4 t4=new Thread4();    
		t1.start();    
		t2.start();    
		t3.start();    
		t4.start();    
	}    

}
