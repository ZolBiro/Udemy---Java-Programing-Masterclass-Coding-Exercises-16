public class FirstLastDigitSum {

        public static int sumFirstAndLastDigit (int number) {

            if (number <0) {
                return -1;
            }

            int digitlast = number % 10;
            int digitfirst = 0;


            while (number >=10) {

                number /= 10;

            }

            digitfirst = number;

            return digitfirst + digitlast;

        }
}
