/**
 * 
 */
package ex05;

import ex05.Purse.Coin;

/**
 * Provided tester class for the Purse class.
 * 18.11.2011: Changed Strings to ENUMs (simon)
 * 
 * @author Rolf Haenni, simon
 *
 */
public class PurseTester
{
   public static void main(String[] args)
   {
      Purse a = new Purse();
      a.addCoin(Coin.Quarter);
      a.addCoin(Coin.Quarter);
      a.addCoin(Coin.Dime);
      a.addCoin(Coin.Penny);
      a.addCoin(Coin.Quarter);
      System.out.println(a.toString());
      System.out.println(a.sum());
      
      Purse b = new Purse();
      b.addCoin(Coin.Quarter);
      b.addCoin(Coin.Dime);
      b.addCoin(Coin.Penny);
      b.addCoin(Coin.Quarter);
      b.addCoin(Coin.Quarter);
      System.out.println(b.toString());
      System.out.println(b.sum());
      
      System.out.println(a.sameValue(b));
      System.out.println(a.sameCoins(b));
      
      Purse c = new Purse(Coin.Quarter, Coin.Dime, Coin.Dime, Coin.Dime, Coin.Penny, Coin.Quarter, Coin.Nickel);
      System.out.println(c.toString());
      System.out.println(c.sum());

      System.out.println(a.sameValue(c));
      System.out.println(a.sameCoins(c));

      c.transferTo(a);
      System.out.println(a.toString());
      System.out.println(c.toString());

      a.transferFrom(b);
      System.out.println(a.toString());
      System.out.println(b.toString());

   }
}
