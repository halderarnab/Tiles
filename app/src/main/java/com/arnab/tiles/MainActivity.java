package com.arnab.tiles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText tile_Width,tile_Length,floor_Width,floor_Length;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        floor_Width = (EditText) findViewById(R.id.editText);
        floor_Length = (EditText) findViewById(R.id.editText2);
        tile_Width = (EditText) findViewById(R.id.editText3);
        tile_Length = (EditText) findViewById(R.id.editText4);

        ImageButton im1 = (ImageButton) findViewById(R.id.imageButton);
        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double nTile_Lengh, nTile_Width;
                //Toast.makeText(MainActivity.this,floor_Width.getText() + "\n" + floor_Length.getText(), Toast.LENGTH_SHORT).show();
                //Toast.makeText(MainActivity.this,tile_Width.getText() + "\n" + tile_Length.getText(), Toast.LENGTH_SHORT).show();

                nTile_Lengh = Double.parseDouble(floor_Length.getText().toString())/Double.parseDouble(tile_Length.getText().toString());
                nTile_Width = Double.parseDouble(floor_Width.getText().toString())/Double.parseDouble(tile_Width.getText().toString());

                String str = "Length = " + nTile_Lengh + "\nWidth = " + nTile_Width +
                        "\nTotal = " + (nTile_Lengh * nTile_Width);
                Toast.makeText(getBaseContext(),str,Toast.LENGTH_LONG).show();
            }
        });
    }
}
