package cortex.mangoloco.Files.Players;

import cortex.mangoloco.Files.MakeFile;
import org.bukkit.block.data.type.Switch;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;
import java.io.IOException;

public interface SetupPlayer extends GetPlayerFile {
    MakeFile make = new MakeFile();
    default int NewPlayerSetup(Player player) throws IOException {
        String PlayerFile = get(player);
        File local = new File(PlayerFile);
        make.CreateFile(local);
        YamlConfiguration yamlConfiguration = new YamlConfiguration();
        yamlConfiguration.addDefault("Name", player.getName());
        yamlConfiguration.addDefault("UUID", player.getUniqueId());
        yamlConfiguration.addDefault("Rank", 0);
        yamlConfiguration.addDefault("isBanned", false);
        yamlConfiguration.save(local);
        return 0;
    }
}
