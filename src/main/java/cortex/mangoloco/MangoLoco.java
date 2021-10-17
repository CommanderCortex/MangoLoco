package cortex.mangoloco;

import cortex.mangoloco.Files.SetupFiles;
import org.bukkit.plugin.java.JavaPlugin;

public final class MangoLoco extends JavaPlugin {

    //Local Imports
    SetupFiles setupFiles = new SetupFiles();


    @Override
    public void onEnable() {
        setupFiles.LocalSetup(true);

    }

}
