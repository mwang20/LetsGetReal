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
    if (nume == 0){
      denominator = 1;
    }
    if (deno < 0) {
      denominator = denominator * (-1);
      numerator = numerator * (-1);
      reduce();
    }
    reduce();
  }

  public double getValueOf(){
    return ((double)numerator) / ((double)denominator);
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

  public String toString(){
    return numerator + "/" + denominator;
  }
  public RationalNumber reciprocal(){
    int a = denominator;
    int b = numerator;
    RationalNumber c = new RationalNumber(a, b);
    return c;
  }

  private static int gcd(int a, int b){
    int c = Math.min(a, b);
    int divisor = 1;
    for(int i = 1; i <= c; i++){
        if(a % i == 0 && b % i == 0){
            divisor = i;
        }
    }
    return divisor;
  }

  private void reduce(){
    if (gcd(numerator, denominator) == 0){
      numerator = 0;
      denominator = 1;
    }
    int gcd = gcd(numerator, denominator);
    numerator = numerator / gcd;
    denominator = denominator / gcd;
  }

  public RationalNumber multiply(RationalNumber other){
    int aNume = this.getNumerator();
    int aDeno = this.getDenominator();
    int bNume = other.getNumerator();
    int bDeno = other.getDenominator();
    RationalNumber c = new RationalNumber(aNume * bNume, aDeno * bDeno);
    return c;
  }
}
