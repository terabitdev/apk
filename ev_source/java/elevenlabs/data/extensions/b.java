package io.elevenlabs.data.extensions;

import android.content.SharedPreferences;
import ho.p;
import hr.x;
import java.util.Set;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14089a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f14090b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f14091c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14092d;

    public /* synthetic */ b(Object obj, x xVar, p pVar, int i10) {
        this.f14089a = i10;
        this.f14092d = obj;
        this.f14090b = xVar;
        this.f14091c = pVar;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        switch (this.f14089a) {
            case 0:
                SharedPreferencesExtensionsKt$observe$1.invokeSuspend$lambda$0((String) this.f14092d, this.f14090b, this.f14091c, sharedPreferences, str);
                return;
            default:
                SharedPreferencesExtensionsKt$observeKeys$1.invokeSuspend$lambda$0((Set) this.f14092d, this.f14090b, this.f14091c, sharedPreferences, str);
                return;
        }
    }
}
