
public class DirectlyCallRunMethod extends Thread{  
	public void run(){  
		for(int i=1;i<5;i++){  
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){
				System.out.println(e);
			}
			System.out.println(i);  
		}  
	}  
	public static void main(String args[]){  
		DirectlyCallRunMethod t1=new DirectlyCallRunMethod();  
		DirectlyCallRunMethod t2=new DirectlyCallRunMethod();  

		//context-switching
//		t1.start();
//		t2.start();
		
		//no context-switching
		t1.run();
		t2.run();
	}  
}  