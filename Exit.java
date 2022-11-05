package Biblio;

public class Exit {
    String i = "Thanks for using our store";
    static Exit Exit = new Exit();
    private Exit() {
    }
    public static Exit getInstance() {
        return Exit;
    }
}
