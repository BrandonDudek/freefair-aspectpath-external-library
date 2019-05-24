package xyz.swatt.aspectj;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import xyz.swatt.log.LogMethods;

@LogMethods // AspectJ Annotion in the SWATT library.
public class Tests {
	private static final Logger LOGGER = LogManager.getLogger(Tests.class);
	
	@Test
	public void test() {
		LOGGER.info("Pass");
	}
}
