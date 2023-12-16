import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class InterruptMain {

    static class Sports{
    Semaphore semaphore  = new Semaphore(2);
        Lock lock = new ReentrantLock();
        String game;
        public Sports(String game){
            this.game=game;
        }
        public  String play(){
            try {
                System.out.println("getQueueLength "+semaphore.getQueueLength());
                semaphore.acquire();
                Thread.sleep(3000);
                System.out.println("availablePermits "+semaphore.availablePermits());
                semaphore.release();

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            return game;

        }
    }

    static class My extends Thread{
        Sports sports;
        public My(Sports sports){
            this.sports=sports;
        }
        public  void run(){

            System.out.println(Thread.currentThread().getName()+" in My class - run() invoked - "+sports.play());



        }
    }

    public static void main(String[] args) {
        Sports sport  = new Sports("cricket");

        List<My> list = new ArrayList<>();

        list.add(new My(sport));
        list.add(new My(sport));
        list.add(new My(sport));
        list.add(new My(sport));

        Iterator<My> it= list.iterator();
        while (it.hasNext()){
            My t = it.next();
            t.start();
        }



        System.out.println("end main thread");
    }
}
