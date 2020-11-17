public class Post {
    private String title;
    private String author;
    private String datePosted;
    private int numberOfWords;
    private int numberOfCharacters;
    public Post(String title, String author) {
        this(title, author, null);
    }
    public Post(String title, String author, String datePosted) {
        this(title, author, datePosted, 0);
    }
    public Post(String title, String author, String datePosted, int numberOfWords) {
        this(title, author, datePosted, numberOfWords, 0);
    }
    public Post(String title, String author, String datePosted, int numberOfWords, int numberOfCharacters) {
        this.title = title;
        this.author = author;
        this.datePosted = datePosted;
        this.numberOfWords = numberOfWords;
        this.numberOfCharacters = numberOfCharacters;
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", datePosted='" + datePosted + '\'' +
                ", numberOfWords=" + numberOfWords +
                ", numberOfCharacters=" + numberOfCharacters +
                '}';
    }
}

