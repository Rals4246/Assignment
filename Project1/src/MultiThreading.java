import java.util.*;
import java.io.*;
public class MultiThreading implements Runnable {
   private Thread t;
   private String threadName;
   
   MultiThreading( String name) {
      threadName = name;
      System.out.println(threadName );
   }
      /*try {
         for(int i = 4; i > 0; i--) {
            System.out.println("Thread: " + threadName + ", " + i);
            Thread.sleep(50);
         }
      } catch (InterruptedException e) {
         System.out.println("Thread " +  threadName + " interrupted.");
      }*/
      
   
   
   public void start () {
      System.out.println("Starting " +  threadName );
      if (t == null) {
         t = new Thread (this, threadName);
         t.start ();
      }
   }

@Override
public void run() {
	// TODO Auto-generated method stub
	
}
}


