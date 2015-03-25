package intervals;

public class IntervalLeftOpened extends Interval{

	@Override
	public boolean includes(double value) {
		return value>this.getMin()&& value<=this.getMax();
	}

	@Override
	public boolean includes(Interval interval) {
		// TODO Auto-generated method stub
		return  this.includes(interval.getMin())&&this.includes(interval.getMax());
	}

	@Override
	public boolean intersectsWith(Interval interval) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Interval intersection(Interval interval) {
		// TODO Auto-generated method stub
		return null;
	}

}
