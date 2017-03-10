import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester {
  private MathApplication mathApplication;
  private CalculatorService calculatorService;

  @Before
  public void setUp() {
    mathApplication = new MathApplication();
    calculatorService = mock(CalculatorService.class);
    mathApplication.setCalculatorService(calculatorService);
  }

  @Test
  public void testAddAndSubtract() {
    when(calculatorService.add(20.0,10.0)).thenReturn(30.0);
    when(calculatorService.subtract(20.0,10.0)).thenReturn(10.0);

    Assert.assertEquals(mathApplication.subtract(20.0,10.0),10.0,0);
    Assert.assertEquals(mathApplication.add(20.0,10.0),30.0,0);

    verify(calculatorService).add(20.0,10.0);
    verify(calculatorService).subtract(20.0,10.0);
  }
}
