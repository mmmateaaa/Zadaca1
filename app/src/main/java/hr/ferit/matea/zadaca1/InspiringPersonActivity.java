package hr.ferit.matea.zadaca1;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class InspiringPersonActivity extends AppCompatActivity {

    @BindView(R.id.ivGHopper) ImageView ivGHopper;
    @BindView(R.id.ivJVNeumann) ImageView ivJVNeumann;
    @BindView(R.id.ivATuring) ImageView ivATuring;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inspiring_person);

        ButterKnife.bind(this);
    }

    @SuppressLint("ResourceType")
    @OnClick({R.id.ivGHopper, R.id.ivJVNeumann, R.id.ivATuring})
    public void showMessage(View view) {
        String message = "";
        Resources r = this.getResources();
        switch (view.getId()) {
            case R.id.ivGHopper:
                message = r.getString(R.string.gHopperQuote);
                break;
            case R.id.ivJVNeumann:
                message = r.getString(R.string.jVNeumannQuote);
                break;
            case R.id.ivATuring:
                message = r.getString(R.string.aTuringQuote);
                break;
        }

        showMessageAsToast(message);
    }

    private void showMessageAsToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

}
