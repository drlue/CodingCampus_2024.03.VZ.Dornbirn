package lukas.designPatterns.mementoPattern;

import java.util.Vector;

public class EditorOrig {
    private String content;
    private Vector<String> contentHistory = new Vector<>();
    private Vector<String> undoHistory = new Vector<>();
    private int contentIndex;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        contentHistory.add(content);
    }

    public void undo() {
        if(contentHistory.size()>1){
            undoHistory.add(contentHistory.removeLast());
            this.content = contentHistory.getLast();
        }else {
            System.out.println("Nichts rückgängig zu machen");
        }



    }

    public void redo() {
        if(!undoHistory.isEmpty()) {
            this.content = undoHistory.removeLast();
        } else {
            System.out.println("Es kann nichts mehr wieder hergestellt werde,");
        }
    }
}
