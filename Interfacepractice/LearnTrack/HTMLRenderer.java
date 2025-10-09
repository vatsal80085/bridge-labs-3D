package Interfacepractice.LearnTrack;

public class HTMLRenderer implements CourseContentRenderer {
    public void renderContent(String content) {
        System.out.println("🌐 Rendering HTML page: " + content);
    }
}

