package com.chatton.marina.holdall.fragments;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;

import com.chatton.marina.holdall.R;

public class FragmentsActivity extends FragmentActivity implements BtnFragment.OnBtnClickListener{
    private static int clickCountLandscape = 0;
    private static int clickCountPortrait = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments);

        //if(findViewById(r.id.fragments_container)!=null): portrait mode; else : landscape mode
        if(findViewById(R.id.fragments_container)!=null){
            BtnFragment btnFragment = new BtnFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.fragments_container, btnFragment).commit();
        }
    }

    @Override
    public void onBtnClicked() {
        if(findViewById(R.id.fragments_container)==null){
            clickCountLandscape++;
            TxtFragment txtFragment = (TxtFragment) getSupportFragmentManager().findFragmentById(R.id.txt_fragment);
            txtFragment.setTextviewText("Clicked on landscape mode "+clickCountLandscape+" time(s)!");
        }else{
            clickCountPortrait++;
            TxtFragment txtFragment = new TxtFragment();
            Bundle args = new Bundle();
            args.putString(TxtFragment.ARG_TXT, "Clicked on portrait mode "+clickCountPortrait+" time(s)!");
            txtFragment.setArguments(args);
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragments_container,txtFragment, "txtFrag");
            fragmentTransaction.addToBackStack(null);//allow to go back to 1st fragment with Back button
            fragmentTransaction.commit();
        }
    }
}
