import java.text.DecimalFormat;

public class Main3 {
    public static void main(String[] args) {
   Integer summa, percent, timeyy;

    try {
        summa = Integer.parseInt(args[0]);
        percent = Integer.parseInt(args[1]);
        timeyy = Integer.parseInt(args[2]);

        double percentPerMonth = percent/12d;
        Double summaWithPercentYy = Double.valueOf(summa);

        for (int i = 1; i <=timeyy ; i++) {

            double countPercentsForYear = 0d;
            for (int j = 1; j <= 12; j++) {
                countPercentsForYear = countPercentsForYear + summaWithPercentYy*percentPerMonth/100;
                summaWithPercentYy = summaWithPercentYy+summaWithPercentYy*percentPerMonth/100;
//                System.out.println(summaWithPercentYy + " | " + j + "|" + countPercentsForYear);
            }
            System.out.println("Sum per year with percent = " +  new DecimalFormat("#0.00").format(summaWithPercentYy) + " UAH" +
                    " Only percent = "+ new DecimalFormat("#0.00").format(countPercentsForYear) +" UAH"+" for " + i + " year");
        }

   }
   catch (Exception e){
       System.out.println("Something went wrong! " + e.getMessage());
   }




    }

}
