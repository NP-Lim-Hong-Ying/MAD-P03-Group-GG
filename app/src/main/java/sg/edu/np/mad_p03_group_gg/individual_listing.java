package sg.edu.np.mad_p03_group_gg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class individual_listing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_individual_listing);

        TextView title;
        TextView price;
        TextView itemcondition;
        TextView description;
        TextView location;
        TextView deliveryoption;
        TextView deliveryprice;
        TextView deliverytime;

        title = findViewById(R.id.individual_title);
        price = findViewById(R.id.individual_price);
        itemcondition = findViewById(R.id.individual_itemcondition);
        description = findViewById(R.id.individual_description);
        location = findViewById(R.id.individual_salelocation);
        deliveryoption = findViewById(R.id.individual_deliveryoption);
        deliveryprice = findViewById(R.id.individual_deliveryprice);
        deliverytime = findViewById(R.id.individual_deliverytime);
    }

    private void retrieveDataFromFB(int pid) {
        String db = "https://cashoppe-179d4-default-rtdb.asia-southeast1.firebasedatabase.app/";
        FirebaseDatabase individualdb = FirebaseDatabase.getInstance(db);
        DatabaseReference individualListing = individualdb.getReference("individual-listing").child(""+pid);
        individualListing.equalTo(pid);
    }
}