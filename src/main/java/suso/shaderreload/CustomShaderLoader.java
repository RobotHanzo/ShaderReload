package suso.shaderreload;

import net.minecraft.client.gl.ShaderLoader;
import net.minecraft.client.texture.TextureManager;

public class CustomShaderLoader extends ShaderLoader {
    public CustomShaderLoader(TextureManager textureManager) {
        super(textureManager, CustomShaderLoader::onShaderError);
    }



    static void onShaderError(Exception e) {

    }
}
