package Interfaces;

public interface Calculator {
    static double sum(double firstSummand, double secondSummand) { return firstSummand + secondSummand; }
    static double subtract(double minuend, double subtrahend) {return minuend - subtrahend; }
    static double multiply(double firstMultiplier, double secondMultiplier) {return firstMultiplier * secondMultiplier; }
    static double division(double divisible, double divisor) { return divisible / divisor; }
}
