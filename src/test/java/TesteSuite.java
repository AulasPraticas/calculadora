import junit.framework.JUnit4TestAdapter;
import org.junit.runner.RunWith;
import calculadora.TesteCalculadora;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({TesteCalculadora.class})

public class TesteSuite {
    public static junit.framework.Test suite(){
        return new JUnit4TestAdapter(TesteSuite.class);
    }
}