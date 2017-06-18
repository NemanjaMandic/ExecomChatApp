package eu.execom.chatapplicationspring2017.view;

import android.content.Context;

import org.androidannotations.annotations.EViewGroup;

import eu.execom.chatapplicationspring2017.R;

/**
 * Created by Alex on 5/20/17.
 */

@EViewGroup(R.layout.item_view_message_outgoing)
public class OutgoingMessageItemView extends BaseMessageItemView {

    public OutgoingMessageItemView(Context context) {
        super(context);
    }

}
