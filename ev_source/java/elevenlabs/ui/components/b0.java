package io.elevenlabs.ui.components;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b0 implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17269a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17270b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17271c;

    public /* synthetic */ b0(Object obj, Object obj2, int i10) {
        this.f17269a = i10;
        this.f17270b = obj;
        this.f17271c = obj2;
    }

    @Override // ho.a
    public final Object invoke() {
        sn.z ChipGroup$lambda$2$0$0$0$0$0;
        sn.z Input$lambda$3$0;
        sn.z SectionHeader$lambda$0$0;
        sn.z ActionsRow$lambda$0$0$0$0;
        switch (this.f17269a) {
            case 0:
                ChipGroup$lambda$2$0$0$0$0$0 = ChipGroupKt.ChipGroup$lambda$2$0$0$0$0$0((ho.l) this.f17270b, this.f17271c);
                return ChipGroup$lambda$2$0$0$0$0$0;
            case 1:
                Input$lambda$3$0 = InputKt.Input$lambda$3$0((y4.w) this.f17270b, (u2.z0) this.f17271c);
                return Input$lambda$3$0;
            case 2:
                SectionHeader$lambda$0$0 = SectionHeaderKt.SectionHeader$lambda$0$0((ho.l) this.f17270b, (String) this.f17271c);
                return SectionHeader$lambda$0$0;
            default:
                ActionsRow$lambda$0$0$0$0 = SwipeToActionBoxKt.ActionsRow$lambda$0$0$0$0((ho.l) this.f17270b, (ActionConfig) this.f17271c);
                return ActionsRow$lambda$0$0$0$0;
        }
    }
}
