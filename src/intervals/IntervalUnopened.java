package intervals;

public class IntervalUnopened extends Interval{

	public IntervalUnopened(double minimum, double maximum) {
		// TODO Auto-generated constructor stub
	}

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
