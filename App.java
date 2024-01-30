package com.ontariotechu.sofe3980U;

import org.joda.time.LocalTime;

public class Binary {
    private String value;

    public Binary(String binaryValue) {
        this.value = binaryValue;
    }

    public String getValue() {
        return value;
    }

    public static Binary add(Binary binary1, Binary binary2) {
        // Your existing add implementation
        // ...

        return new Binary(result);
    }

    // New OR operation
    public static Binary or(Binary binary1, Binary binary2) {
        // Implement bitwise OR operation
        // ...

        return new Binary(result);
    }

    // New AND operation
    public static Binary and(Binary binary1, Binary binary2) {
        // Implement bitwise AND operation
        // ...

        return new Binary(result);
    }

    // New Multiply operation
    public static Binary multiply(Binary binary1, Binary binary2) {
        // Implement binary multiplication using the add function
        // ...

        return new Binary(result);
    }
}

public class App {
    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);

        Binary binary1 = new Binary("00010001000");
        System.out.println("First binary number is " + binary1.getValue());

        Binary binary2 = new Binary("111000");
        System.out.println("Second binary number is " + binary2.getValue());

        Binary sum = Binary.add(binary1, binary2);
        System.out.println("Their summation is " + sum.getValue());

        Binary orResult = Binary.or(binary1, binary2);
        System.out.println("Bitwise OR result is " + orResult.getValue());

        Binary andResult = Binary.and(binary1, binary2);
        System.out.println("Bitwise AND result is " + andResult.getValue());

        Binary multiplyResult = Binary.multiply(binary1, binary2);
        System.out.println("Multiplication result is " + multiplyResult.getValue());
    }
}