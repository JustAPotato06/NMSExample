package dev.potato.nmsexample;

import dev.potato.nmsexample.listeners.PlayerMovementListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class NMSExample extends JavaPlugin {

    @Override
    public void onEnable() {
        // Listeners
        registerListeners();
    }

    private void registerListeners() {
        getServer().getPluginManager().registerEvents(new PlayerMovementListener(), this);
    }
}