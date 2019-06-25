package com.example.gsp_111;


import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    //Declering Variables
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button del;
    private Button Dial1;
    private Button change;
    private TextView data;
    private TextView Org;
    private String s;
    private String number;
    private String orginal;
    private String frnd;
    private String temp;
    private  boolean secret;
    private  boolean Dupli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIview();
        onClickaction();
        Dial1.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View V) {
                                         s = data.getText().toString();

                                         if (s.equals("999"))
                                         {secret = true;
                                             Dupli = false;
                                             setNumber();}


                                         else if(s.equals("888"))
                                         {secret = true;
                                             Dupli = true;
                                             setNumber();}


                                         else {

                                             secret = false;
                                             if (s.equals(orginal)) {
                                                 number = frnd;
                                             } else {
                                                 number = s;
                                             }
                                         }

                                         if(!secret)
                                         {Intent callIntent = new Intent(Intent.ACTION_CALL);
                                             callIntent.setData(Uri.parse("tel:" + number));
                                             if (checkSelfPermission(Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                                                 // TODO: Consider calling
                                                 //    Activity#requestPermissions
                                                 // here to request the missing permissions, and then overriding
                                                 //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                                                 //                                          int[] grantResults)
                                                 // to handle the case where the user grants the permission. See the documentation
                                                 // for Activity#requestPermissions for more details.
                                                 return;
                                             }
                                             startActivity(callIntent);
                                             data.setText(null);}

                                     }
                                 }
        );

    }
    //lollllllllllllllllllllllllllllllllll

    private void setupUIview() {

        this.one = (Button) findViewById(R.id.btn1);
        this.two = (Button) findViewById(R.id.btn2);
        this.three = (Button) findViewById(R.id.btn3);
        this.four = (Button) findViewById(R.id.btn4);
        this.five = (Button) findViewById(R.id.btn5);
        this.six = (Button) findViewById(R.id.btn6);
        this.seven = (Button) findViewById(R.id.btn7);
        this.eight = (Button) findViewById(R.id.btn8);
        this.nine = (Button) findViewById(R.id.btn9);
        this.zero = (Button) findViewById(R.id.btn0);
        this.del = (Button) findViewById(R.id.btndel);
        this.data = (TextView) findViewById(R.id.Data);
        this.Dial1 = (Button) findViewById(R.id.dial1);
        this.Org = (TextView)findViewById(R.id.Orginal);
        this.change = (Button)findViewById(R.id.makeChange);
        secret=false;
        change.setVisibility(View.INVISIBLE);
        Org.setVisibility(View.INVISIBLE);


    }
    private void onClickaction() {
        //Set Orginal and Duplicate
        change.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View V) {
                                          MakeChange();
                                      }
                                  }

        );
        del.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View V) {
                                       if(!secret) {
                                           s = data.getText().toString();
                                           if(s.length()>0)
                                           {int lastIndex = s.length();
                                               lastIndex--;
                                               s = s.substring(0, lastIndex);
                                               data.setText(s);
                                           }
                                           else {data.setText(null);}
                                       }
                                       else {
                                           temp = Org.getText().toString();
                                           if(s.length()>0)
                                           {
                                               int lastIndex = temp.length();
                                               lastIndex--;
                                               temp = temp.substring(0, lastIndex);
                                               Org.setText(temp);
                                           }
                                           else {Org.setText(null);}
                                       }

                                   }
                               }

        );
        zero.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View V) {
                                        if(secret){Org.setText(Org.getText().toString()+"0");}
                                        else{data.setText(data.getText().toString() + "0");}


                                    }

                                }
        );
        one.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View V) {
                                       if(secret){Org.setText(Org.getText().toString()+"1");}
                                       else {data.setText(data.getText().toString() + "1");}

                                   }
                               }
        );
        two.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View V) {
                                       if(secret){Org.setText(Org.getText().toString()+"2");}
                                       else{data.setText(data.getText().toString() + "2");}

                                   }

                               }
        );
        three.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View V) {
                                         if(secret){Org.setText(Org.getText().toString()+"3");}
                                         else{data.setText(data.getText().toString() + "3");}

                                     }


                                 }
        );
        four.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View V) {
                                        if(secret){Org.setText(Org.getText().toString()+"4");}
                                        else{data.setText(data.getText().toString() + "4");}

                                    }

                                }
        );
        five.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View V) {
                                        if(secret){Org.setText(Org.getText().toString()+"5");}
                                        else{data.setText(data.getText().toString() + "5");}

                                    }

                                }
        );
        six.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View V) {
                                       if(secret){Org.setText(Org.getText().toString()+"6");}
                                       else{data.setText(data.getText().toString() + "6");}

                                   }

                               }
        );
        seven.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View V) {
                                         if(secret){Org.setText(Org.getText().toString()+"7");}
                                         else{data.setText(data.getText().toString() + "7");}

                                     }

                                 }
        );
        eight.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View V) {
                                         if(secret){Org.setText(Org.getText().toString()+"8");}
                                         else{data.setText(data.getText() + "8");}

                                     }

                                 }
        );
        nine.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View V) {
                                        if(secret){Org.setText(Org.getText().toString()+"9");}
                                        else{ data.setText(data.getText().toString() + "9");}

                                    }


                                }
        );



    }
    private void setNumber(){
        if(Dupli){setDuplicate();}
        if(!Dupli) {setOrginal();}
    }
    private void setOrginal(){
        Org.setText(null);
        Org.setHint("Enter Parents Number");
        Org.setVisibility(View.VISIBLE);
        change.setVisibility(View.VISIBLE);
        data.setVisibility(View.INVISIBLE);

    }
    private void setDuplicate(){
        Org.setText(null);
        Org.setHint("Enter Duplicate Number");
        Org.setVisibility(View.VISIBLE);
        change.setVisibility(View.VISIBLE);
        data.setVisibility(View.INVISIBLE);

    }
    private void MakeChange(){

        if(Dupli){ frnd = Org.getText().toString();}
        else { orginal = Org.getText().toString();}
        Org.setText(null);
        data.setText(null);
        Org.setVisibility(View.INVISIBLE);
        change.setVisibility(View.INVISIBLE);
        data.setVisibility(View.VISIBLE);
        secret=false;

    }


}
