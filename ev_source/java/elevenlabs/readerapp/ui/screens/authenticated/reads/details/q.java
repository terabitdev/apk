package io.elevenlabs.readerapp.ui.screens.authenticated.reads.details;

import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.menu.PlayerActionsSheetKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements ho.p {
    public final /* synthetic */ int Y;
    public final /* synthetic */ Object Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16851a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f16852b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ho.a f16853c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16854d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f16855e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f16856f;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ sn.d f16857x0;

    /* renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ Object f16858y0;

    public /* synthetic */ q(String str, boolean z6, String str2, boolean z10, ho.a aVar, ho.a aVar2, i3.t tVar, int i10, int i11) {
        this.f16854d = str;
        this.f16852b = z6;
        this.Z = str2;
        this.f16855e = z10;
        this.f16853c = aVar;
        this.f16857x0 = aVar2;
        this.f16858y0 = tVar;
        this.f16856f = i10;
        this.Y = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z DisabledReasonLayout$lambda$1;
        sn.z EchoBottomSheetScaffold$lambda$2;
        sn.z QuickActionsRow$lambda$1;
        switch (this.f16851a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                DisabledReasonLayout$lambda$1 = ReadDetailsScreenKt.DisabledReasonLayout$lambda$1((String) this.f16854d, this.f16852b, (String) this.Z, this.f16855e, this.f16853c, (ho.a) this.f16857x0, (i3.t) this.f16858y0, this.f16856f, this.Y, (u2.m) obj, intValue);
                return DisabledReasonLayout$lambda$1;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                EchoBottomSheetScaffold$lambda$2 = BottomSheetScaffoldKt.EchoBottomSheetScaffold$lambda$2(this.f16852b, this.f16853c, (String) this.f16854d, this.f16855e, (ho.q) this.Z, (ho.q) this.f16857x0, (ho.r) this.f16858y0, this.f16856f, this.Y, (u2.m) obj, intValue2);
                return EchoBottomSheetScaffold$lambda$2;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                QuickActionsRow$lambda$1 = PlayerActionsSheetKt.QuickActionsRow$lambda$1(this.f16852b, this.f16855e, this.f16853c, (ho.a) this.f16857x0, (ho.a) this.f16854d, (ho.a) this.Z, (i3.t) this.f16858y0, this.f16856f, this.Y, (u2.m) obj, intValue3);
                return QuickActionsRow$lambda$1;
        }
    }

    public /* synthetic */ q(boolean z6, ho.a aVar, String str, boolean z10, ho.q qVar, ho.q qVar2, ho.r rVar, int i10, int i11) {
        this.f16852b = z6;
        this.f16853c = aVar;
        this.f16854d = str;
        this.f16855e = z10;
        this.Z = qVar;
        this.f16857x0 = qVar2;
        this.f16858y0 = rVar;
        this.f16856f = i10;
        this.Y = i11;
    }

    public /* synthetic */ q(boolean z6, boolean z10, ho.a aVar, ho.a aVar2, ho.a aVar3, ho.a aVar4, i3.t tVar, int i10, int i11) {
        this.f16852b = z6;
        this.f16855e = z10;
        this.f16853c = aVar;
        this.f16857x0 = aVar2;
        this.f16854d = aVar3;
        this.Z = aVar4;
        this.f16858y0 = tVar;
        this.f16856f = i10;
        this.Y = i11;
    }
}
