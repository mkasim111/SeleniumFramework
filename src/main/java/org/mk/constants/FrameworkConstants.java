package org.mk.constants;

public final class FrameworkConstants {
	
	private FrameworkConstants() {}
	
	private final static String PATH_REPORT = System.getProperty("user.dir") + "/Results/index.html";

	public static String getPathReport() {
		return PATH_REPORT;
	}

}
