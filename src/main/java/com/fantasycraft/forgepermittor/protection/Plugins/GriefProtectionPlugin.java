package com.fantasycraft.forgepermittor.protection.Plugins;

import com.fantasycraft.forgepermittor.info.types.BlockType;
import com.fantasycraft.forgepermittor.info.types.ItemType;
import com.fantasycraft.forgepermittor.protection.IprotectionPlugin;
import com.fantasycraft.forgepermittor.protection.MessageType;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

/**
 * Created by thomas on 8/16/2014.
 */
public class GriefProtectionPlugin implements IprotectionPlugin {

    @Override
    public boolean CanUseBlock(Player player, Block block, BlockType type) {
        return false;
    }

    @Override
    public boolean CanUseItem(Player player, Location location, ItemType type) {
        return false;
    }

    @Override
    public void SendErrorMessage(Player player, MessageType type) {

    }
}
