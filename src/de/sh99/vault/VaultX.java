package de.sh99.vault;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

public interface VaultX
{
    public Environment getEnvironmental(Class<? extends Environment> envClass);

    public void registerEnvironment(Environment env);

    public boolean hasEnvironment(Class<? extends Environment> envClass);

    public static VaultX getRuntimeInstance()
    {
        Plugin plugin = Bukkit.getServer().getPluginManager().getPlugin("IndependentVault");

        if (null == plugin) {
            return null;
        }

        if(!(plugin instanceof VaultX)){
            return null;
        }

        return (VaultX) plugin;
    }
}