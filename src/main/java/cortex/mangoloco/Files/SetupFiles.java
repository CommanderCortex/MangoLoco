package cortex.mangoloco.Files;

import cortex.mangoloco.Files.DIRs.CortexDIR;
import cortex.mangoloco.Files.DIRs.DataDir;
import cortex.mangoloco.Files.DIRs.PlayersDIR;

public class SetupFiles {
    CortexDIR cortex = new CortexDIR();
    DataDir data = new DataDir();
    PlayersDIR players = new PlayersDIR();

    public int LocalSetup(boolean Value){
        if(Value)
            cortex.Cortex();
            data.Data();
            players.Players();
        return 0;
    }
}
