public class GreatestNumber{
    public static void main(String[] args){
        //assign values to five numbers
        int num1=34;
        int num2=68;
        int num3=19;
        int num4=90;
        int num5=50;
        //assume the first number is the greatest
        int greatest=num1;
        //compare with the second number
        if(num2>greatest){
            greatest=num2;
        }
        //compare with the third number
        if(num3>greatest){
            greatest=num3;
        }
        //compare with the fourth number
        if(num4>greatest){
            greatest=num4;
        }
        if(num5>greatest){
            greatest=num5;
        }
        //display the result
        System.out.println("The greatest number among the five given numbers is: " + greatest);
    }
}
