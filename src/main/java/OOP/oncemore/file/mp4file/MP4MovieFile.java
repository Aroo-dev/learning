package OOP.oncemore.file.mp4file;

import OOP.oncemore.file.FileType;

public class MP4MovieFile extends AbstractMovieFile implements MovieFile{
    private String videoName;

    public String getVideoName() {
        return videoName;
    }

    public MP4MovieFile(String name, int size, int sizeOfVideo, String videoName) {
        super(name, size, sizeOfVideo);
        this.videoName = videoName;
    }

    @Override
    public FileType getType() {
        return super.getType();
    }

    @Override
    public void playVideo() {
        System.out.println("playing movie " + videoName );


    }
}
