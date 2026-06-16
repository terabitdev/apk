package io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations;

import i3.t;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16603a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f16604b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ho.l f16605c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16606d;

    public /* synthetic */ n(ho.l lVar, t tVar, int i10) {
        this.f16605c = lVar;
        this.f16604b = tVar;
        this.f16606d = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z GetFeedbackItem$lambda$1;
        u2.m mVar = (u2.m) obj;
        Integer num = (Integer) obj2;
        switch (this.f16603a) {
            case 0:
                GetFeedbackItem$lambda$1 = PronunciationsListScreenKt.GetFeedbackItem$lambda$1(this.f16605c, this.f16604b, this.f16606d, mVar, num.intValue());
                return GetFeedbackItem$lambda$1;
            default:
                num.intValue();
                l1.n.b(this.f16605c, this.f16604b, mVar, u2.r.M(this.f16606d | 1));
                return z.f31622a;
        }
    }

    public /* synthetic */ n(t tVar, ho.l lVar, int i10) {
        this.f16604b = tVar;
        this.f16605c = lVar;
        this.f16606d = i10;
    }
}
