package net.witcher_rpg.item.misc;

import net.minecraft.util.Identifier;
import net.spell_engine.item.UniversalSpellBookItem;

public class MasterSpellBook extends UniversalSpellBookItem {
    public MasterSpellBook(Settings settings) {
        super(settings.fireproof());
    }
}
