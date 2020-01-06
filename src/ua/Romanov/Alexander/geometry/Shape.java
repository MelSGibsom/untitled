package ua.Romanov.Alexander.geometry;

abstract class Shape {
    public abstract double getArea();
private double getSegment(int x1, int y1, int x2,int y2){
    int deltaX =x2-x1;
    int deltaY =y2-y1;
    return Math.sqrt(deltaX*deltaX+deltaY*deltaY);

}
public final double getUniversalSigment(int [] x1Array, int[] y1Array, int[] x2Array, int[] y2Array){
    //this.getSegment(x1,y1,x2,y2);
    double sumSegment=0;
    for (int i = 0; i < x1Array.length; i++) {

        double segment = getSegment(x1Array[i],y1Array[i],x2Array[i],y2Array[i]);
    }
    return sumSegment;
}
}
