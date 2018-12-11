package nyc.pursuit.recyclerviewlessondec02;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import nyc.pursuit.recyclerviewlessondec02.controllers.NumberAdapter;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    List<Integer> numberList =
        new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12));
    RecyclerView numberRecyclerView = findViewById(R.id.rv_numbers);
    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
    numberRecyclerView.setLayoutManager(linearLayoutManager);
    NumberAdapter numberAdapter = new NumberAdapter(numberList);
    numberRecyclerView.setAdapter(numberAdapter);
  }
}
