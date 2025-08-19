public class ProfitAndLoss {
    public static void main(String[] args){
        int cp=129;
        int sp=191;
        int p=sp-cp;
        double pp=(p*100.0)/cp;
        System.out.println("The Cost Price is INR "+cp+" and the Selling Price is INR "+sp);
        System.out.println("The Profit is INR "+p+" and the Profit Percentage is "+ String.format("%.2f",pp));
    }
    
}
