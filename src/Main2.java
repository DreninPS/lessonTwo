public class Main2 {
    public static void main(String[] args) {
        Double count = 0d;
        try {
            for (int i = 0; i < args.length; i++) {
                count = count + Double.parseDouble(args[i]);
//                System.out.println("Var number " + i + " " + Double.parseDouble(args[i]));
            }
            System.out.println("average = " + count / args.length);
        } catch (Exception exception) {
            System.out.println("Something went wrong! " + exception.getMessage());
        }
    }
}
