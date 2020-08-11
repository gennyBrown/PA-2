/*
 * TCSS 305 - SnapShop
 */

package filters;

import image.Pixel;
import image.PixelImage;

/**
 * A filter that flips the image horizontally.
 * 
 * @author Marty Stepp
 * @author Daniel M. Zimmerman
 * @author Alan Fowler
 * @version 1.1
 */
public class FlipHorizontalFilter extends AbstractFilter {
    /**
     * Constructs a new flip horizontal filter.
     */
    public FlipHorizontalFilter() {
        super("Flip Horizontal");
    }

    /**
     * Filters the specified image.
     * 
     * @param theImage The image.
     */
    @Override
    public void filter(final PixelImage theImage) {
        final Pixel[][] data = theImage.getPixelData();
        for (int row = 0; row < theImage.getHeight(); row++) {
            for (int col = 0; col < theImage.getWidth() / 2; col++) {
                /*
                 * extract local variable
                 * int col2 = theImage.getWidth() - col - 1
                 * by Cynthia
                 */
                int col2 = theImage.getWidth() - col - 1;
                swap(data, row, col, row, col2);
            }
        }
        theImage.setPixelData(data);
    }
}
