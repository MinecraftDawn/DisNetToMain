package disnet2main;

import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPortalEvent;

public class Nether2MainEvent implements Listener {
    @EventHandler()
    public void onPlayerPassPortalEvent(PlayerPortalEvent e) {
        Player p = e.getPlayer();

        if (p.getWorld().getEnvironment().equals(World.Environment.NETHER)) {
            e.setCancelled(true);
        }
    }
}
