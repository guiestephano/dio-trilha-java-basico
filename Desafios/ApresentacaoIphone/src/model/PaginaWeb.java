package model;

public class PaginaWeb {
    private String url;

    public PaginaWeb(){
        url = "www.safari.com";
    }
    public PaginaWeb(String url){
        this.url = url;
    }
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
