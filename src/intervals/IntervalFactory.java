package intervals;


public class IntervalFactory {
     private IntervalBothOpened intervalBothOpened;
     private IntervalLeftOpened intervalleftOpened;
     private IntervalRightOpened intervalRightOpened;
     private IntervalUnopened intervalUnopened;
     public static Interval interval=null;
	public static Interval getInterval(double minimum, double maximum, Opening opening) {
		
		switch (opening) {
		case BOTH_OPENED:
			  if(interval==null)
			  interval= new IntervalBothOpened();
			   break;
         case LEFT_OPENED:
        	 if(interval==null)
        	  interval=new IntervalLeftOpened();
        	 break;
         case RIGHT_OPENED:
        	 if(interval==null)
       	        interval = new IntervalRightOpened();
       	     break;
         case UNOPENED:
        	 if(interval==null)
          	 interval = new IntervalUnopened(); 	   
			break;
		default:
			break;
		}
		interval.setMin(minimun);
		interval.setMax(maximun);
		
	return interval;
	}
	
	
}
