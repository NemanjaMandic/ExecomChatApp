package eu.execom.chatapplicationspring2017.view;

import android.content.Context;

import org.androidannotations.annotations.EViewGroup;

import eu.execom.chatapplicationspring2017.R;

/**
 * Created by Alex on 5/20/17.
 */

@EViewGroup(R.layout.item_view_message_incoming)
public class IncomingMessageItemView extends BaseMessageItemView {

    public IncomingMessageItemView(Context context) {
        super(context);
    }

}
