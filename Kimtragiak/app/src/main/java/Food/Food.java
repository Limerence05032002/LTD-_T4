package Food;

public class Food {
    private int sourceImage;
    private int sourceStar;
    private String title;

    public Food(int sourceImage, int sourceStar, String title) {
        this.sourceImage = sourceImage;
        this.sourceStar = sourceStar;
        this.title = title;
    }

    public int getSourceImage() {
        return sourceImage;
    }

    public void setSourceImage(int sourceImage) {
        this.sourceImage = sourceImage;
    }

    public int getSourceStar() {
        return sourceStar;
    }

    public void setSourceStar(int sourceStar) {
        this.sourceStar = sourceStar;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
