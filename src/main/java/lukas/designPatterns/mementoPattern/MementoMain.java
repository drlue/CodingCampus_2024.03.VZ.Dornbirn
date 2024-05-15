package lukas.designPatterns.mementoPattern;

public class MementoMain {


    public static void main(String[] args) {
        //Variante ohne Pattern
        System.out.println("------- OHNE PATTERN TEST -------");
        EditorOrig editor1 = new EditorOrig();
        editor1.setContent("a");
        editor1.setContent("b");
        editor1.setContent("c");
        System.out.println(editor1.getContent());
        editor1.undo();
        System.out.println(editor1.getContent());
        editor1.undo();
        System.out.println(editor1.getContent());
        editor1.redo();
        System.out.println(editor1.getContent());

        //Variante mit MementoPattern
        System.out.println("------- MEMENTO PATTERN TEST -------");

        Editor editor2 = new Editor();
        History history = new History();

        editor2.setContent("a");
        history.push(editor2.createState());
        System.out.println("Set content: " + editor2.getContent());

        editor2.setContent("b");
        history.push(editor2.createState());
        System.out.println("Set content: " + editor2.getContent());

        editor2.setContent("c");
        history.push(editor2.createState());
        System.out.println("Set content: " + editor2.getContent());

        //undo 1
        editor2.restore(history.pop());
        System.out.println("Undo 1: " + editor2.getContent());
        //undo 2
        editor2.restore(history.pop());
        System.out.println("Undo 2: " + editor2.getContent());
        //undo 3
        editor2.restore(history.pop());
        System.out.println("Undo 3: " + editor2.getContent());



    }


}
