package io.elevenlabs.readerapp.ui.screens.authenticated.player.contents;

import ho.p;
import sn.z;
import u1.o;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16019a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.l f16020b;

    public /* synthetic */ j(ho.l lVar, int i10) {
        this.f16019a = i10;
        this.f16020b = lVar;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z PlayerContentsScreen$lambda$1$0$2;
        switch (this.f16019a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                PlayerContentsScreen$lambda$1$0$2 = PlayerContentsScreenKt.PlayerContentsScreen$lambda$1$0$2(this.f16020b, (m) obj, intValue);
                return PlayerContentsScreen$lambda$1$0$2;
            case 1:
                ((Integer) obj2).getClass();
                return (u1.e) this.f16020b.invoke((o) obj);
            default:
                this.f16020b.invoke(obj);
                return z.f31622a;
        }
    }
}
