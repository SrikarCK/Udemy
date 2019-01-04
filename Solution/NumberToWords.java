public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(100);
    }
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int reverseNumber = reverse(number);
            int amountOfZeroes = getDigitCount(number) - getDigitCount(reverseNumber);
            StringBuilder result = new StringBuilder();
            int counter = 0;
            while (reverseNumber != 0) {
                if (counter != 0) {
                    result.append(" ");
                }
                switch (reverseNumber % 10) {
                    case 0:
                        result.append("Zero");
                        break;
                    case 1:
                        result.append("One");
                        break;
                    case 2:
                        result.append("Two");
                        break;
                    case 3:
                        result.append("Three");
                        break;
                    case 4:
                        result.append("Four");
                        break;
                    case 5:
                        result.append("Five");
                        break;
                    case 6:
                        result.append("Six");
                        break;
                    case 7:
                        result.append("Seven");
                        break;
                    case 8:
                        result.append("Eight");
                        break;
                    case 9:
                        result.append("Nine");
                        break;
                    default:
                        result.append("None");
                        break;
                }

                reverseNumber /= 10;
                counter++;
            }

            if (amountOfZeroes > 0) {
                for (int i = 0; i < amountOfZeroes; i++) {
                    result.append(" Zero");
                }
            }

            System.out.println(result.toString());
        }
    }

    public static int reverse(int number) {
        int reverseNumber = 0;
        int num = number;

        while (num != 0) {
            int lastDigit = num % 10;
            reverseNumber *= 10;
            reverseNumber += lastDigit;
            num /= 10;
        }

        return reverseNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        return Integer.toString(number).length();
    }
}
