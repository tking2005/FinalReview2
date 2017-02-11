package nyc.c4q.tarynking.finalreview2;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * Created by tarynking on 2/10/17.
 */

public class NavigationAdapter extends RecyclerView.Adapter{
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


//    private List<Integer> navigationList = new ArrayList<>();
//
//    @Override
//    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        return new NavigationViewHolder(parent);
//    }
//
//    @Override
//    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
//        NavigationViewHolder navigationViewHolder = (NavigationViewHolder) holder;
//        navigationViewHolder currentNavigationNumber = navigationViewHolder.get(position);
//        navigationViewHolder.bind(currentNavigationNumber);
//    }
//
//    @Override
//    public int getItemCount() {
//        return Integer.MAX_VALUE;
//    }
//
//    public void setData(List<Integer> integers) {
//        notifyDataSetChanged();
//    }
}
