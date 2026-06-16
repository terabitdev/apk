package io.elevenlabs.ui.components;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17531a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.a f17532b;

    public /* synthetic */ o(int i10, ho.a aVar) {
        this.f17531a = i10;
        this.f17532b = aVar;
    }

    @Override // ho.a
    public final Object invoke() {
        sn.z Checkbox$lambda$2$0;
        sn.z Chip$IconComponent$lambda$3$0;
        sn.z Chip$lambda$10$1$0;
        sn.z Chip$AsyncIconComponent$lambda$7$0;
        switch (this.f17531a) {
            case 0:
                return BoxSectionKt.a(this.f17532b);
            case 1:
                Checkbox$lambda$2$0 = CheckboxKt.Checkbox$lambda$2$0(this.f17532b);
                return Checkbox$lambda$2$0;
            case 2:
                Chip$IconComponent$lambda$3$0 = ChipKt.Chip$IconComponent$lambda$3$0(this.f17532b);
                return Chip$IconComponent$lambda$3$0;
            case 3:
                Chip$lambda$10$1$0 = ChipKt.Chip$lambda$10$1$0(this.f17532b);
                return Chip$lambda$10$1$0;
            case 4:
                Chip$AsyncIconComponent$lambda$7$0 = ChipKt.Chip$AsyncIconComponent$lambda$7$0(this.f17532b);
                return Chip$AsyncIconComponent$lambda$7$0;
            case 5:
                return ErrorScreenKt.f(this.f17532b);
            case 6:
                return MenuKt.h(this.f17532b);
            case 7:
                return PillKt.c(this.f17532b);
            case 8:
                return RadioButtonKt.c(this.f17532b);
            case 9:
                return SelectableBadgeBoxKt.i(this.f17532b);
            case 10:
                return SelectableCardV2Kt.e(this.f17532b);
            default:
                return SwipeToActionBoxKt.C(this.f17532b);
        }
    }
}
