package lukas.designPatterns.mementoPattern;

public class Editor {
    private String content;
    //--get set
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    //--methods
    public EditorState createState() {
        return new EditorState(content);
    }

    public void restore(EditorState state) {
        content = state.getContent();
    }
}
