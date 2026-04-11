package src;
public class HotelBookingTest1 {

    public static void test(String expected, String actual) {
        if (expected.equals(actual)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL: expected=" + expected + ", actual=" + actual);
        }
    }

    public static void main(String[] args) {
        test("invalid", HotelBooking.calculate("standard", 0, false, "low"));
        test("500k", HotelBooking.calculate("standard", 1, false, "low"));
        test("1000k", HotelBooking.calculate("standard", 2, false, "low"));
        test("7500k", HotelBooking.calculate("standard", 15, false, "low"));
        test("14500k", HotelBooking.calculate("standard", 29, false, "low"));
        test("15000k", HotelBooking.calculate("standard", 30, false, "low"));
        test("invalid", HotelBooking.calculate("standard", 31, false, "low"));
    }
}