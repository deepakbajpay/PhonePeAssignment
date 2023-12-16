package com.nobroker.myapplication.data.local;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@androidx.room.Database(entities = {}, version = 3)
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/nobroker/myapplication/data/local/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    
    public AppDatabase() {
        super();
    }
}