package com.uraneptus.fishermens_trap.core.data.client;

import com.uraneptus.fishermens_trap.FishermensTrap;
import com.uraneptus.fishermens_trap.core.registry.FTBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class FTLangProvider extends LanguageProvider {

    public FTLangProvider(DataGenerator gen) {
        super(gen, FishermensTrap.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(FishermensTrap.MOD_ID + ".container.fishtrap", "Fishtrap");
        addBlock(FTBlocks.FISHTRAP, "Fishtrap");

    }

}