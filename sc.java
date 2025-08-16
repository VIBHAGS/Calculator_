public class SimpleCalculator {
    public static void main(String[] args) {
        // Basic Calculator using Java
        // This program performs addition, subtraction, multiplication, and division
        
        double num1 = 25.5;
        double num2 = 10.0;
        
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        
        if (num2 != 0) {
            System.out.println("Division: " + (num1 / num2));
        } else {
            System.out.println("Cannot divide by zero");
        }
    }
}
