package com.packtpub.libgdx.canyonbunny.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.tools.texturepacker.TexturePacker;
import com.packtpub.libgdx.canyonbunny.CanyonBunnyMain;

public class DesktopLauncher {
    public static void main (String[] arg) {
        boolean rebuildAtlas = true;

        if (rebuildAtlas) {
            TexturePacker.Settings settings = new TexturePacker.Settings();
            settings.maxWidth = 1024;
            settings.maxHeight = 1024;
            settings.duplicatePadding = false;
            settings.debug = false;

            TexturePacker.processIfModified(settings, "../../desktop/assets-raw/images", "../../android/assets/images", "canyonbunny.pack");
            TexturePacker.processIfModified(settings, "../../desktop/assets-raw/images-ui", "../../android/assets/images", "canyonbunny-ui.pack");

        }
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new CanyonBunnyMain(), config);
	}
}
