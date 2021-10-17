package cortex.mangoloco.Files;

import java.io.File;
import java.io.IOException;

public class MakeFile {

    public int CreateFile(File file){
        if(!file.exists())
            System.out.print(file + " Could not be found, Now Creating one\n");
        try {
            file.createNewFile();
            System.out.print(file + " Has Been Created!\n");
        } catch (IOException e) {
            System.out.print(file + " Error Handling File:\n");
            e.printStackTrace();
        }
        return 0;
    }
}
