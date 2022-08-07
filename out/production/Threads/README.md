### Threads

* Thread is a lightweight sub process.
* It is the smallest independent unit of a program.
* Contains a seperate path of execution.
* Every Java program contains at least one thread.
* By default we will have a main thread in an application represented by main method.
* A thread is created and controlled by the java.lang.Thread class.
* A java thread can lie only in one of the shown states at any point of time.
* Threads always execute the jobs in sequence.
* start() method internally call the run method in thread.
* Everytime we execute multiple thread application the output sequence is different because all thread are executing parallely.
* We can make the child class of another parent class as thread only by implementing Runnable interface because multiple inheritance is not supported in java by we can implement the interface.
### Thread States


* When we create a thread a state of thread is new.
* Then the thread move into the runnable.
* Then the thread move to running.
* Finally the thread will be terminated.
* In between these state thread can have a waiting state which can iterate between the runnable and running.


* New : A new thread begins its life cycle in this state and remains here until the program starts the thread. It is also known as a born thread.
* Runnable : Once a newly born thread starts, the thread comes under runnable state. A thread stays in this state until it executing its task.
* Running : In this state a thread starts executing by entering run() method and the yeild() method can send them to go back to the Runnable state.
* Waiting : A thread enters this state when it is temporarily in an inactive state i.e it is still alive but is not eligible to run. It can be waiting, sleeping or blocked state.
* Terminated : A runnable threads enter the terminated state when it completes its task or otherwise terminates.


* A thread can be created using two ways:
	1. Thread Class
	```
	Public class Thread extends Object implements Runnable
	```
	2. Runnable Interface

	```
	public interface Runnable
	```
 
* Creating thread using Thread Class:
	1. Create a Thread Class.
	2. Override run() method.
	3. Create object of the class.
	4. Invoke start() method to execute the custom thread run().
	

```
	Public class MyThread extends Thread{
		public void run(){
			System.out.println("Thread using Thread Class");
		}
		
		public static void main(String[] args){
			MyThread obj= new MyThread();
			obj.start();
		}
	}
```


* Creating thread using Runnable Interface:
	1. Create a Thread Class implementing Runnable Interface.
	2. Override run() method.
	3. Create object of the custom class implementing runnable.
	4. Create the object of the Thread Class and pass Object of the custom class implementing runnable.
	4. Invoke start() method using object to execute the custom thread run().


```
	Public class MyThread implements Runnable{
		public void run(){
			System.out.println("Thread using Runnable Interface");
		}
		
		public static void main(String[] args){
			MyThread obj= new MyThread();
			Thread t= new Thread(obj);
			obj.start();
		}
	}
```