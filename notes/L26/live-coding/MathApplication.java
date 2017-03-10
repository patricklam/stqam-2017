public class MathApplication {
  private CalculatorService calculatorService;

  public void setCalculatorService(CalculatorService calculatorService) {
    this.calculatorService = calculatorService;
  }

  public double add(double x, double y) {
    return calculatorService.add(x, y);
  }
  public double subtract(double x, double y) {
    return calculatorService.subtract(x, y);
  }
}
