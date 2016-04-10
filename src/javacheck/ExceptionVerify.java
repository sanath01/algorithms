package javacheck;

/**
 * Created by muppallav
 */
public class ExceptionVerify {

    public static void main(String[] args) {
        ExceptionVerify exceptionVerify = new ExceptionVerify();
        exceptionVerify.handleException();
    }

    public void handleException() {
        try {
            callExceptionMethod();
        } catch (Exception e) {
            System.out.println("Exception is Handled: " + e);
        }
    }

    public void callExceptionMethod() {
        String s = null;
        s.equals("Causing Exception intentinally");
    }
}
