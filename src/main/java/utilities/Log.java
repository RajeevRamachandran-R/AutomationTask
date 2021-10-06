package utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

	public class Log {

		private static boolean root=false;
		
		public static Logger getLogger(String cls){
			if(root){
				return Logger.getLogger(cls);
			}
			PropertyConfigurator.configure(System.getProperty("user.dir")+"/src/main/resources/log4j2.properties");
			root = true;
			return Logger.getLogger(cls);
		}	

		public static String getCallInfo() {
			String callInfo;
			String className = Thread.currentThread().getStackTrace()[3].getClassName();
			String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
			int lineNumber = Thread.currentThread().getStackTrace()[3].getLineNumber();

			callInfo = className + ":" + methodName + " " + lineNumber+ " ::  ";
			return callInfo;
		}
		
		public static void trace(Object message) {
			getLogger(Thread.currentThread().getStackTrace()[3].getClassName()).trace(message);
		}

		public static void trace(Object message, Throwable t) {
			getLogger(Thread.currentThread().getStackTrace()[3].getClassName()).trace(message, t);
		}

		public static void debug(Object message) {
			getLogger(Thread.currentThread().getStackTrace()[3].getClassName()).debug(getCallInfo() + message);
		}

		public static void debug(Object message, Throwable t) {
			getLogger(Thread.currentThread().getStackTrace()[3].getClassName()).debug(getCallInfo() + message, t);
		}

		public static void error(Object message) {
			getLogger(Thread.currentThread().getStackTrace()[3].getClassName()).error(getCallInfo() + message);
		}

		public static void error(Object message, Throwable t) {
			getLogger(Thread.currentThread().getStackTrace()[3].getClassName()).error(getCallInfo() + message, t);
		}

		public static void fatal(Object message) {
			getLogger(Thread.currentThread().getStackTrace()[3].getClassName()).fatal(getCallInfo() + message);
		}

		public static void fatal(Object message, Throwable t) {
			getLogger(Thread.currentThread().getStackTrace()[3].getClassName()).fatal(getCallInfo() + message, t);
		}

		public static void info(Object message) {
			getLogger(Thread.currentThread().getStackTrace()[3].getClassName()).info(getCallInfo() + message);
		}

		public static void info(Object message, Throwable t) {
			getLogger(Thread.currentThread().getStackTrace()[3].getClassName()).info(getCallInfo() + message, t);
		}

		public static void warn(Object message) {
			getLogger(Thread.currentThread().getStackTrace()[3].getClassName()).warn(getCallInfo() + message);
		}

		public static void warn(Object message, Throwable t) {
			getLogger(Thread.currentThread().getStackTrace()[3].getClassName()).warn(getCallInfo() + message, t);
		}
				
}
