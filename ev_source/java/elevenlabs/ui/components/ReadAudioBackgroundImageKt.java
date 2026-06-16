package io.elevenlabs.ui.components;

import android.gov.nist.javax.sip.parser.TokenNames;
import android.os.Build;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.skydoves.landscapist.transformation.blur.BlurTransformationPlugin;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.extensions.CoilExtensionsKt;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ae\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"", "imageUrl", "", "shouldAnimate", "", "animatedScale", "animatedOffsetX", "animatedOffsetY", "animatedBlurRadius", "baseScale", "baseBlurRadius", "Li3/t;", "modifier", "blurPlaceholder", "Lsn/z;", "ReadAudioBackgroundImage", "(Ljava/lang/String;ZFFFFFFLi3/t;Ljava/lang/String;Lu2/m;II)V", "COMPOSE_BLUR_FACTOR", TokenNames.F, "LANDSCAPIST_BLUR_FACTOR", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ReadAudioBackgroundImageKt {
    private static final float COMPOSE_BLUR_FACTOR = 0.5f;
    private static final float LANDSCAPIST_BLUR_FACTOR = 1.0f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [int] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReadAudioBackgroundImage(String str, final boolean z6, final float f10, final float f11, final float f12, final float f13, final float f14, final float f15, i3.t tVar, String str2, u2.m mVar, final int i10, final int i11) {
        int i12;
        final i3.t tVar2;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z10;
        String str3;
        final String str4;
        u2.r1 r10;
        i3.t tVar3;
        String str5;
        boolean z11;
        String str6;
        i3.t tVar4;
        boolean z12;
        float f16;
        boolean z13;
        float f17;
        float f18;
        float f19;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        f4.p pVar = f4.q.f8839b;
        str.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-543523218);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i24 = 4;
            } else {
                i24 = 2;
            }
            i12 = i24 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.g(z6)) {
                i23 = 32;
            } else {
                i23 = 16;
            }
            i12 |= i23;
        }
        if ((i10 & 384) == 0) {
            if (qVar.c(f10)) {
                i22 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i22 = 128;
            }
            i12 |= i22;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.c(f11)) {
                i21 = 2048;
            } else {
                i21 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i21;
        }
        if ((i10 & 24576) == 0) {
            if (qVar.c(f12)) {
                i20 = 16384;
            } else {
                i20 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i20;
        }
        if ((196608 & i10) == 0) {
            if (qVar.c(f13)) {
                i19 = 131072;
            } else {
                i19 = 65536;
            }
            i12 |= i19;
        }
        if ((1572864 & i10) == 0) {
            if (qVar.c(f14)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i12 |= i18;
        }
        if ((12582912 & i10) == 0) {
            if (qVar.c(f15)) {
                i17 = 8388608;
            } else {
                i17 = 4194304;
            }
            i12 |= i17;
        }
        int i25 = i11 & RpcError.MAX_MESSAGE_BYTES;
        if (i25 != 0) {
            i12 |= 100663296;
        } else if ((100663296 & i10) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i12 |= i13;
            i14 = i11 & 512;
            if (i14 == 0) {
                i12 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (qVar.f(str2)) {
                    i15 = 536870912;
                } else {
                    i15 = 268435456;
                }
                i12 |= i15;
            }
            i16 = i12;
            if ((i12 & 306783379) == 306783378) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!qVar.O(i16 & 1, z10)) {
                i3.q qVar2 = i3.q.f13017a;
                if (i25 != 0) {
                    tVar3 = qVar2;
                } else {
                    tVar3 = tVar2;
                }
                if (i14 != 0) {
                    str5 = null;
                } else {
                    str5 = str2;
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                h5.c cVar = (h5.c) qVar.j(i4.j1.f13129h);
                boolean z14 = z11;
                p3.k0 rememberBase64ImageBitmap = CoilExtensionsKt.rememberBase64ImageBitmap(str5, qVar, (i16 >> 27) & 14);
                f4.f1 d10 = r1.p.d(i3.d.f12997a, false);
                int hashCode = Long.hashCode(qVar.T);
                c3.o l4 = qVar.l();
                i3.t c5 = i3.a.c(tVar3, qVar);
                h4.h.f11920i.getClass();
                i3.t tVar5 = tVar3;
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
                if (rememberBase64ImageBitmap != null) {
                    qVar.X(1576254720);
                    BlurredImagePlaceholderKt.BlurredImagePlaceholder(rememberBase64ImageBitmap, m3.h.j(r1.p2.d(qVar2, 1.0f), f14, f14), qVar, 0, 0);
                    qVar.p(false);
                } else {
                    qVar.X(1576421934);
                    qVar.p(false);
                }
                if (z14) {
                    qVar.X(1576474417);
                    i3.t d11 = r1.p2.d(qVar2, 1.0f);
                    if (z6) {
                        f16 = f10;
                    } else {
                        f16 = f14;
                    }
                    i3.t j4 = m3.h.j(d11, f16, f16);
                    if (z6) {
                        f17 = f11;
                        z13 = 0;
                    } else {
                        z13 = 0;
                        f17 = 0;
                    }
                    if (z6) {
                        f18 = f12;
                    } else {
                        f18 = (float) z13;
                    }
                    i3.t A = r1.d.A(j4, f17, f18);
                    if (z6) {
                        f19 = f13;
                    } else {
                        f19 = f15;
                    }
                    str6 = str5;
                    tVar4 = tVar5;
                    CachedAsyncImageKt.m1792CachedAsyncImageN55sxy0(str, m3.h.b(A, f19 * 0.5f, p3.h0.f26395b), null, pVar, null, null, null, qVar, (i16 & 14) | 3072, 116);
                    str3 = str;
                    qVar.p(z13);
                } else {
                    str3 = str;
                    str6 = str5;
                    tVar4 = tVar5;
                    qVar.X(1577094076);
                    u3.c M = kd.a.M(R.drawable.book_cover, qVar, 0);
                    i3.t j10 = m3.h.j(r1.p2.d(qVar2, 1.0f), f14, f14);
                    vk.i iVar = new vk.i(null, 0L, 121);
                    xk.b D = g0.c.D(c3.k.d(-684466802, true, new io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements.b(f15, cVar), qVar), qVar);
                    if ((i16 & 14) == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    Object L = qVar.L();
                    if (z12 || L == u2.l.f33918a) {
                        L = new w1(str3, 0);
                        qVar.h0(L);
                    }
                    LandscapistImageKt.LandscapistCoilImage((ho.a) L, j10, D, null, iVar, null, M, null, null, null, qVar, u3.c.$stable << 18, 936);
                    qVar.p(false);
                }
                qVar.p(true);
                tVar2 = tVar4;
                str4 = str6;
            } else {
                str3 = str;
                qVar.R();
                str4 = str2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                final String str7 = str3;
                r10.f34012d = new ho.p() { // from class: io.elevenlabs.ui.components.x1
                    @Override // ho.p
                    public final Object invoke(Object obj, Object obj2) {
                        sn.z ReadAudioBackgroundImage$lambda$1;
                        ReadAudioBackgroundImage$lambda$1 = ReadAudioBackgroundImageKt.ReadAudioBackgroundImage$lambda$1(str7, z6, f10, f11, f12, f13, f14, f15, tVar2, str4, i10, i11, (u2.m) obj, ((Integer) obj2).intValue());
                        return ReadAudioBackgroundImage$lambda$1;
                    }
                };
                return;
            }
            return;
        }
        tVar2 = tVar;
        i14 = i11 & 512;
        if (i14 == 0) {
        }
        i16 = i12;
        if ((i12 & 306783379) == 306783378) {
        }
        if (!qVar.O(i16 & 1, z10)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z ReadAudioBackgroundImage$lambda$0$0(h5.c cVar, float f10, xk.b bVar, u2.m mVar, int i10) {
        boolean z6;
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
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            bVar.f37971a.add(new BlurTransformationPlugin((int) (cVar.d0(f10) * 1.0f)));
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ReadAudioBackgroundImage$lambda$1(String str, boolean z6, float f10, float f11, float f12, float f13, float f14, float f15, i3.t tVar, String str2, int i10, int i11, u2.m mVar, int i12) {
        ReadAudioBackgroundImage(str, z6, f10, f11, f12, f13, f14, f15, tVar, str2, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final Object ReadAudioBackgroundImage$lambda$0$1$0(String str) {
        return str;
    }
}
