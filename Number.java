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
}
