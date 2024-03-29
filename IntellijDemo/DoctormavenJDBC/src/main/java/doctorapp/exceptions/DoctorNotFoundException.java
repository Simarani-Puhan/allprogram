package doctorapp.exceptions;

public class DoctorNotFoundException extends Exception{
    public DoctorNotFoundException() {
    }

    public DoctorNotFoundException(String message) {
        super(message);
    }
}
