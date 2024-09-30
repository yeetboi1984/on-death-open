package net.yeetboi1984.ondeathopen;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;

@Environment(EnvType.CLIENT)
public class WarningMenu extends Screen{

    private final Screen parent;

    public WarningMenu(Screen parent) {
        super(Text.literal("WARNING!"));
        this.parent = parent;
    }
    
    public ButtonWidget button1;



    @Override
    protected void init() {
        button1 = ButtonWidget.builder(Text.literal("I understand and wish to continue"), button -> {
            close();
        })
            .dimensions(width / 2 - 205, 20, 200, 20)
            .build();
        addDrawableChild(button1);
    }

    @Override
    public void close()
    {
        client.setScreen(parent);
    }
}
