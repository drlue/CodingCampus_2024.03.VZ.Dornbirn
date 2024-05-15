package lukas.designPatterns.mementoPattern;

import java.util.ArrayList;
import java.util.List;

public class History {

    private List<EditorState> states = new ArrayList<>();

    public void push(EditorState state) {
        states.add(state);
    }

    public EditorState pop() {
        return states.removeLast();
    }
}
