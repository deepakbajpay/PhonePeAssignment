package com.nobroker.myapplication.ui.venues;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.nobroker.myapplication.data.remote.dto.Venue;
import com.nobroker.myapplication.databinding.VenueItemBinding;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fH\u0016J\u0014\u0010\u0014\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00050\tj\b\u0012\u0004\u0012\u00020\u0005`\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/nobroker/myapplication/ui/venues/VenueAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/nobroker/myapplication/ui/venues/VenueAdapter$ViewHolder;", "onItemClick", "Lkotlin/Function1;", "Lcom/nobroker/myapplication/data/remote/dto/Venue;", "", "(Lkotlin/jvm/functions/Function1;)V", "venues", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setVenues", "", "ViewHolder", "app_debug"})
public final class VenueAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.nobroker.myapplication.ui.venues.VenueAdapter.ViewHolder> {
    private final kotlin.jvm.functions.Function1<com.nobroker.myapplication.data.remote.dto.Venue, kotlin.Unit> onItemClick = null;
    private java.util.ArrayList<com.nobroker.myapplication.data.remote.dto.Venue> venues;
    
    public VenueAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.nobroker.myapplication.data.remote.dto.Venue, kotlin.Unit> onItemClick) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.nobroker.myapplication.ui.venues.VenueAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.nobroker.myapplication.ui.venues.VenueAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public final void setVenues(@org.jetbrains.annotations.NotNull
    java.util.List<com.nobroker.myapplication.data.remote.dto.Venue> venues) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/nobroker/myapplication/ui/venues/VenueAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/nobroker/myapplication/databinding/VenueItemBinding;", "(Lcom/nobroker/myapplication/databinding/VenueItemBinding;)V", "bind", "", "venue", "Lcom/nobroker/myapplication/data/remote/dto/Venue;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.nobroker.myapplication.databinding.VenueItemBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        com.nobroker.myapplication.databinding.VenueItemBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.nobroker.myapplication.data.remote.dto.Venue venue) {
        }
    }
}