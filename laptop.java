import android.util.Log;

public class laptop {
    private String modelName;
    private String color;

    public laptop() {
        Log.d("Laptop", "laptop: this is the parent");
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String newName) {
        modelName = newName;
    }

    public String printColor() {
        return color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
///this methods of print 
    public String printColor(String newColor) {

        return newColor;
    }
}
