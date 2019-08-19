package Session8.Assignment2;

import java.util.Scanner;

public class primeMian {

	public static void main(String[] args) {
		int x;



		Scanner sc = new Scanner (System.in);
		System.out.print("Please enter a number: ");
		x = sc.nextInt();

		primeThread pt = new primeThread(x);	
		primeThreadRun ptR = new primeThreadRun(x);
		Thread t = new Thread(ptR);
		
		
		
		System.out.println("Prime Runnable Thread:");
		System.out.print(x+ " ");
		pt.start();

		synchronized(pt){
			try {
				pt.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		synchronized(pt){
			try {
				pt.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Prime Thread:");
		System.out.print(x+ " ");
		t.start();

	}
}
