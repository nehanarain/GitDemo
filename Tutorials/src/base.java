import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.remote.MobileCapabilityType;

public class base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"nehaaemulator");
		cap.setCapability(MobileCapabilityType.APP, value);
		
	}

}
