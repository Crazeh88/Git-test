package ee.mystudy.test;

public class Worker implements Runnable {


	@Override
	public void run() {
		for(int i = 0; i < 2000; i++){
			Main.increaceNumber();
		}

	}

}
