public class FeeDistribution {
    public static void main(String[] args){
        System.out.print("Enter your Course fee: ");
        int fee=12500;
        int dp=10;
        int dis_amt=(fee*dp)/100;
        int dis_fee=fee-dis_amt;
        System.out.println("The discounted amount is INR "+ dis_amt +" and final discounted fee is INR " + dis_fee);
    }
}
