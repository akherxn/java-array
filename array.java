public class array {
    // created integer array
    static int[] numbers;
    static int sum = 0;
    public static void main(String[] args) {
        // initialises an integer array of 99 elements
        numbers = new int[99];
        for (int n = 101, a = 0; n<200 && a<numbers.length; n++, a++){
            // adds numbers between 100 and 200 into the array
            numbers[a] = n;
            System.out.println(numbers[a]); 
             
        }
        for (int v = 0; v<numbers.length && v%2==0; v++){
            // calculates the sum of all even numbers in the array
            sum+= numbers[v];
            System.out.println("sum is: "+ sum); 
        }
        
        
    }
    
}
