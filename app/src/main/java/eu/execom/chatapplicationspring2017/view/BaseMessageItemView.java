package eu.execom.chatapplicationspring2017.view;

import android.content.Context;
import android.text.format.DateFormat;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

import eu.execom.chatapplicationspring2017.model.Message;

/**
 * Created by Alex on 5/20/17.
 */

@EViewGroup
public class BaseMessageItemView extends RelativeLayout {

    @ViewById
    TextView messageTime;

    @ViewById
    TextView messageUser;

    @ViewById
    TextView messageText;

    @ViewById
    SimpleDraweeView userPhoto;

    public BaseMessageItemView(Context context) {
        super(context);
    }

    public BaseMessageItemView bind(Message message) {
        messageText.setText(message.getText());
        messageTime.setText(DateFormat.format("HH:mm dd MMM", message.getTimestamp()));
        messageUser.setText(message.getUser().getUsername());
        userPhoto.setImageURI(message.getUser().getPhotoUrl());

        return this;
    }

}
