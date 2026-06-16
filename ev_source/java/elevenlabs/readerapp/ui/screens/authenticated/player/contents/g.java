package io.elevenlabs.readerapp.ui.screens.authenticated.player.contents;

import io.elevenlabs.ui.components.SegmentedSelectorControlKt;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16011a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.l f16012b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16013c;

    public /* synthetic */ g(ho.l lVar, int i10, int i11) {
        this.f16011a = i11;
        this.f16012b = lVar;
        this.f16013c = i10;
    }

    @Override // ho.a
    public final Object invoke() {
        z PlayerContentsScreenUI$lambda$3$0$0$0$0$0;
        z SegmentedSelectorControl$lambda$6$1$0$1$0;
        switch (this.f16011a) {
            case 0:
                PlayerContentsScreenUI$lambda$3$0$0$0$0$0 = PlayerContentsScreenKt.PlayerContentsScreenUI$lambda$3$0$0$0$0$0(this.f16012b, this.f16013c);
                return PlayerContentsScreenUI$lambda$3$0$0$0$0$0;
            case 1:
                SegmentedSelectorControl$lambda$6$1$0$1$0 = SegmentedSelectorControlKt.SegmentedSelectorControl$lambda$6$1$0$1$0(this.f16012b, this.f16013c);
                return SegmentedSelectorControl$lambda$6$1$0$1$0;
            default:
                this.f16012b.invoke(Integer.valueOf(this.f16013c));
                return z.f31622a;
        }
    }
}
