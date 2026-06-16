package io.elevenlabs.ui.components;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d2 implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17331a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17332b;

    public /* synthetic */ d2(Object obj, int i10) {
        this.f17331a = i10;
        this.f17332b = obj;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z ErrorScreen_uDo3WH8$lambda$0;
        sn.z Select$lambda$3;
        switch (this.f17331a) {
            case 0:
                return RubberBandOverscrollEffect$applyToFling$2.d((RubberBandOverscrollEffect) this.f17332b, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
            case 1:
                ErrorScreen_uDo3WH8$lambda$0 = ErrorScreenKt.ErrorScreen_uDo3WH8$lambda$0((ho.a) this.f17332b, (u2.m) obj, ((Integer) obj2).intValue());
                return ErrorScreen_uDo3WH8$lambda$0;
            case 2:
                return RowWithInvertedMeasurementKt.c((ho.q) this.f17332b, (u2.m) obj, ((Integer) obj2).intValue());
            default:
                Select$lambda$3 = SelectKt.Select$lambda$3((Integer) this.f17332b, (u2.m) obj, ((Integer) obj2).intValue());
                return Select$lambda$3;
        }
    }
}
