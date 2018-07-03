package com.example.douglasdesousa.mapafinal;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import static android.text.TextUtils.concat;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {
    int numero=0;
    ImageView iFoto;
    private int score=0;
    private String ansewer;

    private GoogleMap mMap;
    double lat=2,lon=109;

  private InteracaoActivity interacao=new InteracaoActivity();






    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

































//start


        FloatingActionButton bFoto = (FloatingActionButton) findViewById(R.id.btn);
        iFoto = (ImageView) findViewById(R.id.imgFoto);
        bFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, 0);
            }
        });

Button btnMudardeTela =(Button) findViewById(R.id.btnIniciar) ;
btnMudardeTela.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {


setContentView(R.layout.activity_main);




perguntas(numero);



    }
});














    }

    public void perguntas(final int numero){



        String pergunta= interacao.getQuestion(numero);
        TextView perg=(TextView)findViewById(R.id.txtPergunta);


        perg.setText(pergunta);

        String resposta=interacao.getChoice(numero);
        String resposta1=interacao.getChoice1(numero);
        String resposta2=interacao.getChoice2(numero);
        String resposta4=interacao.getChoice3(numero);



        final Button btnR=(Button) findViewById(R.id.btnR1);
        btnR.setText(resposta);
        btnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int valor=numero;
                String answer=interacao.getCorrectAwnser(valor);
                if(btnR.getText() == answer) {
                    score+=1;
                    TextView socore= (TextView)findViewById(R.id.score);
                    socore.setText(""+score);
                    proximo(numero);






                }else{

                    proximo(numero);



                }









            }
        });


        final Button btn2=(Button)findViewById(R.id.btnR2);
        btn2.setText(resposta1);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valor=numero;
                String answer=interacao.getCorrectAwnser(valor);

                if(btn2.getText() == answer) {
                    score+=1;
                    TextView socore= (TextView)findViewById(R.id.score);
                    socore.setText(""+score);
                    proximo(numero);






                }else{

                    proximo(numero);



                }
            }
        });


        final Button btn3=(Button)findViewById(R.id.btnR3);
        btn3.setText(resposta2);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valor=numero;
                String answer=interacao.getCorrectAwnser(valor);
                if(btn3.getText() == answer) {
                    score+=1;
                    TextView socore= (TextView)findViewById(R.id.score);
                    socore.setText(""+score);
                    proximo(numero);






                }else{

                    proximo(numero);



                }
            }
        });





        final Button btn4=(Button)findViewById(R.id.btnR4);
        btn4.setText(resposta4);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valor=numero;
                String answer=interacao.getCorrectAwnser(valor);
                if(btn4.getText() == answer) {
                    score+=1;
                    TextView socore= (TextView)findViewById(R.id.score);
                    socore.setText(""+score);
                    proximo(numero);






                }else{

                    proximo(numero);



                }
            }
        });




    }













public void proximo(int numero){

        numero+=1;

        perguntas(numero);

}












    public void alterarNome(View view){

  Button btnSalvar=(Button)findViewById(R.id.btnSalvar);
        EditText editNome=(EditText)findViewById(R.id.edNome);

        editNome.setVisibility(View.VISIBLE);
        btnSalvar.setVisibility(View.VISIBLE);
        editNome.requestFocus();







    }

//

public  void salvarNome(View view){
    String nome=new String();
    Button btnSalvar=(Button)findViewById(R.id.btnSalvar);
    EditText editNome=(EditText)findViewById(R.id.edNome);


        EditText editText=(EditText)findViewById(R.id.edNome);
    TextView bemVindo=(TextView)findViewById(R.id.btnNome);
    TextView fraseBemVindo=(TextView)findViewById(R.id.txtBemvindo);



    fraseBemVindo.setText(concat("Bem vindo "+editText.getText()));

    editNome.setVisibility(View.INVISIBLE);
    btnSalvar.setVisibility(View.INVISIBLE);


}







    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap bitmap=(Bitmap)data.getExtras().get("data");
        iFoto.setImageBitmap(bitmap);

    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera

        /*LatLng sydney = new LatLng(15,16);


       mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    */}

/*
public void procurar(View view){
        EditText localizar;

        localizar=(EditText)findViewById(R.id.edLocation);


      String location= localizar.getText().toString();

    if(location==null || location.equals("")){
        Toast.makeText(getBaseContext(), "No Place is entered", Toast.LENGTH_SHORT).show();
        return;
    }


    String url = "https://maps.googleapis.com/maps/api/geocode/json?";


    try{
        location= URLEncoder.encode(location,"UTF-8");



    }catch (UnsupportedEncodingException e){

        e.printStackTrace();

    }


    String adress ="address"+location;
    String sensor="sensor=false";
    url=url+adress+"&"+sensor;












}

*/

public void procurar(View view){

    String pais = null;


    EditText digitado=findViewById(R.id.edLocation);

    String localizar= digitado.getText().toString();

    if(localizar.equals("Brasil") ){

        digitado.getText().clear();

      configMap(-15.793857, -47.861453);
pais= "brasil";






    }if(localizar.equals("Japao")){

        digitado.getText().clear();

        configMap(35.721526, 139.730387);
        pais= "japao";
        numero=4;


    }


if(localizar.equals("Canada")){

        digitado.getText().clear();

        configMap(35.721526, 139.730387);
    pais= "canada";


    }if(localizar.equals("Alemanha")){

        digitado.getText().clear();

        configMap(52.525734, 13.412334);
        pais= "canada";


    }if(localizar.equals("China")){

        digitado.getText().clear();

        configMap(40.337992, 116.142792);
        pais= "canada";


    }if(localizar.equals("França")){

        digitado.getText().clear();

        configMap(48.962319,2.291029);
        pais= "canada";


    }if(localizar.equals("Estados Unidos")){

        digitado.getText().clear();

        configMap(42.515378,-87846072);
        pais= "canada";


    }if(localizar.equals("Italia")){

        digitado.getText().clear();

        configMap(41.862087,12.542963);
        pais= "canada";


    }if(localizar.equals("Argentina")){

        digitado.getText().clear();

        configMap(-34.118944,-59.439238);
        pais= "canada";


    }













Button btnComecar=(Button)findViewById(R.id.btnIniciar);
    btnComecar.setVisibility(View.VISIBLE);






}








    /** A class, to download Places from Geocoding webservice */
/**private class DownloadTask extends AsyncTask<String, Integer, String> {

        String data = null;

        // Invoked by execute() method of this object
        @Override
        protected String doInBackground(String... url) {
            try{
                data = downloadUrl(url[0]);
            }catch(Exception e){
                Log.d("Background Task",e.toString());
            }
            return data;
        }


    }
*/


public void configMap(double lat, double lon){

    EditText digitado=findViewById(R.id.edLocation);



    LatLng sydney = new LatLng(lat,lon);


    mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
    mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));


}










}

