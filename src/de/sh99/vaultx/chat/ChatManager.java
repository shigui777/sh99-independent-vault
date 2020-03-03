package de.sh99.vaultx.chat;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;
import org.bukkit.OfflinePlayer;
import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.UUID;

public interface ChatManager
{
    public String getName();

    public boolean isEnabled();

    public boolean isSuperPermsCompatible();

    public boolean has(@NotNull CommandSender sender, @NotNull String permission);

    public boolean add(@NotNull OfflinePlayer offlinePlayer, @NotNull String permission, @Nullable World world);

    public boolean add(@NotNull Player player, @NotNull String permission, @Nullable World world);

    public boolean remove(@NotNull OfflinePlayer offlinePlayer, @NotNull String permission, @Nullable World world);

    public boolean remove(@NotNull Player player, @NotNull String permission, @NotNull World world);

    public boolean addTransient(@NotNull Player player, @NotNull String permission, @Nullable World world);

    public boolean addTransient(@NotNull OfflinePlayer offlinePlayer, @NotNull String permission, @Nullable World world);

    public boolean removeTransient(@NotNull Player player, @NotNull String permission, @Nullable World world);

    public boolean removeTransient(@NotNull OfflinePlayer offlinePlayer, @NotNull String permission, @Nullable World world);

    public boolean groupHas(@NotNull String group, @NotNull String permission, @Nullable World world);

    public boolean groupRemove(@NotNull String group, @NotNull String permission, @Nullable World world);

    public boolean isMember(@NotNull String group, @NotNull Player player, @Nullable World world);

    public boolean isMember(@NotNull String group, @NotNull OfflinePlayer player, @Nullable World world);

    public boolean addMember(@NotNull String group, @NotNull Player player, @Nullable World world);

    public boolean addMember(@NotNull String group, @NotNull OfflinePlayer player, @Nullable World world);

    public boolean removeMember(@NotNull String group, @NotNull Player player, @Nullable World world);

    public boolean removeMember(@NotNull String group, @NotNull OfflinePlayer player, @Nullable World world);

    public List<String> getGroupsByPlayer(@NotNull Player player, @Nullable World world);

    public List<String> getGroupsByPlayer(@NotNull OfflinePlayer offlinePlayer, @Nullable World world);

    public String getPrimaryGroup(@NotNull Player player, @Nullable World world);

    public String getPrimaryGroup(@NotNull OfflinePlayer offlinePlayer, @Nullable World world);

    public List<String> getGroups();

    public boolean hasGroupSupport();


}
