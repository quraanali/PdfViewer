package com.quraanali.pdfviwer.listener;

public interface OnRenderListener {

    /**
     * Called only once, when document is rendered
     * @param nbPages number of pages
     */
    void onInitiallyRendered(int nbPages);
}
