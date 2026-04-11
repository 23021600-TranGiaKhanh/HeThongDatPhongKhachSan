package src;
public class HoltelBookingTest3 {
        public static void test(String expected, String actual) {
        if (expected.equals(actual)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL: expected=" + expected + ", actual=" + actual);
        }
    }

    public static void main(String[] args) {
        test("2500k", HotelBooking.calculate("standard", 5, false, "low"));
        test("2250k", HotelBooking.calculate("standard", 5, true, "low"));
        test("12000k", HotelBooking.calculate("deluxe", 10, false, "high"));
        test("invalid", HotelBooking.calculate("standard", 0, true, "low"));
        test("invalid", HotelBooking.calculate("standard", 31, false, "low"));
        test("invalid", HotelBooking.calculate("abc", 5, true, "low"));
        test("invalid", HotelBooking.calculate("standard", 5, true, "abc"));
    }
}
