package disnet2main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new Nether2MainEvent(),this);
        Bukkit.getPluginManager().registerEvents(new DisableWorldCalc(),this);
    }
}
