package com.cc.java;

public class App {
    
    public static void main(String[] args) {

       // Worker worker = new Worker();
       // Queen queen = new Queen();
       // Drone drone = new Drone();

        HoneyBee worker = new Worker();
        HoneyBee queen = new Queen();
        HoneyBee drone = new Drone();


        output(worker.doYourJob());
        output(queen.doYourJob());
        output(drone.doYourJob());

        HoneyBee be = new HoneyBee();
        

        output("-------------------------");

        output(worker.fly());
        output(queen.fly());
        output(drone.fly());
        output(be.doYourJob());
     
    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

