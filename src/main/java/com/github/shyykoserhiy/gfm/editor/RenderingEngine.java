package com.github.shyykoserhiy.gfm.editor;

public enum RenderingEngine {
    FX_WEBVIEW("JavaFX WebView");
    private String text;

    RenderingEngine(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public static RenderingEngine getTypeByText(String text) {
        for (RenderingEngine renderingEngine : RenderingEngine.values()) {
            if (renderingEngine.text.equals(text)) {
                return renderingEngine;
            }
        }
        return null;
    }
}
