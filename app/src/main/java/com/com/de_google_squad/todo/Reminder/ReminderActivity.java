package com.com.de_google_squad.todo.Reminder;

import android.os.Bundle;
import android.support.annotation.NonNull;

import com.com.de_google_squad.todo.AppDefault.AppDefaultActivity;
import com.com.de_google_squad.todo.R;

public class ReminderActivity extends AppDefaultActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected int contentViewLayoutRes() {
        return R.layout.reminder_layout;
    }

    @NonNull
    @Override
    protected ReminderFragment createInitialFragment() {
        return ReminderFragment.newInstance();
    }


}
