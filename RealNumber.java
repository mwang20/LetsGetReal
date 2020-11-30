import java.lang.Math;

public class RealNumber extends Number{
  private double value;
  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+getValue();
  }

  public RealNumber add(RealNumber other){
    double a = this.getValue();
    double b = other.getValue();
    RealNumber c = new RealNumber(a + b);
    return c;
  }

  public RealNumber subtract(RealNumber other){
    double a = this.getValue();
    double b = other.getValue();
    RealNumber c = new RealNumber(a - b);
    return c;
  }

  public RealNumber multiply(RealNumber other){
    double a = this.getValue();
    double b = other.getValue();
    RealNumber c = new RealNumber(a * b);
    return c;
  }

  public RealNumber divide(RealNumber other){
    double a = this.getValue();
    double b = other.getValue();
    RealNumber c = new RealNumber(a / b);
    return c;
  }
}
