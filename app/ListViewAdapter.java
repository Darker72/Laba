import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListViewCustomAdapter extends BaseAdapter
{
    public String title[];
    public String description[];
    public Activity context;
    public LayoutInflater inflater;

    public ListViewCustomAdapter(Activity context,String[] title, String[] description) {
        super();

        this.context = context;
        this.title = title;
        this.description = description;

        this.inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public static class ViewHolder
    {
        ImageView imgViewLogo;
        TextView txtViewTitle;
        TextView txtViewDescription;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        ViewHolder holder;
        if(convertView==null)
        {
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.listitem_row.xml, null);

            holder.imgViewLogo = (ImageView) convertView.findViewById(R.id.imgViewLogo);
            holder.txtViewTitle = (TextView) convertView.findViewById(R.id.txtViewTitle);
            holder.txtViewDescription = (TextView) convertView.findViewById(R.id.txtViewDescription);

            convertView.setTag(holder);
        }
        else
            holder=(ViewHolder)convertView.getTag();

        holder.imgViewLogo.setImageResource(R.drawable.icon);
        holder.txtViewTitle.setText(title[position]);
        holder.txtViewDescription.setText(description[position]);

        return convertView;
    }

}