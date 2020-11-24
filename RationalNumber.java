public class RationalNumber extends RealNumber{
  private int numerator, denominator;
  public RationalNumber(int nume, int deno){
    super(0.0);
    numerator = nume;
    denominator = deno;
    if (deno == 0){
      numerator = 0;
      denominator = 1;
    }
    else if (nume == 0){
      denominator = 1;
    }
  }

  public double getValueOf(){
    return 0.0;
  }

  public int getNumerator(){
    return numerator;
  }

  public int getDenominator(){
    return denominator;
  }

  public boolean equals(RationalNumber other){
    int aNume = this.getNumerator();
    int aDeno = this.getDenominator();
    int bNume = other.getNumerator();
    int bDeno = other.getDenominator();
    if ((aNume / aDeno) == (bNume / bDeno)){
      return true;
    }
    return false;
  }

  public RationalNumber reciprocal(){
    int a = denominator;
    int b = numerator;
    RationalNumber c = new RationalNumber(a, b);
    return c;
  }

  private static int gcd(int a, int b){
    int r = -1;
    if (a == b){
      return a;
    }
    if (b > a){
      a = b;
      b = a;
    }
    while (r != 0){
      a = Math.round(a / b);
      r = a % b;
      b = r;
    }
    return r;
  }
}
