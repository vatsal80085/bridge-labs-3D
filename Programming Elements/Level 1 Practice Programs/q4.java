public class q4 {
    public static void main(String[] args) {
        int cp=129;
        int sp=191;
        int profitOrLoss = Math.max(cp, sp) - Math.min(cp, sp);
        int profpercent = profitOrLoss*100/cp;
        System.out.println("The Cost Price is INR "+cp+" and Selling Price is INR "+sp+"\n" + //
                        "The Profit is INR "+profitOrLoss+" and the Profit Percentage is "+profpercent);    
    }
}
