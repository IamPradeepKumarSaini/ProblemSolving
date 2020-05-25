import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executer {

    public static  void main (String[]  args){
        // create a pool
        ExecutorService service = Executors.newFixedThreadPool(5);
        // submit the task for exceution
        for(int i=0; i<10;i++) {
            service.execute(new Task());
        }
        service.shutdown();
    }

    static class Task implements Runnable{
        public void run() {
            System.out.println("Thread Name :"+ Thread.currentThread().getName());
        }
    }
}


