package cortex.mangoloco.Files.DIRs;

import cortex.mangoloco.Local.DirectoryLocations;

import java.io.File;

public class CortexDIR {
    DirectoryLocations local = new DirectoryLocations();
    public int Cortex(){
        File _cortex = new File(local.cortex);
        if(!_cortex.exists())
            _cortex.mkdir();
        return 0;
    }
}
