class Factorial {
    public static void main(String args[]) {
        if (args.length == 1) {
            try {
                int a = Integer.parseInt(args[0]);
                
                if (a<0) {
                    System.out.println("Factorial is not defined for negative numbers.");
                    return;
                }

                int ans = 1; 
                for (int i=1; i<=a; i++)
                    ans = ans * i;

                System.out.println("Factorial of " + a + " is: " + ans);

            } catch (Exception e) {
                System.out.println("Something happened, please enter a valid integer input.");
            }
        } else {
            System.out.println("Invalid input. Please pass exactly one number.");
        }
    }
}
