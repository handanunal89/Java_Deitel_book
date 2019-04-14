/**
 *Exercise 11.6 -  UsingExceptions -Stack unwinding
 * 
 * Author: Handan Unal
 * 
 */
package figures.f6;

public class UsingExceptions {

	public static void main(String[] args) {
		try {
			method1();

		} catch (Exception exception) {
			System.err.printf("%s%n%n", exception.getMessage());
			exception.printStackTrace();
			StackTraceElement[] traceElements = exception.getStackTrace();
			System.out.printf("%nStack trace from  getStackTrace %n");
			System.out.println("Class\t\t\t\tFile\t\t\tLine\tMethod");

			for (StackTraceElement element : traceElements) {
				System.out.printf("%s\t", element.getClassName());
				System.out.printf("%s\t", element.getFileName());
				System.out.printf("%s\t", element.getLineNumber());
				System.out.printf("%s%n", element.getMethodName());

			}

		}

	}

	private static void method1() throws Exception {
		// TODO Auto-generated method stub
		method2();
	}

	private static void method2() throws Exception {
		// TODO Auto-generated method stub
		method3();
	}

	private static void method3() throws Exception {
		throw new Exception("Exception thrown in the method3");

	}

}
