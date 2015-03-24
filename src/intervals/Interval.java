package intervals;

public abstract  class Interval {
	    private Double  min;
	    private Double max;
	    public Interval() {
			
		}
	    
    
	public Interval(Double min, Double max) {
			super();
			this.min = min;
			this.max = max;
		}
    

	public Double getMin() {
		return min;
	}


	public void setMin(Double min) {
		this.min = min;
	}


	public Double getMax() {
		return max;
	}


	public void setMax(Double max) {
		this.max = max;
	}


	public  double midPoint() {
		
		return (this.max-this.min)/2.0;
	}

	public abstract boolean includes(double value); 
	
	public abstract boolean includes(Interval interval);
	public abstract boolean intersectsWith(Interval interval); 
	public abstract Interval intersection(Interval interval); 

	@Override
	public String toString() {
		//TODO
		return null;
	}

	@Override
	public boolean equals(Object object) {
		//TODO
		return false;
	}
}
