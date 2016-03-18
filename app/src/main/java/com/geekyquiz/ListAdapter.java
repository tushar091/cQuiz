package com.geekyquiz;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

/**
 * Created by tushar on 8/2/16.
 */
public class ListAdapter extends CursorAdapter {
    private LayoutInflater mLayoutInflater;

    public ListAdapter(Context context, Cursor cursor, int i) {
        super(context, cursor, i);
        mLayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        View view = mLayoutInflater.inflate(R.layout.correct_answer_layout, null, false);
        ViewHolder viewHolder = new ViewHolder();
        viewHolder.mQuestionText = (TextView) view.findViewById(R.id.result_question);
        viewHolder.mAnswertext = (TextView) view.findViewById(R.id.result_answer);
        view.setTag(viewHolder);
        return view;
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        ViewHolder viewHolder = (ViewHolder)view.getTag();
        int ans = cursor.getInt(6);
        viewHolder.mQuestionText.setText(cursor.getString(1));
        viewHolder.mAnswertext.setText(cursor.getString(ans + 1));

    }

    public static class ViewHolder {
        public TextView mQuestionText;
        public TextView mAnswertext;
    }
}
