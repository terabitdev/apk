package io.elevenlabs.ui.components;

import java.util.List;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o2 implements ho.p {
    public final /* synthetic */ Object Y;
    public final /* synthetic */ sn.d Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17547a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i3.t f17548b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f17549c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17551e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f17552f;

    public /* synthetic */ o2(boolean z6, ho.a aVar, String str, i3.t tVar, ho.p pVar, int i10, int i11) {
        this.f17547a = 2;
        this.f17549c = z6;
        this.Z = aVar;
        this.Y = str;
        this.f17548b = tVar;
        this.f17550d = pVar;
        this.f17551e = i10;
        this.f17552f = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z ActionItem$lambda$3;
        sn.z ActionsRow$lambda$1;
        sn.z EchoRadioButton$lambda$2;
        switch (this.f17547a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                ActionItem$lambda$3 = SwipeToActionBoxKt.ActionItem$lambda$3((ActionConfig) this.Y, (ho.a) this.Z, this.f17548b, this.f17549c, (BoxSide) this.f17550d, this.f17551e, this.f17552f, (u2.m) obj, intValue);
                return ActionItem$lambda$3;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                ActionsRow$lambda$1 = SwipeToActionBoxKt.ActionsRow$lambda$1((List) this.Y, (ho.l) this.Z, this.f17548b, this.f17549c, (BoxSide) this.f17550d, this.f17551e, this.f17552f, (u2.m) obj, intValue2);
                return ActionsRow$lambda$1;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                EchoRadioButton$lambda$2 = EchoRadioButtonKt.EchoRadioButton$lambda$2(this.f17549c, (ho.a) this.Z, (String) this.Y, this.f17548b, (ho.p) this.f17550d, this.f17551e, this.f17552f, (u2.m) obj, intValue3);
                return EchoRadioButton$lambda$2;
        }
    }

    public /* synthetic */ o2(Object obj, sn.d dVar, i3.t tVar, boolean z6, BoxSide boxSide, int i10, int i11, int i12) {
        this.f17547a = i12;
        this.Y = obj;
        this.Z = dVar;
        this.f17548b = tVar;
        this.f17549c = z6;
        this.f17550d = boxSide;
        this.f17551e = i10;
        this.f17552f = i11;
    }
}
