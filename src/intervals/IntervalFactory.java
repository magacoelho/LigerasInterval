package intervals;


public class IntervalFactory {
     private static  IntervalBothOpened intervalBothOpened;
     private static IntervalLeftOpened intervalleftOpened;
     private static IntervalRightOpened intervalRightOpened;
     private static IntervalUnopened intervalUnopened;
     public static Interval interval=null;
	public static Interval getInterval(double minimum, double maximum, Opening opening) {
		
		switch (opening) {
		case BOTH_OPENED:
			  if(intervalBothOpened==null)
			  interval= new IntervalBothOpened();
			   break;
         case LEFT_OPENED:
        	 if(intervalleftOpened==null)
        	  interval=new IntervalLeftOpened();
        	 break;
         case RIGHT_OPENED:
        	 if(intervalRightOpened==null)
       	        interval = new IntervalRightOpened();
       	     break;
         case UNOPENED:
        	 if(intervalUnopened==null)
          	 interval = new IntervalUnopened(); 	   
			break;
		default:
			break;
		}
		interval.setMin(new Double(minimum));
		interval.setMax(new Double(maximum));
		
	return interval;
	}
	
	
}
