//****************************************************************************************
//	Author: Breno Silva		Last Modified: 03/15/14			Project 13.5
//
//	CSC*E224				Programming Assignment IV		Problem 1
//****************************************************************************************

/*
 * TODO Make so costumers arrive while others are being attended by the cashier.
 */

package edu.housatonic.www.assignment4.problem1;

import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class Bank {

	final static int MAX = 10;
	Queue<Costumer> queue;
	
	// Constructor
	public Bank(){
		queue = new ArrayBlockingQueue<Costumer>(MAX, true);
	}
	
	
	
	// Simulates the queue in a bank
	public void costumersLine(){
		int time = 0;
		
		// Add costumers to the queue
		for(int i = 0; i < MAX; i++){
			waitTime(5);
			this.queue.offer(new Costumer("Costumer " + i, i));
			
			System.out.println("Costumer " + i + " Arrived at the bank");
		}
		
		System.out.println("__________________________________");
		
		// Removes Costumers from the queue
		for(int i = 0; i < MAX; i++){
			this.queue.offer(new Costumer("Costumer " + i, i));
			
			
			time += waitTime(10);
					
			queue.peek().setWaitTime(time);
			
			System.out.println(queue.peek().getName() + " Please attend to the cashier. Wait time: " + queue.peek().getWaitTime());
			queue.poll();
			
		}

	}
	
	
	// Creates a random number with a max parameter
	public int makeRand(int max){
		Random rand = new Random();
		int foo = rand.nextInt(max)+1;
		
		return foo;
	}
	
	// Simulates the waiting time in queue
	public int waitTime(int time){
		
		int sleepTime = makeRand(time) * 200;
		
		try {
		    Thread.sleep(sleepTime);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		
		return sleepTime;
	}
	

}
