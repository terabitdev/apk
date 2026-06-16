package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements;

import io.elevenlabs.ui.components.ZoomableBoxScope;
import r1.l2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements ho.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16131a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f16132b;

    public /* synthetic */ r(String str, int i10) {
        this.f16131a = i10;
        this.f16132b = str;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        sn.z FullScreenImage$lambda$3;
        sn.z UnlockFullReadButton$lambda$0;
        switch (this.f16131a) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                FullScreenImage$lambda$3 = FullScreenImageKt.FullScreenImage$lambda$3(this.f16132b, (ZoomableBoxScope) obj, (u2.m) obj2, intValue);
                return FullScreenImage$lambda$3;
            default:
                int intValue2 = ((Integer) obj3).intValue();
                UnlockFullReadButton$lambda$0 = UnlockFullReadButtonKt.UnlockFullReadButton$lambda$0(this.f16132b, (l2) obj, (u2.m) obj2, intValue2);
                return UnlockFullReadButton$lambda$0;
        }
    }
}
