package ocr;


import java.awt.image.BufferedImage;
import java.util.logging.Logger;

/**
 * Empty implementation of DocumentScannerListener interface which can be
 * subclassed and only have the needed methods overridden.  This prevents
 * implementing classes from being forced to implement all methods in the
 * interface.
 * @author Ronald B. Cemer
 */
public class DocumentScannerListenerAdaptor
        implements DocumentScannerListener
{

    @Override
    public void beginDocument(PixelImage pixelImage)
    {
    }

    @Override
    public void beginRow(PixelImage pixelImage, int y1, int y2)
    {
    }

    @Override
    public BufferedImage processChar(PixelImage pixelImage, int x1, int y1, int x2, int y2, int rowY1, int rowY2)
    {
		return null;
    }

    @Override
    public void processSpace(PixelImage pixelImage, int x1, int y1, int x2, int y2)
    {
    }

    @Override
    public void endRow(PixelImage pixelImage, int y1, int y2)
    {
    }

    @Override
    public void endDocument(PixelImage pixelImage)
    {
    }
    private static final Logger LOG = Logger.getLogger(DocumentScannerListenerAdaptor.class.getName());
}
