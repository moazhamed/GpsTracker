package com.moaaz.gpstracker.Base;


import android.content.Context;
import android.support.v4.app.Fragment;

import com.afollestad.materialdialogs.MaterialDialog;

/**
 * A simple {@link Fragment} subclass.
 */
public class BaseFragment extends Fragment {

    protected static BaseActivity  activity;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        activity = (BaseActivity) context;

    }


    public MaterialDialog showMessage(int titleResId, int messageResId, int posResText) {
        return activity.showMessage(titleResId, messageResId, posResText);
    }

    public MaterialDialog showConfirmationMessage(int titleResId, int messageResId, int posResText,
                                                  MaterialDialog.SingleButtonCallback onPosAction) {
        return activity.showConfirmationMessage(titleResId, messageResId, posResText, onPosAction);
    }

    public static MaterialDialog showMessage(String title, String message, String posResText) {
        return activity.showMessage(title, message, posResText);
    }

    public MaterialDialog showProgressBar() {
        return activity.showProgressBar();
    }

    public void hideProgressBar() {
        activity.showProgressBar();

    }
}
