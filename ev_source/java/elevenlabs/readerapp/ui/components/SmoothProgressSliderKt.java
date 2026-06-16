package io.elevenlabs.readerapp.ui.components;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeShapes;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;
import q2.j7;
import q2.y2;
import r1.i2;
import r1.k2;
import r1.m2;
import r1.p2;
import u2.r1;
import u2.s2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000B\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\u001aÃ\u0001\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u000f\u0010\u001e\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u000f\u0010 \u001a\u00020\u0003H\u0001¢\u0006\u0004\b \u0010\u001f\u001a\u000f\u0010!\u001a\u00020\u0003H\u0001¢\u0006\u0004\b!\u0010\u001f¨\u0006(²\u0006\u000e\u0010\"\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010#\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u0018\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00028\nX\u008a\u0084\u0002²\u0006\u0012\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\nX\u008a\u0084\u0002²\u0006\u0012\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010'\u001a\u00020\u00178\nX\u008a\u0084\u0002"}, d2 = {"", "value", "Lkotlin/Function1;", "Lsn/z;", "onValueChange", "Lkotlin/Function0;", "onValueChangeFinished", "onValueChangeStarted", "Li3/t;", "modifier", "", "enabled", "Lp3/x;", "trackColor", "progressColor", "Ls4/y0;", "textStyle", "", "elapsedChapterTime", "remainingChapterTime", "remainingReadTime", "isCurrentChapterLast", "sleepTimerRemaining", "Lh5/f;", "normalHeight", "seekingHeight", "verticalSpacing", "SmoothProgressSlider-OXtVwFM", "(FLho/l;Lho/a;Lho/a;Li3/t;ZJJLs4/y0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;FFFLu2/m;III)V", "SmoothProgressSlider", "Preview_SmoothProgressSlider", "(Lu2/m;I)V", "Preview_SmoothProgressSlider_WithSleepTimer", "Preview_SmoothProgressSlider_WithRemainingReadTime", "isSeeking", "barWidthPx", "updatedOnValueChange", "updatedOnValueChangeFinished", "updatedOnValueChangeStarted", "animatedSliderHeight", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class SmoothProgressSliderKt {
    public static final void Preview_SmoothProgressSlider(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-530513630);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            i3.t E = r1.d.E(l1.n.h(i3.q.f13017a, EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), p3.h0.f26395b), 16);
            f4.f1 d10 = r1.p.d(i3.d.f12997a, false);
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
            u2.r.J(h4.g.f11907f, d10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new r0(3);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new a(9);
                qVar.h0(L2);
            }
            ho.a aVar = (ho.a) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new a(10);
                qVar.h0(L3);
            }
            m1094SmoothProgressSliderOXtVwFM(0.4f, lVar, aVar, (ho.a) L3, null, false, 0L, 0L, null, "1:23", "3:33", "12:44", true, null, t2.u.P, t2.u.P, t2.u.P, qVar, 805309878, 438, 123376);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new i0(i10, 15);
        }
    }

    public static final sn.z Preview_SmoothProgressSlider$lambda$0$0$0(float f10) {
        return sn.z.f31622a;
    }

    public static final sn.z Preview_SmoothProgressSlider$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_SmoothProgressSlider(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_SmoothProgressSlider_WithRemainingReadTime(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1483470322);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            i3.t E = r1.d.E(l1.n.h(i3.q.f13017a, EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), p3.h0.f26395b), 16);
            f4.f1 d10 = r1.p.d(i3.d.f12997a, false);
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
            u2.r.J(h4.g.f11907f, d10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new r0(5);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new a(13);
                qVar.h0(L2);
            }
            ho.a aVar = (ho.a) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new a(8);
                qVar.h0(L3);
            }
            m1094SmoothProgressSliderOXtVwFM(0.4f, lVar, aVar, (ho.a) L3, null, false, 0L, 0L, null, "1:23", "3:33", "12h 44m left", false, null, t2.u.P, t2.u.P, t2.u.P, qVar, 805309878, 438, 123376);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new i0(i10, 14);
        }
    }

    public static final sn.z Preview_SmoothProgressSlider_WithRemainingReadTime$lambda$0$0$0(float f10) {
        return sn.z.f31622a;
    }

    public static final sn.z Preview_SmoothProgressSlider_WithRemainingReadTime$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_SmoothProgressSlider_WithRemainingReadTime(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_SmoothProgressSlider_WithSleepTimer(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1804804561);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            i3.t E = r1.d.E(l1.n.h(i3.q.f13017a, EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), p3.h0.f26395b), 16);
            f4.f1 d10 = r1.p.d(i3.d.f12997a, false);
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
            u2.r.J(h4.g.f11907f, d10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new r0(2);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new a(11);
                qVar.h0(L2);
            }
            ho.a aVar = (ho.a) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new a(12);
                qVar.h0(L3);
            }
            m1094SmoothProgressSliderOXtVwFM(0.4f, lVar, aVar, (ho.a) L3, null, false, 0L, 0L, null, "1:23", "3:33", "12h 44m left", true, "45m", t2.u.P, t2.u.P, t2.u.P, qVar, 805309878, 3510, 115184);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new i0(i10, 16);
        }
    }

    public static final sn.z Preview_SmoothProgressSlider_WithSleepTimer$lambda$0$0$0(float f10) {
        return sn.z.f31622a;
    }

    public static final sn.z Preview_SmoothProgressSlider_WithSleepTimer$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_SmoothProgressSlider_WithSleepTimer(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c6  */
    /* renamed from: SmoothProgressSlider-OXtVwFM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1094SmoothProgressSliderOXtVwFM(final float f10, final ho.l lVar, final ho.a aVar, final ho.a aVar2, i3.t tVar, boolean z6, long j4, long j10, s4.y0 y0Var, final String str, final String str2, final String str3, final boolean z10, String str4, float f11, float f12, float f13, u2.m mVar, final int i10, final int i11, final int i12) {
        int i13;
        int i14;
        int i15;
        long j11;
        final s4.y0 y0Var2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        final i3.t tVar2;
        final boolean z11;
        final String str5;
        final float f14;
        final float f15;
        final float f16;
        final long j12;
        final long j13;
        r1 r10;
        i3.t tVar3;
        boolean z12;
        long j14;
        String str6;
        s4.y0 y0Var3;
        float f17;
        float f18;
        int i22;
        float f19;
        int i23;
        long j15;
        long j16;
        int i24;
        boolean z13;
        u2.z0 z0Var;
        u2.z0 z0Var2;
        boolean z14;
        i3.t tVar4;
        String str7;
        boolean z15;
        int i25;
        int i26;
        lVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-2012251315);
        if ((i10 & 6) == 0) {
            i13 = (qVar.c(f10) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i10 & 48) == 0) {
            i13 |= qVar.h(lVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i13 |= qVar.h(aVar) ? 256 : 128;
        }
        int i27 = i10 & 3072;
        int i28 = UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i27 == 0) {
            i13 |= qVar.h(aVar2) ? 2048 : 1024;
        }
        int i29 = i12 & 16;
        int i30 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
        if (i29 != 0) {
            i13 |= 24576;
        } else if ((i10 & 24576) == 0) {
            i13 |= qVar.f(tVar) ? 16384 : 8192;
            i14 = i12 & 32;
            if (i14 == 0) {
                i13 |= 196608;
            } else if ((i10 & 196608) == 0) {
                i13 |= qVar.g(z6) ? 131072 : 65536;
            }
            int i31 = 524288;
            if ((i10 & 1572864) != 0) {
                if ((i12 & 64) == 0) {
                    i15 = i29;
                    j11 = j4;
                    if (qVar.e(j11)) {
                        i26 = 1048576;
                        i13 |= i26;
                    }
                } else {
                    i15 = i29;
                    j11 = j4;
                }
                i26 = 524288;
                i13 |= i26;
            } else {
                i15 = i29;
                j11 = j4;
            }
            if ((i10 & 12582912) == 0) {
                i13 |= ((i12 & 128) == 0 && qVar.e(j10)) ? 8388608 : 4194304;
            }
            if ((i10 & 100663296) != 0) {
                if ((i12 & RpcError.MAX_MESSAGE_BYTES) == 0) {
                    y0Var2 = y0Var;
                    if (qVar.f(y0Var2)) {
                        i25 = 67108864;
                        i13 |= i25;
                    }
                } else {
                    y0Var2 = y0Var;
                }
                i25 = 33554432;
                i13 |= i25;
            } else {
                y0Var2 = y0Var;
            }
            if ((i10 & 805306368) == 0) {
                i13 |= qVar.f(str) ? 536870912 : 268435456;
            }
            if ((i11 & 6) != 0) {
                i16 = i11 | (qVar.f(str2) ? 4 : 2);
            } else {
                i16 = i11;
            }
            if ((i11 & 48) == 0) {
                i16 |= qVar.f(str3) ? 32 : 16;
            }
            if ((i11 & 384) == 0) {
                i16 |= qVar.g(z10) ? 256 : 128;
            }
            int i32 = i16;
            i17 = i12 & UserMetadata.MAX_INTERNAL_KEY_SIZE;
            if (i17 == 0) {
                i18 = i32 | 3072;
            } else {
                int i33 = i32;
                if ((i11 & 3072) == 0) {
                    if (qVar.f(str4)) {
                        i28 = 2048;
                    }
                    i33 |= i28;
                }
                i18 = i33;
            }
            i19 = i12 & 16384;
            if (i19 == 0) {
                i20 = i18 | 24576;
            } else {
                i20 = i18;
                if ((i11 & 24576) == 0) {
                    if (qVar.c(f11)) {
                        i30 = 16384;
                    }
                    i20 |= i30;
                    i21 = i12 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS;
                    if (i21 != 0) {
                        i20 |= 196608;
                    } else if ((i11 & 196608) == 0) {
                        i20 |= qVar.c(f12) ? 131072 : 65536;
                    }
                    if ((i11 & 1572864) == 0) {
                        if ((i12 & 65536) == 0 && qVar.c(f13)) {
                            i31 = 1048576;
                        }
                        i20 |= i31;
                    }
                    if (qVar.O(i13 & 1, (i13 & 306783379) == 306783378 || (i20 & 599187) != 599186)) {
                        qVar.T();
                        int i34 = i10 & 1;
                        i3.q qVar2 = i3.q.f13017a;
                        if (i34 == 0 || qVar.y()) {
                            tVar3 = i15 != 0 ? qVar2 : tVar;
                            z12 = i14 != 0 ? true : z6;
                            if ((i12 & 64) != 0) {
                                j11 = EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getFill().getOctonary(qVar, EchoThemeColors.Fill.$stable);
                                i13 &= -3670017;
                            }
                            if ((i12 & 128) != 0) {
                                j14 = EchoTheme.INSTANCE.getColors(qVar, EchoTheme.$stable).getFill().getPrimary(qVar, EchoThemeColors.Fill.$stable);
                                i13 &= -29360129;
                            } else {
                                j14 = j10;
                            }
                            if ((i12 & RpcError.MAX_MESSAGE_BYTES) != 0) {
                                EchoTheme echoTheme = EchoTheme.INSTANCE;
                                int i35 = EchoTheme.$stable;
                                i13 &= -234881025;
                                y0Var2 = s4.y0.a(echoTheme.getTypography(qVar, i35).getXsRegular400(qVar, EchoThemeTypography.$stable), echoTheme.getColors(qVar, i35).getText().getQuaternary(qVar, EchoThemeColors.Text.$stable), 0L, null, null, null, 0L, 0, 0L, null, null, 16777214);
                            }
                            String str8 = i17 != 0 ? null : str4;
                            float f20 = i19 != 0 ? 8 : f11;
                            float f21 = i21 != 0 ? 16 : f12;
                            i3.t tVar5 = tVar3;
                            if ((i12 & 65536) != 0) {
                                str6 = str8;
                                y0Var3 = y0Var2;
                                f17 = f20;
                                f18 = f21;
                                i22 = i20 & (-3670017);
                                f19 = EchoTheme.INSTANCE.getSpacings(qVar, EchoTheme.$stable).getX2();
                                i23 = i13;
                                j15 = j11;
                                j16 = j14;
                                tVar3 = tVar5;
                            } else {
                                str6 = str8;
                                y0Var3 = y0Var2;
                                f17 = f20;
                                f18 = f21;
                                i22 = i20;
                                f19 = f13;
                                i23 = i13;
                                j15 = j11;
                                j16 = j14;
                            }
                        } else {
                            qVar.R();
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                            }
                            if ((i12 & 128) != 0) {
                                i13 &= -29360129;
                            }
                            if ((i12 & RpcError.MAX_MESSAGE_BYTES) != 0) {
                                i13 &= -234881025;
                            }
                            if ((i12 & 65536) != 0) {
                                i20 &= -3670017;
                            }
                            tVar3 = tVar;
                            z12 = z6;
                            str6 = str4;
                            f17 = f11;
                            f18 = f12;
                            i23 = i13;
                            j15 = j11;
                            y0Var3 = y0Var2;
                            i22 = i20;
                            j16 = j10;
                            f19 = f13;
                        }
                        qVar.q();
                        Object L = qVar.L();
                        String str9 = str6;
                        u2.e eVar = u2.l.f33918a;
                        if (L == eVar) {
                            L = u2.r.A(Boolean.FALSE);
                            qVar.h0(L);
                        }
                        u2.z0 z0Var3 = (u2.z0) L;
                        Object L2 = qVar.L();
                        if (L2 == eVar) {
                            i24 = i23;
                            L2 = new u2.e1(t2.u.P);
                            qVar.h0(L2);
                        } else {
                            i24 = i23;
                        }
                        u2.w0 w0Var = (u2.w0) L2;
                        final u2.z0 H = u2.r.H(lVar, qVar);
                        final u2.z0 H2 = u2.r.H(aVar, qVar);
                        final u2.z0 H3 = u2.r.H(aVar2, qVar);
                        s2 a10 = j1.f.a(SmoothProgressSlider_OXtVwFM$lambda$1(z0Var3) ? f18 : f17, null, "Slider Height Animation", qVar, 384, 10);
                        boolean f22 = ((i24 & 14) == 4) | ((i24 & 458752) == 131072) | qVar.f(H3) | qVar.f(H) | qVar.f(H2);
                        Object L3 = qVar.L();
                        if (f22 || L3 == eVar) {
                            final boolean z16 = z12;
                            L3 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.components.v0
                                @Override // ho.l
                                public final Object invoke(Object obj) {
                                    sn.z SmoothProgressSlider_OXtVwFM$lambda$10$0;
                                    SmoothProgressSlider_OXtVwFM$lambda$10$0 = SmoothProgressSliderKt.SmoothProgressSlider_OXtVwFM$lambda$10$0(f10, z16, H3, H, H2, (p4.b0) obj);
                                    return SmoothProgressSlider_OXtVwFM$lambda$10$0;
                                }
                            };
                            z13 = z16;
                            z0Var = H;
                            z0Var2 = H2;
                            qVar.h0(L3);
                        } else {
                            z0Var = H;
                            z13 = z12;
                            z0Var2 = H2;
                        }
                        i3.t c5 = p4.q.c(tVar3, false, (ho.l) L3);
                        r1.u0 u0Var = r1.j.f29228a;
                        i3.k kVar = i3.d.f13005z0;
                        i3.t tVar6 = tVar3;
                        float f23 = f19;
                        r1.x a11 = r1.w.a(r1.j.i(f19, kVar), i3.d.B0, qVar, 0);
                        long j17 = j16;
                        int hashCode = Long.hashCode(qVar.T);
                        c3.o l4 = qVar.l();
                        i3.t c10 = i3.a.c(c5, qVar);
                        h4.h.f11920i.getClass();
                        h4.f fVar = h4.g.f11903b;
                        qVar.b0();
                        if (qVar.S) {
                            qVar.k(fVar);
                        } else {
                            qVar.k0();
                        }
                        h4.e eVar2 = h4.g.f11907f;
                        u2.r.J(eVar2, a11, qVar);
                        h4.e eVar3 = h4.g.f11906e;
                        u2.r.J(eVar3, l4, qVar);
                        Integer valueOf = Integer.valueOf(hashCode);
                        h4.e eVar4 = h4.g.f11908g;
                        u2.r.y(qVar, valueOf, eVar4);
                        h4.d dVar = h4.g.f11909h;
                        u2.r.F(dVar, qVar);
                        h4.e eVar5 = h4.g.f11905d;
                        u2.r.J(eVar5, c10, qVar);
                        long j18 = j15;
                        i3.t f24 = p2.f(p2.e(qVar2, 1.0f), SmoothProgressSlider_OXtVwFM$lambda$9(a10));
                        EchoTheme echoTheme2 = EchoTheme.INSTANCE;
                        int i36 = EchoTheme.$stable;
                        i3.t c11 = m3.h.c(f24, echoTheme2.getShapes(qVar, i36).getFull(qVar, EchoThemeShapes.$stable));
                        Object L4 = qVar.L();
                        if (L4 == eVar) {
                            L4 = new s(w0Var, 1);
                            qVar.h0(L4);
                        }
                        i3.t q = f4.i0.q(c11, (ho.l) L4);
                        if (z13) {
                            qVar.X(1520519469);
                            Float valueOf2 = Float.valueOf(SmoothProgressSlider_OXtVwFM$lambda$4(w0Var));
                            boolean f25 = qVar.f(H3) | qVar.f(z0Var) | qVar.f(z0Var2);
                            Object L5 = qVar.L();
                            if (f25 || L5 == eVar) {
                                L5 = new SmoothProgressSliderKt$SmoothProgressSlider$2$2$1(w0Var, z0Var3, H3, z0Var, z0Var2);
                                qVar.h0(L5);
                            }
                            tVar4 = c4.l0.b(qVar2, valueOf2, (PointerInputEventHandler) L5);
                            z14 = false;
                            qVar.p(false);
                        } else {
                            z14 = false;
                            qVar.X(1521755315);
                            qVar.p(false);
                            tVar4 = qVar2;
                        }
                        i3.t then = q.then(tVar4);
                        f4.f1 d10 = r1.p.d(i3.d.f13000d, z14);
                        int hashCode2 = Long.hashCode(qVar.T);
                        c3.o l7 = qVar.l();
                        i3.t c12 = i3.a.c(then, qVar);
                        qVar.b0();
                        if (qVar.S) {
                            qVar.k(fVar);
                        } else {
                            qVar.k0();
                        }
                        u2.r.J(eVar2, d10, qVar);
                        u2.r.J(eVar3, l7, qVar);
                        defpackage.f.u(hashCode2, qVar, eVar4, qVar, dVar);
                        u2.r.J(eVar5, c12, qVar);
                        i3.t f26 = p2.f(p2.e(qVar2, 1.0f), SmoothProgressSlider_OXtVwFM$lambda$9(a10));
                        p3.w0 w0Var2 = p3.h0.f26395b;
                        r1.p.a(l1.n.h(f26, j18, w0Var2), qVar, 0);
                        r1.p.a(l1.n.h(p2.f(p2.e(qVar2, f10), SmoothProgressSlider_OXtVwFM$lambda$9(a10)), j17, w0Var2), qVar, 0);
                        qVar.p(true);
                        r1.f fVar2 = r1.j.f29234g;
                        i3.t e10 = p2.e(qVar2, 1.0f);
                        Object L6 = qVar.L();
                        if (L6 == eVar) {
                            L6 = new r0(4);
                            qVar.h0(L6);
                        }
                        i3.t c13 = p4.q.c(e10, true, (ho.l) L6);
                        k2 a12 = i2.a(fVar2, kVar, qVar, 54);
                        int hashCode3 = Long.hashCode(qVar.T);
                        c3.o l10 = qVar.l();
                        i3.t c14 = i3.a.c(c13, qVar);
                        qVar.b0();
                        if (qVar.S) {
                            qVar.k(fVar);
                        } else {
                            qVar.k0();
                        }
                        u2.r.J(eVar2, a12, qVar);
                        u2.r.J(eVar3, l10, qVar);
                        defpackage.f.u(hashCode3, qVar, eVar4, qVar, dVar);
                        u2.r.J(eVar5, c14, qVar);
                        s4.y0 a13 = s4.y0.a(y0Var3, 0L, 0L, null, null, "tnum", 0L, 0, 0L, null, null, 16777151);
                        m2 m2Var = m2.f29267a;
                        j7.d(str, m2Var.b(qVar2, 1.0f, true), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, a13, qVar, (i24 >> 27) & 14, 0, 131068);
                        qVar = qVar;
                        if (str9 != null) {
                            qVar.X(1045058627);
                            r1.f fVar3 = r1.j.f29232e;
                            i3.t b10 = m2Var.b(qVar2, 1.0f, true);
                            k2 a14 = i2.a(fVar3, kVar, qVar, 54);
                            int hashCode4 = Long.hashCode(qVar.T);
                            c3.o l11 = qVar.l();
                            i3.t c15 = i3.a.c(b10, qVar);
                            qVar.b0();
                            if (qVar.S) {
                                qVar.k(fVar);
                            } else {
                                qVar.k0();
                            }
                            u2.r.J(eVar2, a14, qVar);
                            u2.r.J(eVar3, l11, qVar);
                            defpackage.f.u(hashCode4, qVar, eVar4, qVar, dVar);
                            u2.r.J(eVar5, c15, qVar);
                            u3.c M = kd.a.M(R.drawable.clock_snooze, qVar, 0);
                            EchoThemeColors.Text text = echoTheme2.getColors(qVar, i36).getText();
                            int i37 = EchoThemeColors.Text.$stable;
                            z15 = true;
                            y2.a(M, null, p2.o(qVar2, 14), text.getWarningPrimary(qVar, i37), qVar, u3.c.$stable | 432, 0);
                            r1.d.g(p2.s(qVar2, 4), qVar);
                            j7.d(str9, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, s4.y0.a(y0Var3, echoTheme2.getColors(qVar, i36).getText().getWarningPrimary(qVar, i37), 0L, null, null, "tnum", 0L, 0, 0L, null, null, 16777150), qVar, (i22 >> 9) & 14, 0, 131070);
                            str7 = str9;
                            qVar.p(true);
                            qVar.p(false);
                        } else {
                            str7 = str9;
                            z15 = true;
                            if (!z10) {
                                qVar.X(1046004747);
                                j7.d(str3, m2Var.b(qVar2, 1.0f, true), 0L, 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, s4.y0.a(y0Var3, 0L, 0L, null, null, "tnum", 0L, 0, 0L, null, null, 16777151), qVar, (i22 >> 3) & 14, 0, 130044);
                                qVar.p(false);
                            } else {
                                qVar.X(1046307369);
                                r1.d.g(m2Var.b(qVar2, 1.0f, true), qVar);
                                qVar.p(false);
                            }
                        }
                        j7.d(str2, m2Var.b(qVar2, 1.0f, z15), 0L, 0L, null, 0L, new e5.k(6), 0L, 0, false, 0, 0, null, s4.y0.a(y0Var3, 0L, 0L, null, null, "tnum", 0L, 0, 0L, null, null, 16777151), qVar, i22 & 14, 0, 130044);
                        qVar.p(z15);
                        qVar.p(z15);
                        z11 = z13;
                        tVar2 = tVar6;
                        str5 = str7;
                        y0Var2 = y0Var3;
                        f14 = f17;
                        f15 = f18;
                        f16 = f23;
                        j13 = j17;
                        j12 = j18;
                    } else {
                        qVar.R();
                        tVar2 = tVar;
                        z11 = z6;
                        str5 = str4;
                        f14 = f11;
                        f15 = f12;
                        f16 = f13;
                        j12 = j11;
                        j13 = j10;
                    }
                    r10 = qVar.r();
                    if (r10 != null) {
                        r10.f34012d = new ho.p() { // from class: io.elevenlabs.readerapp.ui.components.w0
                            @Override // ho.p
                            public final Object invoke(Object obj, Object obj2) {
                                sn.z SmoothProgressSlider_OXtVwFM$lambda$12;
                                int intValue = ((Integer) obj2).intValue();
                                SmoothProgressSlider_OXtVwFM$lambda$12 = SmoothProgressSliderKt.SmoothProgressSlider_OXtVwFM$lambda$12(f10, lVar, aVar, aVar2, tVar2, z11, j12, j13, y0Var2, str, str2, str3, z10, str5, f14, f15, f16, i10, i11, i12, (u2.m) obj, intValue);
                                return SmoothProgressSlider_OXtVwFM$lambda$12;
                            }
                        };
                        return;
                    }
                    return;
                }
            }
            i21 = i12 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS;
            if (i21 != 0) {
            }
            if ((i11 & 1572864) == 0) {
            }
            if (qVar.O(i13 & 1, (i13 & 306783379) == 306783378 || (i20 & 599187) != 599186)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        i14 = i12 & 32;
        if (i14 == 0) {
        }
        int i312 = 524288;
        if ((i10 & 1572864) != 0) {
        }
        if ((i10 & 12582912) == 0) {
        }
        if ((i10 & 100663296) != 0) {
        }
        if ((i10 & 805306368) == 0) {
        }
        if ((i11 & 6) != 0) {
        }
        if ((i11 & 48) == 0) {
        }
        if ((i11 & 384) == 0) {
        }
        int i322 = i16;
        i17 = i12 & UserMetadata.MAX_INTERNAL_KEY_SIZE;
        if (i17 == 0) {
        }
        i19 = i12 & 16384;
        if (i19 == 0) {
        }
        i21 = i12 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS;
        if (i21 != 0) {
        }
        if ((i11 & 1572864) == 0) {
        }
        if (qVar.O(i13 & 1, (i13 & 306783379) == 306783378 || (i20 & 599187) != 599186)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    private static final boolean SmoothProgressSlider_OXtVwFM$lambda$1(u2.z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    public static final sn.z SmoothProgressSlider_OXtVwFM$lambda$10$0(float f10, boolean z6, s2 s2Var, s2 s2Var2, s2 s2Var3, p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.h(b0Var, new p4.j(f10, new no.c(t2.u.P, 1.0f)));
        if (z6) {
            b0Var.b(p4.n.f26499i, new p4.a(null, new a2.o0(s2Var, s2Var2, s2Var3, 10)));
        }
        return sn.z.f31622a;
    }

    public static final boolean SmoothProgressSlider_OXtVwFM$lambda$10$0$0(s2 s2Var, s2 s2Var2, s2 s2Var3, float f10) {
        float l4 = ae.l.l(f10, t2.u.P, 1.0f);
        SmoothProgressSlider_OXtVwFM$lambda$8(s2Var).invoke();
        SmoothProgressSlider_OXtVwFM$lambda$6(s2Var2).invoke(Float.valueOf(l4));
        SmoothProgressSlider_OXtVwFM$lambda$7(s2Var3).invoke();
        return true;
    }

    public static final sn.z SmoothProgressSlider_OXtVwFM$lambda$11$0$0(u2.w0 w0Var, h5.l lVar) {
        SmoothProgressSlider_OXtVwFM$lambda$5(w0Var, (int) (lVar.f12092a >> 32));
        return sn.z.f31622a;
    }

    public static final sn.z SmoothProgressSlider_OXtVwFM$lambda$11$3$0(p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.b(b0Var);
        return sn.z.f31622a;
    }

    public static final sn.z SmoothProgressSlider_OXtVwFM$lambda$12(float f10, ho.l lVar, ho.a aVar, ho.a aVar2, i3.t tVar, boolean z6, long j4, long j10, s4.y0 y0Var, String str, String str2, String str3, boolean z10, String str4, float f11, float f12, float f13, int i10, int i11, int i12, u2.m mVar, int i13) {
        m1094SmoothProgressSliderOXtVwFM(f10, lVar, aVar, aVar2, tVar, z6, j4, j10, y0Var, str, str2, str3, z10, str4, f11, f12, f13, mVar, u2.r.M(i10 | 1), u2.r.M(i11), i12);
        return sn.z.f31622a;
    }

    public static final void SmoothProgressSlider_OXtVwFM$lambda$2(u2.z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public static final float SmoothProgressSlider_OXtVwFM$lambda$4(u2.w0 w0Var) {
        return ((u2.e1) w0Var).h();
    }

    private static final void SmoothProgressSlider_OXtVwFM$lambda$5(u2.w0 w0Var, float f10) {
        ((u2.e1) w0Var).i(f10);
    }

    public static final ho.l SmoothProgressSlider_OXtVwFM$lambda$6(s2 s2Var) {
        return (ho.l) s2Var.getValue();
    }

    public static final ho.a SmoothProgressSlider_OXtVwFM$lambda$7(s2 s2Var) {
        return (ho.a) s2Var.getValue();
    }

    public static final ho.a SmoothProgressSlider_OXtVwFM$lambda$8(s2 s2Var) {
        return (ho.a) s2Var.getValue();
    }

    private static final float SmoothProgressSlider_OXtVwFM$lambda$9(s2 s2Var) {
        return ((h5.f) s2Var.getValue()).f12083a;
    }
}
