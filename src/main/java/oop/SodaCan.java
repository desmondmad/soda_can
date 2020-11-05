package oop;

public class SodaCan {

    //TODO
    // see P8.5 for class requirements
    private double h;
    private double r;

    public SodaCan(double h, double r){
        this.h = h;
        this.r = r;
    }

    public SodaCan(){
        this.h = 0;
        this.r = 0;
    }

    public double getH() {
        return h;
    }

    public double getR() {
        return r;
    }

    public double getVolume(){
        double vol = Math.PI * (r*r) * h;
        return vol;
    }

    public double getSurfaceArea(){
        double sArea = (2 * Math.PI * r * h) + (2 * Math.PI * (r * r));
        return sArea;
    }

    public void setH(double h){
        this.h = h;
    }

    public void setR(double r){
        this.r = r;
    }
}
