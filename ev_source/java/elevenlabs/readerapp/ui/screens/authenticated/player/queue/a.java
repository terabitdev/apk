package io.elevenlabs.readerapp.ui.screens.authenticated.player.queue;

import a2.b2;
import a2.e1;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.room.m0;
import com.google.protobuf.c6;
import f4.f0;
import fr.g0;
import h4.e2;
import h5.m;
import ho.l;
import io.elevenlabs.domain.model.MediaItemState;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerMode;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.SelectFiltersEvent;
import io.elevenlabs.ui.extensions.AutofillExtensionsKt;
import io.elevenlabs.ui.extensions.ComposeExtensionsKt;
import j1.c2;
import j1.v1;
import ja.c1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l1.f2;
import l1.p;
import l1.s;
import l2.r;
import m2.a0;
import n1.b4;
import n1.i3;
import n1.p2;
import na.c0;
import na.j;
import na.j0;
import p3.d1;
import p3.i;
import p3.k;
import p3.l0;
import p3.n;
import p3.p0;
import p3.q0;
import p3.r0;
import p3.s0;
import p3.t;
import p3.v;
import p3.v0;
import p3.x;
import p3.y0;
import p4.b0;
import p4.y;
import q2.a8;
import q2.k6;
import q2.m3;
import q2.u2;
import q2.v2;
import q2.y3;
import q2.z7;
import r3.f;
import r3.h;
import sn.z;
import t2.u;
import u2.f1;
import u2.h0;
import u2.i0;
import ur.g1;
import y4.g;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16277a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16278b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f16277a = i10;
        this.f16278b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:217:0x0575, code lost:
    
        if (r19 != false) goto L226;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:220:0x058f  */
    /* JADX WARN: Type inference failed for: r5v23, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    @Override // ho.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        PlayerQueueViewModel PlayerQueueScreen_Kz89ssw$lambda$0$0;
        h0 PlayerQueueScreen_Kz89ssw$lambda$1$0;
        VoicePickerViewModel VoicePickerScreen$lambda$1$0;
        z VoicePickerScreen$lambda$11$0$0;
        z autofill$lambda$0$0$0;
        z backgroundStreched$lambda$0$0;
        boolean rememberPermissionsGranted$lambda$0$0;
        float ceil;
        boolean z6;
        final long j4;
        final long j10;
        final f iVar;
        int i10;
        n nVar;
        t tVar;
        l0 l0Var;
        l0 l0Var2;
        boolean z10;
        n nVar2;
        r3.b bVar;
        c1 c1Var;
        float f10;
        float f11;
        long L;
        boolean z11;
        boolean z12;
        boolean z13;
        b2 b2Var;
        Bundle bundle;
        Bundle[] bundleArr;
        Throwable th;
        Object obj2;
        Boolean bool;
        float f12;
        List list;
        SerialDescriptor descriptor;
        switch (this.f16277a) {
            case 0:
                PlayerQueueScreen_Kz89ssw$lambda$0$0 = PlayerQueueScreenKt.PlayerQueueScreen_Kz89ssw$lambda$0$0((MediaItemState) this.f16278b, (PlayerQueueViewModel.Factory) obj);
                return PlayerQueueScreen_Kz89ssw$lambda$0$0;
            case 1:
                PlayerQueueScreen_Kz89ssw$lambda$1$0 = PlayerQueueScreenKt.PlayerQueueScreen_Kz89ssw$lambda$1$0((PlayerQueueViewModel) this.f16278b, (i0) obj);
                return PlayerQueueScreen_Kz89ssw$lambda$1$0;
            case 2:
                VoicePickerScreen$lambda$1$0 = VoicePickerScreenKt.VoicePickerScreen$lambda$1$0((VoicePickerMode) this.f16278b, (VoicePickerViewModel.Factory) obj);
                return VoicePickerScreen$lambda$1$0;
            case 3:
                VoicePickerScreen$lambda$11$0$0 = VoicePickerScreenKt.VoicePickerScreen$lambda$11$0$0((VoicePickerViewModel) this.f16278b, (SelectFiltersEvent) obj);
                return VoicePickerScreen$lambda$11$0$0;
            case 4:
                autofill$lambda$0$0$0 = AutofillExtensionsKt.autofill$lambda$0$0$0((j3.l) this.f16278b, (f0) obj);
                return autofill$lambda$0$0$0;
            case 5:
                backgroundStreched$lambda$0$0 = ComposeExtensionsKt.backgroundStreched$lambda$0$0((u3.c) this.f16278b, (r3.e) obj);
                return backgroundStreched$lambda$0$0;
            case 6:
                rememberPermissionsGranted$lambda$0$0 = ComposeExtensionsKt.rememberPermissionsGranted$lambda$0$0((String[]) this.f16278b, (Context) obj);
                return Boolean.valueOf(rememberPermissionsGranted$lambda$0$0);
            case 7:
                return Long.valueOf(g0.N(((xq.b) ((io.elevenlabs.highlighter.z) this.f16278b).invoke(obj)).f38128a));
            case 8:
                ((j2.t) this.f16278b).a((g) obj);
                return z.f31622a;
            case 9:
                l1.t tVar2 = (l1.t) this.f16278b;
                m3.d dVar = (m3.d) obj;
                if (dVar.getDensity() * tVar2.f21059d >= u.P && o3.e.c(dVar.f22842a.b()) > u.P) {
                    if (h5.f.b(tVar2.f21059d, u.P)) {
                        ceil = 1.0f;
                    } else {
                        ceil = (float) Math.ceil(dVar.getDensity() * tVar2.f21059d);
                    }
                    float f13 = 2;
                    final float min = Math.min(ceil, (float) Math.ceil(o3.e.c(dVar.f22842a.b()) / f13));
                    final float f14 = min / f13;
                    final long floatToRawIntBits = (Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(f14) & 4294967295L);
                    float intBitsToFloat = Float.intBitsToFloat((int) (dVar.f22842a.b() >> 32)) - min;
                    final long floatToRawIntBits2 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.f22842a.b() & 4294967295L)) - min) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
                    float f15 = min * f13;
                    if (f15 > o3.e.c(dVar.f22842a.b())) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    s0 mo1createOutlinePq9zytI = tVar2.f21061f.mo1createOutlinePq9zytI(dVar.f22842a.b(), dVar.f22842a.getLayoutDirection(), dVar);
                    if (mo1createOutlinePq9zytI instanceof p0) {
                        t tVar3 = tVar2.f21060e;
                        p0 p0Var = (p0) mo1createOutlinePq9zytI;
                        v0 v0Var = p0Var.f26415a;
                        if (z6) {
                            return dVar.a(new v1(p0Var, tVar3, 5));
                        }
                        if (tVar3 instanceof d1) {
                            nVar = new n(x.b(1.0f, ((d1) tVar3).f26365a), 5);
                            i10 = 1;
                        } else {
                            i10 = 0;
                            nVar = null;
                        }
                        o3.c e10 = ((i) v0Var).e();
                        float f16 = e10.f24767b;
                        float f17 = e10.f24766a;
                        if (tVar2.f21058c == null) {
                            tVar2.f21058c = new p();
                        }
                        p pVar = tVar2.f21058c;
                        pVar.getClass();
                        i iVar2 = pVar.f21019d;
                        i iVar3 = iVar2;
                        if (iVar2 == null) {
                            i a10 = k.a();
                            pVar.f21019d = a10;
                            iVar3 = a10;
                        }
                        iVar3.h();
                        v0.b(iVar3, e10);
                        iVar3.g(iVar3, v0Var, 0);
                        ?? obj3 = new Object();
                        long ceil2 = (((int) Math.ceil(e10.f24769d - f16)) & 4294967295L) | (((int) Math.ceil(e10.f24768c - f17)) << 32);
                        p pVar2 = tVar2.f21058c;
                        pVar2.getClass();
                        p3.f fVar = pVar2.f21016a;
                        p3.b bVar2 = pVar2.f21017b;
                        if (fVar != null) {
                            tVar = tVar3;
                            l0Var = new l0(fVar.a());
                        } else {
                            tVar = tVar3;
                            l0Var = null;
                        }
                        try {
                            try {
                                if (l0Var == null || l0Var.f26406a != 0) {
                                    if (fVar != null) {
                                        l0Var2 = new l0(fVar.a());
                                    } else {
                                        l0Var2 = null;
                                    }
                                    if (l0Var2 == null || i10 != l0Var2.f26406a) {
                                        z10 = false;
                                        if (fVar == null && bVar2 != null) {
                                            nVar2 = nVar;
                                            float intBitsToFloat2 = Float.intBitsToFloat((int) (dVar.f22842a.b() >> 32));
                                            Bitmap bitmap = fVar.f26376a;
                                            if (intBitsToFloat2 <= bitmap.getWidth()) {
                                                if (Float.intBitsToFloat((int) (dVar.f22842a.b() & 4294967295L)) <= bitmap.getHeight()) {
                                                }
                                            }
                                        } else {
                                            nVar2 = nVar;
                                        }
                                        fVar = p3.h0.g((int) (ceil2 >> 32), (int) (ceil2 & 4294967295L), i10);
                                        pVar2.f21016a = fVar;
                                        bVar2 = p3.h0.a(fVar);
                                        pVar2.f21017b = bVar2;
                                        bVar = pVar2.f21018c;
                                        if (bVar == null) {
                                            bVar = new r3.b();
                                            pVar2.f21018c = bVar;
                                        }
                                        c1Var = bVar.f29421b;
                                        r3.a aVar = bVar.f29420a;
                                        long Z = a.a.Z(ceil2);
                                        m layoutDirection = dVar.f22842a.getLayoutDirection();
                                        r3.b bVar3 = bVar;
                                        h5.c cVar = aVar.f29416a;
                                        n nVar3 = nVar2;
                                        m mVar = aVar.f29417b;
                                        i iVar4 = iVar3;
                                        v vVar = aVar.f29418c;
                                        long j11 = aVar.f29419d;
                                        aVar.f29416a = dVar;
                                        aVar.f29417b = layoutDirection;
                                        aVar.f29418c = bVar2;
                                        aVar.f29419d = Z;
                                        bVar2.o();
                                        r3.e.q0(bVar3, x.f26427b, 0L, Z, u.P, null, 0, 58);
                                        f10 = -f17;
                                        f11 = -f16;
                                        ((j8.g) c1Var.f18786b).X(f10, f11);
                                        r3.e.F(bVar3, p0Var.f26415a, tVar, u.P, new r3.i(f15, u.P, 0, 0, 30), 52);
                                        float f18 = 1;
                                        float intBitsToFloat3 = (Float.intBitsToFloat((int) (bVar3.b() >> 32)) + f18) / Float.intBitsToFloat((int) (bVar3.b() >> 32));
                                        float intBitsToFloat4 = Float.intBitsToFloat((int) (bVar3.b() & 4294967295L)) + f18;
                                        p3.b bVar4 = bVar2;
                                        float intBitsToFloat5 = intBitsToFloat4 / Float.intBitsToFloat((int) (bVar3.b() & 4294967295L));
                                        long j02 = bVar3.j0();
                                        p3.f fVar2 = fVar;
                                        L = c1Var.L();
                                        c1Var.y().o();
                                        ((j8.g) c1Var.f18786b).W(intBitsToFloat3, j02, intBitsToFloat5);
                                        r3.e.F(bVar3, iVar4, tVar, u.P, null, 28);
                                        ((j8.g) c1Var.f18786b).X(-f10, -f11);
                                        bVar4.f();
                                        aVar.f29416a = cVar;
                                        aVar.f29417b = mVar;
                                        aVar.f29418c = vVar;
                                        aVar.f29419d = j11;
                                        fVar2.f26376a.prepareToDraw();
                                        obj3.f20559a = fVar2;
                                        return dVar.a(new s(e10, obj3, ceil2, nVar3));
                                    }
                                }
                                ((j8.g) c1Var.f18786b).W(intBitsToFloat3, j02, intBitsToFloat5);
                                r3.e.F(bVar3, iVar4, tVar, u.P, null, 28);
                                ((j8.g) c1Var.f18786b).X(-f10, -f11);
                                bVar4.f();
                                aVar.f29416a = cVar;
                                aVar.f29417b = mVar;
                                aVar.f29418c = vVar;
                                aVar.f29419d = j11;
                                fVar2.f26376a.prepareToDraw();
                                obj3.f20559a = fVar2;
                                return dVar.a(new s(e10, obj3, ceil2, nVar3));
                            } finally {
                                c1Var.y().f();
                                c1Var.g0(L);
                            }
                            r3.e.F(bVar3, p0Var.f26415a, tVar, u.P, new r3.i(f15, u.P, 0, 0, 30), 52);
                            float f182 = 1;
                            float intBitsToFloat32 = (Float.intBitsToFloat((int) (bVar3.b() >> 32)) + f182) / Float.intBitsToFloat((int) (bVar3.b() >> 32));
                            float intBitsToFloat42 = Float.intBitsToFloat((int) (bVar3.b() & 4294967295L)) + f182;
                            p3.b bVar42 = bVar2;
                            float intBitsToFloat52 = intBitsToFloat42 / Float.intBitsToFloat((int) (bVar3.b() & 4294967295L));
                            long j022 = bVar3.j0();
                            p3.f fVar22 = fVar;
                            L = c1Var.L();
                            c1Var.y().o();
                        } catch (Throwable th2) {
                            ((j8.g) c1Var.f18786b).X(-f10, -f11);
                            throw th2;
                        }
                        z10 = true;
                        if (fVar == null) {
                        }
                        nVar2 = nVar;
                        fVar = p3.h0.g((int) (ceil2 >> 32), (int) (ceil2 & 4294967295L), i10);
                        pVar2.f21016a = fVar;
                        bVar2 = p3.h0.a(fVar);
                        pVar2.f21017b = bVar2;
                        bVar = pVar2.f21018c;
                        if (bVar == null) {
                        }
                        c1Var = bVar.f29421b;
                        r3.a aVar2 = bVar.f29420a;
                        long Z2 = a.a.Z(ceil2);
                        m layoutDirection2 = dVar.f22842a.getLayoutDirection();
                        r3.b bVar32 = bVar;
                        h5.c cVar2 = aVar2.f29416a;
                        n nVar32 = nVar2;
                        m mVar2 = aVar2.f29417b;
                        i iVar42 = iVar3;
                        v vVar2 = aVar2.f29418c;
                        long j112 = aVar2.f29419d;
                        aVar2.f29416a = dVar;
                        aVar2.f29417b = layoutDirection2;
                        aVar2.f29418c = bVar2;
                        aVar2.f29419d = Z2;
                        bVar2.o();
                        r3.e.q0(bVar32, x.f26427b, 0L, Z2, u.P, null, 0, 58);
                        f10 = -f17;
                        f11 = -f16;
                        ((j8.g) c1Var.f18786b).X(f10, f11);
                    } else {
                        if (mo1createOutlinePq9zytI instanceof r0) {
                            final t tVar4 = tVar2.f21060e;
                            o3.d dVar2 = ((r0) mo1createOutlinePq9zytI).f26421a;
                            if (n0.l.E(dVar2)) {
                                final long j12 = dVar2.f24774e;
                                final r3.i iVar5 = new r3.i(min, u.P, 0, 0, 30);
                                final boolean z14 = z6;
                                return dVar.a(new l() { // from class: l1.r
                                    @Override // ho.l
                                    public final Object invoke(Object obj4) {
                                        ja.c1 c1Var2;
                                        long j13;
                                        h4.k0 k0Var = (h4.k0) ((r3.c) obj4);
                                        k0Var.a();
                                        r3.b bVar5 = k0Var.f11967a;
                                        boolean z15 = z14;
                                        p3.t tVar5 = tVar4;
                                        long j14 = j12;
                                        if (z15) {
                                            r3.e.p0(k0Var, tVar5, 0L, 0L, j14, null, 246);
                                        } else {
                                            float intBitsToFloat6 = Float.intBitsToFloat((int) (j14 >> 32));
                                            float f19 = f14;
                                            if (intBitsToFloat6 < f19) {
                                                float intBitsToFloat7 = Float.intBitsToFloat((int) (bVar5.b() >> 32));
                                                float f20 = min;
                                                float f21 = intBitsToFloat7 - f20;
                                                float intBitsToFloat8 = Float.intBitsToFloat((int) (bVar5.b() & 4294967295L)) - f20;
                                                ja.c1 c1Var3 = bVar5.f29421b;
                                                long L2 = c1Var3.L();
                                                c1Var3.y().o();
                                                try {
                                                    ((j8.g) c1Var3.f18786b).O(f20, f20, f21, intBitsToFloat8, 0);
                                                    j13 = L2;
                                                    c1Var2 = c1Var3;
                                                    try {
                                                        r3.e.p0(k0Var, tVar5, 0L, 0L, j14, null, 246);
                                                        com.google.android.gms.internal.play_billing.b.v(c1Var2, j13);
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        com.google.android.gms.internal.play_billing.b.v(c1Var2, j13);
                                                        throw th;
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    c1Var2 = c1Var3;
                                                    j13 = L2;
                                                }
                                            } else {
                                                r3.e.p0(k0Var, tVar5, floatToRawIntBits, floatToRawIntBits2, n.A(f19, j14), iVar5, 208);
                                            }
                                        }
                                        return sn.z.f31622a;
                                    }
                                });
                            }
                            boolean z15 = z6;
                            if (tVar2.f21058c == null) {
                                tVar2.f21058c = new p();
                            }
                            p pVar3 = tVar2.f21058c;
                            pVar3.getClass();
                            i iVar6 = pVar3.f21019d;
                            i iVar7 = iVar6;
                            if (iVar6 == null) {
                                i a11 = k.a();
                                pVar3.f21019d = a11;
                                iVar7 = a11;
                            }
                            iVar7.h();
                            v0.c(iVar7, dVar2);
                            if (!z15) {
                                v0 a12 = k.a();
                                v0.c(a12, new o3.d(min, min, dVar2.b() - min, dVar2.a() - min, l1.n.A(min, dVar2.f24774e), l1.n.A(min, dVar2.f24775f), l1.n.A(min, dVar2.f24776g), l1.n.A(min, dVar2.f24777h)));
                                iVar7.g(iVar7, a12, 0);
                            }
                            return dVar.a(new v1(iVar7, tVar4, 4));
                        }
                        boolean z16 = z6;
                        if (mo1createOutlinePq9zytI instanceof q0) {
                            final t tVar5 = tVar2.f21060e;
                            if (z16) {
                                j4 = 0;
                            } else {
                                j4 = floatToRawIntBits;
                            }
                            if (z16) {
                                j10 = dVar.f22842a.b();
                            } else {
                                j10 = floatToRawIntBits2;
                            }
                            if (z16) {
                                iVar = h.f29426a;
                            } else {
                                iVar = new r3.i(min, u.P, 0, 0, 30);
                            }
                            return dVar.a(new l() { // from class: l1.q
                                @Override // ho.l
                                public final Object invoke(Object obj4) {
                                    h4.k0 k0Var = (h4.k0) ((r3.c) obj4);
                                    k0Var.a();
                                    r3.e.m(k0Var, p3.t.this, j4, j10, t2.u.P, iVar, null, 0, 104);
                                    return sn.z.f31622a;
                                }
                            });
                        }
                        c6.p();
                        return null;
                    }
                } else {
                    return dVar.a(new c2(23));
                }
                break;
            case 10:
                kotlin.jvm.internal.z zVar = (kotlin.jvm.internal.z) this.f16278b;
                e2 e2Var = (e2) obj;
                if (!zVar.f20568a) {
                    e2Var.getClass();
                    if (!((p2) e2Var).f23898a) {
                        z11 = false;
                        zVar.f20568a = z11;
                        return Boolean.valueOf(!z11);
                    }
                }
                z11 = true;
                zVar.f20568a = z11;
                return Boolean.valueOf(!z11);
            case 11:
                f2 f2Var = (f2) this.f16278b;
                float floatValue = ((Float) obj).floatValue();
                f1 f1Var = f2Var.f20901a;
                float h10 = f1Var.h() + floatValue + f2Var.f20906f;
                float l4 = ae.l.l(h10, u.P, f2Var.f20905e.h());
                if (h10 == l4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                float h11 = l4 - f1Var.h();
                int round = Math.round(h11);
                f1Var.i(f1Var.h() + round);
                f2Var.f20906f = h11 - round;
                if (!z12) {
                    floatValue = h11;
                }
                return Float.valueOf(floatValue);
            case 12:
                c4.h hVar = (c4.h) this.f16278b;
                c4.v vVar3 = (c4.v) obj;
                long j13 = vVar3.f4757c;
                l2.r0 r0Var = (l2.r0) hVar.f4688d;
                if (r0Var.k() && r0Var.n().f38321a.f31041b.length() != 0 && (b2Var = r0Var.f21232d) != null && b2Var.d() != null) {
                    hVar.r(r0Var.n(), j13, false, r.f21224d);
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    vVar3.a();
                }
                return z.f31622a;
            case 13:
                a0 a0Var = (a0) this.f16278b;
                ((Float) obj).getClass();
                return Float.valueOf(a0Var.a().d0(m2.z.f22823a));
            case 14:
                n0.m mVar3 = (n0.m) this.f16278b;
                mVar3.f23612n.getClass();
                mVar3.j(obj);
                return z.f31622a;
            case 15:
                c4.v vVar4 = (c4.v) obj;
                ((io.elevenlabs.ui.components.c2) this.f16278b).invoke(vVar4, new o3.b(c4.u.h(vVar4, false)));
                vVar4.a();
                return z.f31622a;
            case 16:
                i3 i3Var = (i3) this.f16278b;
                return new o3.b(i3Var.c(i3Var.f23801k, ((o3.b) obj).f24764a, i3Var.f23800j));
            case 17:
                ((b4) this.f16278b).f23653d.getClass();
                return Boolean.TRUE;
            case 18:
                j0 j0Var = (j0) this.f16278b;
                j jVar = (j) obj;
                jVar.getClass();
                qa.c cVar3 = jVar.Z;
                na.x xVar = jVar.f24329b;
                if (xVar == null) {
                    xVar = null;
                }
                if (xVar != null) {
                    cVar3.a();
                    na.x c5 = j0Var.c(xVar);
                    if (c5 != null) {
                        if (!c5.equals(xVar)) {
                            return j0Var.b().b(c5, c5.b(cVar3.a()));
                        }
                        return jVar;
                    }
                }
                return null;
            case 19:
                Bundle bundle2 = (Bundle) obj;
                c0 t10 = m0.t((Context) this.f16278b);
                if (bundle2 != null) {
                    bundle2.setClassLoader(t10.f24351a.getClassLoader());
                }
                qa.e eVar = t10.f24352b;
                LinkedHashMap linkedHashMap = eVar.f28171m;
                Throwable th3 = null;
                boolean z17 = false;
                if (bundle2 == null) {
                    th = null;
                } else {
                    if (bundle2.containsKey("android-support-nav:controller:navigatorState")) {
                        bundle = bundle2.getBundle("android-support-nav:controller:navigatorState");
                        if (bundle == null) {
                            oo.f0.s0("android-support-nav:controller:navigatorState");
                            throw null;
                        }
                    } else {
                        bundle = null;
                    }
                    eVar.f28162d = bundle;
                    if (bundle2.containsKey("android-support-nav:controller:backStack")) {
                        bundleArr = (Bundle[]) o0.e.V(bundle2, "android-support-nav:controller:backStack").toArray(new Bundle[0]);
                    } else {
                        bundleArr = null;
                    }
                    eVar.f28163e = bundleArr;
                    linkedHashMap.clear();
                    if (bundle2.containsKey("android-support-nav:controller:backStackDestIds") && bundle2.containsKey("android-support-nav:controller:backStackIds")) {
                        int[] intArray = bundle2.getIntArray("android-support-nav:controller:backStackDestIds");
                        if (intArray != null) {
                            ArrayList<String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:backStackIds");
                            if (stringArrayList != null) {
                                int length = intArray.length;
                                int i11 = 0;
                                int i12 = 0;
                                while (i11 < length) {
                                    int i13 = i12 + 1;
                                    Integer valueOf = Integer.valueOf(intArray[i11]);
                                    LinkedHashMap linkedHashMap2 = eVar.f28170l;
                                    Throwable th4 = th3;
                                    if (!kotlin.jvm.internal.m.c(stringArrayList.get(i12), "")) {
                                        obj2 = (String) stringArrayList.get(i12);
                                    } else {
                                        obj2 = th4;
                                    }
                                    linkedHashMap2.put(valueOf, obj2);
                                    i11++;
                                    th3 = th4;
                                    i12 = i13;
                                }
                            } else {
                                oo.f0.s0("android-support-nav:controller:backStackIds");
                                throw null;
                            }
                        } else {
                            oo.f0.s0("android-support-nav:controller:backStackDestIds");
                            throw null;
                        }
                    }
                    th = th3;
                    if (bundle2.containsKey("android-support-nav:controller:backStackStates")) {
                        ArrayList<String> stringArrayList2 = bundle2.getStringArrayList("android-support-nav:controller:backStackStates");
                        if (stringArrayList2 != null) {
                            for (String str : stringArrayList2) {
                                if (bundle2.containsKey("android-support-nav:controller:backStackStates:" + str)) {
                                    ArrayList V = o0.e.V(bundle2, "android-support-nav:controller:backStackStates:" + str);
                                    tn.l lVar = new tn.l(V.size());
                                    Iterator it = V.iterator();
                                    while (it.hasNext()) {
                                        lVar.addLast(new na.k((Bundle) it.next()));
                                    }
                                    linkedHashMap.put(str, lVar);
                                }
                            }
                        } else {
                            oo.f0.s0("android-support-nav:controller:backStackStates");
                            throw th;
                        }
                    }
                }
                if (bundle2 != null) {
                    boolean z18 = bundle2.getBoolean("android-support-nav:controller:deepLinkHandled", false);
                    if (!z18 && bundle2.getBoolean("android-support-nav:controller:deepLinkHandled", true)) {
                        bool = th;
                    } else {
                        bool = Boolean.valueOf(z18);
                    }
                    if (bool != 0) {
                        z17 = bool.booleanValue();
                    }
                    t10.f24355e = z17;
                }
                return t10;
            case 20:
                ((or.c) this.f16278b).n(null);
                return z.f31622a;
            case 21:
                y.d((String) ((sn.k) this.f16278b).f31600a, (b0) obj);
                return z.f31622a;
            case 22:
                a8 a8Var = (a8) this.f16278b;
                float floatValue2 = ((Float) obj).floatValue();
                z7 z7Var = ((u2) a8Var.f26856o).f27744a;
                z7Var.b(z7Var.f27985c.h() + floatValue2);
                return z.f31622a;
            case 23:
                p3.i0 i0Var = (p3.i0) obj;
                float floatValue3 = ((Number) ((j1.d) this.f16278b).d()).floatValue();
                float d10 = y3.d(floatValue3, i0Var);
                float e11 = y3.e(floatValue3, i0Var);
                if (e11 == u.P) {
                    f12 = 1.0f;
                } else {
                    f12 = d10 / e11;
                }
                y0 y0Var = (y0) i0Var;
                y0Var.s(f12);
                y0Var.z(y3.f27930c);
                return z.f31622a;
            case 24:
                m3 m3Var = (m3) this.f16278b;
                m3Var.show();
                return new e1(m3Var, 7);
            case 25:
                return Boolean.valueOf(kotlin.jvm.internal.m.c(((v2) obj).f27794a, (k6) this.f16278b));
            case 26:
                s4.v0 v0Var2 = (s4.v0) this.f16278b;
                s4.f fVar3 = (s4.f) obj;
                s4.c cVar4 = (s4.c) fVar3.f31030a;
                if (cVar4 instanceof s4.v) {
                    s4.v vVar5 = (s4.v) cVar4;
                    if (vVar5.f31151b == null) {
                        return s4.f.a(fVar3, new s4.v(vVar5.f31150a, v0Var2), 0, 14);
                    }
                }
                if (cVar4 instanceof s4.u) {
                    s4.u uVar = (s4.u) cVar4;
                    if (uVar.f31143b == null) {
                        return s4.f.a(fVar3, new s4.u(uVar.f31142a, v0Var2), 0, 14);
                    }
                    return fVar3;
                }
                return fVar3;
            case 27:
                qr.a aVar3 = (qr.a) this.f16278b;
                sr.a aVar4 = (sr.a) obj;
                aVar4.getClass();
                KSerializer kSerializer = aVar3.f28969b;
                if (kSerializer != null && (descriptor = kSerializer.getDescriptor()) != null) {
                    list = descriptor.getAnnotations();
                } else {
                    list = null;
                }
                if (list == null) {
                    list = tn.t.f33547a;
                }
                aVar4.f31697b = list;
                return z.f31622a;
            case 28:
                qr.d dVar3 = (qr.d) this.f16278b;
                sr.a aVar5 = (sr.a) obj;
                aVar5.getClass();
                aVar5.a("type", g1.f34589b);
                aVar5.a("value", o0.e.o("kotlinx.serialization.Polymorphic<" + dVar3.f28975a.n() + '>', sr.g.f31729b, new SerialDescriptor[0]));
                List list2 = dVar3.f28976b;
                list2.getClass();
                aVar5.f31697b = list2;
                return z.f31622a;
            default:
                w2.b bVar5 = (w2.b) this.f16278b;
                Object[] objArr = bVar5.f36079a;
                int i14 = bVar5.f36081c;
                for (int i15 = 0; i15 < i14; i15++) {
                    ((f4.g1) objArr[i15]).b();
                }
                return z.f31622a;
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, int i10) {
        this.f16277a = i10;
        this.f16278b = obj;
    }
}
