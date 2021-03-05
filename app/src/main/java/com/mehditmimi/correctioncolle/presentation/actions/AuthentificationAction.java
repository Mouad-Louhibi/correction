package com.mehditmimi.correctioncolle.presentation.actions;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.mehditmimi.correctioncolle.presentation.controllers.AccueilActivity;
import com.mehditmimi.correctioncolle.presentation.controllers.MainActivity;
import com.mehditmimi.correctioncolle.utils.MyContext;

public class AuthentificationAction implements View.OnClickListener {
    private MainActivity mainActivity;
    private MyContext myContext;
    @Override
    public void onClick(View v) {
        if(myContext.getServices().seConnecter(
                mainActivity.getEmailInput().getText().toString(),
                mainActivity.getPasswordInput().getText().toString()))
        {
            // naviguer vers une autre activite
            Intent intent=new Intent(myContext, AccueilActivity.class);
            mainActivity.startActivity(intent);

        }
        else {
            Toast.makeText(myContext,"erreur",Toast.LENGTH_LONG).show();
        }
    }

    public void setMainActivity(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
        myContext= (MyContext) mainActivity.getApplicationContext();
    }
}
