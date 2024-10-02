package Framework;

import org.testng.asserts.SoftAssert;

public class AssertFunction extends DriverInit {
	
	public SoftAssert uassert = new SoftAssert ();
	
	public void AssertValue (String ExpectedValue, String ActualValue) {
		uassert.assertEquals(ExpectedValue,ActualValue );
	
	}
	public void AssertValue (int ExpectedValue,int ActualValue, String message ) {
		uassert.assertEquals(ExpectedValue ,ActualValue );
	}
	public void AssertValue (float ExpectedValue,float ActualValue ) {
		uassert.assertEquals(ExpectedValue ,ActualValue );
	}
	public void AssertValue (char ExpectedValue,char ActualValue ) {
		uassert.assertEquals(ExpectedValue ,ActualValue );
	}
	public void AssertValues(Object ExpectedValue, Object ActualValue) {
		uassert.assertEquals(ExpectedValue, ActualValue);
	}

	
	public void AssertValues(String ExpectedValue, String ActualValue) {
		uassert.assertEquals(ExpectedValue, ActualValue);
	
}
}