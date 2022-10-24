package OOP.oncemore.file.mp4file;

import OOP.oncemore.file.AbstractFile;
import OOP.oncemore.file.FileType;

public abstract class AbstractMovieFile extends AbstractFile {

    protected int sizeOfVideo;
    public AbstractMovieFile(String name, int size, int sizeOfVideo) {
        super(name, size);
        this.sizeOfVideo =  sizeOfVideo;
    }

    @Override


    public FileType getType() {
        return FileType.VIDEO;
    }
}
