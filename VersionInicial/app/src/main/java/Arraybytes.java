import android.graphics.Bitmap;
import android.util.Base64;
import android.widget.ImageView;

import java.io.ByteArrayOutputStream;

public class Arraybytes {
    public void obtener()
    {
        Bitmap imageBitmap = null;//(Bitmap) extras.get("data");


        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        imageBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream .toByteArray();
    }
}
