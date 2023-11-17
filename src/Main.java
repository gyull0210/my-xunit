import java.lang.reflect.InvocationTargetException;

public class Main {
  
  public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException {
    TestCaseTest testCaseTest = new TestCaseTest("testRunning");
    testCaseTest.run();
  }
}
