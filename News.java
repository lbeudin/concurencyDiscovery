public class News {
    private final String message;
    private final String title;

    public News(String message, String title) {

        this.message = message;
        this.title = title;
    }

    public String getMessage() {
        return message;
    }
    public String getTitle() {
        return title;
    }
}
