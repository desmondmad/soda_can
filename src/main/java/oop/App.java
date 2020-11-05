package oop;

import java.text.DecimalFormat;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "\n*** SodaCan App ***" );
        App app = new App();
        app.start();
    }

    public void start() {
        SodaCan sc1 = new SodaCan();
        DecimalFormat df = new DecimalFormat("#.##");
        //TODO
        // See question P8.5
        sc1.setH(13);
        sc1.setR(6);
        System.out.println(df.format(sc1.getVolume()));
        System.out.println(df.format(sc1.getSurfaceArea()));
    }
}
