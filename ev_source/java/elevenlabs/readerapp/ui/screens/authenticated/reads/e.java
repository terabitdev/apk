package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import r1.l2;
import r1.z1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements ho.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16905a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.l f16906b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16907c;

    public /* synthetic */ e(ho.l lVar, ImportLinkState importLinkState) {
        this.f16906b = lVar;
        this.f16907c = importLinkState;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        sn.z AddSharedReadScreenUI$lambda$3;
        sn.z ImportLinkScreenUI$lambda$0$1;
        switch (this.f16905a) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                AddSharedReadScreenUI$lambda$3 = AddSharedReadScreenKt.AddSharedReadScreenUI$lambda$3((AddSharedReadState) this.f16907c, this.f16906b, (z1) obj, (u2.m) obj2, intValue);
                return AddSharedReadScreenUI$lambda$3;
            default:
                int intValue2 = ((Integer) obj3).intValue();
                ImportLinkScreenUI$lambda$0$1 = ImportLinkScreenKt.ImportLinkScreenUI$lambda$0$1(this.f16906b, (ImportLinkState) this.f16907c, (l2) obj, (u2.m) obj2, intValue2);
                return ImportLinkScreenUI$lambda$0$1;
        }
    }

    public /* synthetic */ e(AddSharedReadState addSharedReadState, ho.l lVar) {
        this.f16907c = addSharedReadState;
        this.f16906b = lVar;
    }
}
