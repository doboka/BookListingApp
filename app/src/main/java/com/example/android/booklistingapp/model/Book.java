package com.example.android.booklistingapp.model;

import android.graphics.Bitmap;

/**
 * An {@link Book} object contains information related to a single book.
 */
public class Book {

    /**
     * Author of the book
     */
    private String mAuthor;

    /**
     * Title of the book
     */
    private String mTitle;

    /**
     * Website of the book
     */
    private String mUrl;

    /**
     * thumbnail of the cover of the book
     */
    private Bitmap mThumbnail;

    /**
     * Constructs a new {@link Book} object.
     *
     * @param author    is the author of the book
     * @param title     is the title of the book
     * @param thumbnail is the thumbnail of the cover of the book
     * @param url       is the website URL to find more details about the book
     */

    public Book(String author, String title, Bitmap thumbnail, String url) {
        mAuthor = author;
        mTitle = title;
        mThumbnail = thumbnail;
        mUrl = url;
    }

    /**
     * Returns the URL of the book
     */
    public String getUrl() {
        return mUrl;
    }

    /**
     * Returns the thumbnail of the book
     */
    public Bitmap getThumbnail() {
        return mThumbnail;
    }

    /**
     * Returns the author of the book
     */
    public String getAuthor() {
        return mAuthor;
    }

    /**
     * Returns the title of the book
     */
    public String getTitle() {
        return mTitle;
    }

}
