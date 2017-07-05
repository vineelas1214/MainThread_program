
	class WorkerThread implements Runnable{
	    
	    @Override 
	    public void run() { 
	        // get current thread instance
	        Thread t = Thread.currentThread();
	        // call thread.getId() on the current t instance
	        System.out.println("WorkerThread details : Name - "+ t.getName()); 
	        System.out.println("Thread Id of Worker Thread - " + t.getId());
	       
	 
	 }
	}

