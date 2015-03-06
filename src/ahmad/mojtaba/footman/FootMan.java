package ahmad.mojtaba.footman;


import java.util.List;

import android.R.string;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class FootMan extends ListActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_foot_man);
		setListAdapter (new AdaptereMan (this,  
				android.R.layout.simple_list_item_1, R.id.row_text,
				getResources().getStringArray(R.array.options)));
  	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.foot_man, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}


	private class AdaptereMan extends ArrayAdapter <String>{
		
		
		public AdaptereMan(Context context, int resource, int textViewResourceId,
				String[] strings) {
			super(context, resource, textViewResourceId, strings);
			// TODO Auto-generated constructor stub
		}
	
		@Override
		public View getView(int position, View convertView, ViewGroup parent){
			
			LayoutInflater bazkonande = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View radif = bazkonande.inflate(R.layout.list_row, parent, false);
			String [] radifha = getResources ().getStringArray(R.array.options);
			ImageView tasvir = (ImageView) radif.findViewById(R.id.row_icon);
			TextView matn = (TextView) radif.findViewById(R.id.row_text);
			matn.setText (radifha[position]);
			if (position == 0)
				tasvir.setImageResource(R.drawable.icon);
			else if (position == 1)
				tasvir.setImageResource(R.drawable.icon);
			else if (position == 2)
				tasvir.setImageResource(R.drawable.icon);
			return radif;
		}
	}

}
