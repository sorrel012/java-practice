package com.sorrel012.com;

import java.util.concurrent.atomic.AtomicInteger;

public class BiCounterWithAtomicInteger {
	
	private AtomicInteger i = new AtomicInteger();
	private AtomicInteger j = new AtomicInteger();
	
	
	public void incrementI() {
		i.incrementAndGet();
	}
	
	public void decrementI() {
		i.decrementAndGet();
	}
	
	public int getI() {
		return i.get();
	}

	public void incrementJ() {
		j.incrementAndGet();
	}
	
	public int getJ() {
		return j.get();
	}
	
}