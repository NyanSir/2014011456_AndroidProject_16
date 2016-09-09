package bistu.rookie.u_nity.androidproject_16;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button openFirst = (Button) findViewById(R.id.main_openFirstActivity);
        Button openSecond = (Button) findViewById(R.id.main_openSecondActivity);

        openFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("DoNothing");
                intent.addCategory("android.intent.category.DEFAULT");
                intent.setData(Uri.parse("test://myactivity:8080/first"));
                intent.putExtra("path", "test://myactivity:8080/first");
                startActivity(intent);
            }
        });

        openSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("DoNothing");
                intent.addCategory("android.intent.category.DEFAULT");
                intent.setData(Uri.parse("test://myactivity:8080/second"));
                intent.putExtra("path", "test://myactivity:8080/second");
                startActivity(intent);
            }
        });
    }

}
