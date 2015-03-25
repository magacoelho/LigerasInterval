package intervals;

public class IntervalBothOpened extends Interval{


	@Override
	public boolean includes(double value) {
		if(value>this.getMin()&& value>this.getMin());
		return false;
	}

	@Override
	public boolean includes(Interval interval) {
		// TODO Auto-generated method stub
		return false;
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
