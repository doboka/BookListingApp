package com.example.android.booklistingapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.booklistingapp.model.Book;

import java.util.List;

/**
 * An {@link BookAdapter} knows how to create a list item layout for each book
 * in the data source (a list of {@link com.example.android.booklistingapp.model.Book} objects).
 * <p>
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */

public class BookAdapter extends ArrayAdapter<Book> {

    /**
     * Constructs a new {@link BookAdapter}.
     *
     * @param context of the app
     * @param books   is the list of books, which is the data source of the adapter
     */
    public BookAdapter(Context context, List<Book> books) {
        super(context, 0, books);
    }

    /**
     * Returns a list item view that displays information about the book at the given position
     * in the list of books.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Find the book at the given position in the list of books
        Book currentBook = getItem(position);

        // Find the TextView with view ID author_name
        TextView authorView = (TextView) listItemView.findViewById(R.id.author_name);
        // Display the name of the author in that TextView
        authorView.setText(currentBook.getAuthor());

        // Find the TextView with view ID book_title
        TextView titleView = (TextView) listItemView.findViewById(R.id.book_title);
        // Display the title of the book in that TextView
        titleView.setText(currentBook.getTitle());

        // Find the ImageView with view ID cover and display the thumbnail in that ImageView
        // if the current book has thumbnail
        if (currentBook.getThumbnail() != null) {
            ImageView thumbnailView = (ImageView) listItemView.findViewById(R.id.cover);
            thumbnailView.setImageBitmap(currentBook.getThumbnail());
        }

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }
}
