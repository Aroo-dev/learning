package powtorka.room;

public class Bed {
    private String style;
    private int pillow;
    private int height;
    private int sheets;
    private int guilt;

    public Bed(String style, int pillow, int height, int sheets, int guilt) {
        this.style = style;
        this.pillow = pillow;
        this.height = height;
        this.sheets = sheets;
        this.guilt = guilt;
    }
    public void make(){
        System.out.print("Bed -> Making | ");
    }
    public String getStyle() {
        return style;
    }

    public int getPillow() {
        return pillow;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getGuilt() {
        return guilt;
    }
}
