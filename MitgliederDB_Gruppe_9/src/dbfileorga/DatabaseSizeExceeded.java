package dbfileorga;

public class DatabaseSizeExceeded extends RuntimeException{
    public DatabaseSizeExceeded (String errorMessage) {
        super(errorMessage);
    }
}
