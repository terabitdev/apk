package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesViewModel;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o1 implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16253a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f16254b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16255c;

    public /* synthetic */ o1(float f10, Object obj, int i10) {
        this.f16253a = i10;
        this.f16254b = f10;
        this.f16255c = obj;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        PlayerState onSpeedChanged$lambda$0;
        SoundscapesContract.State mixerLevel$lambda$0;
        boolean z6;
        switch (this.f16253a) {
            case 0:
                onSpeedChanged$lambda$0 = PlayerViewModel.onSpeedChanged$lambda$0((PlayerViewModel) this.f16255c, this.f16254b, (PlayerState) obj);
                return onSpeedChanged$lambda$0;
            case 1:
                mixerLevel$lambda$0 = SoundscapesViewModel.setMixerLevel$lambda$0((SoundscapesViewModel) this.f16255c, this.f16254b, (SoundscapesContract.State) obj);
                return mixerLevel$lambda$0;
            case 2:
                j1.u1 u1Var = (j1.u1) this.f16255c;
                long longValue = ((Long) obj).longValue();
                boolean g10 = u1Var.g();
                u2.g1 g1Var = u1Var.f18417g;
                if (!g10) {
                    if (g1Var.h() == Long.MIN_VALUE) {
                        g1Var.i(longValue);
                        ((u2.i1) u1Var.f18411a.f9212a).setValue(Boolean.TRUE);
                    }
                    long h10 = longValue - g1Var.h();
                    float f10 = this.f16254b;
                    if (f10 != t2.u.P) {
                        h10 = jo.a.z(h10 / f10);
                    }
                    u1Var.n(h10);
                    if (f10 == t2.u.P) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    u1Var.h(h10, z6);
                }
                return sn.z.f31622a;
            case 3:
                no.c cVar = (no.c) this.f16255c;
                p4.y.h((p4.b0) obj, new p4.j(((Number) ae.l.q(Float.valueOf(this.f16254b), cVar)).floatValue(), cVar));
                return sn.z.f31622a;
            default:
                l1.v vVar = (l1.v) this.f16255c;
                h4.k0 k0Var = (h4.k0) ((r3.c) obj);
                k0Var.a();
                r3.b bVar = k0Var.f11967a;
                float f11 = this.f16254b;
                if (!h5.f.b(f11, t2.u.P)) {
                    float density = bVar.getDensity() * f11;
                    float intBitsToFloat = Float.intBitsToFloat((int) (bVar.b() & 4294967295L)) - (density / 2);
                    r3.e.y(k0Var, vVar.f21072b, (Float.floatToRawIntBits(t2.u.P) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (bVar.b() >> 32))) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat)), density, t2.u.P, 496);
                }
                return sn.z.f31622a;
        }
    }

    public /* synthetic */ o1(Object obj, float f10, int i10) {
        this.f16253a = i10;
        this.f16255c = obj;
        this.f16254b = f10;
    }
}
