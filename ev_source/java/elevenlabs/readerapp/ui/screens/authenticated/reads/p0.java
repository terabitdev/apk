package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import u2.s2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p0 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16963a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f16964b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16965c;

    public /* synthetic */ p0(long j4, s2 s2Var) {
        this.f16963a = 1;
        this.f16964b = j4;
        this.f16965c = s2Var;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        RateTitleState submit$lambda$0;
        int i10 = this.f16963a;
        sn.z zVar = sn.z.f31622a;
        long j4 = this.f16964b;
        Object obj2 = this.f16965c;
        switch (i10) {
            case 0:
                submit$lambda$0 = RateTitleViewModel.submit$lambda$0((RateTitleViewModel) obj2, j4, (RateTitleState) obj);
                return submit$lambda$0;
            case 1:
                r3.e.q0((r3.e) obj, this.f16964b, 0L, 0L, ae.l.l(((Number) ((s2) obj2).getValue()).floatValue(), t2.u.P, 1.0f), null, 0, 118);
                return zVar;
            default:
                v1.w wVar = (v1.w) obj2;
                long c5 = h5.j.c(((h5.j) ((j1.d) obj).d()).f12086a, j4);
                int i11 = v1.w.f34928t;
                wVar.g(c5);
                wVar.f34931c.invoke();
                return zVar;
        }
    }

    public /* synthetic */ p0(Object obj, long j4, int i10) {
        this.f16963a = i10;
        this.f16965c = obj;
        this.f16964b = j4;
    }
}
