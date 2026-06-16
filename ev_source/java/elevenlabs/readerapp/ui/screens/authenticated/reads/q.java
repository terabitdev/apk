package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements ho.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16966a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16967b;

    public /* synthetic */ q(Object obj, int i10) {
        this.f16966a = i10;
        this.f16967b = obj;
    }

    @Override // ho.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        sn.z GenFMLoadingUI$lambda$6$0$0$0;
        sn.z ReadLinkShareSheet$lambda$4;
        switch (this.f16966a) {
            case 0:
                GenFMLoadingUI$lambda$6$0$0$0 = GenFMLoadingScreenKt.GenFMLoadingUI$lambda$6$0$0$0((z0) this.f16967b, (i1.o) obj, ((Boolean) obj2).booleanValue(), (u2.m) obj3, ((Integer) obj4).intValue());
                return GenFMLoadingUI$lambda$6$0$0$0;
            default:
                ReadLinkShareSheet$lambda$4 = ReadLinkShareSheetKt.ReadLinkShareSheet$lambda$4((ReadLinkShareState) this.f16967b, (r1.y) obj, (BottomSheetControl) obj2, (u2.m) obj3, ((Integer) obj4).intValue());
                return ReadLinkShareSheet$lambda$4;
        }
    }
}
