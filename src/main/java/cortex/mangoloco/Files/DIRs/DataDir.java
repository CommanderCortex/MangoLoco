package cortex.mangoloco.Files.DIRs;

import cortex.mangoloco.Local.DirectoryLocations;

import java.io.File;

public class DataDir {
    DirectoryLocations local = new DirectoryLocations();
    public int Data(){
        File data = new File(local.data);
        if(!data.exists())
            data.mkdir();
        return 0;
    }
}
