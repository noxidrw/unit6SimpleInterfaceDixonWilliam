package com.example.unit6simpleinterfacedixonwilliam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageButton btnCallJody;
    Button btnTextJody;
    ImageButton btnCallSarah;
    Button btnTextSarah;
    ImageButton btnCallTayler;
    Button btnTextTayler;
    ImageButton btnCallJessy;
    Button btnTextJessy;
    //String jody = getResources().getString(R.string.Jody);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupButtonClickEventsJody();
        setupButtonClickEventsJody2();
        setupButtonClickEventsSarah();
        setupButtonClickEventsSarah2();
        setupButtonClickEventsTayler();
        setupButtonClickEventsTayler2();
        setupButtonClickEventsJessy();
        setupButtonClickEventsJessy2();
    }

    private void setupButtonClickEventsJody() {

        btnCallJody = findViewById(R.id.imageButtonJody);
        btnCallJody.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // When button is clicked
                Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + getResources().getString(R.string.Jody)));
                // check for calendar app
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(callIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                if (callIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(callIntent);
                }
            }
        });
    }

    private void setupButtonClickEventsJody2() {
        btnTextJody = findViewById(R.id.buttonJody);
        btnTextJody.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // When button is clicked
                Intent textIntent = new Intent(Intent.ACTION_VIEW);
                textIntent.setData(Uri.parse("sms:" + getResources().getString(R.string.Jody)));
                textIntent.putExtra("sms_body", "Hi");
                // check for SMS APP
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(textIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                if (activities.size() > 0) {     // found at least 1 app to make phone call
                    startActivity(textIntent);   // places the call
                }
            }
        });
    }

    private void setupButtonClickEventsSarah() {
        btnCallSarah = findViewById(R.id.imageButtonSarah);
        btnCallSarah.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // When button is clicked
                Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + getResources().getString(R.string.Sarah)));
                // check for calendar app
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(callIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                if (callIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(callIntent);
                }
            }
        });
    }

    private void setupButtonClickEventsSarah2() {
        btnTextSarah = findViewById(R.id.buttonSarah);
        btnTextSarah.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // When button is clicked
                Intent textIntent = new Intent(Intent.ACTION_VIEW);
                textIntent.setData(Uri.parse("sms:" + getResources().getString(R.string.Sarah)));
                textIntent.putExtra("sms_body", "Hi");
                // check for SMS APP
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(textIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                if (activities.size() > 0) {     // found at least 1 app to make phone call
                    startActivity(textIntent);   // places the call
                }
            }
        });
    }

    private void setupButtonClickEventsTayler() {
        btnCallTayler = findViewById(R.id.imageButtonTayler);
        btnCallTayler.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // When button is clicked
                Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + getResources().getString(R.string.Tayler)));
                // check for calendar app
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(callIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                if (callIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(callIntent);
                }
            }
        });
    }

    private void setupButtonClickEventsTayler2() {
        btnTextTayler = findViewById(R.id.buttonTayler);
        btnTextTayler.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // When button is clicked
                Intent textIntent = new Intent(Intent.ACTION_VIEW);
                textIntent.setData(Uri.parse("sms:" + getResources().getString(R.string.Tayler)));
                textIntent.putExtra("sms_body", "Hi");
                // check for SMS APP
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(textIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                if (activities.size() > 0) {     // found at least 1 app to make phone call
                    startActivity(textIntent);   // places the call
                }
            }
        });
    }

    private void setupButtonClickEventsJessy() {
        btnCallJessy = findViewById(R.id.imageButtonJessy);
        btnCallJessy.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // When button is clicked
                Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + getResources().getString(R.string.Jessy)));
                // check for calendar app
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(callIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                if (callIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(callIntent);
                }
            }
        });
    }

    private void setupButtonClickEventsJessy2() {
        btnTextJessy = findViewById(R.id.buttonJessy);
        btnTextJessy.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // When button is clicked
                Intent textIntent = new Intent(Intent.ACTION_VIEW);
                textIntent.setData(Uri.parse("sms:" + getResources().getString(R.string.Jessy)));
                textIntent.putExtra("sms_body", "Hi");
                // check for SMS APP
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(textIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                if (activities.size() > 0) {     // found at least 1 app to make phone call
                    startActivity(textIntent);   // places the call
                }
            }
        });
    }


}