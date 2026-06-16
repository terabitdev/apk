package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import io.elevenlabs.domain.model.PlayerDisplayMode;
import io.elevenlabs.domain.model.ReadMeta;
import u2.s2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c1 implements ho.p {
    public final /* synthetic */ sn.d Y;
    public final /* synthetic */ Object Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15991a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15992b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15993c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15994d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15995e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f15996f;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ Object f15997x0;

    public /* synthetic */ c1(ReadMeta readMeta, PlayerDisplayMode playerDisplayMode, u2.x0 x0Var, boolean z6, ho.a aVar, ho.l lVar, s2 s2Var, u2.z0 z0Var) {
        this.f15993c = readMeta;
        this.f15994d = playerDisplayMode;
        this.f15995e = x0Var;
        this.f15992b = z6;
        this.f15996f = aVar;
        this.Y = lVar;
        this.Z = s2Var;
        this.f15997x0 = z0Var;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z PlayerScreenUI$lambda$44$0$12;
        switch (this.f15991a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                PlayerScreenUI$lambda$44$0$12 = PlayerScreenKt.PlayerScreenUI$lambda$44$0$12((ReadMeta) this.f15993c, (PlayerDisplayMode) this.f15994d, (u2.x0) this.f15995e, this.f15992b, (ho.a) this.f15996f, (ho.l) this.Y, (s2) this.Z, (u2.z0) this.f15997x0, (u2.m) obj, intValue);
                return PlayerScreenUI$lambda$44$0$12;
            default:
                ((Integer) obj2).getClass();
                int M = u2.r.M(49);
                q2.b2.b((q2.d2) this.f15993c, (i3.t) this.f15994d, (q2.y0) this.f15995e, (q2.u0) this.f15996f, (ho.p) this.Y, (ho.p) this.Z, this.f15992b, (n3.v) this.f15997x0, (u2.m) obj, M);
                return sn.z.f31622a;
        }
    }

    public /* synthetic */ c1(q2.d2 d2Var, i3.t tVar, q2.y0 y0Var, q2.u0 u0Var, ho.p pVar, ho.p pVar2, boolean z6, n3.v vVar, int i10) {
        this.f15993c = d2Var;
        this.f15994d = tVar;
        this.f15995e = y0Var;
        this.f15996f = u0Var;
        this.Y = pVar;
        this.Z = pVar2;
        this.f15992b = z6;
        this.f15997x0 = vVar;
    }
}
