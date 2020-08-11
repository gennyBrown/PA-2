/*
 * TCSS 305 - SnapShop
 */

package filters;

import image.Pixel;
import image.PixelImage;

/**
 * A filter that flips the image vertically.
 * 
 * @author Marty Stepp
 * @author Daniel M. Zimmerman
 * @author Alan Fowler
 * @version 1.1
 */
public class FlipVerticalFilter extends AbstractFilter {
    /**
     * Constructs a new flip vertical filter.
     */
    public FlipVerticalFilter() {
        super("Flip Vertical");
    }

    /**
     * Filters the specified image.
     * 
     * @param theImage The image.
     */
    @Override
    public void filter(final PixelImage theImage) {
        final Pixel[][] data = theImage.getPixelData();
        for (int row = 0; row < theImage.getHeight() / 2; row++) {
            for (int col = 0; col < theImage.getWidth(); col++) {
                /*
                 * extract local variable
                 * int row2 = theImage.getHeight() - col - 1
                 * by Cynthia
                 */
                int row2 = theImage.getHeight() - row - 1;
                swap(data, row, col, row2, col);
            }
        }
        theImage.setPixelData(data);
    }
}
