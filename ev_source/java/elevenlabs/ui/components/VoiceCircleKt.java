package io.elevenlabs.ui.components;

import android.graphics.ColorMatrixColorFilter;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.skydoves.landscapist.transformation.blur.BlurTransformationPlugin;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.extensions.ColorExtensionsKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\u001a;\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0013\u0010\u0013\u001a\u00020\u000b*\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\"\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\"\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u001a²\u0006\u000e\u0010\u0019\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "videoEnabled", "", "id", "Li3/t;", "modifier", "blurred", "isPlaying", "Lsn/z;", "VoiceCircle", "(ZLjava/lang/String;Li3/t;ZZLu2/m;II)V", "", "imageRes", "", "angleRotation", "VoiceColoredCircle", "(IFZLu2/m;I)V", "Preview_VoiceCircle", "(Lu2/m;I)V", "getHash", "(Ljava/lang/String;)I", "", "availableCircles", "Ljava/util/List;", "availableCirclesVideo", "ready", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoiceCircleKt {
    private static final List<Integer> availableCircles = ig.f.I(Integer.valueOf(R.drawable.circle_0), Integer.valueOf(R.drawable.circle_1), Integer.valueOf(R.drawable.circle_2), Integer.valueOf(R.drawable.circle_3), Integer.valueOf(R.drawable.circle_4), Integer.valueOf(R.drawable.circle_5), Integer.valueOf(R.drawable.circle_6), Integer.valueOf(R.drawable.circle_7), Integer.valueOf(R.drawable.circle_8), Integer.valueOf(R.drawable.circle_9), Integer.valueOf(R.drawable.circle_10), Integer.valueOf(R.drawable.circle_11), Integer.valueOf(R.drawable.circle_12), Integer.valueOf(R.drawable.circle_13), Integer.valueOf(R.drawable.circle_14), Integer.valueOf(R.drawable.circle_15), Integer.valueOf(R.drawable.circle_16), Integer.valueOf(R.drawable.circle_17), Integer.valueOf(R.drawable.circle_18), Integer.valueOf(R.drawable.circle_19), Integer.valueOf(R.drawable.circle_20), Integer.valueOf(R.drawable.circle_21), Integer.valueOf(R.drawable.circle_22), Integer.valueOf(R.drawable.circle_23), Integer.valueOf(R.drawable.circle_24), Integer.valueOf(R.drawable.circle_25), Integer.valueOf(R.drawable.circle_26), Integer.valueOf(R.drawable.circle_27), Integer.valueOf(R.drawable.circle_28), Integer.valueOf(R.drawable.circle_29), Integer.valueOf(R.drawable.circle_30), Integer.valueOf(R.drawable.circle_31), Integer.valueOf(R.drawable.circle_32), Integer.valueOf(R.drawable.circle_33), Integer.valueOf(R.drawable.circle_34), Integer.valueOf(R.drawable.circle_35), Integer.valueOf(R.drawable.circle_36), Integer.valueOf(R.drawable.circle_37), Integer.valueOf(R.drawable.circle_38), Integer.valueOf(R.drawable.circle_39), Integer.valueOf(R.drawable.circle_40), Integer.valueOf(R.drawable.circle_41), Integer.valueOf(R.drawable.circle_42), Integer.valueOf(R.drawable.circle_43), Integer.valueOf(R.drawable.circle_44), Integer.valueOf(R.drawable.circle_45), Integer.valueOf(R.drawable.circle_46), Integer.valueOf(R.drawable.circle_47), Integer.valueOf(R.drawable.circle_48), Integer.valueOf(R.drawable.circle_49), Integer.valueOf(R.drawable.circle_50), Integer.valueOf(R.drawable.circle_51), Integer.valueOf(R.drawable.circle_52), Integer.valueOf(R.drawable.circle_53), Integer.valueOf(R.drawable.circle_54), Integer.valueOf(R.drawable.circle_55), Integer.valueOf(R.drawable.circle_56), Integer.valueOf(R.drawable.circle_57), Integer.valueOf(R.drawable.circle_58), Integer.valueOf(R.drawable.circle_59), Integer.valueOf(R.drawable.circle_60), Integer.valueOf(R.drawable.circle_61), Integer.valueOf(R.drawable.circle_62), Integer.valueOf(R.drawable.circle_63), Integer.valueOf(R.drawable.circle_64), Integer.valueOf(R.drawable.circle_65), Integer.valueOf(R.drawable.circle_66), Integer.valueOf(R.drawable.circle_67), Integer.valueOf(R.drawable.circle_68), Integer.valueOf(R.drawable.circle_69), Integer.valueOf(R.drawable.circle_70), Integer.valueOf(R.drawable.circle_71), Integer.valueOf(R.drawable.circle_72), Integer.valueOf(R.drawable.circle_73), Integer.valueOf(R.drawable.circle_74), Integer.valueOf(R.drawable.circle_75), Integer.valueOf(R.drawable.circle_76), Integer.valueOf(R.drawable.circle_77), Integer.valueOf(R.drawable.circle_78), Integer.valueOf(R.drawable.circle_79), Integer.valueOf(R.drawable.circle_80), Integer.valueOf(R.drawable.circle_81), Integer.valueOf(R.drawable.circle_82), Integer.valueOf(R.drawable.circle_83), Integer.valueOf(R.drawable.circle_84), Integer.valueOf(R.drawable.circle_85), Integer.valueOf(R.drawable.circle_86), Integer.valueOf(R.drawable.circle_87), Integer.valueOf(R.drawable.circle_88), Integer.valueOf(R.drawable.circle_89), Integer.valueOf(R.drawable.circle_90), Integer.valueOf(R.drawable.circle_91), Integer.valueOf(R.drawable.circle_92), Integer.valueOf(R.drawable.circle_93), Integer.valueOf(R.drawable.circle_94), Integer.valueOf(R.drawable.circle_95), Integer.valueOf(R.drawable.circle_96), Integer.valueOf(R.drawable.circle_97), Integer.valueOf(R.drawable.circle_98), Integer.valueOf(R.drawable.circle_99), Integer.valueOf(R.drawable.circle_100), Integer.valueOf(R.drawable.circle_101), Integer.valueOf(R.drawable.circle_102), Integer.valueOf(R.drawable.circle_103), Integer.valueOf(R.drawable.circle_104), Integer.valueOf(R.drawable.circle_105), Integer.valueOf(R.drawable.circle_106), Integer.valueOf(R.drawable.circle_107), Integer.valueOf(R.drawable.circle_108), Integer.valueOf(R.drawable.circle_109), Integer.valueOf(R.drawable.circle_110), Integer.valueOf(R.drawable.circle_111), Integer.valueOf(R.drawable.circle_112), Integer.valueOf(R.drawable.circle_113), Integer.valueOf(R.drawable.circle_114), Integer.valueOf(R.drawable.circle_115), Integer.valueOf(R.drawable.circle_116), Integer.valueOf(R.drawable.circle_117), Integer.valueOf(R.drawable.circle_118), Integer.valueOf(R.drawable.circle_119), Integer.valueOf(R.drawable.circle_120), Integer.valueOf(R.drawable.circle_121), Integer.valueOf(R.drawable.circle_122), Integer.valueOf(R.drawable.circle_123), Integer.valueOf(R.drawable.circle_124), Integer.valueOf(R.drawable.circle_125), Integer.valueOf(R.drawable.circle_126), Integer.valueOf(R.drawable.circle_127), Integer.valueOf(R.drawable.circle_128), Integer.valueOf(R.drawable.circle_129), Integer.valueOf(R.drawable.circle_130), Integer.valueOf(R.drawable.circle_131), Integer.valueOf(R.drawable.circle_132), Integer.valueOf(R.drawable.circle_133), Integer.valueOf(R.drawable.circle_134), Integer.valueOf(R.drawable.circle_135), Integer.valueOf(R.drawable.circle_136), Integer.valueOf(R.drawable.circle_137), Integer.valueOf(R.drawable.circle_138), Integer.valueOf(R.drawable.circle_139), Integer.valueOf(R.drawable.circle_140), Integer.valueOf(R.drawable.circle_141), Integer.valueOf(R.drawable.circle_142), Integer.valueOf(R.drawable.circle_143), Integer.valueOf(R.drawable.circle_144), Integer.valueOf(R.drawable.circle_145), Integer.valueOf(R.drawable.circle_146), Integer.valueOf(R.drawable.circle_147), Integer.valueOf(R.drawable.circle_148), Integer.valueOf(R.drawable.circle_149), Integer.valueOf(R.drawable.circle_150), Integer.valueOf(R.drawable.circle_151), Integer.valueOf(R.drawable.circle_152), Integer.valueOf(R.drawable.circle_153), Integer.valueOf(R.drawable.circle_154), Integer.valueOf(R.drawable.circle_155), Integer.valueOf(R.drawable.circle_156), Integer.valueOf(R.drawable.circle_157), Integer.valueOf(R.drawable.circle_158), Integer.valueOf(R.drawable.circle_159), Integer.valueOf(R.drawable.circle_160), Integer.valueOf(R.drawable.circle_161), Integer.valueOf(R.drawable.circle_162), Integer.valueOf(R.drawable.circle_163), Integer.valueOf(R.drawable.circle_164), Integer.valueOf(R.drawable.circle_165), Integer.valueOf(R.drawable.circle_166), Integer.valueOf(R.drawable.circle_167), Integer.valueOf(R.drawable.circle_168), Integer.valueOf(R.drawable.circle_169), Integer.valueOf(R.drawable.circle_170), Integer.valueOf(R.drawable.circle_171), Integer.valueOf(R.drawable.circle_172), Integer.valueOf(R.drawable.circle_173), Integer.valueOf(R.drawable.circle_174), Integer.valueOf(R.drawable.circle_175), Integer.valueOf(R.drawable.circle_176), Integer.valueOf(R.drawable.circle_177), Integer.valueOf(R.drawable.circle_178), Integer.valueOf(R.drawable.circle_179), Integer.valueOf(R.drawable.circle_180), Integer.valueOf(R.drawable.circle_181), Integer.valueOf(R.drawable.circle_182), Integer.valueOf(R.drawable.circle_183), Integer.valueOf(R.drawable.circle_184), Integer.valueOf(R.drawable.circle_185), Integer.valueOf(R.drawable.circle_186), Integer.valueOf(R.drawable.circle_187), Integer.valueOf(R.drawable.circle_188), Integer.valueOf(R.drawable.circle_189), Integer.valueOf(R.drawable.circle_190), Integer.valueOf(R.drawable.circle_191), Integer.valueOf(R.drawable.circle_192), Integer.valueOf(R.drawable.circle_193), Integer.valueOf(R.drawable.circle_194), Integer.valueOf(R.drawable.circle_195), Integer.valueOf(R.drawable.circle_196), Integer.valueOf(R.drawable.circle_197), Integer.valueOf(R.drawable.circle_198), Integer.valueOf(R.drawable.circle_199), Integer.valueOf(R.drawable.circle_200), Integer.valueOf(R.drawable.circle_201), Integer.valueOf(R.drawable.circle_202), Integer.valueOf(R.drawable.circle_203), Integer.valueOf(R.drawable.circle_204), Integer.valueOf(R.drawable.circle_205), Integer.valueOf(R.drawable.circle_206), Integer.valueOf(R.drawable.circle_207), Integer.valueOf(R.drawable.circle_208), Integer.valueOf(R.drawable.circle_209), Integer.valueOf(R.drawable.circle_210), Integer.valueOf(R.drawable.circle_211), Integer.valueOf(R.drawable.circle_212), Integer.valueOf(R.drawable.circle_213), Integer.valueOf(R.drawable.circle_214), Integer.valueOf(R.drawable.circle_215));
    private static final List<Integer> availableCirclesVideo = ig.f.I(Integer.valueOf(R.raw.voice_circle_video_0), Integer.valueOf(R.raw.voice_circle_video_1), Integer.valueOf(R.raw.voice_circle_video_2), Integer.valueOf(R.raw.voice_circle_video_3), Integer.valueOf(R.raw.voice_circle_video_4), Integer.valueOf(R.raw.voice_circle_video_5), Integer.valueOf(R.raw.voice_circle_video_6), Integer.valueOf(R.raw.voice_circle_video_7));

    public static final void Preview_VoiceCircle(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1224926394);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            float f10 = 10;
            i3.q qVar2 = i3.q.f13017a;
            i3.t E = r1.d.E(qVar2, f10);
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
            float f11 = 20;
            VoiceCircle(false, "1GCrs945cp4oP7i0cPos", r1.p2.o(qVar2, f11), false, false, qVar, 438, 24);
            float f12 = 2;
            r1.d.g(r1.p2.f(qVar2, f12), qVar);
            float f13 = 40;
            VoiceCircle(false, "7YV4PQoQgL5aEL1Mt", r1.p2.o(qVar2, f13), false, false, qVar, 438, 24);
            r1.d.g(r1.p2.f(qVar2, f12), qVar);
            float f14 = 60;
            VoiceCircle(false, "BCViXMYTxySmoNv4v5LL", r1.p2.o(qVar2, f14), false, false, qVar, 438, 24);
            r1.d.g(r1.p2.f(qVar2, f12), qVar);
            VoiceCircle(false, "AsNyiVPRz7I7UvuA9US1", r1.p2.o(qVar2, 100), false, false, qVar, 438, 24);
            r1.d.g(r1.p2.f(qVar2, f12), qVar);
            VoiceCircle(false, "UKw0MN6n40X1dl9SkECi", r1.p2.o(qVar2, 200), false, false, qVar, 438, 24);
            r1.d.g(r1.p2.f(qVar2, f10), qVar);
            VoiceCircle(false, "1GCrs945cp4oP7i0cPos", r1.p2.o(qVar2, f11), false, true, qVar, 25014, 8);
            r1.d.g(r1.p2.f(qVar2, f12), qVar);
            VoiceCircle(false, "7YV4PQoQgL5aEL1Mt", r1.p2.o(qVar2, f13), false, true, qVar, 25014, 8);
            r1.d.g(r1.p2.f(qVar2, f12), qVar);
            VoiceCircle(false, "BCViXMYTxySmoNv4v5LL", r1.p2.o(qVar2, f14), false, true, qVar, 25014, 8);
            qVar.p(true);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new u1(i10, 22);
        }
    }

    public static final sn.z Preview_VoiceCircle$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_VoiceCircle(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VoiceCircle(final boolean z6, String str, final i3.t tVar, boolean z10, boolean z11, u2.m mVar, final int i10, final int i11) {
        int i12;
        String str2;
        boolean z12;
        int i13;
        int i14;
        boolean z13;
        int i15;
        boolean z14;
        u2.q qVar;
        final boolean z15;
        u2.r1 r10;
        boolean z16;
        boolean z17;
        boolean z18;
        u2.q qVar2;
        boolean z19;
        boolean z20;
        int i16;
        int i17;
        int i18;
        str.getClass();
        tVar.getClass();
        u2.q qVar3 = (u2.q) mVar;
        qVar3.Z(1212967955);
        if ((i10 & 6) == 0) {
            if (qVar3.g(z6)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i12 = i18 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            str2 = str;
            if (qVar3.f(str2)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i12 |= i17;
        } else {
            str2 = str;
        }
        if ((i10 & 384) == 0) {
            if (qVar3.f(tVar)) {
                i16 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i16 = 128;
            }
            i12 |= i16;
        }
        int i19 = i11 & 8;
        if (i19 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            z12 = z10;
            if (qVar3.g(z12)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i13;
            i14 = i11 & 16;
            if (i14 == 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                z13 = z11;
                if (qVar3.g(z13)) {
                    i15 = 16384;
                } else {
                    i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i12 |= i15;
                if ((i12 & 9363) != 9362) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (qVar3.O(i12 & 1, z14)) {
                    if (i19 != 0) {
                        z16 = false;
                    } else {
                        z16 = z12;
                    }
                    if (i14 != 0) {
                        z17 = false;
                    } else {
                        z17 = z13;
                    }
                    if ((i12 & 112) == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    Object L = qVar3.L();
                    u2.e eVar = u2.l.f33918a;
                    if (z18 || L == eVar) {
                        L = Integer.valueOf(getHash(str2));
                        qVar3.h0(L);
                    }
                    int intValue = ((Number) L).intValue();
                    boolean d10 = qVar3.d(intValue);
                    Object L2 = qVar3.L();
                    if (d10 || L2 == eVar) {
                        L2 = Float.valueOf((intValue % 4) * 90);
                        qVar3.h0(L2);
                    }
                    float floatValue = ((Number) L2).floatValue();
                    boolean d11 = qVar3.d(intValue);
                    Object L3 = qVar3.L();
                    if (d11 || L3 == eVar) {
                        L3 = Integer.valueOf(intValue % availableCircles.size());
                        qVar3.h0(L3);
                    }
                    int intValue2 = ((Number) L3).intValue();
                    boolean d12 = qVar3.d(intValue2);
                    Object L4 = qVar3.L();
                    if (d12 || L4 == eVar) {
                        L4 = Integer.valueOf(intValue2 / 27);
                        qVar3.h0(L4);
                    }
                    int intValue3 = ((Number) L4).intValue();
                    boolean d13 = qVar3.d(intValue2);
                    Object L5 = qVar3.L();
                    if (d13 || L5 == eVar) {
                        L5 = Integer.valueOf(availableCircles.get(intValue2).intValue());
                        qVar3.h0(L5);
                    }
                    int intValue4 = ((Number) L5).intValue();
                    boolean d14 = qVar3.d(intValue3);
                    Object L6 = qVar3.L();
                    if (d14 || L6 == eVar) {
                        L6 = Integer.valueOf(availableCirclesVideo.get(intValue3).intValue());
                        qVar3.h0(L6);
                    }
                    int intValue5 = ((Number) L6).intValue();
                    i3.t c5 = m3.h.c(tVar, ElevenLabsTheme.INSTANCE.getShapes(qVar3, 6).getFull());
                    f4.f1 d15 = r1.p.d(i3.d.f12997a, false);
                    int hashCode = Long.hashCode(qVar3.T);
                    c3.o l4 = qVar3.l();
                    i3.t c10 = i3.a.c(c5, qVar3);
                    h4.h.f11920i.getClass();
                    h4.f fVar = h4.g.f11903b;
                    qVar3.b0();
                    if (qVar3.S) {
                        qVar3.k(fVar);
                    } else {
                        qVar3.k0();
                    }
                    u2.r.J(h4.g.f11907f, d15, qVar3);
                    u2.r.J(h4.g.f11906e, l4, qVar3);
                    u2.r.y(qVar3, Integer.valueOf(hashCode), h4.g.f11908g);
                    u2.r.F(h4.g.f11909h, qVar3);
                    u2.r.J(h4.g.f11905d, c10, qVar3);
                    VoiceColoredCircle(intValue4, floatValue, z16, qVar3, (i12 >> 3) & 896);
                    if (z6 && z17) {
                        qVar3.X(-615877341);
                        Object L7 = qVar3.L();
                        if (L7 == eVar) {
                            L7 = u2.r.A(Boolean.FALSE);
                            qVar3.h0(L7);
                        }
                        u2.z0 z0Var = (u2.z0) L7;
                        float f10 = 1.0f;
                        i3.t d16 = r1.p2.d(i3.q.f13017a, 1.0f);
                        if (!VoiceCircle$lambda$6$1(z0Var)) {
                            f10 = t2.u.P;
                        }
                        i3.t a10 = m3.h.a(d16, f10);
                        long j4 = p3.x.f26437l;
                        Object L8 = qVar3.L();
                        if (L8 == eVar) {
                            L8 = new v2(z0Var, 3);
                            qVar3.h0(L8);
                        }
                        z19 = z16;
                        z20 = true;
                        VideoPlayerKt.m1884VideoPlayer_Ogyb9c(a10, intValue5, j4, (ho.a) L8, (ho.a) null, (ho.a) null, true, true, false, Float.valueOf(floatValue), true, 2, (u2.m) qVar3, 14159232, 54, RCHTTPStatusCodes.NOT_MODIFIED);
                        qVar2 = qVar3;
                        qVar2.p(false);
                    } else {
                        qVar2 = qVar3;
                        z19 = z16;
                        z20 = true;
                        qVar2.X(-615306507);
                        qVar2.p(false);
                    }
                    qVar2.p(z20);
                    z12 = z19;
                    qVar = qVar2;
                    z15 = z17;
                } else {
                    qVar3.R();
                    qVar = qVar3;
                    z15 = z13;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    final String str3 = str2;
                    final boolean z21 = z12;
                    r10.f34012d = new ho.p() { // from class: io.elevenlabs.ui.components.d3
                        @Override // ho.p
                        public final Object invoke(Object obj, Object obj2) {
                            sn.z VoiceCircle$lambda$7;
                            int intValue6 = ((Integer) obj2).intValue();
                            VoiceCircle$lambda$7 = VoiceCircleKt.VoiceCircle$lambda$7(z6, str3, tVar, z21, z15, i10, i11, (u2.m) obj, intValue6);
                            return VoiceCircle$lambda$7;
                        }
                    };
                    return;
                }
                return;
            }
            z13 = z11;
            if ((i12 & 9363) != 9362) {
            }
            if (qVar3.O(i12 & 1, z14)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        z12 = z10;
        i14 = i11 & 16;
        if (i14 == 0) {
        }
        z13 = z11;
        if ((i12 & 9363) != 9362) {
        }
        if (qVar3.O(i12 & 1, z14)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    private static final boolean VoiceCircle$lambda$6$1(u2.z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    private static final void VoiceCircle$lambda$6$2(u2.z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public static final sn.z VoiceCircle$lambda$6$3$0(u2.z0 z0Var) {
        VoiceCircle$lambda$6$2(z0Var, true);
        return sn.z.f31622a;
    }

    public static final sn.z VoiceCircle$lambda$7(boolean z6, String str, i3.t tVar, boolean z10, boolean z11, int i10, int i11, u2.m mVar, int i12) {
        VoiceCircle(z6, str, tVar, z10, z11, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [p3.z, p3.y] */
    private static final void VoiceColoredCircle(final int i10, final float f10, final boolean z6, u2.m mVar, final int i11) {
        int i12;
        boolean z10;
        int i13;
        int i14;
        int i15;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1028615292);
        if ((i11 & 6) == 0) {
            if (qVar.d(i10)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            if (qVar.c(f10)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 384) == 0) {
            if (qVar.g(z6)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (qVar.O(i12 & 1, z10)) {
            int i16 = i12 & 14;
            u3.c M = kd.a.M(i10, qVar, i16);
            i3.t d10 = r1.p2.d(i3.q.f13017a, 1.0f);
            boolean z11 = false;
            float[] createHueRotationMatrix = ColorExtensionsKt.createHueRotationMatrix(f10);
            ?? yVar = new p3.y(new ColorMatrixColorFilter(createHueRotationMatrix));
            yVar.f26452b = createHueRotationMatrix;
            vk.i iVar = new vk.i(yVar, 0L, 117);
            xk.b D = g0.c.D(c3.k.d(269771266, true, new io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.y(z6, 1), qVar), qVar);
            if (i16 == 4) {
                z11 = true;
            }
            Object L = qVar.L();
            if (z11 || L == u2.l.f33918a) {
                L = new io.elevenlabs.ocr.u(i10, 1);
                qVar.h0(L);
            }
            LandscapistImageKt.LandscapistCoilImage((ho.a) L, d10, D, null, iVar, null, M, null, null, null, qVar, (u3.c.$stable << 18) | 48, 936);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new ho.p() { // from class: io.elevenlabs.ui.components.c3
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    sn.z VoiceColoredCircle$lambda$2;
                    int intValue = ((Integer) obj2).intValue();
                    VoiceColoredCircle$lambda$2 = VoiceCircleKt.VoiceColoredCircle$lambda$2(i10, f10, z6, i11, (u2.m) obj, intValue);
                    return VoiceColoredCircle$lambda$2;
                }
            };
        }
    }

    public static final sn.z VoiceColoredCircle$lambda$0(boolean z6, xk.b bVar, u2.m mVar, int i10) {
        boolean z10;
        int i11;
        bVar.getClass();
        if ((i10 & 6) == 0) {
            if (((u2.q) mVar).f(bVar)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 |= i11;
        }
        if ((i10 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z10)) {
            if (z6) {
                bVar.f37971a.add(new BlurTransformationPlugin(36));
            }
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z VoiceColoredCircle$lambda$2(int i10, float f10, boolean z6, int i11, u2.m mVar, int i12) {
        VoiceColoredCircle(i10, f10, z6, mVar, u2.r.M(i11 | 1));
        return sn.z.f31622a;
    }

    private static final int getHash(String str) {
        byte[] bytes = str.getBytes(wq.b.f37231a);
        bytes.getClass();
        ArrayList arrayList = new ArrayList(bytes.length);
        int i10 = 0;
        int i11 = 0;
        for (byte b10 : bytes) {
            i11++;
            arrayList.add(Integer.valueOf(b10 * i11));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i10 += ((Number) it.next()).intValue();
        }
        return i10;
    }
}
