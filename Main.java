class Compounding{
  Compounding (double Principal, double Rate, double Time)
  {
    double Interest;
    int x;
    for(x=1;x<=Time;x++)
      {
        Interest=((Principal*Rate)/100);
        Principal=Principal+Interest;
        System.out.println("Amount after "+x+"month is "+Principal);
      }
  }
}
  public class Main {
  public static void main(String[] args) {
    Compounding c1=new Compounding (10000,5,20);
  }
}