package nyc.pursuit.recyclerviewlessondec02.controllers;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Random;
import nyc.pursuit.recyclerviewlessondec02.R;

public class NumberAdapter extends RecyclerView.Adapter<NumberAdapter.NumberViewHolder> {

  private List<Integer> numberList;

  public NumberAdapter(List<Integer> numberList) {
    this.numberList = numberList;
  }

  @NonNull @Override
  public NumberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View viewHolder =
        LayoutInflater.from(parent.getContext()).inflate(R.layout.number_viewholder, parent, false);
    return new NumberViewHolder(viewHolder);
  }

  @Override public void onBindViewHolder(@NonNull NumberViewHolder holder, int position) {
    holder.numberTextView.setText(String.valueOf(numberList.get(position)));
  }

  @Override public int getItemCount() {
    return numberList.size();
  }

  class NumberViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private TextView numberTextView;
    private Button colorButton;

    NumberViewHolder(@NonNull View itemView) {
      super(itemView);
      numberTextView = itemView.findViewById(R.id.tv_number_field);
      colorButton = itemView.findViewById(R.id.color_button);
      colorButton.setOnClickListener(this);
      itemView.setBackgroundColor(getRandomColor());
    }

    @Override public void onClick(View v) {
      itemView.setBackgroundColor(getRandomColor());
    }

    private int getRandomColor() {
      Random rnd = new Random();
      return Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
    }
  }
}
