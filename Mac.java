import android.util.Log;

public class Mac extends laptop {
    public Mac() {
        Log.d("Mac", "Mac: this is the child" + super.printColor("red"));

        String macColor = super.getColor();
    }

    public String printColor() {
        return "nothing";
    }
}
