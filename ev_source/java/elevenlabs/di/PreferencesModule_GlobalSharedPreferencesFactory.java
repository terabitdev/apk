package io.elevenlabs.di;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.room.m0;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class PreferencesModule_GlobalSharedPreferencesFactory implements ul.c {
    private final f contextProvider;

    private PreferencesModule_GlobalSharedPreferencesFactory(f fVar) {
        this.contextProvider = fVar;
    }

    public static PreferencesModule_GlobalSharedPreferencesFactory create(f fVar) {
        return new PreferencesModule_GlobalSharedPreferencesFactory(fVar);
    }

    public static SharedPreferences globalSharedPreferences(Context context) {
        SharedPreferences globalSharedPreferences = PreferencesModule.INSTANCE.globalSharedPreferences(context);
        m0.n(globalSharedPreferences);
        return globalSharedPreferences;
    }

    @Override // rn.a
    public SharedPreferences get() {
        return globalSharedPreferences((Context) this.contextProvider.get());
    }
}
