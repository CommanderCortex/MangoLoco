package cortex.mangoloco.Files.Players;

import cortex.mangoloco.Local.DirectoryLocations;
import org.bukkit.entity.Player;

public interface GetPlayerFile {
    DirectoryLocations local = new DirectoryLocations();
    default String get(Player player){
        return local.players + player.getUniqueId();
    }
}
