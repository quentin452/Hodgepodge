package com.mitchej123.hodgepodge.config.gui;

import net.minecraft.client.gui.GuiScreen;

import com.gtnewhorizon.gtnhlib.config.ConfigException;
import com.gtnewhorizon.gtnhlib.config.SimpleGuiConfig;
import com.mitchej123.hodgepodge.config.*;

public class HodgepdgeGuiConfig extends SimpleGuiConfig {

    public HodgepdgeGuiConfig(GuiScreen parent) throws ConfigException {
        super(
                parent,
                "hodgepodge",
                "hodgepodge",
                ASMConfig.class,
                DebugConfig.class,
                FixesConfig.class,
                OverallConfig.class,
                PollutionConfig.class,
                PollutionRecolorConfig.class,
                SpeedupsConfig.class,
                TweaksConfig.class);
    }
}
