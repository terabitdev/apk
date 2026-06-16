package io.elevenlabs.readerapp.core.router;

import androidx.room.m0;
import i4.q2;
import java.util.List;
import q2.s0;
import q2.u0;
import q2.w0;
import q2.y0;
import u2.s2;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements ho.p {
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14479a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14480b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14481c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14483e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14484f;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ Object f14485x0;

    public /* synthetic */ x(na.c0 c0Var, RouterViewModel routerViewModel, fr.d0 d0Var, String str, h5.c cVar, q2 q2Var, z0 z0Var, List list) {
        this.f14479a = 0;
        this.f14480b = c0Var;
        this.f14481c = routerViewModel;
        this.f14482d = d0Var;
        this.f14483e = str;
        this.f14484f = cVar;
        this.Y = q2Var;
        this.Z = z0Var;
        this.f14485x0 = list;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z Router$lambda$20;
        switch (this.f14479a) {
            case 0:
                Router$lambda$20 = RouterKt.Router$lambda$20((na.c0) this.f14480b, (RouterViewModel) this.f14481c, (fr.d0) this.f14482d, (String) this.f14483e, (h5.c) this.f14484f, (q2) this.Y, (s2) this.Z, (List) this.f14485x0, (u2.m) obj, ((Integer) obj2).intValue());
                return Router$lambda$20;
            case 1:
                ((Integer) obj2).getClass();
                s0.a((Long) this.f14480b, (ho.l) this.f14481c, (s2.v) this.f14482d, (no.g) this.f14483e, (y0) this.f14484f, (w0) this.Y, (u0) this.Z, (n3.v) this.f14485x0, (u2.m) obj, u2.r.M(1));
                return sn.z.f31622a;
            default:
                ((Integer) obj2).getClass();
                m0.c((c3.j) this.f14480b, (c3.j) this.f14481c, (c3.j) this.f14482d, (c3.j) this.f14483e, (c3.j) this.f14484f, (c3.j) this.Y, (i3.t) this.Z, (wj.c) this.f14485x0, (u2.m) obj, u2.r.M(224695));
                return sn.z.f31622a;
        }
    }

    public /* synthetic */ x(Object obj, sn.d dVar, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10, int i11) {
        this.f14479a = i11;
        this.f14480b = obj;
        this.f14481c = dVar;
        this.f14482d = obj2;
        this.f14483e = obj3;
        this.f14484f = obj4;
        this.Y = obj5;
        this.Z = obj6;
        this.f14485x0 = obj7;
    }
}
