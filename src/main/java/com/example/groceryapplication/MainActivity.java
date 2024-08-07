package com.example.groceryapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements onClickListener{
    RecyclerView recyclerView;
    List<Item> itemList;
    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView = findViewById(R.id.recyclerView);
        itemList = new ArrayList<>();

        Item item1 = new Item("Fruits", "Fresh fruits from garden", R.drawable.fruit);
        Item item2 = new Item("Vegetables", "Fresh vegetables from garden", R.drawable.vegetables);
        Item item3 = new Item("Dairy", "Fresh dairy products from garden", R.drawable.milk);
        Item item4 = new Item("Bakery", "Fresh bakery products from garden", R.drawable.bread);
        Item item5 = new Item("Beverages", "Fresh beverages from garden", R.drawable.beverage);
        Item item6 = new Item("Snacks", "Fresh snacks from garden", R.drawable.popcorn);
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        itemList.add(item6);

        customAdapter = new CustomAdapter(itemList);
        recyclerView.setAdapter(customAdapter);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);
        customAdapter.setOnClickListener(this);
    }
    @Override
    public void onItemClick(View v, int position) {
        Toast.makeText(this, itemList.get(position).getItem(), Toast.LENGTH_SHORT).show();
    }
}