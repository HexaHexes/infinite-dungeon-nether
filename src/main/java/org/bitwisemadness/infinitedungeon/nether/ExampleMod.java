package org.bitwisemadness.infinitedungeon.nether;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

/**
 * Template mod entry point.
 *
 * <p>Rename {@link #MOD_ID} to match {@code mod_id} in {@code gradle.properties} as
 * part of the rename checklist in the README.</p>
 */
@Mod(InfiniteDungeonNether.MOD_ID)
public final class InfiniteDungeonNether {

    public static final String MOD_ID = "infinite_dungeon_nether";
    public static final Logger LOGGER = LogUtils.getLogger();

    public InfiniteDungeonNether(IEventBus modBus) {
        LOGGER.info("Infinite Dungeon: Nether initialized");
    }
}
