package io.elevenlabs.ui.components;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.domain.model.EffectivePlaybackModeKt;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.elevenlabs.ui.theme.ReaderColors;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a=\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u008a\u0084\u0002"}, d2 = {"", "id", "image", "Li3/t;", "modifier", "", "isVerified", "isPreviewPlaying", "Lsn/z;", "VoiceAvatar", "(Ljava/lang/String;Ljava/lang/String;Li3/t;ZZLu2/m;II)V", "Preview_VoiceAvatar", "(Lu2/m;I)V", "", "playOverlayOpacity", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoiceAvatarKt {
    public static final void Preview_VoiceAvatar(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-2108670246);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t E = r1.d.E(qVar2, 10);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(E, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, a10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            float f10 = 50;
            VoiceAvatar("dfgdfg", null, r1.p2.o(qVar2, f10), false, false, qVar, 438, 24);
            float f11 = 2;
            r1.d.g(r1.p2.f(qVar2, f11), qVar);
            VoiceAvatar("dfgdsf", "", r1.p2.o(qVar2, f10), false, false, qVar, 438, 24);
            r1.d.g(r1.p2.f(qVar2, f11), qVar);
            VoiceAvatar("sdfsdf", null, r1.p2.o(qVar2, f10), true, false, qVar, 3510, 16);
            r1.d.g(r1.p2.f(qVar2, f11), qVar);
            VoiceAvatar("sdfsdf", null, r1.p2.o(qVar2, f10), false, true, qVar, 25014, 8);
            r1.d.g(r1.p2.f(qVar2, f11), qVar);
            VoiceAvatar("sdfsdf", null, r1.p2.o(qVar2, f10), true, true, qVar, 28086, 0);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u1(i10, 21);
        }
    }

    public static final sn.z Preview_VoiceAvatar$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_VoiceAvatar(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VoiceAvatar(String str, String str2, i3.t tVar, boolean z6, boolean z10, u2.m mVar, int i10, int i11) {
        int i12;
        boolean z11;
        int i13;
        int i14;
        boolean z12;
        int i15;
        boolean z13;
        boolean z14;
        u2.q qVar;
        boolean z15;
        u2.r1 r10;
        boolean z16;
        boolean z17;
        float f10;
        h4.e eVar;
        h4.e eVar2;
        int i16;
        h4.e eVar3;
        boolean z18;
        i3.q qVar2;
        h4.d dVar;
        h4.f fVar;
        h4.e eVar4;
        u2.q qVar3;
        h4.e eVar5;
        h4.e eVar6;
        i3.q qVar4;
        u2.q qVar5;
        h4.e eVar7;
        h4.f fVar2;
        boolean z19;
        int i17;
        h4.d dVar2;
        h4.e eVar8;
        int i18;
        int i19;
        int i20;
        str.getClass();
        tVar.getClass();
        u2.q qVar6 = (u2.q) mVar;
        qVar6.Z(-1523177982);
        if ((i10 & 6) == 0) {
            if (qVar6.f(str)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i12 = i20 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar6.f(str2)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i12 |= i19;
        }
        if ((i10 & 384) == 0) {
            if (qVar6.f(tVar)) {
                i18 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i18 = 128;
            }
            i12 |= i18;
        }
        int i21 = i11 & 8;
        if (i21 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            z11 = z6;
            if (qVar6.g(z11)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i13;
            i14 = i11 & 16;
            if (i14 == 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                z12 = z10;
                if (qVar6.g(z12)) {
                    i15 = 16384;
                } else {
                    i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i12 |= i15;
                if ((i12 & 9363) != 9362) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (qVar6.O(i12 & 1, z13)) {
                    if (i21 != 0) {
                        z16 = false;
                    } else {
                        z16 = z11;
                    }
                    if (i14 != 0) {
                        z17 = false;
                    } else {
                        z17 = z12;
                    }
                    if (z17) {
                        f10 = 1.0f;
                    } else {
                        f10 = t2.u.P;
                    }
                    u2.s2 b10 = j1.f.b(f10, null, null, qVar6, 0, 30);
                    f4.f1 d10 = r1.p.d(i3.d.f12999c, false);
                    int hashCode = Long.hashCode(qVar6.T);
                    c3.o l4 = qVar6.l();
                    i3.t c5 = i3.a.c(tVar, qVar6);
                    h4.h.f11920i.getClass();
                    h4.f fVar3 = h4.g.f11903b;
                    qVar6.b0();
                    if (qVar6.S) {
                        qVar6.k(fVar3);
                    } else {
                        qVar6.k0();
                    }
                    h4.e eVar9 = h4.g.f11907f;
                    u2.r.J(eVar9, d10, qVar6);
                    h4.e eVar10 = h4.g.f11906e;
                    u2.r.J(eVar10, l4, qVar6);
                    Integer valueOf = Integer.valueOf(hashCode);
                    h4.e eVar11 = h4.g.f11908g;
                    u2.r.y(qVar6, valueOf, eVar11);
                    h4.d dVar3 = h4.g.f11909h;
                    u2.r.F(dVar3, qVar6);
                    h4.e eVar12 = h4.g.f11905d;
                    u2.r.J(eVar12, c5, qVar6);
                    i3.q qVar7 = i3.q.f13017a;
                    int i22 = i12;
                    if (str2 == null) {
                        qVar6.X(-194918291);
                        if (str.equals(EffectivePlaybackModeKt.ORIGINAL_AUDIO)) {
                            qVar6.X(-194885803);
                            l1.n.c(kd.a.M(R.drawable.original_audio_avatar, qVar6, 0), null, r1.p2.d(qVar7, 1.0f), null, null, t2.u.P, null, qVar6, u3.c.$stable | 432, 120);
                            qVar6.p(false);
                            eVar5 = eVar9;
                            dVar2 = dVar3;
                            eVar7 = eVar10;
                            z19 = false;
                            eVar6 = eVar12;
                            qVar4 = qVar7;
                            fVar2 = fVar3;
                            qVar5 = qVar6;
                            i17 = 6;
                            eVar8 = eVar11;
                        } else {
                            qVar6.X(-194635540);
                            eVar5 = eVar9;
                            eVar6 = eVar12;
                            qVar4 = qVar7;
                            qVar5 = qVar6;
                            eVar7 = eVar10;
                            fVar2 = fVar3;
                            z19 = false;
                            i17 = 6;
                            dVar2 = dVar3;
                            eVar8 = eVar11;
                            VoiceCircleKt.VoiceCircle(false, str, r1.p2.d(qVar7, 1.0f), false, z17, qVar5, ((i22 << 3) & 112) | 390 | (i22 & 57344), 8);
                            qVar5.p(false);
                        }
                        qVar5.p(z19);
                        eVar4 = eVar7;
                        fVar = fVar2;
                        eVar3 = eVar8;
                        i16 = i17;
                        dVar = dVar2;
                        z18 = z19;
                        qVar2 = qVar4;
                        eVar = eVar5;
                        qVar3 = qVar5;
                        eVar2 = eVar6;
                    } else {
                        qVar6.X(-194381185);
                        ad.h hVar = new ad.h((Context) qVar6.j(AndroidCompositionLocals_androidKt.f2291b));
                        hVar.f1788c = str2;
                        hVar.b();
                        eVar = eVar9;
                        eVar2 = eVar12;
                        i16 = 6;
                        eVar3 = eVar11;
                        z18 = false;
                        qVar2 = qVar7;
                        dVar = dVar3;
                        fVar = fVar3;
                        eVar4 = eVar10;
                        qc.m.b(hVar.a(), null, r1.p2.d(m3.h.c(qVar7, ElevenLabsTheme.INSTANCE.getShapes(qVar6, 6).getFull()), 1.0f), null, f4.q.f8839b, null, qVar6, 1572912, 4024);
                        qVar3 = qVar6;
                        qVar3.p(false);
                    }
                    i3.t c10 = m3.h.c(m3.h.a(r1.p2.d(qVar2, 1.0f), VoiceAvatar$lambda$0(b10)), ElevenLabsTheme.INSTANCE.getShapes(qVar3, i16).getFull());
                    ReaderColors readerColors = ReaderColors.INSTANCE;
                    i3.t h10 = l1.n.h(c10, p3.x.b(0.6f, readerColors.m2366getBlack0d7_KjU()), p3.h0.f26395b);
                    f4.f1 d11 = r1.p.d(i3.d.f13001e, z18);
                    int hashCode2 = Long.hashCode(qVar3.T);
                    c3.o l7 = qVar3.l();
                    i3.t c11 = i3.a.c(h10, qVar3);
                    qVar3.b0();
                    if (qVar3.S) {
                        qVar3.k(fVar);
                    } else {
                        qVar3.k0();
                    }
                    u2.r.J(eVar, d11, qVar3);
                    u2.r.J(eVar4, l7, qVar3);
                    defpackage.f.u(hashCode2, qVar3, eVar3, qVar3, dVar);
                    u2.r.J(eVar2, c11, qVar3);
                    u3.c M = kd.a.M(R.drawable.pause_lg, qVar3, 0);
                    i3.t o6 = r1.p2.o(qVar2, 24);
                    long m2466getWhite0d7_KjU = readerColors.m2466getWhite0d7_KjU();
                    int i23 = u3.c.$stable;
                    i3.q qVar8 = qVar2;
                    u2.q qVar9 = qVar3;
                    q2.y2.a(M, null, o6, m2466getWhite0d7_KjU, qVar9, i23 | 3504, 0);
                    qVar9.p(true);
                    if (z16) {
                        qVar9.X(-193428989);
                        l1.n.c(kd.a.M(R.drawable.verified_gold, qVar9, 0), null, r1.p2.d(qVar8, 0.3f), null, null, t2.u.P, null, qVar9, i23 | 432, 120);
                        qVar9.p(false);
                    } else {
                        qVar9.X(-193222374);
                        qVar9.p(false);
                    }
                    qVar9.p(true);
                    qVar = qVar9;
                    z14 = z16;
                    z15 = z17;
                } else {
                    qVar6.R();
                    z14 = z11;
                    qVar = qVar6;
                    z15 = z12;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new io.elevenlabs.readerapp.ui.components.e0(str, str2, tVar, z14, z15, i10, i11);
                    return;
                }
                return;
            }
            z12 = z10;
            if ((i12 & 9363) != 9362) {
            }
            if (qVar6.O(i12 & 1, z13)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        z11 = z6;
        i14 = i11 & 16;
        if (i14 == 0) {
        }
        z12 = z10;
        if ((i12 & 9363) != 9362) {
        }
        if (qVar6.O(i12 & 1, z13)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    private static final float VoiceAvatar$lambda$0(u2.s2 s2Var) {
        return ((Number) s2Var.getValue()).floatValue();
    }

    public static final sn.z VoiceAvatar$lambda$2(String str, String str2, i3.t tVar, boolean z6, boolean z10, int i10, int i11, u2.m mVar, int i12) {
        VoiceAvatar(str, str2, tVar, z6, z10, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }
}
