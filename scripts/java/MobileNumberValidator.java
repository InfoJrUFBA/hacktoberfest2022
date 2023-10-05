public class MobileNumberValidator {
    public static void main(String[] args) {
        try {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Enter your mobile number: ");
            String mobileNumber = scanner.nextLine();
            Validator.validateMobileNumber(mobileNumber);
            System.out.println("Mobile number is valid!");
        } catch (InvalidMobileNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class InvalidMobileNumberException extends Exception {
    public InvalidMobileNumberException(String message) {
        super(message);
    }
}

class Validator {
    public static void validateMobileNumber(String mobileNumber) throws InvalidMobileNumberException {
        // Check for valid mobile number format
        // You can customize this validation based on your requirements
        if (!mobileNumber.matches("\\d{10}")) {
            throw new InvalidMobileNumberException("Invalid mobile number format!");
        }
    }
}