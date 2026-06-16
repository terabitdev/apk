package io.elevenlabs.ui.components;

import q2.d5;
import q2.i6;
import q2.j6;
import q2.q7;
import q2.t7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p0 implements ho.p {
    public final /* synthetic */ Object Y;
    public final /* synthetic */ sn.d Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17556a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17557b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f17558c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17560e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f17561f;

    public /* synthetic */ p0(i3.t tVar, ho.a aVar, boolean z6, p3.b1 b1Var, q2.x2 x2Var, ho.p pVar, int i10) {
        this.f17557b = tVar;
        this.f17559d = aVar;
        this.f17558c = z6;
        this.f17561f = b1Var;
        this.Y = x2Var;
        this.Z = pVar;
        this.f17560e = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z ConfirmationDialogContent$lambda$3;
        switch (this.f17556a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                ConfirmationDialogContent$lambda$3 = ConfirmationDialogKt.ConfirmationDialogContent$lambda$3((String) this.f17557b, (ho.a) this.f17559d, (String) this.f17561f, (ho.a) this.Y, (ho.p) this.Z, this.f17558c, this.f17560e, (u2.m) obj, intValue);
                return ConfirmationDialogContent$lambda$3;
            case 1:
                ((Integer) obj2).getClass();
                m1.f.c((String) this.f17557b, this.f17558c, (m1.c) this.f17561f, (i3.t) this.Y, (ho.q) this.Z, (ho.a) this.f17559d, (u2.m) obj, u2.r.M(this.f17560e | 1));
                return sn.z.f31622a;
            case 2:
                ((Integer) obj2).getClass();
                d5.h((i3.t) this.f17557b, (ho.a) this.f17559d, this.f17558c, (p3.b1) this.f17561f, (q2.x2) this.Y, (ho.p) this.Z, (u2.m) obj, u2.r.M(this.f17560e | 1));
                return sn.z.f31622a;
            case 3:
                ((Integer) obj2).getClass();
                i6.c((i3.t) this.f17557b, (j6) this.f17561f, this.f17558c, (p1.l) this.f17559d, (ho.q) this.Y, (c3.j) this.Z, (u2.m) obj, u2.r.M(this.f17560e | 1));
                return sn.z.f31622a;
            case 4:
                ((Integer) obj2).getClass();
                q7.b((l5.a0) this.f17557b, (c3.j) this.f17561f, (t7) this.f17559d, (i3.t) this.Y, this.f17558c, (c3.j) this.Z, (u2.m) obj, u2.r.M(this.f17560e | 1));
                return sn.z.f31622a;
            default:
                ((Integer) obj2).getClass();
                s2.i.c((l5.a0) this.f17557b, (t7) this.f17561f, (fr.d0) this.f17559d, this.f17558c, (u2.z0) this.Y, (c3.j) this.Z, (u2.m) obj, u2.r.M(this.f17560e | 1));
                return sn.z.f31622a;
        }
    }

    public /* synthetic */ p0(i3.t tVar, j6 j6Var, boolean z6, p1.l lVar, ho.q qVar, c3.j jVar, int i10) {
        this.f17557b = tVar;
        this.f17561f = j6Var;
        this.f17558c = z6;
        this.f17559d = lVar;
        this.Y = qVar;
        this.Z = jVar;
        this.f17560e = i10;
    }

    public /* synthetic */ p0(String str, ho.a aVar, String str2, ho.a aVar2, ho.p pVar, boolean z6, int i10) {
        this.f17557b = str;
        this.f17559d = aVar;
        this.f17561f = str2;
        this.Y = aVar2;
        this.Z = pVar;
        this.f17558c = z6;
        this.f17560e = i10;
    }

    public /* synthetic */ p0(String str, boolean z6, m1.c cVar, i3.t tVar, ho.q qVar, ho.a aVar, int i10) {
        this.f17557b = str;
        this.f17558c = z6;
        this.f17561f = cVar;
        this.Y = tVar;
        this.Z = qVar;
        this.f17559d = aVar;
        this.f17560e = i10;
    }

    public /* synthetic */ p0(l5.a0 a0Var, c3.j jVar, t7 t7Var, i3.t tVar, boolean z6, c3.j jVar2, int i10) {
        this.f17557b = a0Var;
        this.f17561f = jVar;
        this.f17559d = t7Var;
        this.Y = tVar;
        this.f17558c = z6;
        this.Z = jVar2;
        this.f17560e = i10;
    }

    public /* synthetic */ p0(l5.a0 a0Var, t7 t7Var, fr.d0 d0Var, boolean z6, u2.z0 z0Var, c3.j jVar, int i10) {
        this.f17557b = a0Var;
        this.f17561f = t7Var;
        this.f17559d = d0Var;
        this.f17558c = z6;
        this.Y = z0Var;
        this.Z = jVar;
        this.f17560e = i10;
    }
}
