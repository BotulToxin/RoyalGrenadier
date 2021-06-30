package net.forthecrown.grenadier.types.block;

import org.bukkit.Keyed;
import org.bukkit.Material;
import org.bukkit.block.data.BlockData;

/**
 * Represents a block or block data which has been parsed through Brigadier
 */
public interface ParsedBlock extends Keyed, net.kyori.adventure.key.Keyed {
    BlockData getData();
    Material getMaterial();
}
