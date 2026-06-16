package io.elevenlabs.di;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\t"}, d2 = {"Lio/elevenlabs/di/PreferencesModule;", "", "<init>", "()V", "userSharedPreferences", "Landroid/content/SharedPreferences;", "context", "Landroid/content/Context;", "globalSharedPreferences", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class PreferencesModule {
    public static final PreferencesModule INSTANCE = new PreferencesModule();

    private PreferencesModule() {
    }

    @GlobalSharedPreferences
    public final SharedPreferences globalSharedPreferences(Context context) {
        context.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences("GLOBAL", 0);
        sharedPreferences.getClass();
        return sharedPreferences;
    }

    @UserSharedPreferences
    public final SharedPreferences userSharedPreferences(Context context) {
        context.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences("USER", 0);
        sharedPreferences.getClass();
        return sharedPreferences;
    }
}
