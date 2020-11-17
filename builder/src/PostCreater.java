import java.util.ArrayList;

/**
 * @todo: nutze das Builder Pattern um Posts zu erstellen
 *
 * Nutze den Builder so, dass Du title und author nur 1x setzen und danach jeweils nur noch die anderen 3 Instanzvariabeln (datePosted, numberOfWords und numberOfCharacters) setzen musst
 */

public class PostCreater {
    static ArrayList<Post> posts = new ArrayList<>();
    public static void main(String[] args) {
        posts.add(new Post("blog-post", "javadevcentral"));
        posts.add(new Post("blog-post", "javadevcentral", "17.11"));
        posts.add(new Post("blog-post", "javadevcentral", "18.11", 1000, 5000));
        printPosts();
    }

    static void printPosts() {
        for (Post post : posts) {
            System.out.println(post);
        }
    }

}
