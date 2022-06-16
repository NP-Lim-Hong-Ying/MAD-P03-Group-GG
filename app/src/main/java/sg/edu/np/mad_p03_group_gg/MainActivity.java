package sg.edu.np.mad_p03_group_gg;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import sg.edu.np.mad_p03_group_gg.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        // When MainActivity is launched, it will display homepage as default
        replaceFragment(new HomepageFragment());

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
            // Get which button the user pressed and display the fragment accordingly
            switch(item.getItemId()) {
                case R.id.home:
                    replaceFragment(new HomepageFragment());
                    break;
                case R.id.add:
                    Intent newList = new Intent(this, newlisting.class);
                    this.startActivity(newList);
                    break;
                case R.id.user:
                    //replaceFragment(new User);
                    break;
            }

            return true;
        });

    }

    // Init the fragment
    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.testfragcon, fragment);
        fragmentTransaction.commit();
    }
}