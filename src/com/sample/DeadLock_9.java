package com.sample;

public class DeadLock_9 {

	public static void main(String[] args) {
		DeadLock_9 d = new DeadLock_9();

		final First a = d.new First();
		final Second b = d.new Second();
		final Third c = d.new Third();

		// Thread-1
		Runnable r1 = new Runnable() {
			public void run() {
				synchronized (b) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (a) {
						System.out.println("In First block "+a.getI());
					}
				}
			}
		};

		// Thread-2
		Runnable r2 = new Runnable() {
			public void run() {
				synchronized (b) {
					synchronized (a) {
						System.out.println("In Second block " +b.getI());
					}
				}
			}
		};

		// Thread-3
		Runnable r3 = new Runnable() {
			public void run() {
				synchronized (c) {
					synchronized (b) {
						System.out.println("In Third block " +c.getI());
					}
				}
			}
		};
		
		new Thread(r1).start();
		new Thread(r2).start();
		new Thread(r3).start();
	}

	// Resource First
	private class First {
		private int i = 20;

		public int getI() {
			return i;
		}
	}

	// Resource Second
	private class Second {
		private int i = 15;

		public int getI() {
			return i;
		}

	}

	// Resource Third
	private class Third {
		private int i = 30;

		public int getI() {
			return i;
		}
	}

}