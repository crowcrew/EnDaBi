import java.math.BigInteger;
 
public class isProbablePrime
{
  public static void main(String[] args)
  {
    BigInteger test_case = new BigInteger(args[0]);
    int certainty = Integer.parseInt(args[1]);

/* 1 means Probably Prime, 0 means definitely composite. */
    System.out.println((test_case.isProbablePrime(certainty) ? "1" : "0"));
  }
}
