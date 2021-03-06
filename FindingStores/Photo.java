package NeededFiles;

import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;
import java.io.InputStream;

/**
 * Represents a referenced photo.
 */
public class Photo {
    private final Place place;
    private final String reference;
    private final int width, height;
    private InputStream image;

    protected Photo(Place place, String reference, int width, int height) {
        this.place = place;
        this.reference = reference;
        this.width = width;
        this.height = height;
    }

    /**
     * Downloads the photo and caches it within the photo.
     *
     * @param maxWidth    of photo
     * @param maxHeight   of photo
     * @param extraParams to append to request url
     * @return this
     */
    

    /**
     * Downloads the photo and caches it within the photo.
     *
     * @param extraParams to append to request url
     * @return this
     */
    

    /**
     * Returns the input stream of the image. {@link #download(int, int, Param...)}
     * must be called prior to calling this.
     *
     * @return input stream
     */
    public InputStream getInputStream() {
        return image;
    }

    /**
     * Returns an Image from the specified photo reference.
     *
     * @return image
     */
    public BufferedImage getImage() {
        try {
            return ImageIO.read(image);
        } catch (Exception e) {
            throw new GooglePlacesException(e);
        }
    }

    /**
     * Returns the reference token to the photo.
     *
     * @return reference token
     */
    public String getReference() {
        return reference;
    }

    /**
     * Returns the width of the photo.
     *
     * @return photo width
     */
    public int getWidth() {
        return width;
    }

    /**
     * Returns the height of the photo.
     *
     * @return photo height
     */
    public int getHeight() {
        return height;
    }
}
