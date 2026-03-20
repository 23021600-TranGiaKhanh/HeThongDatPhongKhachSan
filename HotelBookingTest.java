public class HotelBookingTest {

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
        test("invalid", HotelBooking.calculate("standard", 0, true, "low"));
        test("invalid", HotelBooking.calculate("abc", 5, true, "low"));
    }
}