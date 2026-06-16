package io.elevenlabs.ui.components;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.ui.extensions.CoilExtensionsKt;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a[\u0010\u0010\u001a\u00020\r2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"", "url", "Li3/t;", "modifier", "Lp3/x;", "tintColor", "Lf4/r;", "scale", "Li3/g;", "alignment", "", "placeholderDrawableRes", "contentDescription", "Lsn/z;", "CachedAsyncImage-N55sxy0", "(Ljava/lang/String;Li3/t;Lp3/x;Lf4/r;Li3/g;Ljava/lang/Integer;Ljava/lang/String;Lu2/m;II)V", "CachedAsyncImage", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class CachedAsyncImageKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0042  */
    /* renamed from: CachedAsyncImage-N55sxy0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1792CachedAsyncImageN55sxy0(String str, i3.t tVar, p3.x xVar, f4.r rVar, i3.g gVar, Integer num, String str2, u2.m mVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        p3.x xVar2;
        int i15;
        int i16;
        f4.r rVar2;
        int i17;
        int i18;
        i3.g gVar2;
        int i19;
        int i20;
        Integer num2;
        int i21;
        int i22;
        String str3;
        int i23;
        int i24;
        boolean z6;
        i3.t tVar2;
        u2.r1 r10;
        int i25;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1545644156);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i25 = 4;
            } else {
                i25 = 2;
            }
            i12 = i25 | i10;
        } else {
            i12 = i10;
        }
        int i26 = i11 & 2;
        if (i26 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (qVar.f(tVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            i14 = i11 & 4;
            if (i14 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                xVar2 = xVar;
                if (qVar.f(xVar2)) {
                    i15 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i15 = 128;
                }
                i12 |= i15;
                i16 = i11 & 8;
                if (i16 != 0) {
                    i12 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    rVar2 = rVar;
                    if (qVar.f(rVar2)) {
                        i17 = 2048;
                    } else {
                        i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i12 |= i17;
                    i18 = i11 & 16;
                    if (i18 == 0) {
                        i12 |= 24576;
                    } else if ((i10 & 24576) == 0) {
                        gVar2 = gVar;
                        if (qVar.f(gVar2)) {
                            i19 = 16384;
                        } else {
                            i19 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                        i12 |= i19;
                        i20 = i11 & 32;
                        if (i20 != 0) {
                            i12 |= 196608;
                        } else if ((196608 & i10) == 0) {
                            num2 = num;
                            if (qVar.f(num2)) {
                                i21 = 131072;
                            } else {
                                i21 = 65536;
                            }
                            i12 |= i21;
                            i22 = i11 & 64;
                            if (i22 == 0) {
                                i12 |= 1572864;
                            } else if ((1572864 & i10) == 0) {
                                str3 = str2;
                                if (qVar.f(str3)) {
                                    i23 = 1048576;
                                } else {
                                    i23 = 524288;
                                }
                                i12 |= i23;
                                i24 = i12;
                                if ((i24 & 599187) != 599186) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (qVar.O(i24 & 1, z6)) {
                                    if (i26 != 0) {
                                        tVar2 = i3.q.f13017a;
                                    } else {
                                        tVar2 = tVar;
                                    }
                                    if (i14 != 0) {
                                        xVar2 = null;
                                    }
                                    if (i16 != 0) {
                                        rVar2 = f4.q.f8840c;
                                    }
                                    if (i18 != 0) {
                                        gVar2 = i3.d.f13001e;
                                    }
                                    if (i20 != 0) {
                                        num2 = null;
                                    }
                                    if (i22 != 0) {
                                        str3 = null;
                                    }
                                    ad.h coverData = CoilExtensionsKt.coverData(new ad.h((Context) qVar.j(AndroidCompositionLocals_androidKt.f2291b)), str);
                                    coverData.b();
                                    if (num2 != null) {
                                        coverData.f1803s = Integer.valueOf(num2.intValue());
                                    }
                                    u2.r.a(i4.w1.f13252a.a(Boolean.FALSE), c3.k.d(-1109406788, true, new id.l(xVar2, coverData.a(), str3, tVar2, gVar2, rVar2), qVar), qVar, 56);
                                } else {
                                    qVar.R();
                                    tVar2 = tVar;
                                }
                                p3.x xVar3 = xVar2;
                                f4.r rVar3 = rVar2;
                                i3.g gVar3 = gVar2;
                                Integer num3 = num2;
                                String str4 = str3;
                                r10 = qVar.r();
                                if (r10 != null) {
                                    r10.f34012d = new fm.c(str, tVar2, xVar3, rVar3, gVar3, num3, str4, i10, i11);
                                    return;
                                }
                                return;
                            }
                            str3 = str2;
                            i24 = i12;
                            if ((i24 & 599187) != 599186) {
                            }
                            if (qVar.O(i24 & 1, z6)) {
                            }
                            p3.x xVar32 = xVar2;
                            f4.r rVar32 = rVar2;
                            i3.g gVar32 = gVar2;
                            Integer num32 = num2;
                            String str42 = str3;
                            r10 = qVar.r();
                            if (r10 != null) {
                            }
                        }
                        num2 = num;
                        i22 = i11 & 64;
                        if (i22 == 0) {
                        }
                        str3 = str2;
                        i24 = i12;
                        if ((i24 & 599187) != 599186) {
                        }
                        if (qVar.O(i24 & 1, z6)) {
                        }
                        p3.x xVar322 = xVar2;
                        f4.r rVar322 = rVar2;
                        i3.g gVar322 = gVar2;
                        Integer num322 = num2;
                        String str422 = str3;
                        r10 = qVar.r();
                        if (r10 != null) {
                        }
                    }
                    gVar2 = gVar;
                    i20 = i11 & 32;
                    if (i20 != 0) {
                    }
                    num2 = num;
                    i22 = i11 & 64;
                    if (i22 == 0) {
                    }
                    str3 = str2;
                    i24 = i12;
                    if ((i24 & 599187) != 599186) {
                    }
                    if (qVar.O(i24 & 1, z6)) {
                    }
                    p3.x xVar3222 = xVar2;
                    f4.r rVar3222 = rVar2;
                    i3.g gVar3222 = gVar2;
                    Integer num3222 = num2;
                    String str4222 = str3;
                    r10 = qVar.r();
                    if (r10 != null) {
                    }
                }
                rVar2 = rVar;
                i18 = i11 & 16;
                if (i18 == 0) {
                }
                gVar2 = gVar;
                i20 = i11 & 32;
                if (i20 != 0) {
                }
                num2 = num;
                i22 = i11 & 64;
                if (i22 == 0) {
                }
                str3 = str2;
                i24 = i12;
                if ((i24 & 599187) != 599186) {
                }
                if (qVar.O(i24 & 1, z6)) {
                }
                p3.x xVar32222 = xVar2;
                f4.r rVar32222 = rVar2;
                i3.g gVar32222 = gVar2;
                Integer num32222 = num2;
                String str42222 = str3;
                r10 = qVar.r();
                if (r10 != null) {
                }
            }
            xVar2 = xVar;
            i16 = i11 & 8;
            if (i16 != 0) {
            }
            rVar2 = rVar;
            i18 = i11 & 16;
            if (i18 == 0) {
            }
            gVar2 = gVar;
            i20 = i11 & 32;
            if (i20 != 0) {
            }
            num2 = num;
            i22 = i11 & 64;
            if (i22 == 0) {
            }
            str3 = str2;
            i24 = i12;
            if ((i24 & 599187) != 599186) {
            }
            if (qVar.O(i24 & 1, z6)) {
            }
            p3.x xVar322222 = xVar2;
            f4.r rVar322222 = rVar2;
            i3.g gVar322222 = gVar2;
            Integer num322222 = num2;
            String str422222 = str3;
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        i14 = i11 & 4;
        if (i14 == 0) {
        }
        xVar2 = xVar;
        i16 = i11 & 8;
        if (i16 != 0) {
        }
        rVar2 = rVar;
        i18 = i11 & 16;
        if (i18 == 0) {
        }
        gVar2 = gVar;
        i20 = i11 & 32;
        if (i20 != 0) {
        }
        num2 = num;
        i22 = i11 & 64;
        if (i22 == 0) {
        }
        str3 = str2;
        i24 = i12;
        if ((i24 & 599187) != 599186) {
        }
        if (qVar.O(i24 & 1, z6)) {
        }
        p3.x xVar3222222 = xVar2;
        f4.r rVar3222222 = rVar2;
        i3.g gVar3222222 = gVar2;
        Integer num3222222 = num2;
        String str4222222 = str3;
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final sn.z CachedAsyncImage_N55sxy0$lambda$1(p3.x xVar, ad.i iVar, String str, i3.t tVar, i3.g gVar, f4.r rVar, u2.m mVar, int i10) {
        boolean z6;
        p3.n nVar;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            if (xVar != null) {
                nVar = new p3.n(xVar.f26440a, 5);
            } else {
                nVar = null;
            }
            qc.m.b(iVar, str, tVar, gVar, rVar, nVar, qVar, 0, 3736);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z CachedAsyncImage_N55sxy0$lambda$2(String str, i3.t tVar, p3.x xVar, f4.r rVar, i3.g gVar, Integer num, String str2, int i10, int i11, u2.m mVar, int i12) {
        m1792CachedAsyncImageN55sxy0(str, tVar, xVar, rVar, gVar, num, str2, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }
}
