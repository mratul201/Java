public class DatatypeConversion {
    public static void main(String[] args) {
        //We can always adjust a smaller fish to a bigger aquarium.
        //But we cannot adjust a Bigger fish in a smaller aquarium.
        //Implicit Data type variable Storing a smaller type variable in a larger type variable
        int num = 100;
        long numL = num;
        float numf = numL;
        System.out.println(numf);
        //Implicit Conversion ends.
        //Start Explicit Datatype conversion: We have to do Type casting to fit a bigger fish in a smaller area
        double numDouble = 98.7;
        float numfloat = (float) numDouble;
        long numLong = (long) numfloat;
        int numInt = (int) numLong;
        System.out.println(numInt);





    }
}
