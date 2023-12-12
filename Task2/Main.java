package Task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GaussRandom gr = new GaussRandom(2);
        double[] standardDistribution = new double[100];
        double[] transformation = new double[100];

        for (int i = 0; i < standardDistribution.length; i++) {
            standardDistribution[i] = gr.nextNormal();
            transformation[i] = gr.nextNormal(1,1);
        }
        System.out.println("Стандартное нормальное распределение: " + Arrays.toString(standardDistribution));
        System.out.println("Преобразование Бокса-Мюллера: " + Arrays.toString(transformation));
    }
}
