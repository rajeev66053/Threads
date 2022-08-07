
public class JoinMethodExample extends Thread{  
	public void run(){  
		for(int i=1;i<=5;i++){  
			try{  
				Thread.sleep(500);  
			}catch(Exception e){System.out.println(e);}  
			System.out.println(i);  
		}  
	}  
	public static void main(String args[]){  
		JoinMethodExample t1=new JoinMethodExample();  
		JoinMethodExample t2=new JoinMethodExample();  
		JoinMethodExample t3=new JoinMethodExample();  
		t1.start();
		try{  
//			t1.join();  
			 t1.join(1500);
		}catch(Exception e){System.out.println(e);}  
		 
		t2.start();
		t3.start();  
	}  
}  