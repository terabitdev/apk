package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h0 implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16919a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f16920b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16921c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho.a f16922d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f16923e;

    public /* synthetic */ h0(String str, int i10, ho.a aVar, int i11, int i12) {
        this.f16919a = i12;
        this.f16920b = str;
        this.f16921c = i10;
        this.f16922d = aVar;
        this.f16923e = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z SheetItem$lambda$2;
        sn.z ShareActionButton$lambda$1;
        switch (this.f16919a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                SheetItem$lambda$2 = MoreActionsSheetKt.SheetItem$lambda$2(this.f16920b, this.f16921c, this.f16922d, this.f16923e, (u2.m) obj, intValue);
                return SheetItem$lambda$2;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                ShareActionButton$lambda$1 = ReadShareDetailsScreenKt.ShareActionButton$lambda$1(this.f16920b, this.f16921c, this.f16922d, this.f16923e, (u2.m) obj, intValue2);
                return ShareActionButton$lambda$1;
        }
    }
}
