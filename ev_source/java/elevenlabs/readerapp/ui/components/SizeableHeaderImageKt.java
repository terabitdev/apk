package io.elevenlabs.readerapp.ui.components;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import io.elevenlabs.domain.model.SizeableHeaderImage;
import io.elevenlabs.ui.components.BlurredImagePlaceholderKt;
import io.elevenlabs.ui.components.CachedAsyncImageKt;
import io.elevenlabs.ui.extensions.BoxShadow;
import io.elevenlabs.ui.extensions.BoxShadowKt;
import io.elevenlabs.ui.extensions.CoilExtensionsKt;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import r1.p2;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aO\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u0010\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lio/elevenlabs/domain/model/SizeableHeaderImage;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Li3/t;", "modifier", "Lh5/f;", "maxHeight", "Lf4/r;", "contentScale", "Lp3/b1;", "shape", "", "blurPlaceholder", "Lsn/z;", "SizeableHeaderImage-vtUHdqY", "(Lio/elevenlabs/domain/model/SizeableHeaderImage;Li3/t;Lh5/f;Lf4/r;Lp3/b1;Ljava/lang/String;Lu2/m;II)V", "SizeableHeaderImage", "Preview_SizeableHeaderImage_Book", "(Lu2/m;I)V", "Preview_SizeableHeaderImage_Collection", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class SizeableHeaderImageKt {
    public static final void Preview_SizeableHeaderImage_Book(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-738248650);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            m1093SizeableHeaderImagevtUHdqY(new SizeableHeaderImage("file:///android_asset/read_cover_preview.jpg", 1.0f, 0.6f, 300.0f, Float.valueOf(8.0f)), null, null, null, null, null, qVar, 0, 62);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new i0(i10, 13);
        }
    }

    public static final sn.z Preview_SizeableHeaderImage_Book$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_SizeableHeaderImage_Book(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_SizeableHeaderImage_Collection(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(560184235);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            m1093SizeableHeaderImagevtUHdqY(new SizeableHeaderImage("file:///android_asset/read_cover_preview.jpg", 1.0f, 0.6f, 300.0f, Float.valueOf(12.0f)), null, null, null, null, null, qVar, 0, 62);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new i0(i10, 12);
        }
    }

    public static final sn.z Preview_SizeableHeaderImage_Collection$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_SizeableHeaderImage_Collection(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0045  */
    /* renamed from: SizeableHeaderImage-vtUHdqY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1093SizeableHeaderImagevtUHdqY(SizeableHeaderImage sizeableHeaderImage, i3.t tVar, h5.f fVar, f4.r rVar, p3.b1 b1Var, String str, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        int i14;
        h5.f fVar2;
        int i15;
        int i16;
        f4.r rVar2;
        int i17;
        int i18;
        int i19;
        int i20;
        String str2;
        int i21;
        boolean z6;
        p3.b1 b1Var2;
        i3.t tVar3;
        h5.f fVar3;
        f4.r rVar3;
        String str3;
        r1 r10;
        f4.r rVar4;
        p3.b1 b1Var3;
        i3.t tVar4;
        float f10;
        int i22;
        sizeableHeaderImage.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(215910516);
        if ((i10 & 6) == 0) {
            if (qVar.h(sizeableHeaderImage)) {
                i22 = 4;
            } else {
                i22 = 2;
            }
            i12 = i22 | i10;
        } else {
            i12 = i10;
        }
        int i23 = i11 & 2;
        if (i23 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            i14 = i11 & 4;
            if (i14 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                fVar2 = fVar;
                if (qVar.f(fVar2)) {
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
                        if (qVar.f(b1Var)) {
                            i19 = 16384;
                        } else {
                            i19 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                        i12 |= i19;
                        i20 = i11 & 32;
                        if (i20 != 0) {
                            i12 |= 196608;
                        } else if ((196608 & i10) == 0) {
                            str2 = str;
                            if (qVar.f(str2)) {
                                i21 = 131072;
                            } else {
                                i21 = 65536;
                            }
                            i12 |= i21;
                            if ((74899 & i12) == 74898) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (!qVar.O(i12 & 1, z6)) {
                                i3.q qVar2 = i3.q.f13017a;
                                if (i23 != 0) {
                                    tVar2 = qVar2;
                                }
                                String str4 = null;
                                if (i14 != 0) {
                                    fVar2 = null;
                                }
                                if (i16 != 0) {
                                    rVar4 = f4.q.f8839b;
                                } else {
                                    rVar4 = rVar2;
                                }
                                if (i18 != 0) {
                                    b1Var2 = null;
                                } else {
                                    b1Var2 = b1Var;
                                }
                                if (i20 == 0) {
                                    str4 = str2;
                                }
                                float min = Math.min(sizeableHeaderImage.getScreenWidthRatio() * ((Configuration) qVar.j(AndroidCompositionLocals_androidKt.f2290a)).screenWidthDp, sizeableHeaderImage.getMaxWidth());
                                if (b1Var2 == null) {
                                    Float cornerRadius = sizeableHeaderImage.getCornerRadius();
                                    if (cornerRadius != null) {
                                        f10 = cornerRadius.floatValue();
                                    } else {
                                        f10 = 8;
                                    }
                                    b1Var3 = z1.h.b(f10);
                                } else {
                                    b1Var3 = b1Var2;
                                }
                                p3.k0 rememberBase64ImageBitmap = CoilExtensionsKt.rememberBase64ImageBitmap(str4, qVar, (i12 >> 15) & 14);
                                if (fVar2 == null || (tVar4 = p2.h(tVar2, t2.u.P, fVar2.f12083a, 1)) == null) {
                                    tVar4 = tVar2;
                                }
                                f4.r rVar5 = rVar4;
                                i3.t c5 = m3.h.c(BoxShadowKt.boxShadow$default(r1.d.j(p2.s(tVar4, min), sizeableHeaderImage.getAspectRatio(), true), new BoxShadow[]{new BoxShadow(p3.x.b(0.16f, p3.x.f26427b), 20, t2.u.P, (Float.floatToRawIntBits(0) << 32) | (Float.floatToRawIntBits(8) & 4294967295L), false, 20, null)}, b1Var3, false, 4, null), b1Var3);
                                f4.f1 d10 = r1.p.d(i3.d.f12997a, false);
                                int hashCode = Long.hashCode(qVar.T);
                                c3.o l4 = qVar.l();
                                i3.t c10 = i3.a.c(c5, qVar);
                                h4.h.f11920i.getClass();
                                h4.f fVar4 = h4.g.f11903b;
                                qVar.b0();
                                if (qVar.S) {
                                    qVar.k(fVar4);
                                } else {
                                    qVar.k0();
                                }
                                u2.r.J(h4.g.f11907f, d10, qVar);
                                u2.r.J(h4.g.f11906e, l4, qVar);
                                u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
                                u2.r.F(h4.g.f11909h, qVar);
                                u2.r.J(h4.g.f11905d, c10, qVar);
                                if (rememberBase64ImageBitmap != null) {
                                    qVar.X(1775555959);
                                    BlurredImagePlaceholderKt.BlurredImagePlaceholder(rememberBase64ImageBitmap, p2.d(qVar2, 1.0f), qVar, 48, 0);
                                    qVar.p(false);
                                } else {
                                    qVar.X(1775706836);
                                    qVar.p(false);
                                }
                                CachedAsyncImageKt.m1792CachedAsyncImageN55sxy0(sizeableHeaderImage.getImageUrl(), p2.d(qVar2, 1.0f), null, rVar5, null, null, null, qVar, (i12 & 7168) | 48, 116);
                                qVar.p(true);
                                fVar3 = fVar2;
                                str3 = str4;
                                tVar3 = tVar2;
                                rVar3 = rVar5;
                            } else {
                                qVar.R();
                                b1Var2 = b1Var;
                                tVar3 = tVar2;
                                fVar3 = fVar2;
                                rVar3 = rVar2;
                                str3 = str2;
                            }
                            r10 = qVar.r();
                            if (r10 == null) {
                                r10.f34012d = new u0(sizeableHeaderImage, tVar3, fVar3, rVar3, b1Var2, str3, i10, i11, 0);
                                return;
                            }
                            return;
                        }
                        str2 = str;
                        if ((74899 & i12) == 74898) {
                        }
                        if (!qVar.O(i12 & 1, z6)) {
                        }
                        r10 = qVar.r();
                        if (r10 == null) {
                        }
                    }
                    i20 = i11 & 32;
                    if (i20 != 0) {
                    }
                    str2 = str;
                    if ((74899 & i12) == 74898) {
                    }
                    if (!qVar.O(i12 & 1, z6)) {
                    }
                    r10 = qVar.r();
                    if (r10 == null) {
                    }
                }
                rVar2 = rVar;
                i18 = i11 & 16;
                if (i18 == 0) {
                }
                i20 = i11 & 32;
                if (i20 != 0) {
                }
                str2 = str;
                if ((74899 & i12) == 74898) {
                }
                if (!qVar.O(i12 & 1, z6)) {
                }
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            fVar2 = fVar;
            i16 = i11 & 8;
            if (i16 != 0) {
            }
            rVar2 = rVar;
            i18 = i11 & 16;
            if (i18 == 0) {
            }
            i20 = i11 & 32;
            if (i20 != 0) {
            }
            str2 = str;
            if ((74899 & i12) == 74898) {
            }
            if (!qVar.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 4;
        if (i14 == 0) {
        }
        fVar2 = fVar;
        i16 = i11 & 8;
        if (i16 != 0) {
        }
        rVar2 = rVar;
        i18 = i11 & 16;
        if (i18 == 0) {
        }
        i20 = i11 & 32;
        if (i20 != 0) {
        }
        str2 = str;
        if ((74899 & i12) == 74898) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z SizeableHeaderImage_vtUHdqY$lambda$2(SizeableHeaderImage sizeableHeaderImage, i3.t tVar, h5.f fVar, f4.r rVar, p3.b1 b1Var, String str, int i10, int i11, u2.m mVar, int i12) {
        m1093SizeableHeaderImagevtUHdqY(sizeableHeaderImage, tVar, fVar, rVar, b1Var, str, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }
}
