public class ArrayClass {
    public static double[] copyArray(double[] source, double[] dest){
        for(int i = 0; i < source.length; i++){
            dest[i] = source[i];
        }
        return dest;
    }
    public static double[] addBonus(double[] salary, double bonus){
        double[] temp = new double[salary.length];
        temp = copyArray(salary, temp);
        for(int i = 0; i < temp.length; i++){
            temp[i] *= (1 + bonus*0.01);
        }
        return temp;
    }
}
