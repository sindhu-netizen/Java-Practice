public class TriangleChecker{
    public static void main(String[] args){
        //assign values to the angles
        int angle1=50;
        int angle2=60;
        int angle3=70;
        //check if the sum of the angles is 180 degrees
        if(angle1+angle2+angle3==180){
            System.out.println("The given angles form a triangle.");
        }
        else{
            System.out.println("The given angles do not form a triangle.");
        }
    }
}
