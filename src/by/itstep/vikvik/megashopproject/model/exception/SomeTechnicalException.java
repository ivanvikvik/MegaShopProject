package by.itstep.vikvik.megashopproject.model.exception;

public class SomeTechnicalException extends TechnicalProductShopException  {
    public SomeTechnicalException() {
        super();
    }

    public SomeTechnicalException(String message) {
        super(message);
    }

    public SomeTechnicalException(String message, Throwable cause) {
        super(message, cause);
    }

    public SomeTechnicalException(Throwable cause) {
        super(cause);
    }
}
