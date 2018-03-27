package hr.ferit.matea.zadaca1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.bShowPersons) Button bShowPersons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.bShowPersons)
    public void openListAction(Button button) {
        Intent actionToOpenList = new Intent(MainActivity.this, InspiringPersonActivity.class);
        startActivity(actionToOpenList);
    }
}
