package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17005a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17006b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17007c;

    public /* synthetic */ x(Object obj, Object obj2, int i10) {
        this.f17005a = i10;
        this.f17006b = obj;
        this.f17007c = obj2;
    }

    @Override // ho.a
    public final Object invoke() {
        sn.z ImportFileScreen$lambda$2$0;
        sn.z RateTitleSheetUI$lambda$4$1$0;
        sn.z ReadLinkShareSheet$lambda$3$0;
        switch (this.f17005a) {
            case 0:
                ImportFileScreen$lambda$2$0 = ImportFileScreenKt.ImportFileScreen$lambda$2$0((j.j) this.f17006b, (ImportFileViewModel) this.f17007c);
                return ImportFileScreen$lambda$2$0;
            case 1:
                RateTitleSheetUI$lambda$4$1$0 = RateTitleSheetKt.RateTitleSheetUI$lambda$4$1$0((ho.l) this.f17006b, (z0) this.f17007c);
                return RateTitleSheetUI$lambda$4$1$0;
            default:
                ReadLinkShareSheet$lambda$3$0 = ReadLinkShareSheetKt.ReadLinkShareSheet$lambda$3$0((ReadLinkShareViewModel) this.f17006b, (ho.a) this.f17007c);
                return ReadLinkShareSheet$lambda$3$0;
        }
    }
}
