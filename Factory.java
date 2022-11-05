package Biblio;

public class Factory {
    public Library create(String typeOfBook) {
        switch (typeOfBook) {
            case "Head_First_Java" : return new Head_First_Java();
            case "Philosophy_Java" : return new Philosophy_Java();
            default: return null;
        }
    }
}