import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers , takes two numbers as input
//        Test Data:
//        Input first number: 125
//        Input second number: 24 Expected Output :
//        125 + 24 = 149 125 - 24 = 101 125 x 24 = 3000 125 / 24 = 5 125 mod 24 = 5
        Scanner input = new Scanner(System.in);
        try {
        System.out.println("Input second number:  ");
        int entuser = input.nextInt();
        System.out.println("Enter s number  ");
        int entuser1 = input.nextInt();

    int sum;
    System.out.println(sum = entuser + entuser1);
    int mun;
    System.out.println(mun = entuser - entuser1);
    int subtract;
    System.out.println(subtract = entuser * entuser1);
    int divide;
    System.out.println(divide = entuser / entuser1);
    int mod;
    System.out.println(mod = entuser % entuser1);
}catch (InputMismatchException e){
    System.out.println("**It is not possible to calculate**");
}

        ///////////////////////////////////////////end

        //2. Write a Java program that takes a number as input and prints its multiplication table up to 10.
        //Test Data:
        //Input a number: 8 Output :
        //8 x 1 =8
        //8 x 2 = 16 8 x 3 = 24 ...
        //8 x 10 = 80

            try {
                System.out.println("enter your number for multiplication table up to 10.");
                int numOfMulti = input.nextInt();
                for (int i = 1; i <= 10; i++) {
                    int num = numOfMulti * i;

                    System.out.println(numOfMulti + "*" + i + "=" + num);
                }
            }catch (InputMismatchException e){

                System.out.println("**Input Mis match Exception**");
            }


        ///////////////////////////////////////////end

//3. Write a Java program to print the area and perimeter of a circle.
//Test Data:
//Radius = 7.5
//Expected Output
//Perimeter is = 47.12388980384689
//Area is = 176.71458676442586
//
        try {
            System.out.println("enter Radius  ");
            double radius = input.nextDouble();
            Reduse(radius);
        }catch (NegativeArraySizeException e){
            System.out.println(e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("**Input Mis match Exception**");
        }



        ///////////////////////////////////////////end
//
//        4. Java program to find out the average of a set of integers
//        Enter the count of numbers: 5
//        Enter an integer:
//        3
//        Enter an integer: 8
//        Enter an integer: 6
//        Enter an integer: 7
//        Enter an integer: 2
//        The average is: 5.2
        try {

            System.out.println("Enter the count of numbers:  ");
            int i = input.nextInt();
            if(i<0){
                throw new NegativeArraySizeException();
            }else {
            double avr = 0;
            int setnum = 0;
            while (i != 0) {
                ++setnum;

                avr = avr + i;

                System.out.println("Enter an integer: or 0 to exit  ");
                i = input.nextInt();
            }
            avr = avr / setnum;
            System.out.println("average is " + avr);}
        }catch (NegativeArraySizeException e){
            System.out.println("no negative");
        }


        catch (Exception e){
            System.out.println(e.getMessage());
        }


        ///////////////////////////////////////////end


//        5. Write a Java program that accepts three integers as input,
//        adds the first two integers together, and then determines whether the sum is equal to the third integer.
//        Sample Output:
//        Input the first number : 5 Input the second number: 10 Input the third number : 15 The result is: true
//                --------
//        Input the first number : 10 Input the second number: 20 Input the third number : 25 The result is: false

//
//
        try {
            System.out.println("input the first number :");
            int number1 = input.nextInt();
            System.out.println("input the second number :");
            int number2 = input.nextInt();
            System.out.println("input the third number :");
            int number3 = input.nextInt();


            if (number1 + number2 == number3){
                System.out.println("The result is: true");
            }else System.out.println("The result is: false");

        }catch (InputMismatchException e ){
            System.out.println("**Input Mis match Exception**");
        }



//        /////////////////////////////////////////end
//
//        6. Write a Java program to reverse a word.
//        Sample Output: Input a word: dsaf Reverse word: fasd
//
//

        System.out.println("Input a word:");
        String word = input.nextLine();

        revers(word);


        ///////////////////////////////////////////end


//        7 - Java program to check whether the given number is even or odd
//        Enter a number:
//        33
//        The number is Odd
//        Enter a number:
//        24
//        The number is Even

        try {int numcheck;
        do {
            System.out.println("Enter a number:");
             numcheck = input.nextInt();
             if(numcheck != 0 ) {

                 if (numcheck % 2 == 0) {

                     System.out.println("The number is Even");
                 } else
                     System.out.println("The number is Odd");
             }else
                 break;
        }while(numcheck != 0 );
        }catch (InputMismatchException e){
            System.out.println("**Input Mis match Exception**");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        ///////////////////////////////////////////end



//        8 - Java program to convert the temperature in Centigrade to Fahrenheit
        //Enter temperature in Centigrade: 43
        //Temperature in Fahrenheit is: 109.4

        try{
            System.out.println("Enter temperature in Centigrade: ");
            double c = input.nextDouble();

            double f;

            f = (c * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit is: " + f);
        }catch (Exception e){
            System.out.println("**not String**");
        }

        ///////////////////////////////////////////end



//        9.Write a Java program that takes a string and a number from the user,then prints the character in the given index.
//                Test Data:
//        Input a string: Java Bootcamp Input a number: 1
//        Expected Output: a
    try {
        System.out.println("Input a string: ");
        String string = input.nextLine();

        System.out.println("Input a number: ");
        int numberS = input.nextInt();

        System.out.println(string.charAt(numberS));
    }catch (Exception e){
        System.out.println("**not String in number**");
    }

        ///////////////////////////////////////////end

//        10. Write a Java program to print the area and perimeter of a rectangle.
//                Test Data:
//        Width = 5.5 Height = 8.5
//        Expected Output
//        Area is 5.6 * 8.5 = 47.60
//        Perimeter is 2 * (5.6 + 8.5) = 28.20
                try {
                    System.out.println("enter Width for rectangle ");
                    double width = input.nextDouble();
                    System.out.println("enter Height for  rectangle ");
                    double height = input.nextDouble();

                    double area1;
                    double perimeter1;

                    area1 = width * height;
                    perimeter1 = 2 * (width + height);

                    System.out.println(" Area is  =  " + area1
                            + "\nPerimeter is =  " + perimeter1);
                }catch (Exception e){
                    System.out.println("**not String in number**");
                }

                ///////////////////////////////////////////end
//
//                11. Write a Java program to compare two numbers.
//                Input Data:
//                Input first integer: 25 Input second integer: 39 Expected Output
//                25 != 39
//                25 < 39
//                25 <= 39
        try {
            System.out.println(" Input first integer: ");
            int number_1 = input.nextInt();
            System.out.println(" Input second integer: ");
            int number_2 = input.nextInt();

            if (number_1 != number_2)
                System.out.println(number_1 + "!=" + number_2);

            if (number_1 < number_2)
                System.out.println(number_1 + "<" + number_2);

            if (number_1 <= number_2)
                System.out.println(number_1 + "<=" + number_2);

            if (number_1 >= number_2)
                System.out.println(number_1 + ">=" + number_2);

            if (number_1 > number_2)
                System.out.println(number_1 + ">" + number_2);

            if (number_1 == number_2)
                System.out.println(number_1 + "=" + number_2);
        }catch (Exception e){
                    System.out.println("**not String in number**");
                }
        ///////////////////////////////////////////end

//        12. Write a Java program to convert seconds to hours, minutes and seconds.
//        Sample Output:
//        Input seconds: 86399
//        23:59:59
        try {
            System.out.println("Input seconds: ");
            int seconds1 = input.nextInt();
            int hour=1;

            hour = seconds1 /3600;

            int minutes ;
            minutes = seconds1%60;

            int seconds2 = minutes%60;

            System.out.println(hour+":"+minutes+":"+seconds2);

        }catch (Exception e){
            System.out.println("**not String in number**");
        }



        ///////////////////////////////////////////end


//        13. Write a Java program that accepts four integers from the user and prints equal if all four are equal, and not equal otherwise.
//                Sample Output:
//        Input first number: 25 Input second number: 37 Input third number: 45 Input fourth number: 23 Numbers are not equal!

        try {
            System.out.println("Input first number:");
            int num1 = input.nextInt();
            System.out.println("Input second number:");
            int num2 = input.nextInt();
            System.out.println("Input third number:");
            int num3 = input.nextInt();
            System.out.println("Input fourth number:");
            int num4 = input.nextInt();

            if (num1 == num2 & num1 == num3 && num4 == num1)
                System.out.println("is equal");
            else
                System.out.println("Numbers are not equal!");
        }catch (Exception e){
                    System.out.println("**not String in number**");
                }

        ///////////////////////////////////////////end

//        14. Write a Java program that reads an integer and check whether it is negative, zero, or positive.
//        Test Data Input a number: 7 Expected Output : Number is positive

        try {
            System.out.println("Input number:");
            int numperpo = input.nextInt();

            if (numperpo > 0)
                System.out.println("is positive");

            if (numperpo == 0)
                System.out.println("is zero");

            if (numperpo < 0)
                System.out.println("is negative");
        }catch (Exception e){
                    System.out.println("**not String in number**");
                }
        ///////////////////////////////////////////end
//        15.Write a program to enter the numbers till the user wants and at the end it should display the count of positive,
//        negative and zeros entered (End loop use -1 , Don’t count -1).
//Test data 1
//3
//0
//-2
//-4
//-1
//2 positives
//1 zero
//2 negatives

       try {
            System.out.println("Input number or -1 to exit");
            int in = input.nextInt();
            int count1 = 0;
            int count_1 = 0;
            int count0 = 0;

            while (in != -1) {

                if (in < 0)
                    if (in != -1)
                        count_1++;
                    else
                        break;

                if (in > 0)
                    count1++;


                if (in == 0)
                    count0++;


                System.out.println("Input number or -1 to exit");
                in = input.nextInt();
            }
            System.out.println("positives is " + count1);
            System.out.println("zero is " + count0);
            System.out.println("negatives is " + count_1);
        }catch (Exception e){
            System.out.println("**not String in number**");
        }
        ///////////////////////////////////////////end

//        16 - Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
//                For example, if the input is 12345, the output should be 54321.

       try {
            System.out.println("enter number");
            String number4 = input.nextLine();
            String rev = "";
            if(number4.length()==0){
                throw new Exception("**length can be > 0**");}

            for (int i2 = number4.length() - 1; i2 >= 0; i2--) {
                rev += "" + number4.charAt(i2);
            }
            System.out.println(rev);
        }catch (Exception e){
           System.out.println(e.getMessage());
       }
        ///////////////////////////////////////////end


//        17 - Write a program to enter the numbers till the user wants and at the end the program should display the largest and smallest numbers entered.
//enter the number : 4 enter the number : 5 enter the number : -1 enter the number : 9 the large number : 9 the small number : -1


        try{
            int enternumber;
            int max = 0;
            int min = 0;

            do {
                System.out.println("enter number or 0 to exit");
                enternumber = input.nextInt();

                if (enternumber > max) {
                    max = enternumber;

                    if (enternumber == 0) {
                        break;
                    } else if (enternumber < min) {
                        min = max;
                    }
                }

            } while (enternumber != 0);

            System.out.println("the larg number :" + max + "\n the small number : " + min);
        }catch (Exception e){
            System.out.println("**not String in number**");
        }
        ///////////////////////////////////////////end
        try{
            System.out.println("enter your word");
            String wordd = input.nextLine();
            int a = 0;


            for (int i2 = wordd.length() - 1; i2 >= 0; i2--) {
                if (wordd.matches("a"))
                    ++a;
            }

            System.out.println("a is " + a);
        }catch (Exception e){
            System.out.println("**not String in number**");
        }

    }

public static void Reduse(double r) throws NegativeArraySizeException {

        if(r < 0 ){
            throw new NegativeArraySizeException("**radius not negative**");

        }else {
        double Area = (3.14) * (r * r);
        double perimeter = 2 * 3.14 * r;

    System.out.println("Perimeter is  =  " + perimeter
            + "\nArea is =  " + Area);}
}

public static void revers(String word){

        try{
    String re = "";
    if(word.length()<1){
        throw new Exception("**lenfth not 0**");
    }else
    for (int i2 = word.length()-1; i2 >= 0 ; i2--) {

        re +=""+word.charAt(i2);

    }
    System.out.println("Reverse word: " +re);
}catch (Exception e){
            System.out.println(e.getMessage());
        }
    }





}