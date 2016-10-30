package cmsc179.abstrack;

/**
 * Created by justine_navaja on 10/17/2016.
 */

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ShakespeareAdapter extends ArrayAdapter<Shakespeare> {
    private static final String LOG_TAG = ShakespeareAdapter.class.getSimpleName();

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the List is the data we want
     * to populate into the lists
     *  @param context        The current context. Used to inflate the layout file.
     * @param simple_list_item_activated_1
     * @param shakespeares A List of AndroidFlavor objects to display in a list
     */
    public ShakespeareAdapter(Activity context, int simple_list_item_activated_1, List<Shakespeare> shakespeares) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, shakespeares);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The AdapterView position that is requesting a view
     * @param convertView The recycled view to populate.
     *                    (search online for "android view recycling" to learn more)
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Gets the AndroidFlavor object from the ArrayAdapter at the appropriate position
        Shakespeare shakespeare = getItem(position);

        // Adapters recycle views to AdapterViews.
        // If this is a new View object we're getting, then inflate the layout.
        // If not, this view already has the layout inflated from a previous call to getView,
        // and we modify the View widgets as usual.
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_book, parent, false);
        }

        ImageView iconView = (ImageView) convertView.findViewById(R.id.list_item_icon);
        iconView.setImageResource(shakespeare.image);

        TextView versionNameView = (TextView) convertView.findViewById(R.id.list_item_title);
        versionNameView.setText(shakespeare.versionName);

        TextView versionNumberView = (TextView) convertView.findViewById(R.id.list_item_description_textview);
        versionNumberView.setText(shakespeare.versionNumber);
        return convertView;
    }
}
