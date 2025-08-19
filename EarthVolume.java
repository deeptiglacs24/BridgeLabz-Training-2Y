public class EarthVolume {
    public static void main(String[] args){
        int rkm=6378;
        double rm=rkm*(0.621);
        double vkm=(4.0/3.0)*Math.PI*Math.pow(rkm,3);
        double vm=(4.0/3.0)*Math.PI*Math.pow(rm,3);
        System.out.println("The Volume of earth in cubic kilometer is "+ vkm +" and the cubic miles is " +vm);
    }
}
