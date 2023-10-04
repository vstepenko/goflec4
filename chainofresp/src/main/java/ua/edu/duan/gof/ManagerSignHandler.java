package ua.edu.duan.gof;

public class ManagerSignHandler implements SignHandler{

    private final SignHandler nextHandler;

    public ManagerSignHandler(SignHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void sign(String docName) {
        System.out.println("Manager Sign Document" + docName);
        if(nextHandler != null) {
            nextHandler.sign(docName);
        }
    }
}
