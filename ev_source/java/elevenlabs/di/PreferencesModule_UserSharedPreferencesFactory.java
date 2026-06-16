package io.elevenlabs.di;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.room.m0;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class PreferencesModule_UserSharedPreferencesFactory implements ul.c {
    private final f contextProvider;

    private PreferencesModule_UserSharedPreferencesFactory(f fVar) {
        this.contextProvider = fVar;
    }

    public static PreferencesModule_UserSharedPreferencesFactory create(f fVar) {
        return new PreferencesModule_UserSharedPreferencesFactory(fVar);
    }

    public static SharedPreferences userSharedPreferences(Context context) {
        SharedPreferences userSharedPreferences = PreferencesModule.INSTANCE.userSharedPreferences(context);
        m0.n(userSharedPreferences);
        return userSharedPreferences;
    }

    @Override // rn.a
    public SharedPreferences get() {
        return userSharedPreferences((Context) this.contextProvider.get());
    }
}
