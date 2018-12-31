import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;


@SuppressWarnings("rawtypes")
	public class IsLongerThan extends BaseMatcher {

	private int minLen = 0;
	
      public void describeTo(Description description) { 
        description.appendText("length is greater or equal than " + minLen); 
      }

      protected IsLongerThan(int len) { this.minLen = len; };
      
      @Factory 
      public static Matcher isLongerThan(int len) { 
        return new IsLongerThan(len); 
      }

		@Override
		public boolean matches(Object s) {
	        return ((String)s).length() >= minLen; 
		}
}
