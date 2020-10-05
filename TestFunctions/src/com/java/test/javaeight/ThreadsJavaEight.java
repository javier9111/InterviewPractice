package com.java.test.javaeight;

public class ThreadsJavaEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable runnable = new Runnable(){

			@Override
			public void run() {

			for (int i = 0; i <3; i++){
				
				System.out.println("hello thread["+Thread.currentThread().getName()+"]");
			}
				
			}
			
			
		};
		
		Runnable runnableLambda = () -> {
							for (int i = 0; i <3; i++){	
						System.out.println("hello thread["+Thread.currentThread().getName()+"]");
								}
							};
		
		Thread t = new Thread(runnableLambda);
		
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
