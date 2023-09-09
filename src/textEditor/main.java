package textEditor;

public class main {
    public static void main(String[] args) {
        TextEditor txt=new TextEditor();
        txt.addText("leetcode");
        txt.display();
        System.out.println("");
        txt.deleteText(4);
        txt.addText("practice");
        txt.display();

        txt.cursorLeft(8);
        System.out.println(txt.display(10));
    }
}
