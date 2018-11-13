public class Post {
    public String authorName;
    public String created_at;
    public String updated_at;
    public String topic;
    public String content;
    public String title;
    public int views;
    public double rating;

    // create a blog post
    public static void main(String[] args) {
        Post p = new Post();
        p.authorName = "Stephen Guedea";
        p.created_at = "January 24, 2018";
        p.updated_at = "January 31, 2018";
        p.topic = "Birthday";
        p.content = "Today I'm celebrating my birthday!";
        p.title = "My Birthday Bash";
        p.views = 20;
        p.rating = 5;

        System.out.println(p.authorName);

    }

}
