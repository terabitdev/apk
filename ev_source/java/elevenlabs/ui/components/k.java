package io.elevenlabs.ui.components;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17472a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17473b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17474c;

    public /* synthetic */ k(Object obj, Object obj2, int i10) {
        this.f17472a = i10;
        this.f17473b = obj;
        this.f17474c = obj2;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z ConfirmationDialogContent$lambda$0;
        sn.z MetaChip$lambda$2$0;
        sn.z PillSmall$lambda$0;
        switch (this.f17472a) {
            case 0:
                return AutoScrollingChipRowKt$autoScroll$2.d((kotlin.jvm.internal.a0) this.f17473b, (n1.o2) this.f17474c, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
            case 1:
                ConfirmationDialogContent$lambda$0 = ConfirmationDialogKt.ConfirmationDialogContent$lambda$0((String) this.f17473b, (String) this.f17474c, (u2.m) obj, ((Integer) obj2).intValue());
                return ConfirmationDialogContent$lambda$0;
            case 2:
                MetaChip$lambda$2$0 = MetaChipKt.MetaChip$lambda$2$0((MetaChipVariant) this.f17473b, (String) this.f17474c, (u2.m) obj, ((Integer) obj2).intValue());
                return MetaChip$lambda$2$0;
            case 3:
                PillSmall$lambda$0 = PillSmallKt.PillSmall$lambda$0((i3.t) this.f17473b, (String) this.f17474c, (u2.m) obj, ((Integer) obj2).intValue());
                return PillSmall$lambda$0;
            default:
                return ToastContainerKt.a((ho.a) this.f17473b, (ho.p) this.f17474c, (u2.m) obj, ((Integer) obj2).intValue());
        }
    }
}
