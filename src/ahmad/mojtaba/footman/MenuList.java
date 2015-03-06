package ahmad.mojtaba.footman;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MenuList extends ArrayAdapter <String> {

	private Context context;
	public MenuList(Context context, int resource, int textViewResourceId,
			String[] strings) {
		super(context, resource, textViewResourceId, strings);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent){
		this.context=context;
		LayoutInflater opener = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View radif = opener.inflate(R.layout.list_row, parent, false);
		String [] radifha = context.getResources ().getStringArray(R.array.options);
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
