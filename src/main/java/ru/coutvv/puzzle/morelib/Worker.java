package ru.coutvv.puzzle.morelib;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Я чего-то вообще не смекаю, что тут происходит =( надо конкарренси подтянуть
 * 
 * why   ? 
 * fix	 ?   
 *
 * moral : 
 * 			-
 *   
 * @author coutvv
 */
public class Worker extends Thread {

	private volatile boolean quittingTime = false;
	
	public void run() {
		while(!quittingTime) 
			pretendsToWork();
		System.out.println("Beer is good");
	}
	
	private void pretendsToWork() {
		try {
			Thread.sleep(300);
		} catch (Exception e) {
		}
	}
	
	synchronized void quit() throws InterruptedException {
		quittingTime = true;
	}
	
	synchronized void keepWorking() {
		quittingTime = false;
	}
	
	public static void main(String[] args) throws InterruptedException {
		final Worker worker = new Worker();
		worker.start();
		
		Timer t = new Timer(true);
		t.schedule(new TimerTask() {
			public void run() {worker.keepWorking();}
		}, 500);
		
		Thread.sleep(400);
		worker.quit();
	}
}
