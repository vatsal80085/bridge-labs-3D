package Interfacepractice.LearnTrack;

public class VideoRenderer implements CourseContentRenderer {

    public void renderContent(String content) {
        System.out.println("🎥 Playing video: " + content);
    }

}
