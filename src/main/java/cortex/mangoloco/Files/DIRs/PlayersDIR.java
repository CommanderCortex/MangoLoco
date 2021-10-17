package cortex.mangoloco.Files.DIRs;

import cortex.mangoloco.Local.DirectoryLocations;

import java.io.File;

public class PlayersDIR {
    DirectoryLocations local = new DirectoryLocations();
    public int Players(){
        File players = new File(local.players);
        if(!players.exists())
            players.mkdir();
        return 0;
    }
}
