public class SimpleInterest{
    public static void main(String[] args){
        //assign values to principal,rate of interest and time period
        double principal=36000;
        double rate=6;
        int time=3;
        //caculate simple interest
        double simpleInterest=(principal*rate*time)/100;
        //display the result
        System.out.println("The simple interest is: " + simpleInterest);
    }
}