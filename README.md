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
* Everytime we execute multiple thread application the output sequence is different because all thread are executing parallely by JVM but JVM can give time slicing for each thread.
* We can make the child class of another parent class as thread only by implementing Runnable interface because multiple inheritance is not supported in java by we can implement the interface.
* Daemon Thread is a thread which is going to be executed by the JVM whenever the application start. 
* Multi threading is the ability of a program to run two or more threads concurrently where each thread can handle a different task at the same time making optimal use of the available resources.
* Java threadpool  manages the pool of worker threads and contains a queue the keeps the tasks to get executed.




### Thread States


* When we create a thread a state of thread is new.
* Then the thread move into the runnable.
* Then the thread move to running.
* Finally the thread will be terminated.
* In between these state thread can have a waiting state which can iterate between the runnable and running.


* **New** : A new thread begins its life cycle in this state and remains here until the program starts the thread. It is also known as a born thread.As we use the Thread class to construct a thread entity, the thread is born and is defined as being in the New state. That is, when a thread is created, it enters a new state, but the start() method on the instance has not yet been invoked.
* **Runnable** : Once a newly born thread starts, the thread comes under runnable state. A thread stays in this state until it executing its task. When a new thread's start() function is called, it enters a runnable state.In the runnable environment, the thread is ready for execution and is awaiting the processor's availability (CPU time). That is, the thread has entered the queue (line) of threads waiting for execution.
* **Running** : In this state a thread starts executing by entering run() method and the yeild() method can send them to go back to the Runnable state.Running implies that the processor (CPU) has assigned a time slot to the thread for execution. When a thread from the runnable state is chosen for execution by the thread scheduler, it joins the running state.In the running state, the processor allots time to the thread for execution and runs its run procedure.
* **Waiting** : A thread enters this state when it is temporarily in an inactive state i.e it is still alive but is not eligible to run. It can be waiting, sleeping or blocked state.
* **Terminated** : A runnable threads enter the terminated state when it completes its task or otherwise terminates.When a thread's run() function ends the execution of sentences, it automatically dies or enters the dead state. That is, when a thread exits the run() process, it is terminated or killed. When the stop() function is invoked, a thread will also go dead.


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

* Difference betweeen Thread class and Runnable Interface
	1. Thread
		1. Each Thread creates its unique object.
		2. More memory consumption.
		3. A class extending Thread class can't extend any other class.
		4. Thread class is extended only if there is a need of overriding other methods of it.
		5. Enable tight coupling.
	2. Runnable
		1. Each Thread creates its unique object.
		2. More memory consumption.
		3. A class implementing Runnable can implement other interface.
		4. Runnable is implemented only if there is need of special run method.
		5. Enable loose coupling.