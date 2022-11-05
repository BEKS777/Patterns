package Biblio;

public class Book {
    String name;
    String color;
    int maxPage;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
    public int getMaxPage() {
        return maxPage;
    }

    private Book(Builder builder) {
        this.name = builder.name;
        this.color = builder.color;
        this.maxPage = builder.maxPage;
    }

    static class Builder {
        private String name;
        private String color;
        private int maxPage;


        public Builder(String name) {
            this.name = name;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setMaxPage(int maxPage) {
            this.maxPage = maxPage;
            return this;
        }
        public Book publish() {
            return new Book (this);
        }
}
}

