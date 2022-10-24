package powtorka.printer;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplexPrinted;

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public Printer(int tonerLevel, boolean duplexPrinted) {
        if (tonerLevel > -1 && tonerLevel <= 100){
            this.tonerLevel =  tonerLevel;

        } else {
            this.tonerLevel = -1;
        }
        this.pagesPrinted = 0;
        this.duplexPrinted = duplexPrinted;
    }
    public int fillUpToner ( int x){
        if (tonerLevel + x >  100){
            tonerLevel = 100;
            return tonerLevel;
        } else if ( x < 0){
            return 0;
        } else{
            tonerLevel += tonerLevel + x;
        } return tonerLevel;
    }
    public int pagesPrinted(int pages){
        if (duplexPrinted){
            pages  = (pages / 2) + (pages % 2);
        }
        this.pagesPrinted += pages;
        return pagesPrinted;
        }

    }

