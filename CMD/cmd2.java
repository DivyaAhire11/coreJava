class Cmd2 {
    public static void main(String args[]) {
        int n;
        String input;
        n = args.length;
        if (n == 1) {
            try {
                input = args[0];
                String reversed = new StringBuilder(input).reverse().toString();
                System.out.println("Reverse String is : " + reversed);

            } catch (Exception e) {
                System.out.println("Please Enter Valid Input");
            }
        } else {
            System.out.println("Invalid Input. Please pass exactly one string.");
        }
    }
}
