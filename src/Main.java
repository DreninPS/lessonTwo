public class Main {
    public static void main(String[] args) {
        try {
            Double firstVar = Double.parseDouble(args[0]);
            Double secondVar = Double.parseDouble(args[1]);
            System.out.println("firstVar = " + firstVar + " secondVar = " + secondVar);
            System.out.println("average " + (firstVar + secondVar) / 2);
        } catch (Exception exception) {
            System.out.println("Something went wrong! " + exception.getMessage());
        }

    }

}

