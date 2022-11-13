package com.countriesandflags;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.countriesandflags.databinding.CountryItemBinding;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.CountryHolder> {
    private final LayoutInflater inflater;
    private final ArrayList<Country> countries;

    CountryAdapter(Context context, ArrayList<Country> countries) {
        this.countries = countries;
        this.inflater = LayoutInflater.from(context);
    }

    public static class CountryHolder extends RecyclerView.ViewHolder {
        CountryItemBinding binding = CountryItemBinding.bind(itemView);

        void bind(Country country) {
            binding.image.setImageResource(country.getImageId());
            binding.countrytitle.setText(country.getTitle());
        }

        public CountryHolder(View view) {
            super(view);
        }
    }


    @NonNull
    @Override
    public CountryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.country_item, parent, false);
        return new CountryHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryHolder holder, int position) {
        holder.bind(countries.get(position));
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }
}
