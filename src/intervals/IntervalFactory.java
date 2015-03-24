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
			  interval= new IntervalBothOpened(minimum, maximum);
			   break;
         case LEFT_OPENED:
        	 if(interval==null)
        	  interval=new IntervalLeftOpened(minimum, maximum);
        	 break;
         case RIGHT_OPENED:
        	 if(interval==null)
       	        interval = new IntervalRightOpened(minimum, maximum);
       	     break;
         case UNOPENED:
        	 if(interval==null)
          	 interval = new IntervalUnopened(minimum, maximum); 	   
			break;
		default:
			break;
		}
		
	return interval;
	}
	
	
}
