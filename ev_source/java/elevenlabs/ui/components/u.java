package io.elevenlabs.ui.components;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements ho.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17667a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.q f17668b;

    public /* synthetic */ u(ho.q qVar, int i10) {
        this.f17667a = i10;
        this.f17668b = qVar;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        sn.z ChipFlowGroup$lambda$0;
        switch (this.f17667a) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                return ButtonOutlinedKt.a(this.f17668b, (r1.s) obj, (u2.m) obj2, intValue);
            default:
                int intValue2 = ((Integer) obj3).intValue();
                ChipFlowGroup$lambda$0 = ChipGroupKt.ChipFlowGroup$lambda$0(this.f17668b, (r1.v0) obj, (u2.m) obj2, intValue2);
                return ChipFlowGroup$lambda$0;
        }
    }
}
