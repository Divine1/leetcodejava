public class BasicThreadMain {


    static class Bird extends Thread{

        public void run(){
            System.out.println("in Bird "+Thread.currentThread().getName());
        }
    }
    static class Animal implements Runnable{
        @Override
        public void run(){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("in Animal "+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(new Animal());
        t1.start();
        //t1.setPriority(Thread.NORM_PRIORITY);
        t1.setName("Animalt");
        System.out.println("in Main thread "+Thread.currentThread().getName());
        Bird b = new Bird();
        b.start();
        b.setPriority(10);

    }
}
