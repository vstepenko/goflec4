package ua.edu.duan.gof;

public class DeveloperSignHandler implements SignHandler{

    private final SignHandler nextHandler;

    public DeveloperSignHandler(SignHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void sign(String docName) {
        if(!docName.equals("test")) {
            System.out.println("Developer Sign Document" + docName);
        }
        if(nextHandler != null) {
            nextHandler.sign(docName);
        }
    }
}
