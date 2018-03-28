package hr.ferit.matea.zadaca1;

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

    @OnClick({R.id.ivGHopper, R.id.ivJVNeumann, R.id.ivATuring})
    public void showMessage(View view) {
        String message = "";
        switch (view.getId()) {
            case R.id.ivGHopper:
                message = "The most damaging phrase in the language is: 'It's always been done that way.'";
                break;
            case R.id.ivJVNeumann:
                message = "Neumann";
                break;
            case R.id.ivATuring:
                message = "Turing";
                break;
        }

        showMessageAsToast(message);
    }

    private void showMessageAsToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

}
