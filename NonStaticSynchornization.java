class Table1{  
	synchronized void printTable(int n){//synchronized method  
		for(int i=1;i<=5;i++){  
			System.out.println(n*i);  
			try{  
				Thread.sleep(400);  
			}catch(Exception e){System.out.println(e);}  
		}  

	}  
}  

class MThread1 extends Thread{  
	Table1 t;  
	MThread1(Table1 t){  
		this.t=t;  
	}  
	public void run(){  
		t.printTable(5);  
	}  

}  
class MThread2 extends Thread{  
	Table1 t;  
	MThread2(Table1 t){  
		this.t=t;  
	}  
	public void run(){  
		t.printTable(100);  
	}  
}  

public class NonStaticSynchornization{  
	public static void main(String args[]){  
		Table1 obj = new Table1();//only one object  
		MThread1 t1=new MThread1(obj);  
		MThread2 t2=new MThread2(obj);  
		t1.start();  
		t2.start();  
	}  
}