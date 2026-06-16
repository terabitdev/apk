package io.elevenlabs.ui.components;

import android.content.Context;
import io.elevenlabs.ui.extensions.SafeHapticFeedback;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h0 implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17413a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17414b;

    public /* synthetic */ h0(Object obj, int i10) {
        this.f17413a = i10;
        this.f17414b = obj;
    }

    @Override // ho.a
    public final Object invoke() {
        float Loader_eopBjH0$lambda$0$0;
        sn.z ActionRowsContainer$lambda$0$0;
        float SwipeToActionBox$lambda$14;
        switch (this.f17413a) {
            case 0:
                return CoilKt.a((Context) this.f17414b);
            case 1:
                Loader_eopBjH0$lambda$0$0 = LoaderKt.Loader_eopBjH0$lambda$0$0((Integer) this.f17414b);
                return Float.valueOf(Loader_eopBjH0$lambda$0$0);
            case 2:
                ActionRowsContainer$lambda$0$0 = SwipeToActionBoxKt.ActionRowsContainer$lambda$0$0((SafeHapticFeedback) this.f17414b);
                return ActionRowsContainer$lambda$0$0;
            default:
                SwipeToActionBox$lambda$14 = SwipeToActionBoxKt.SwipeToActionBox$lambda$14((u2.w0) this.f17414b);
                return Float.valueOf(SwipeToActionBox$lambda$14);
        }
    }
}
