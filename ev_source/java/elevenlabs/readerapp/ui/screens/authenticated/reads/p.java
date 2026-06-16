package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import r1.z1;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements ho.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16958a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.l f16959b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0 f16960c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16961d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16962e;

    public /* synthetic */ p(ho.l lVar, n3.v vVar, z0 z0Var, z0 z0Var2) {
        this.f16959b = lVar;
        this.f16961d = vVar;
        this.f16960c = z0Var;
        this.f16962e = z0Var2;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        sn.z GenFMLoadingUI$lambda$6;
        sn.z WriteScreenUI$lambda$9;
        switch (this.f16958a) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                GenFMLoadingUI$lambda$6 = GenFMLoadingScreenKt.GenFMLoadingUI$lambda$6(this.f16960c, (GenFMLoadingState) this.f16961d, (ho.a) this.f16962e, this.f16959b, (z1) obj, (u2.m) obj2, intValue);
                return GenFMLoadingUI$lambda$6;
            default:
                int intValue2 = ((Integer) obj3).intValue();
                WriteScreenUI$lambda$9 = WriteScreenKt.WriteScreenUI$lambda$9(this.f16959b, (n3.v) this.f16961d, this.f16960c, (z0) this.f16962e, (z1) obj, (u2.m) obj2, intValue2);
                return WriteScreenUI$lambda$9;
        }
    }

    public /* synthetic */ p(z0 z0Var, GenFMLoadingState genFMLoadingState, ho.a aVar, ho.l lVar) {
        this.f16960c = z0Var;
        this.f16961d = genFMLoadingState;
        this.f16962e = aVar;
        this.f16959b = lVar;
    }
}
