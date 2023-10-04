package ua.edu.duan.gof;

public class PresidentSignHandler implements  SignHandler{

    private final SignHandler nextHandler;

    public PresidentSignHandler(SignHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void sign(String docName) {
        System.out.println("President Sign Document" + docName);
        if(nextHandler != null) {
            nextHandler.sign(docName);
        }
    }
}
