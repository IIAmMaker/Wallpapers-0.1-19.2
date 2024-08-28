package net.im_maker.wallpapers.common.block.block_values;

import net.minecraft.util.StringRepresentable;

public enum SkirtingBoard implements StringRepresentable {
    NONE("none"),
    DRIPSTONE("dripstone"),
    QUARTZ("quartz"),
    GOLD("gold"),
    PRISMARINE("prismarine"),
    STONE("stone"),
    DEEPSLATE("deepslate"),
    BLACKSTONE("blackstone");

    private final String name;

    SkirtingBoard(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    public String getSerializedName() {
        return name;
    }
}
