package disnet2main;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class DisableWorldCalc implements Listener {

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPreCommandProcess(PlayerCommandPreprocessEvent e) {

        String command = e.getMessage();
        if ((command.startsWith("/worldedit:/calc")) ||
                (command.startsWith("/worldedit:/eval")) ||
                (command.startsWith("/worldedit:/solve")) ||
                (command.startsWith("/worldedit:/evaluate")) ||
                (command.startsWith("/worldedit:/calculate")) ||
                (command.startsWith("//calc")) ||
                (command.startsWith("//eval")) ||
                (command.startsWith("//solve")) ||
                (command.startsWith("//evaluate")) ||
                (command.startsWith("//calculate"))) {
            e.setCancelled(true);
        }
    }
}
