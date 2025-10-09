package Interfacepractice.LearnTrack;

public class PDFRenderer implements CourseContentRenderer {
    public void renderContent(String content) {
        System.out.println("📄 Displaying PDF: " + content);
    }
}