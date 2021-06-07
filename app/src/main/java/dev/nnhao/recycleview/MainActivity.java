package dev.nnhao.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView contactsRecView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactsRecView = findViewById(R.id.contactsRecView);

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Hao", "nnhao9a3@gmail.com", "https://product.hstatic.net/1000306701/product/do1_ef05154162cd4795960380c55d14bb0f_master.jpg"));
        contacts.add(new Contact("Hao1", "nnhao9a3@gmail.com", "https://product.hstatic.net/1000306701/product/do1_ef05154162cd4795960380c55d14bb0f_master.jpg"));
        contacts.add(new Contact("Hao2", "nnhao9a3@gmail.com", "https://product.hstatic.net/1000306701/product/do1_ef05154162cd4795960380c55d14bb0f_master.jpg"));
        contacts.add(new Contact("Hao3", "nnhao9a3@gmail.com", "https://product.hstatic.net/1000306701/product/do1_ef05154162cd4795960380c55d14bb0f_master.jpg"));
        contacts.add(new Contact("Hao4", "nnhao9a3@gmail.com", "https://product.hstatic.net/1000306701/product/do1_ef05154162cd4795960380c55d14bb0f_master.jpg"));
        contacts.add(new Contact("Hao5", "nnhao9a3@gmail.com", "https://product.hstatic.net/1000306701/product/do1_ef05154162cd4795960380c55d14bb0f_master.jpg"));
        contacts.add(new Contact("Hao6", "nnhao9a3@gmail.com", "https://product.hstatic.net/1000306701/product/do1_ef05154162cd4795960380c55d14bb0f_master.jpg"));
        contacts.add(new Contact("Hao7", "nnhao9a3@gmail.com", "https://product.hstatic.net/1000306701/product/do1_ef05154162cd4795960380c55d14bb0f_master.jpg"));
        contacts.add(new Contact("Hao8", "nnhao9a3@gmail.com", "https://product.hstatic.net/1000306701/product/do1_ef05154162cd4795960380c55d14bb0f_master.jpg"));
        contacts.add(new Contact("Hao9", "nnhao9a3@gmail.com", "https://product.hstatic.net/1000306701/product/do1_ef05154162cd4795960380c55d14bb0f_master.jpg"));
        contacts.add(new Contact("Hao10", "nnhao9a3@gmail.com", "https://product.hstatic.net/1000306701/product/do1_ef05154162cd4795960380c55d14bb0f_master.jpg"));
        contacts.add(new Contact("Hao11", "nnhao9a3@gmail.com", "https://product.hstatic.net/1000306701/product/do1_ef05154162cd4795960380c55d14bb0f_master.jpg"));

        ContactsRecViewAdapter adapter = new ContactsRecViewAdapter(this);
        adapter.setContacts(contacts);

        contactsRecView.setAdapter(adapter);
        contactsRecView.setLayoutManager(new GridLayoutManager(this, 2));

    }
}