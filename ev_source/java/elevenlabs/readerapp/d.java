package io.elevenlabs.readerapp;

import p4.b0;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14491a;

    public /* synthetic */ d(int i10) {
        this.f14491a = i10;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        LowDiskSpaceState copy;
        AppCompatibilityState dismiss$lambda$0;
        LowDiskSpaceState dismiss$lambda$02;
        z onCreate$lambda$1$0$0$1$0;
        switch (this.f14491a) {
            case 0:
                copy = ((LowDiskSpaceState) obj).copy(true);
                return copy;
            case 1:
                dismiss$lambda$0 = AppCompatibilityViewModel.dismiss$lambda$0((AppCompatibilityState) obj);
                return dismiss$lambda$0;
            case 2:
                dismiss$lambda$02 = LowDiskSpaceViewModel.dismiss$lambda$0((LowDiskSpaceState) obj);
                return dismiss$lambda$02;
            default:
                onCreate$lambda$1$0$0$1$0 = MainActivity.onCreate$lambda$1$0$0$1$0((b0) obj);
                return onCreate$lambda$1$0$0$1$0;
        }
    }
}
