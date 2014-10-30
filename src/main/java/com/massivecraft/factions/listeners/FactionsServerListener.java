package com.massivecraft.factions.listeners;

import com.massivecraft.factions.P;
import com.massivecraft.factions.integration.SpoutFeatures;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.server.PluginDisableEvent;
import org.bukkit.event.server.PluginEnableEvent;


public class FactionsServerListener implements Listener {
    public P p;

    public FactionsServerListener(P p) {
        this.p = p;
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onPluginDisable(PluginDisableEvent event) {
        SpoutFeatures.setup();
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onPluginEnable(PluginEnableEvent event) {
        SpoutFeatures.setup();
    }
}