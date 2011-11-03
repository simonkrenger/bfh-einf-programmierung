import java.util.Random;

public class Needle
{
   private static Random generator = new Random();
   private int hits;
   private int tries;

   public Needle()
   {
      hits = 0;
      tries = 0;
   }

   public int getHits()
   {
      return hits;
   }

   public int getTries()
   {
      return tries;
   }

   public void drop()
   {
      double angle = 180 * generator.nextDouble();
      double x_low = 2 * generator.nextDouble();
      double x_high = x_low + Math.sin(Math.toRadians(angle));
      if (x_high >= 2) hits++;
      tries++;
   }
}