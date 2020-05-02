package com.com490.expiredteam.expired;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class manualinputPage extends AppCompatActivity {
    EditText product_category, product_brand,product_pao;
     private Button button_save;

     MyDataAccessObject myDataAccessObject;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_input_page);

        product_brand = findViewById(R.id.brand_button);
        product_pao = findViewById(R.id.PAO_button);
        button_save = findViewById(R.id.button);

        myDataAccessObject = MyAppDatabase.getDBInstance(this).myDao();
      /* final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                //code to save input
                finish(); //to go back to previous page

            }
        });

    */
    }
    /*
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.activity_user_input_page, container, false);

       /* product_brand = view.findViewById(R.id.brand_button);
        product_pao = view.findViewById(R.id.PAO_button);
        button_save = view.findViewById(R.id.button);


       // myDataAccessObject = MyAppDatabase.getDBInstance(this).myDao();

        button_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    int prodcut_POA = Integer.parseInt((product_pao.getText().toString()));
                    String prouct_BRAND = product_brand.getText().toString();

                    /*Product product = new Product();
                    product.setBrand(prouct_BRAND);
                        */

                    //add the other entities
                //MainActivity.myAppDatabase.myDoa().build();
                ///Toast.makeText(getActivity(),"Product Added Successfully",Toast.LENGTH_SHORT);
        /*
            }


        });

        return view;
    }
    */

    public void saveProduct(View view){

        if(product_brand.getText().toString().isEmpty()|| product_pao.getText().toString().isEmpty()){
            Toast.makeText(this, "Fill in all boxes", Toast.LENGTH_SHORT).show();
        }else{
            Product product = new Product();
            product.setBrand(product_brand.getText().toString());
            product.setPoa(product_pao.getText().toString());

            myDataAccessObject.insertProduct(product);
            Toast.makeText(this, "Submit successful", Toast.LENGTH_SHORT).show();
            finish();
        }

    }

   /* public void exitpage(View view){
        finish();
    }
    */

 }

