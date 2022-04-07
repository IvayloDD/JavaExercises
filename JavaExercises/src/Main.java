import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        reverseNumber(1234);
//        countDigitsNumber(234);
//        countEvenOddNumbers(1234555);
//        int[] array = new int[] {1,3,2,5,6,7,8,9,10};
//        missingNum(array);
//        linearSearch(array,8);
//        System.out.println(binarySearch(array,3));
        System.out.println(reverse("Java"));
        System.out.println(isAnagrams("word", "owrd"));
        System.out.println(isStringPalindrome("wow"));
        System.out.println(isStringPalindrome("Wow"));
        System.out.println(reverseWords("This looks strange"));
        numberToWords(1134);


    }

    public static void swapTwoNumbers(int a, int b) {
        System.out.println("Before swapping: " + a + " " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping " + a + " " + b);

    }

    public static void reverseNumber(int num) {
        //1234 4321
        int reverse = 0;

        while(num != 0) {
            reverse = reverse*10 + num%10;
            num /= 10;
        }
        System.out.println(reverse);

    }

    public static boolean isPalindrome(int number)
    {
        int reverse = 0;
        int number1 = number;
        while(number1 != 0) {
            reverse = reverse * 10 + number1 % 10;
            number1 /= 10;
        }
        if(number == reverse)
        {
            return true;
        } else {
            return false;
        }
    }

    public static void countEvenOddNumbers(int number) {
        int countEven = 0;
        int countOdd = 0;

        while(number > 0) {
            int flag = number % 10;
            if(flag % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
            number = number/10;
        }
        System.out.println("Even count is " + countEven);
        System.out.println("Odd count is " + countOdd);
    }

    public static void missingNum(int[] array) {
            int flag = 1;
            Arrays.sort(array);
            for(int i = 0; i < array.length; i++) {
                if(array[i] > 0 && array[i] <= 10) {
                    if(flag != array[i]) {
                        System.out.println("The flag is: "+ flag);
                        return;
                    }
                    flag++;
                } else {
                    System.out.println("Please write appropriate numbers from 1 to 10 ");
                }
            }
        }
    public static int factorialNumber(int n) {
        int sum = 1;
        for(int i = n; i > 1; i--) {
            sum *= i;
        }
        return sum;
    }

    public static void duplicatesArray(String[] array) {
        boolean flag = false;
        for(int i = 0; i < array.length;i++) {
            for(int j = i+1; j < array.length;j++) {
                if(array[i] == array[j]){
                    System.out.println("Found element that is duplicated: " + array[i]);
                    flag = true;
                }
            }
        }
        if(flag == false ) {
            System.out.println("Duplicate value was not found!");
        }
    }

    public static void linearSearch(int[] array, int searchItem) {
        for(int i = 0; i < array.length;i++) {
            if(searchItem == array[i]) {
                System.out.println("Element found at position " + (i+1));
                break;
            }
        }
    }

    public static String reverse(String str) {
        String reverse = "";
        for(int i = str.length()-1; i >= 0;i--) {
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }

    public static boolean isAnagrams(String word, String word2) {

        String sortedWord = sortedChar(word);
        String sortedAnagram = sortedChar(word2);

        if(sortedWord.equals(sortedAnagram)) {
            return true;
        } else {
            return false;
        }
    }

    public static String sortedChar(String word) {
        char[] wordArr = word.toLowerCase().toCharArray();
        Arrays.sort(wordArr);
        return String.valueOf(wordArr); //!!!!
    }

    public static int getLengthOfString(String str)
    {
        int length=0;
        char[] strCharArray=str.toCharArray();
        for(char c:strCharArray)
        {
            length++;
        }
        return length;
    }

     public static boolean isStringPalindrome(String str) {
        String reverse = reverse(str);
        if(reverse.equalsIgnoreCase(str)) {
            return true;
        } else {
            return false;
        }
     }

     public static int numberOfWords(String str) {
        int count = 0;
        String[] stringArray = str.split("\\s+");
        return stringArray.length;
     }

     public static String reverseWords(String str) {
        String[] strArray = str.trim().split("\\s+");
        String strReverseWords = "";
        for(String word : strArray) {
            strReverseWords += reverse(word) + " ";
        }
        return strReverseWords;
     }

    //Binary search arrays should be sorted
    public static int binarySearch(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        while(left <= right) {
            int midpoint = (left + right)/2;
            if(arr[midpoint] == target) {
                return midpoint;
            } else if ( arr[midpoint] > target) {
                right = midpoint + 1;
            } else  {
                left = midpoint + 1;
            }
        }
        return -1;
    }

    public static boolean isLeapYear(int year) {
        if (year > 0 && year < 9999) {

            if (year % 4 == 0 && year % 100 != 0) {
                return true;
            } else if( year % 100 == 0 && year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static void printFactors(int number) {
        if (number >= 1) {
            for(int i = 1; i <= number; i++)
            {
                if( number % i == 0) {
                    System.out.println(i);
                }

            }
        } else {
            System.out.println("Invalid Value");
        }
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        if (number >= 1) {
            for(int i = 1; i < number; i++)
            {
                if( number % i == 0) {
                    sum += i;
                }

            }
            if(sum == number) {
                return true;
            }
        } else {
            return false;
        }
        return false;
    }

    public static int getDigitCount(int number)
    {
        int flag = 0;
        if (number == 0) {
            return 1;
        } else if(number >= 0) {
            while (number != 0) {
                flag++;
                number /= 10;
            }
            return flag;
        }
        return -1;
    }

    public static int reverse (int number) {
        int reverse = 0;
        int number1 = number;
        while (number1 != 0) {
            int digit = number1 % 10;
            reverse = reverse * 10 + digit;
            number1 /= 10;
        }
        return reverse;
    }

    public static void numberToWords(int number)
    {
        int helper = 0;
        int number1 = reverse(number);
        if(number1 == 0) {
            System.out.println("Zero");
        } else if( number1 > 0) {
            while(number1 != 0) {
                switch (number1 % 10) {
                    case 0:
                        System.out.print(" Zero");
                        break;
                    case 1:
                        System.out.print(" One");
                        break;
                    case 2:
                        System.out.print(" Two");
                        break;
                    case 3:
                        System.out.print(" Three");
                        break;
                    case 4:
                        System.out.print(" Four");
                        break;
                    case 5:
                        System.out.print(" Five");
                        break;
                    case 6:
                        System.out.print(" Six");
                        break;
                    case 7:
                        System.out.print(" Seven");
                        break;
                    case 8:
                        System.out.print(" Eight");
                        break;
                    case 9:
                        System.out.print(" Nine");
                        break;
                    default:
                        System.out.print("Invalid Value (default)");
                        break;
                }

                number1 /= 10;
            }
            helper = getDigitCount(number) - getDigitCount(reverse(number));
            if(helper != 0) {
                while (helper > 0) {
                    System.out.print(" Zero");
                    helper--;
                }
            }
        } else {
            System.out.println("Invalid Value");
        }
    }
}
