package ie.cm.activities;

import ie.cm.R;
import ie.cm.fragments.CoffeeFragment;

import android.os.Bundle;

public class Search extends Base {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.search);
	}

	@Override
	protected void onResume() {
		super.onResume();
		coffeeFragment = CoffeeFragment.newInstance(); //get a new Fragment instance
		getFragmentManager()
				.beginTransaction()
				.replace(R.id.fragment_layout, coffeeFragment)
				.commit(); // add/replace in the current activity
	}
}
