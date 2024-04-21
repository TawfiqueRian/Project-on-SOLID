/**
 * Title: This program demonstrates the Dependency Inversion Principle by implementing a media player application
   that can play audio and video files using different player implementations.
 * Author: Md. Tawfiqul Islam, Undergraduate student, Khulna University
 */

// Interface for MediaPlayer
interface MediaPlayer {
    void play();
}

// Interface for AudioPlayer
interface AudioPlayer extends MediaPlayer {
    void playAudio(String audioFile);
}

// Interface for VideoPlayer
interface VideoPlayer extends MediaPlayer {
    void playVideo(String videoFile);
}

// Concrete implementation of AudioPlayer
class BasicAudioPlayer implements AudioPlayer {
    @Override
    public void play() {
        System.out.println("Playing audio...");
    }

    @Override
    public void playAudio(String audioFile) {
        System.out.println("Playing audio file: " + audioFile);
    }
}

// Concrete implementation of VideoPlayer
class BasicVideoPlayer implements VideoPlayer {
    @Override
    public void play() {
        System.out.println("Playing video...");
    }

    @Override
    public void playVideo(String videoFile) {
        System.out.println("Playing video file: " + videoFile);
    }
}

// High-level class MediaPlayerApp depends on abstractions (MediaPlayer, AudioPlayer, VideoPlayer)
class MediaPlayerApp {
    private MediaPlayer mediaPlayer;

    /**
     * Constructor for MediaPlayerApp class.
     * @param mediaPlayer The media player to be used.
     */
    public MediaPlayerApp(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    /**
     * Plays media using the configured player.
     */
    public void playMedia() {
        mediaPlayer.play();
    }
}

public class dependency_inversion_principle {
    public static void main(String[] args) {
        // Creating instances of different media players
        AudioPlayer audioPlayer = new BasicAudioPlayer();
        VideoPlayer videoPlayer = new BasicVideoPlayer();

        // Creating a media player application for audio
        MediaPlayerApp audioApp = new MediaPlayerApp(audioPlayer);
        audioApp.playMedia();

        // Creating a media player application for video
        MediaPlayerApp videoApp = new MediaPlayerApp(videoPlayer);
        videoApp.playMedia();
    }
}
