package com.nobroker.myapplication.data.remote.dto;

import com.google.gson.annotations.SerializedName;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b>\b\u0086\b\u0018\u00002\u00020\u0001B\u00c3\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0001\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u001fJ\t\u0010>\u001a\u00020\u0001H\u00c6\u0003J\u000f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fH\u00c6\u0003J\t\u0010@\u001a\u00020\u0011H\u00c6\u0003J\t\u0010A\u001a\u00020\u0006H\u00c6\u0003J\t\u0010B\u001a\u00020\u0004H\u00c6\u0003J\t\u0010C\u001a\u00020\u0004H\u00c6\u0003J\t\u0010D\u001a\u00020\u0006H\u00c6\u0003J\t\u0010E\u001a\u00020\u0006H\u00c6\u0003J\t\u0010F\u001a\u00020\u0004H\u00c6\u0003J\t\u0010G\u001a\u00020\u0006H\u00c6\u0003J\t\u0010H\u001a\u00020\u0004H\u00c6\u0003J\t\u0010I\u001a\u00020\u0004H\u00c6\u0003J\t\u0010J\u001a\u00020\u0001H\u00c6\u0003J\t\u0010K\u001a\u00020\u001cH\u00c6\u0003J\t\u0010L\u001a\u00020\u0004H\u00c6\u0003J\t\u0010M\u001a\u00020\u0004H\u00c6\u0003J\t\u0010N\u001a\u00020\u0006H\u00c6\u0003J\t\u0010O\u001a\u00020\u0004H\u00c6\u0003J\t\u0010P\u001a\u00020\u0004H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0004H\u00c6\u0003J\t\u0010R\u001a\u00020\u0004H\u00c6\u0003J\t\u0010S\u001a\u00020\fH\u00c6\u0003J\t\u0010T\u001a\u00020\u0006H\u00c6\u0003J\u00f5\u0001\u0010U\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00062\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u0004H\u00c6\u0001J\u0013\u0010V\u001a\u00020\f2\b\u0010W\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010X\u001a\u00020\u0006H\u00d6\u0001J\t\u0010Y\u001a\u00020\u0004H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00018\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010#R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010#R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010%R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0016\u0010\u0012\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010%R\u0016\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010#R\u0016\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010#R\u0016\u0010\u0015\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010%R\u0016\u0010\u0016\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010%R\u0016\u0010\u0017\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010#R\u0016\u0010\u0018\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010%R\u0016\u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010#R\u0016\u0010\u001a\u001a\u00020\u00018\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010!R\u0016\u0010\u001b\u001a\u00020\u001c8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0016\u0010\u001d\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010#R\u0016\u0010\u001e\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010#\u00a8\u0006Z"}, d2 = {"Lcom/nobroker/myapplication/data/remote/dto/Venue;", "", "accessMethod", "address", "", "capacity", "", "city", "country", "displayLocation", "extendedAddress", "hasUpcomingEvents", "", "id", "links", "", "location", "Lcom/nobroker/myapplication/data/remote/dto/Location;", "metroCode", "name", "nameV2", "numUpcomingEvents", "popularity", "postalCode", "score", "slug", "state", "stats", "Lcom/nobroker/myapplication/data/remote/dto/Stats;", "timezone", "url", "(Ljava/lang/Object;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/util/List;Lcom/nobroker/myapplication/data/remote/dto/Location;ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;ILjava/lang/String;Ljava/lang/Object;Lcom/nobroker/myapplication/data/remote/dto/Stats;Ljava/lang/String;Ljava/lang/String;)V", "getAccessMethod", "()Ljava/lang/Object;", "getAddress", "()Ljava/lang/String;", "getCapacity", "()I", "getCity", "getCountry", "getDisplayLocation", "getExtendedAddress", "getHasUpcomingEvents", "()Z", "getId", "getLinks", "()Ljava/util/List;", "getLocation", "()Lcom/nobroker/myapplication/data/remote/dto/Location;", "getMetroCode", "getName", "getNameV2", "getNumUpcomingEvents", "getPopularity", "getPostalCode", "getScore", "getSlug", "getState", "getStats", "()Lcom/nobroker/myapplication/data/remote/dto/Stats;", "getTimezone", "getUrl", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class Venue {
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "access_method")
    private final java.lang.Object accessMethod = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "address")
    private final java.lang.String address = null;
    @com.google.gson.annotations.SerializedName(value = "capacity")
    private final int capacity = 0;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "city")
    private final java.lang.String city = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "country")
    private final java.lang.String country = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "display_location")
    private final java.lang.String displayLocation = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "extended_address")
    private final java.lang.String extendedAddress = null;
    @com.google.gson.annotations.SerializedName(value = "has_upcoming_events")
    private final boolean hasUpcomingEvents = false;
    @com.google.gson.annotations.SerializedName(value = "id")
    private final int id = 0;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "links")
    private final java.util.List<java.lang.String> links = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "location")
    private final com.nobroker.myapplication.data.remote.dto.Location location = null;
    @com.google.gson.annotations.SerializedName(value = "metro_code")
    private final int metroCode = 0;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "name")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "name_v2")
    private final java.lang.String nameV2 = null;
    @com.google.gson.annotations.SerializedName(value = "num_upcoming_events")
    private final int numUpcomingEvents = 0;
    @com.google.gson.annotations.SerializedName(value = "popularity")
    private final int popularity = 0;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "postal_code")
    private final java.lang.String postalCode = null;
    @com.google.gson.annotations.SerializedName(value = "score")
    private final int score = 0;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "slug")
    private final java.lang.String slug = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "state")
    private final java.lang.Object state = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "stats")
    private final com.nobroker.myapplication.data.remote.dto.Stats stats = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "timezone")
    private final java.lang.String timezone = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "url")
    private final java.lang.String url = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.nobroker.myapplication.data.remote.dto.Venue copy(@org.jetbrains.annotations.NotNull
    java.lang.Object accessMethod, @org.jetbrains.annotations.NotNull
    java.lang.String address, int capacity, @org.jetbrains.annotations.NotNull
    java.lang.String city, @org.jetbrains.annotations.NotNull
    java.lang.String country, @org.jetbrains.annotations.NotNull
    java.lang.String displayLocation, @org.jetbrains.annotations.NotNull
    java.lang.String extendedAddress, boolean hasUpcomingEvents, int id, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> links, @org.jetbrains.annotations.NotNull
    com.nobroker.myapplication.data.remote.dto.Location location, int metroCode, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String nameV2, int numUpcomingEvents, int popularity, @org.jetbrains.annotations.NotNull
    java.lang.String postalCode, int score, @org.jetbrains.annotations.NotNull
    java.lang.String slug, @org.jetbrains.annotations.NotNull
    java.lang.Object state, @org.jetbrains.annotations.NotNull
    com.nobroker.myapplication.data.remote.dto.Stats stats, @org.jetbrains.annotations.NotNull
    java.lang.String timezone, @org.jetbrains.annotations.NotNull
    java.lang.String url) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public Venue(@org.jetbrains.annotations.NotNull
    java.lang.Object accessMethod, @org.jetbrains.annotations.NotNull
    java.lang.String address, int capacity, @org.jetbrains.annotations.NotNull
    java.lang.String city, @org.jetbrains.annotations.NotNull
    java.lang.String country, @org.jetbrains.annotations.NotNull
    java.lang.String displayLocation, @org.jetbrains.annotations.NotNull
    java.lang.String extendedAddress, boolean hasUpcomingEvents, int id, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> links, @org.jetbrains.annotations.NotNull
    com.nobroker.myapplication.data.remote.dto.Location location, int metroCode, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String nameV2, int numUpcomingEvents, int popularity, @org.jetbrains.annotations.NotNull
    java.lang.String postalCode, int score, @org.jetbrains.annotations.NotNull
    java.lang.String slug, @org.jetbrains.annotations.NotNull
    java.lang.Object state, @org.jetbrains.annotations.NotNull
    com.nobroker.myapplication.data.remote.dto.Stats stats, @org.jetbrains.annotations.NotNull
    java.lang.String timezone, @org.jetbrains.annotations.NotNull
    java.lang.String url) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getAccessMethod() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAddress() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getCapacity() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCountry() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDisplayLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getExtendedAddress() {
        return null;
    }
    
    public final boolean component8() {
        return false;
    }
    
    public final boolean getHasUpcomingEvents() {
        return false;
    }
    
    public final int component9() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getLinks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.nobroker.myapplication.data.remote.dto.Location component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.nobroker.myapplication.data.remote.dto.Location getLocation() {
        return null;
    }
    
    public final int component12() {
        return 0;
    }
    
    public final int getMetroCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNameV2() {
        return null;
    }
    
    public final int component15() {
        return 0;
    }
    
    public final int getNumUpcomingEvents() {
        return 0;
    }
    
    public final int component16() {
        return 0;
    }
    
    public final int getPopularity() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPostalCode() {
        return null;
    }
    
    public final int component18() {
        return 0;
    }
    
    public final int getScore() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSlug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.nobroker.myapplication.data.remote.dto.Stats component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.nobroker.myapplication.data.remote.dto.Stats getStats() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTimezone() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component23() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUrl() {
        return null;
    }
}