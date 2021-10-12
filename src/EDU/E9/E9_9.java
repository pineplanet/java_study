package EDU.E9;

class UnsupportedFunctionException extends RuntimeException{
    final private int ERR_CODE;

    public UnsupportedFunctionException(String message, int code) {
        super(message);
        ERR_CODE = code;
    }


    public int getErrorCode(){
        return ERR_CODE;
    }
    public String getMessage(){
        return "["+getErrorCode()+"]"+ super.getMessage();

    }
}



public class E9_9 {
    public static void main(String[] args) throws Exception {

        throw new UnsupportedFunctionException("지원하지 않는 기능 입니다.",100);

    }
}
