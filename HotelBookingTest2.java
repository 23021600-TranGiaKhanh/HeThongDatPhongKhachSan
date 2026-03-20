public class HotelBookingTest2 {
    public static void test(String expected, String actual) {
        if (expected.equals(actual)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL: expected=" + expected + ", actual=" + actual);
        }
    }

    public static void main(String[] args) {
        test("invalid", HotelBooking.calculate("standard", 0, true, "low"));
        test("1350k", HotelBooking.calculate("standard", 3, true, "low"));
        test("1500k", HotelBooking.calculate("standard", 3, false, "low"));
        test("2250k", HotelBooking.calculate("standard", 3, false, "high"));
        test("5400k", HotelBooking.calculate("deluxe", 5, true, "high"));
        test("6000k", HotelBooking.calculate("deluxe", 5, false, "high"));
    }
}
