package ua.edu.duan.gof;

public class ChainTest {

    public static void main(String[] args) {

        singSingleDocument("Document1");
        singComplicatedDocument("Document2");
    }

    public static void singSingleDocument(String documentName){

        SignHandler signHandler =  new DeveloperSignHandler( new ManagerSignHandler(null));
        signHandler.sign(documentName);
    }

    public static void singComplicatedDocument(String documentName){
        SignHandler signHandler =  new DeveloperSignHandler( new ManagerSignHandler(new PresidentSignHandler(null)));
        signHandler.sign(documentName);
    }
}
