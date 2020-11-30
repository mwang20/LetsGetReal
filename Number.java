import java.lang.Math;

public abstract class Number{

  public abstract double getValue();

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

  public int compareTo(Number other){
    double a = this.getValue();
    double b = other.getValue();
    if (a == b){
      return 0;
    }
    if (a > b){
      return 1;
    }
    else return -1;
  }
}
