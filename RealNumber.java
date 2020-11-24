import java.lang.Math;

public class RealNumber{
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

  public boolean equals(RealNumber other){
    double a = this.getValue();
    double b = other.getValue();
    if (a == 0 || b == 0){
      if (Math.abs(a - b) == 0){
        return true;
      }
      else return false;
    }
    if (Math.abs(a - b) <= 0.001){
      return true;
    }
    return false;
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
}
