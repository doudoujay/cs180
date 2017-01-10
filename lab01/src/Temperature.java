/**
 * CS180 - Lab 01
 * This is the the temperature converter for CS180 lab01.
 * @author Ji Ma, ma438@purdue.edu, L08
 */

public class Temperature {
    public static void main(String[] args){
        double fahrenheit;
        double celsius;
        fahrenheit = 212;
        celsius = ((fahrenheit-32)*5)/9;
        System.out.println("Fahrenheit " + fahrenheit);
        System.out.println("Celsius " + celsius);

    }
}
