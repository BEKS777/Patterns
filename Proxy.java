package Biblio;

public class Proxy implements Project{
    private String url;
    private Download download;

    public Proxy(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if(download == null){
            download = new Download(url);


        }
        download.run();
    }
}
