package io.elevenlabs.data.extensions;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14093a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SharedPreferences f14094b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SharedPreferences.OnSharedPreferenceChangeListener f14095c;

    public /* synthetic */ c(SharedPreferences sharedPreferences, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener, int i10) {
        this.f14093a = i10;
        this.f14094b = sharedPreferences;
        this.f14095c = onSharedPreferenceChangeListener;
    }

    @Override // ho.a
    public final Object invoke() {
        switch (this.f14093a) {
            case 0:
                return SharedPreferencesExtensionsKt$observe$1.d(this.f14094b, this.f14095c);
            default:
                return SharedPreferencesExtensionsKt$observeKeys$1.d(this.f14094b, this.f14095c);
        }
    }
}
