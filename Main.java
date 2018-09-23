public class Main {

    public static void main(String[] args) {
        // write your code here
        double d1x = (5);
        double d1y = (2);
        double d1z = (-5);
        double d2x = (4);
        double d2y = (9);
        double d2z = (2);
        double d3x = (-3);
        double d3y = (2);
        double d3z = (6);
        double x12 = (d1x - d2x);
        double y12 = (d1y - d2y);
        double z12 = (d1z - d2z);
        double totx12 = Math.pow(x12, 2);
        double toty12 = Math.pow(y12, 2);
        double totz12 = Math.pow(z12, 2);
        double d12 = Math.sqrt(totx12 + toty12 + totz12);
        double x13 = (d1x - d3x);
        double y13 = (d1y - d3y);
        double z13 = (d1z - d3z);
        double totx13 = Math.pow(x13, 2);
        double toty13 = Math.pow(y13, 2);
        double totz13 = Math.pow(z13, 2);
        double d13 = Math.sqrt(totx13 + toty13 + totz13);
        double x23 = (d2x - d3x);
        double y23 = (d2y - d3y);
        double z23 = (d2z - d3y);
        double totx23 = Math.pow(x23, 2);
        double toty23 = Math.pow(y23, 2);
        double totz23 = Math.pow(z23, 2);
        double d23 = Math.sqrt(totx23 + toty23 + totz23);
        double d13d12max=Math.max(d13,d13);
        double d13d12min=Math.min(d12,d13);
        System.out.println("The longest distance between the drones is" + d13d12max);
        System.out.println("The least distance between the drones is" + d13d12min);
    }
}