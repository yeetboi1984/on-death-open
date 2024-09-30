package net.yeetboi1984.ondeathopen;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

@Config(name = "ondeathopen")
public class OnDeathOpenConfig implements ConfigData {
    public String command = "echo Hello World! && pause";
}