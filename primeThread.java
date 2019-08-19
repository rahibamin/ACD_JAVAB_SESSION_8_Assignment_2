package Session8.Assignment2;

public class primeThread extends Thread {
	
	
private int num;
	
	public primeThread(int num){
		this.num = num;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		boolean isPrime = false;
		synchronized (this) {
			isPrime = true;
			;
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
		notify();
		}
		
		System.out.println(isPrime ? ("is a Prime Number."):("is not a Prime Number."));
	}

}
