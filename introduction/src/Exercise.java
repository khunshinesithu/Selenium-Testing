

public class Exercise {
    public static void main(String[] args) {
        int[] numbers = {2,4,6,8,10};
        System.out.println(numbers[0]);
        System.out.println(numbers[4]);
        int sum=0;
        for(int i=numbers.length-1; i>=0; i--){
            System.out.println(i);
            sum=sum+numbers[i];
        }   
        System.out.println(sum);
}
}
