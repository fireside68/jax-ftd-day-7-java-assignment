package com.cooksys.butterpillar.model.impl;

import com.cooksys.butterpillar.model.*;

public class Butterpillar implements IButterpillar {
	private double length;
	private double leavesEaten;

	public Butterpillar() {
		super();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(leavesEaten);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(length);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Butterpillar other = (Butterpillar) obj;
		if (Double.doubleToLongBits(leavesEaten) != Double.doubleToLongBits(other.leavesEaten))
			return false;
		if (Double.doubleToLongBits(length) != Double.doubleToLongBits(other.length))
			return false;
		return true;
	}


	@Override
	public int compareTo(IButterpillar o) {
		if(o.getLength() < this.length) {
			return +1;
		}else if(o.getLength() > this.length){
			return -1;
		}else if(o.getLeavesEaten() < this.getLeavesEaten()){
		return +1;
		}else if(o.getLeavesEaten() > this.getLeavesEaten()){
			return -1;
		}else		
		return 0;
	}

	@Override
	public void setLength(double length) {
		this.length = length;
		
	}

	@Override
	public double getLength() {
		return this.length;
	}

	@Override
	public void setLeavesEaten(double leavesEaten) {
		this.leavesEaten = leavesEaten;
		
	}

	@Override
	public double getLeavesEaten() {
		return leavesEaten;
	}

	@Override
	public String toString() {
		return "Butterpillar [length = " + length + ", leavesEaten = " + leavesEaten + "]";
	}

	
	
	

}
