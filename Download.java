package Biblio;

public class Download implements Project{
    private String url;

    public Download(String url) {
        this.url = url;
        load();
    }

    public void load(){
        System.out.println("Downloading...  " + url);
    }

    @Override
    public void run() {
        System.out.println("Running..." + url);
    }
}
