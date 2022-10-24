package OOP.oncemore;

import OOP.oncemore.drive.ArosFile;
import OOP.oncemore.drive.Drive;
import OOP.oncemore.file.File;
import OOP.oncemore.file.imagefile.GifImageFile;
import OOP.oncemore.file.imagefile.JPGImageFile;
import OOP.oncemore.file.mp4file.MP4MovieFile;
import OOP.oncemore.file.musicfile.MP3MusicFile;

public class Main {
    public static void main(String[] args) {
        GifImageFile gif1 = new GifImageFile("nazwa1gif", 100);
        JPGImageFile jpg1 = new JPGImageFile("nazwa1.jpg", 200, 80);
        MP3MusicFile musicFile = new MP3MusicFile("plik.mp3", 4000, "Madonna"
        , "gimme gimme", 100);
        MP4MovieFile movieFile = new MP4MovieFile("nazwa1.mp4", 300, 120, "Hobbit");
        movieFile.playVideo();
        movieFile.getVideoName();

        Drive arosDrive = new ArosFile();



//        arosDrive.addFiles(gif1);
//        arosDrive.addFiles(jpg1);

//        arosDrive.addFiles(musicFile);
        arosDrive.addFiles(movieFile);
        arosDrive.listFiles();



    }
}
