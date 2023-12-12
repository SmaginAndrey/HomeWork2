package Task2;

import java.util.Random;

public class GaussRandom {
    Random random = new Random();

    double value1 = random.nextDouble();
    double value2 = random.nextDouble();


    public GaussRandom (){

    }
    public GaussRandom(long seed){
        this.random=random;
    }
    public double nextNormal(double m, double sigma){
       double firstPart = Math.cos(2 * Math.PI * value1);
       double secondPart = Math.sqrt(-2 * Math.log10(value2));
       double z = firstPart * secondPart;
       return m + sigma * z;
    }
    public double nextNormal(){
        return this.random.nextGaussian();
    }
}
