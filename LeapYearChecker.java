public class LeapYearChecker{
    public static void main(String[] args){
        //assign a year to check
        int year=2024;
        //check if the year is a leap year
        boolean isLeapYear=false;
        if(year%4==0){
            if(year%100!=0||year%400==0){
                isLeapYear=true;
            }
        }
        //display the result
        if(isLeapYear){
            System.out.println(year + " is a leap year.");
        }
        else{
            System.out.println(year + " is not a leap year.");
        }
    }
}