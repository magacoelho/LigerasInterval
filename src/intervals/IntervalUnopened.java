package intervals;

public class IntervalUnopened extends Interval{


	@Override
	public boolean includes(double value) {
		// TODO Auto-generated method stub
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
