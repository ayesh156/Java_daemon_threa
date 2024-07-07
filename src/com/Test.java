package com;

class UserThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+": "+i);
            
        }
    }
        
}

public class Test {
    public static void main(String[] args){
        
        Thread t1 = new Thread(){
            @Override
            public void run() {
                while (true){
                    
                }
            }  
        };
        t1.setDaemon(true);
        t1.start();
        
        UserThread ut1 = new UserThread();
        ut1.start();
    }
}
