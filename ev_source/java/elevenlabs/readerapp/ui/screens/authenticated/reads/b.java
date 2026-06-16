package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import r1.l2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements ho.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16748a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.a f16749b;

    public /* synthetic */ b(int i10, ho.a aVar) {
        this.f16748a = i10;
        this.f16749b = aVar;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        sn.z AddSharedReadScreenUI$lambda$2$0;
        sn.z ImportFileScreenUI$lambda$1$0;
        sn.z ImportLinkScreenUI$lambda$0$0;
        sn.z PasteLinkScreenUI$lambda$1$0;
        sn.z WriteScreenUI$lambda$8$0;
        int i10 = this.f16748a;
        l2 l2Var = (l2) obj;
        u2.m mVar = (u2.m) obj2;
        int intValue = ((Integer) obj3).intValue();
        switch (i10) {
            case 0:
                AddSharedReadScreenUI$lambda$2$0 = AddSharedReadScreenKt.AddSharedReadScreenUI$lambda$2$0(this.f16749b, l2Var, mVar, intValue);
                return AddSharedReadScreenUI$lambda$2$0;
            case 1:
                ImportFileScreenUI$lambda$1$0 = ImportFileScreenKt.ImportFileScreenUI$lambda$1$0(this.f16749b, l2Var, mVar, intValue);
                return ImportFileScreenUI$lambda$1$0;
            case 2:
                ImportLinkScreenUI$lambda$0$0 = ImportLinkScreenKt.ImportLinkScreenUI$lambda$0$0(this.f16749b, l2Var, mVar, intValue);
                return ImportLinkScreenUI$lambda$0$0;
            case 3:
                PasteLinkScreenUI$lambda$1$0 = PasteLinkScreenKt.PasteLinkScreenUI$lambda$1$0(this.f16749b, l2Var, mVar, intValue);
                return PasteLinkScreenUI$lambda$1$0;
            default:
                WriteScreenUI$lambda$8$0 = WriteScreenKt.WriteScreenUI$lambda$8$0(this.f16749b, l2Var, mVar, intValue);
                return WriteScreenUI$lambda$8$0;
        }
    }
}
