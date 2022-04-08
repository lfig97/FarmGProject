import java.util.Arrays;

public class Field {
    private CropRow[] cropRow;

    public CropRow[] getCropRow() {
        return cropRow;
    }

    public void setCropRow(CropRow[] cropRow) {
        this.cropRow = cropRow;
    }

    @Override
    public String toString() {
        return "Field{" +
                "cropRow=" + Arrays.toString(cropRow) +
                '}';
    }
}
