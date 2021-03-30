package id.ac.pelitabangsa.lemparcoinfuji;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class LemparCoin extends Activity implements View.OnClickListener {
 private Button buttonLempar;
 private Button buttonUlangi;
 private Button buttonKeluar;
 private Random acak;

 @Override
 public void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
 acak= new Random();
 setContentView(R.layout.activity_lemparcoin);
 buttonLempar=(Button)findViewById(R.id.buttonlempar);
 buttonUlangi=(Button)findViewById(R.id.buttonulangi);
 buttonKeluar=(Button)findViewById(R.id.buttonkeluar);
 buttonLempar.setOnClickListener(this);
 buttonUlangi.setOnClickListener(this);
 buttonKeluar.setOnClickListener(this);
 }
 @Override
 public void onClick(View view) {

  if (view==buttonLempar){

   Log.d("CLICK_EVENT","Lempar button diClik!");
   TextView tw=(TextView)findViewById(R.id.textView1);
   ImageView iw=(ImageView)findViewById(R.id.imageView1);

   if (acak.nextDouble() < 0.5) {
    tw.setText("kepala");
    iw.setImageResource(R.drawable.head);
   } else {
    tw.setText("Cross");
    iw.setImageResource(R.drawable.tail);
   }
   buttonLempar.setVisibility(View.INVISIBLE);
   buttonUlangi.setVisibility(View.VISIBLE);
   buttonKeluar.setVisibility(View.VISIBLE);

  } else if (view==buttonUlangi) {
   TextView tw=(TextView)findViewById(R.id.textView1);
   ImageView iw=(ImageView)findViewById(R.id.imageView1);

   buttonLempar.setVisibility(View.VISIBLE);
   buttonUlangi.setVisibility(View.INVISIBLE);
   buttonKeluar.setVisibility(View.INVISIBLE);

  }else if (view==buttonKeluar){
   this.finish();
  }
 }
}
