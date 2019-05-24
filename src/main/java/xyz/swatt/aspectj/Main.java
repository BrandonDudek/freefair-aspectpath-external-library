package xyz.swatt.aspectj;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xyz.swatt.log.LogMethods;

@LogMethods // AspectJ Annotion in the SWATT library.
public class Main {
	
	private static final Logger LOGGER = LogManager.getLogger(Main.class);
	
	public static void main(String[] args) {
		LOGGER.trace("Middle");
	}
}
