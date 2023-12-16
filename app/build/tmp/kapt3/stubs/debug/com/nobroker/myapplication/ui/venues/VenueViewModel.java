package com.nobroker.myapplication.ui.venues;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.nobroker.chatSdk.base.BaseViewModel;
import com.nobroker.myapplication.data.remote.dto.Venue;
import com.nobroker.myapplication.utils.OperationResult;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J>\u0010\f\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0010R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0019"}, d2 = {"Lcom/nobroker/myapplication/ui/venues/VenueViewModel;", "Lcom/nobroker/chatSdk/base/BaseViewModel;", "repository", "Lcom/nobroker/myapplication/ui/venues/VenueRepositoryImpl;", "(Lcom/nobroker/myapplication/ui/venues/VenueRepositoryImpl;)V", "_venues", "Landroidx/lifecycle/MutableLiveData;", "Lcom/nobroker/myapplication/utils/OperationResult;", "", "Lcom/nobroker/myapplication/data/remote/dto/Venue;", "venues", "Landroidx/lifecycle/LiveData;", "getVenues", "()Landroidx/lifecycle/LiveData;", "", "clientId", "", "perPage", "", "page", "lat", "", "lon", "range", "query", "app_debug"})
public final class VenueViewModel extends com.nobroker.chatSdk.base.BaseViewModel {
    private final com.nobroker.myapplication.ui.venues.VenueRepositoryImpl repository = null;
    private final androidx.lifecycle.MutableLiveData<com.nobroker.myapplication.utils.OperationResult<java.util.List<com.nobroker.myapplication.data.remote.dto.Venue>>> _venues = null;
    
    @javax.inject.Inject
    public VenueViewModel(@org.jetbrains.annotations.NotNull
    com.nobroker.myapplication.ui.venues.VenueRepositoryImpl repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.nobroker.myapplication.utils.OperationResult<java.util.List<com.nobroker.myapplication.data.remote.dto.Venue>>> getVenues() {
        return null;
    }
    
    public final void getVenues(@org.jetbrains.annotations.NotNull
    java.lang.String clientId, int perPage, int page, double lat, double lon, @org.jetbrains.annotations.NotNull
    java.lang.String range, @org.jetbrains.annotations.NotNull
    java.lang.String query) {
    }
}